package com.cleomar.ApiMaquina.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Maquina {
    public Transicao transicoes;
    public Transicao getTransicoes() {
        return transicoes;
    }
     public Estado estado;
    public void setTransicoes(Transicao transicoes) {
        this.transicoes = transicoes;
    }

//Voltar para enum de novo o estado
    public void MudarEstado(Maquina maquina){
        if(maquina.transicoes == this.transicoes.OitoHoras_AM){
           this.estado.estadoAtual = "TRABALHANDO";
        }
        else if(maquina.transicoes == this.transicoes.MeioDia) {
            this.estado.estadoAtual = "DESCANSANDO";
        }
        else if(maquina.transicoes == this.transicoes.TrezeHoras){
            this.estado.estadoAtual=  "TRABALHANDO";
        }
        else if(maquina.transicoes == this.transicoes.DezoitoHoras){
            this.estado.estadoAtual= "DESCANSANDO";
        }
        else if(maquina.transicoes == this.transicoes.VinteDuasHoras){
            this.estado.estadoAtual= "DORMINDO";
        }

    }
}
