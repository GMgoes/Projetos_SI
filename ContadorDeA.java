/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contadordea;

import java.util.Scanner;

/**
 *
 * @author Suporte2
 */
public class ContadorDeA {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Fragmentadora palavra = new Fragmentadora();
        
        System.out.println(palavra.conversor(entrada.nextLine()));

    }
}

class Fragmentadora {
    
    public int conversor(String oracao){
        int aux = 0;
        char[] caracteres = oracao.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == 'a'){
            aux++;
            }               
        }
        return aux;
    }
}