/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proxectoerros;

/**
 *
 * @author a21alencf
 */
public class ProxectoErros {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int num = 789;
        int resto;
        int numInvertido=0;
        
        while(num!=0){
            resto=num/10;
            numInvertido = numInvertido*10+resto;
            num/=10;
        }
        System.out.println("Número invertido é "+numInvertido);
    }
}