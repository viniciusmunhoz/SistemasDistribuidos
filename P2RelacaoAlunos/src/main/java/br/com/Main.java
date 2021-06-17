package br.com;


import org.apache.poi.ss.usermodel.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bson.Document;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.util.*;

@SpringBootApplication
@EnableCaching
public class Main {

    @Value("${queue.relacaoalunos.name}")
    private String relacaoalunosQueue;

    @Bean
    public Queue relacaoalunosQueue(){
        return new Queue(relacaoalunosQueue, true);
    }

    public static void main(String args[]) throws IOException {
        SpringApplication.run(Main.class, args);
        try {
            MongoClient mongo = new MongoClient( "localhost" , 27017 );
            System.out.println("Connected to the database successfully");
            //Accessing the database
            MongoDatabase database = mongo.getDatabase("projRelacaoAlunos"); //nome banco
            MongoCollection dbcoll = database.getCollection("relacaoAlunos"); //nome tabela

            List empRecords = new ArrayList<>();
            File myFile = new File("C:/Users/izabe/Downloads/PROJETO/PROJETO/RelacaoAlunosDiplomados.xlsx"); //planilha caminho
            FileInputStream fis = new FileInputStream(myFile);
            // Encontra a pasta para o arquivo XLSX
            Workbook myWorkBook = new XSSFWorkbook(fis);
            // Retorne a primeira Sheet planilha XLSX
            Sheet mySheet = myWorkBook.getSheetAt(0);
            System.out.println(mySheet.getSheetName());
            String headerArr[] = new String[13]; // Tamanho do cabeçalho/Quantidade de colunas

            // Obtenha o iterador para todas as linhas na planilha atual
            Iterator rowIterator = mySheet.iterator();
            Row headerRow = (Row) rowIterator.next();
            Iterator headerCellIterator = headerRow.cellIterator();
            int i= 0;
            while (headerCellIterator.hasNext()){  ///WHILE PARA FAZER A ITERACAO
                Cell headerCell = (Cell) headerCellIterator.next();
                headerArr[i] = headerCell.toString();
                i++;
            }
            while (rowIterator.hasNext()) { // ITERAÇÃO DAS LINHAS
                Row row = (Row) rowIterator.next();
                Document emp = new Document();
                i=0;
                // For each row, iterate through each columns
                Iterator cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    try {
                        Cell cell = (Cell) cellIterator.next();
                        if(cell.getCellType() == CellType.STRING)
                            emp.put(headerArr[i],cell.getStringCellValue());
                        else
                            emp.put(headerArr[i], (int)cell.getNumericCellValue());
                        i++;
                    }catch(Exception e){
                    }
                }
                empRecords.add(emp);
            }
            dbcoll.insertMany(empRecords);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
