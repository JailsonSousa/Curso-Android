package com.jailsonsousa.recyclerview.model;

public class Evento {

    private String nomeEvento;
    private String descricao;
    private String endereco;
    private int imagem;

    public Evento(){

    }

    public Evento(String nomeEvento, String descricao, String endereco, int imagem) {
        this.nomeEvento = nomeEvento;
        this.descricao = descricao;
        this.endereco = endereco;
        this.imagem = imagem;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
