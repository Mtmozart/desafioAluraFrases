package br.com.screematchfrases.screematchfrases.principal;

import br.com.screematchfrases.screematchfrases.model.DadosSerie;
import br.com.screematchfrases.screematchfrases.model.Frase;
import br.com.screematchfrases.screematchfrases.model.Serie;
import br.com.screematchfrases.screematchfrases.repository.SerieRepositorio;
import br.com.screematchfrases.screematchfrases.service.ConsumoApi;
import br.com.screematchfrases.screematchfrases.service.ConverteDados;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);

    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados converte = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";
    private SerieRepositorio repositorio;

    public Principal(SerieRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void exibirMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    1 - Buscar Serie 
                    2 - Cadastrar frase
                    3 - Lista Serie
                                        
                    0 - Sair
                    """;
            switch (opcao) {
                case 1:
                    buscarSerie();
                    break;
                case 2:
                    adicionarFraseSerie();
                    break;
                case 3:
                    listaSerie();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private DadosSerie getDadosSerie() {
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = sc.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = converte.obterDados(json, DadosSerie.class);
        return dados;
    }



    private void buscarSerie() {
        DadosSerie dados = getDadosSerie();
        Serie serie = new Serie(dados.titulo(), dados.poster());
        repositorio.save(serie);
        System.out.println(dados);
    }

    private Frase adicionarFraseSerie() {
        listaSerie();

        System.out.println("Digite quem disse a prase: ");
        String autorFrase = sc.nextLine();
        System.out.println("Digite a frase: ");
        String fraseDita = sc.nextLine();
        Frase frase = new Frase(autorFrase, fraseDita);
        return frase;

    }

    private void listaSerie() {
        List<Serie> series = repositorio.findAll();
        series.stream()
                .sorted(Comparator.comparing(Serie::getTitulo)).forEach(e -> System.out.println(e.getTitulo()));

    }


}
