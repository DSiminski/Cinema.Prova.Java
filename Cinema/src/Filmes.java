package com.company;

import java.util.ArrayList;
import java.util.List;

public class Filmes {
    private String Categorias;
    private long indicacao;
    private List<Sessões> titulos = new ArrayList<Sessões>();

    public Filmes() {
    }

    public Filmes(String categorias, long indicacao, List<Sessões> titulos) {
        Categorias = categorias;
        this.indicacao = indicacao;
        this.titulos = titulos;
    }

    public Filmes(String categorias, long indicacao) {
        Categorias = categorias;
        this.indicacao = indicacao;
    }

    public String getCategorias() {
        return Categorias;
    }


    public void setCategorias(String categorias) {
        Categorias = categorias;
    }

    public long getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(long indicacao) {
        this.indicacao = indicacao;
    }

    public List<Sessões> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<Sessões> titulos) {
        this.titulos = titulos;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "Categorias='" + Categorias + '\'' +
                ", indicacao=" + indicacao +
                ", titulos=" + titulos +
                '}';
    }
}
