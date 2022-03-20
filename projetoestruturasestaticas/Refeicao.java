/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoestruturasestaticas;

import java.util.List;

/**
 *
 * @author Suporte2
 */
// O Java sempre extends da Classe Object do próprio Java, se você não puxar nada.
public class Refeicao {
    
    private String nome;
    // Diamantezinhos, significam generalização, está generalizando os valores que você vai colocar na lista.
    private List<String> ingredientes;
    private Double preco;
    
    // O Java gera um construtor vazio sempre, porém se você colocar um construtor, ele não gera mais
    public Refeicao(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    
    
}
