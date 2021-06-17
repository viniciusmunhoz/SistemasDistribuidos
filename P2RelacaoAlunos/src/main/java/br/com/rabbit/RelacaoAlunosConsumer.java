package br.com.rabbit;

import br.com.model.RelacaoAlunos;
import br.com.service.RelacaoAlunosService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RelacaoAlunosConsumer {

    @Autowired
    private RelacaoAlunosService relacaoAlunosService;

    @RabbitListener(queues = {"${queue.relacaoalunos.name}"})
    public void receive (@Payload RelacaoAlunos RelacaoAlunos){
        System.out.println("Id: "+ RelacaoAlunos.get_id() + "\nNome: " + RelacaoAlunos.getNOME()
                + "\nCPF: " + RelacaoAlunos.getCPF() + "\nEmec_Curso: " + RelacaoAlunos.getEMEC_CURSO()
                + "\nCurso: " + RelacaoAlunos.getCURSO() + "\nAno_Ingresso: " + RelacaoAlunos.getANO_INGRESSO()
                + "\nSemestre_Ingresso: " + RelacaoAlunos.getSEMESTRE_INGRESSO() + "\nData_Expedissao_Diploma: " + RelacaoAlunos.getDATA_EXPEDICAO_DIPLOMA()
                + "\nData_Registro_Diploma: " + RelacaoAlunos.getDATA_REGISTRO_DIPLOMA() + "\nNumero_Registro_Diploma: " + RelacaoAlunos.getNUMERO_REGISTRO_DIPLOMA()
                + "\nData_Publicacao_Dou: " + RelacaoAlunos.getDATA_PUBLICACAO_DOU() + "\nEmec_Ies_Expedidora: " + RelacaoAlunos.getEMEC_IES_EXPEDIDORA()
                + "\nEmec_Ies_Registradora: " + RelacaoAlunos.getDATA_REGISTRO_DIPLOMA());
        relacaoAlunosService.save(RelacaoAlunos);
    }

}




