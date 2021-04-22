package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Empresa {

    @Id
    private String _id;
    private String NomeEmpresa;
    private String Endereco;
    private String Telefone;
    private String Site;
    private String idCidade;
    private String idlinha;

    public String getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(String idCidade) {
        this.idCidade = idCidade;
    }

    public String getIdlinha() {
        return idlinha;
    }

    public void setIdlinha(String idlinha) {
        this.idlinha = idlinha;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        NomeEmpresa = nomeEmpresa;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        Site = site;
    }

    //id_Cidade
    //id_linha



    //public void setFabricante(String fabricante) {
        //this.fabricante = fabricante;}

}
