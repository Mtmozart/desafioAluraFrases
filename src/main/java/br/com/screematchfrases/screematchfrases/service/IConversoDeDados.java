package br.com.screematchfrases.screematchfrases.service;

public interface IConversoDeDados {
    <T> T obterDados(String json, Class<T> classe);

}
