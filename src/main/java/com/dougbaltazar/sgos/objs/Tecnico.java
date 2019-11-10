/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dougbaltazar.sgos.objs;

/**
 *
 * @author Cliente
 */
public class Tecnico {
    private int id;
    private String nome;
    private int trabalhos;
    private String status;
    private Contato contato;
    public Tecnico(int i, String n, int t, String st, Contato c) {
        this.id = i;
        this.nome = n;
        this.trabalhos = t;
        this.status = st;
        this.contato = c;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the trabalhos
     */
    public int getTrabalhos() {
        return trabalhos;
    }

    /**
     * @param trabalhos the trabalhos to set
     */
    public void setTrabalhos(int trabalhos) {
        this.trabalhos = trabalhos;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the contato
     */
    public Contato getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
}
