package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Linha {
    @Id
    private String _id;
    private String NomeLinha;
    private String idItinerario;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNomeLinha() {
        return NomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        NomeLinha = nomeLinha;
    }

    public String getIdItinerario() {
        return idItinerario;
    }

    public void setIdItinerario(String idItinerario) {
        this.idItinerario = idItinerario;
    }


}
