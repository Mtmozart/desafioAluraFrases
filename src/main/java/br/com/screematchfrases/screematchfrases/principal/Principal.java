package br.com.screematchfrases.screematchfrases.principal;

import br.com.screematchfrases.screematchfrases.model.DadosSerie;
import br.com.screematchfrases.screematchfrases.model.Frase;
import br.com.screematchfrases.screematchfrases.model.Serie;
import br.com.screematchfrases.screematchfrases.repository.SerieRepositorio;
import br.com.screematchfrases.screematchfrases.service.ConsumoApi;
import br.com.screematchfrases.screematchfrases.service.ConverteDados;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
            System.out.println(menu);
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    buscarMidia();
                    break;
                case 2:
                    adicionarFraseMidia();
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

    private DadosSerie getDadosMidia() {
        System.out.println("Digite o nome da série/filme para busca: ");
        var nomeSerie = sc.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = converte.obterDados(json, DadosSerie.class);
        return dados;
    }

    private void buscarMidia() {
        DadosSerie dados = getDadosMidia();
        Serie serie = new Serie(dados.titulo(), dados.poster());
        repositorio.save(serie);
        System.out.println(dados);
    }

    private void adicionarFraseMidia() {
        listaSerie();
        System.out.println("Escolha o filme da série");
        String nomeMidia = sc.nextLine();
        Optional<Serie> midia = repositorio.findByTituloContainingIgnoreCase(nomeMidia);

        if (midia.isPresent()) {
            Serie serie = midia.get();
            System.out.println("Digite quem disse a frase: ");
            String autorFrase = sc.nextLine();
            System.out.println("Digite a frase: ");
            String fraseDita = sc.nextLine();
            Frase frase = new Frase(autorFrase, fraseDita);
            frase.setSerie(serie);
            serie.getFrases().add(frase);

            repositorio.save(serie);
            System.out.println(serie.toString());

        }
        else {
            System.out.println("Série não encontrada.");
        }
    }

    private void listaSerie() {
        List<Serie> series = repositorio.findAll();
        series.stream()
                .forEachOrdered(e -> System.out.println(e.getTitulo()));
    }



}
