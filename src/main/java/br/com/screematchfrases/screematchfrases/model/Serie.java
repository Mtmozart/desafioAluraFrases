package br.com.screematchfrases.screematchfrases.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "series")
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String titulo;
    private String poster;
    @OneToMany(mappedBy = "serie", cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Frase> frases = new ArrayList<>();
    public Serie() { }

    public Serie(String titulo, String poster) {
        this.titulo = titulo;
        this.poster = poster;
    }



    public long getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getPoster() {
        return poster;
    }


    public List<Frase> getFrases() {
        return frases;
    }

    public void setFrases(String frase) {
        frases.forEach(e -> e.setSerie(this));
        this.frases = frases;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", poster='" + poster + '\'' +
                ", frases=" + frases.toString() +
                '}';
    }
}
