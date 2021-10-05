package com.company;
import java.awt.*;

public class Sessões {
    private long horarios;
    private String salas;
    private boolean ativo;

    public Sessões() {
    }
    public Sessões(long horarios, String salas, boolean ativo) {
        this.horarios = horarios;
        this.salas = salas;
        this.ativo = ativo;
    }

    public long getHorarios() {
        return horarios;
    }

    public void setHorarios(long horarios) {
        this.horarios = horarios;
    }

    public String getSalas() {
        return salas;
    }

    public void setSalas(String salas) {
        this.salas = salas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = true;
    }
    public void salavazia(){
        this.ativo = false;
    }

    @Override
    public String toString() {
        return "Sessões{" +
                "horarios=" + horarios +
                ", salas='" + salas + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
