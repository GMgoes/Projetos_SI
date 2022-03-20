package com.mycompany.organizador;

/**
 *
 * @author Suporte2
 */

import java.util.Scanner;
public class Organizador {

    public static void main(String[] args) {
        
        var organizador = new Organizacao();   
        
        Scanner entrada = new Scanner(System.in);
        
        int[] vet = new int[3];   
        vet[0] = entrada.nextInt();
        vet[1] = entrada.nextInt();
        vet[2] = entrada.nextInt();
        
        organizador.organizador(vet);
    }    
}
class Organizacao{

    void organizador(int[] vet){
        int aux;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if(vet[j] > vet[i]){
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+" ");
        }
    }
    
}
