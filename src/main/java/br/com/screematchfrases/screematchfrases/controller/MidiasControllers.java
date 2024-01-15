package br.com.screematchfrases.screematchfrases.controller;

import br.com.screematchfrases.screematchfrases.model.Serie;
import br.com.screematchfrases.screematchfrases.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class MidiasControllers {

    @Autowired
    private SerieService service;

    @GetMapping("")
    public String obterFrases(){
       return service.obterSerieAleatorias();
    }
}
