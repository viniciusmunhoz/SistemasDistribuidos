package com.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cidade {

    @Id
    private String _id;
    private String NomeCidade;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNomeCidade() {
        return NomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        NomeCidade = nomeCidade;
    }

}
