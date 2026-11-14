package com.example.cardapiosemana;

import java.time.LocalDate;

public class Prato {

    private String nome;
    private String tipo;
    private String categoria;
    private int porcoes;
    private LocalDate dataPlanejada;
    private String observacao;
    private boolean realizado;

    public Prato(String nome, String tipo, String categoria, int porcoes, LocalDate dataPlanejada, String observacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.categoria = categoria;
        this.porcoes = porcoes;
        this.dataPlanejada = dataPlanejada;
        this.observacao = observacao;
    }
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPorcoes() {
        return porcoes;
    }

    public LocalDate getDataPlanejada() {
        return dataPlanejada;
    }

    public String getObservacao() {
        return observacao;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado (boolean realizado) {
        this.realizado = realizado;
    }

}
