package com.mycompany.lista5.heranca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diegoo
 */
public class Terrestre extends Animal {

    public Terrestre(String nome) {
        super(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Terrestre [nome = " + nome +"]";
    }
    
    
    
    
}
