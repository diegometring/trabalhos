package com.mycompany.lista5.heranca;

/**
 *
 * @author Diegoo
 */
public class Aquatico extends Animal{

    public Aquatico(String nome) {
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
        return "Aquatico [nome = " + nome +"]";
    }
    
    
}
