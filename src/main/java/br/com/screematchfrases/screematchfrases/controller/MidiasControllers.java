package br.com.screematchfrases.screematchfrases.controller;

import br.com.screematchfrases.screematchfrases.dto.FraseDTO;
import br.com.screematchfrases.screematchfrases.dto.SerieDTO;
import br.com.screematchfrases.screematchfrases.model.Serie;
import br.com.screematchfrases.screematchfrases.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class MidiasControllers {

    @Autowired
    private SerieService service;

    @GetMapping("")
    public List<FraseDTO> obterFrases(){
       return service.obterSerieAleatorias();
    }
}
