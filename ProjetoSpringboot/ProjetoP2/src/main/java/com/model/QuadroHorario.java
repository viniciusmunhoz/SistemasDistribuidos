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
    private Linha linha;

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

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

}

