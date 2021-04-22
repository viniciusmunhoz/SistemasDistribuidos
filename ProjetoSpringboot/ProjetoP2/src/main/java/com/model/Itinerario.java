package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Itinerario {
    @Id
    private String _id;
    private String Itinerario;
    private String Sentido;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getItinerario() {
        return Itinerario;
    }

    public void setItinerario(String itinerario) {
        Itinerario = itinerario;
    }

    public String getSentido() {
        return Sentido;
    }

    public void setSentido(String sentido) {
        Sentido = sentido;
    }

}
