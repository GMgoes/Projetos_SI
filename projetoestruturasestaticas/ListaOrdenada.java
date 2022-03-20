/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoestruturasestaticas;

/**
 *
 * @author Suporte2
 */
//Classe de API
//ListaEstatica
//Encapsulamento
public class ListaOrdenada<G> {
    
    private G[] vetor;
    private int quantidade;
    
    public ListaOrdenada(){
        this(10);
    }
    
    public ListaOrdenada(int tamanho){
        this.vetor = (G[]) new Object[tamanho];
        this.quantidade = 0;
    }
    
    boolean inserir(G valor){
        if(cheia())
            return false;
        vetor[quantidade++] = valor;
        return true;
    }
    G remover(G valor){
        int i = 0;
        while (i < quantidade && ! this.vetor[i].equals(valor)) i++;
        if(i == quantidade)
            return null; 
        G ret = this.vetor[i];
        i++;
        while(i < quantidade)
            this.vetor[i-1] = this.vetor[i];
            i++; 
        this.quantidade--;
        return ret;   
    }
    //int buscar(int valor){}
    boolean vazia(){
        return(quantidade==0);
    }
    boolean cheia(){
        return (quantidade == vetor.length);
    }
    G get(int posicao){
        if(posicao >= quantidade)
            return null;
        return vetor[posicao];
    }
    
    void esvaziar(){
        this.quantidade = 0;
    }
    //TODO:Criar método para alterar também
}
