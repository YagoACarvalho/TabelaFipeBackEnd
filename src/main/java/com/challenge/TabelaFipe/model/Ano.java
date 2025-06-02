package com.challenge.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Ano {
   @JsonAlias("codigo")
    private String codigoAno;
    private String nome;


    public String getCodigoAno() {
        return codigoAno;
    }

    public void setCodigoAno(String codigoAno) {
        this.codigoAno = codigoAno;
    }

    @Override
    public String toString() {
        return nome + " Código = " + codigoAno ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
