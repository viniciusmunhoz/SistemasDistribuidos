package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class QuadroHorario {
    @Id
    private String _id;
    private String DiasUteis;
    private String Sabado;
    private String Domingo;
    private String Feriado;
    private String id_Linha;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDiasUteis() {
        return DiasUteis;
    }

    public void setDiasUteis(String diasUteis) {
        DiasUteis = diasUteis;
    }

    public String getSabado() {
        return Sabado;
    }

    public void setSabado(String sabado) {
        Sabado = sabado;
    }

    public String getDomingo() {
        return Domingo;
    }

    public void setDomingo(String domingo) {
        Domingo = domingo;
    }

    public String getFeriado() {
        return Feriado;
    }

    public void setFeriado(String feriado) {
        Feriado = feriado;
    }

    public String getId_Linha() {
        return id_Linha;
    }

    public void setId_Linha(String id_Linha) {
        this.id_Linha = id_Linha;
    }
}

