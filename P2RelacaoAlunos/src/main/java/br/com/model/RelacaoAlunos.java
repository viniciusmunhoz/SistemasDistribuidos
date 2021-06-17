package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class RelacaoAlunos implements Serializable {
    @Id
    private String _id;
    private String NOME;
    private String CPF;
    private int EMEC_CURSO;
    private String CURSO;
    private int ANO_INGRESSO;
    private int SEMESTRE_INGRESSO;
    private String DATA_EXPEDICAO_DIPLOMA;
    private String DATA_REGISTRO_DIPLOMA;
    private int NUMERO_REGISTRO_DIPLOMA;
    private String DATA_PUBLICACAO_DOU;
    private int EMEC_IES_EXPEDIDORA;
    private int EMEC_IES_REGISTRADORA;

    public RelacaoAlunos(){

    }

    public RelacaoAlunos(String _id, String NOME, String CPF, int EMEC_CURSO, String CURSO, int ANO_INGRESSO, int SEMESTRE_INGRESSO, String DATA_EXPEDICAO_DIPLOMA, String DATA_REGISTRO_DIPLOMA, int NUMERO_REGISTRO_DIPLOMA, String DATA_PUBLICACAO_DOU, int EMEC_IES_EXPEDIDORA, int EMEC_IES_REGISTRADORA){
        this._id = _id;
        this.NOME = NOME;
        this.CPF = CPF;
        this.EMEC_CURSO = EMEC_CURSO;
        this.CURSO = CURSO;
        this.ANO_INGRESSO = ANO_INGRESSO;
        this.SEMESTRE_INGRESSO = SEMESTRE_INGRESSO;
        this.DATA_EXPEDICAO_DIPLOMA = DATA_EXPEDICAO_DIPLOMA;
        this.DATA_REGISTRO_DIPLOMA = DATA_REGISTRO_DIPLOMA;
        this.NUMERO_REGISTRO_DIPLOMA = NUMERO_REGISTRO_DIPLOMA;
        this.DATA_PUBLICACAO_DOU = DATA_PUBLICACAO_DOU;
        this.EMEC_IES_EXPEDIDORA = EMEC_IES_EXPEDIDORA;
        this.EMEC_IES_REGISTRADORA = EMEC_IES_REGISTRADORA;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getEMEC_CURSO() {
        return EMEC_CURSO;
    }

    public void setEMEC_CURSO(int EMEC_CURSO) {
        this.EMEC_CURSO = EMEC_CURSO;
    }

    public String getCURSO() {
        return CURSO;
    }

    public void setCURSO(String CURSO) {
        this.CURSO = CURSO;
    }

    public int getANO_INGRESSO() {
        return ANO_INGRESSO;
    }

    public void setANO_INGRESSO(int ANO_INGRESSO) {
        this.ANO_INGRESSO = ANO_INGRESSO;
    }

    public int getSEMESTRE_INGRESSO() {
        return SEMESTRE_INGRESSO;
    }

    public void setSEMESTRE_INGRESSO(int SEMESTRE_INGRESSO) {
        this.SEMESTRE_INGRESSO = SEMESTRE_INGRESSO;
    }

    public String getDATA_EXPEDICAO_DIPLOMA() {
        return DATA_EXPEDICAO_DIPLOMA;
    }

    public void setDATA_EXPEDICAO_DIPLOMA(String DATA_EXPEDICAO_DIPLOMA) {
        this.DATA_EXPEDICAO_DIPLOMA = DATA_EXPEDICAO_DIPLOMA;
    }

    public String getDATA_REGISTRO_DIPLOMA() {
        return DATA_REGISTRO_DIPLOMA;
    }

    public void setDATA_REGISTRO_DIPLOMA(String DATA_REGISTRO_DIPLOMA) {
        this.DATA_REGISTRO_DIPLOMA = DATA_REGISTRO_DIPLOMA;
    }

    public int getNUMERO_REGISTRO_DIPLOMA() {
        return NUMERO_REGISTRO_DIPLOMA;
    }

    public void setNUMERO_REGISTRO_DIPLOMA(int NUMERO_REGISTRO_DIPLOMA) {
        this.NUMERO_REGISTRO_DIPLOMA = NUMERO_REGISTRO_DIPLOMA;
    }

    public String getDATA_PUBLICACAO_DOU() {
        return DATA_PUBLICACAO_DOU;
    }

    public void setDATA_PUBLICACAO_DOU(String DATA_PUBLICACAO_DOU) {
        this.DATA_PUBLICACAO_DOU = DATA_PUBLICACAO_DOU;
    }

    public int getEMEC_IES_EXPEDIDORA() {
        return EMEC_IES_EXPEDIDORA;
    }

    public void setEMEC_IES_EXPEDIDORA(int EMEC_IES_EXPEDIDORA) {
        this.EMEC_IES_EXPEDIDORA = EMEC_IES_EXPEDIDORA;
    }

    public int getEMEC_IES_REGISTRADORA() {
        return EMEC_IES_REGISTRADORA;
    }

    public void setEMEC_IES_REGISTRADORA(int EMEC_IES_REGISTRADORA) {
        this.EMEC_IES_REGISTRADORA = EMEC_IES_REGISTRADORA;
    }
}





