package br.com.screematchfrases.screematchfrases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String autor;
    private String frase;

    @ManyToOne()
    private Serie serie;


    public Frase(){

    }
    public Frase( String autor, String frase) {
        this.autor = autor;
        this.frase = frase;
    }

    public Serie getSerie() {
        return serie;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Frase{" +
                "autor='" + autor + '\'' +
                ", frase='" + frase + '\'' +
                ", serie=" + serie.getTitulo() +
                '}';
    }
}
