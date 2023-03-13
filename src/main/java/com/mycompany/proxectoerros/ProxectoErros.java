/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proxectoerros;

import java.util.Scanner;

/**
 *
 * @author a21alencf
 */
public class ProxectoErros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int resto;
        int numInvertido=0;
        
        while(num!=0){
            resto=num%10;
            numInvertido = numInvertido*10+resto;
            num/=10;
        }
        System.out.println("Número invertido é "+numInvertido);
    }
}
