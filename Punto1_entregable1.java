/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto1_entregable1;

import java.util.Scanner;

/**
 *
 * @author albei
 */
public class Punto1_entregable1 {

    public static void main(String[] args) {
      int edjuan, edana,edalber,edmama;
      
      System.out.println("Ingrese la edad de Juan: ");
      Scanner entrada= new Scanner(System.in);
      edjuan = entrada.nextInt(); //lee la edad de Juan
      
      edalber = 2*(edjuan)/3;
      edana = 4*(edjuan)/3;
      edmama = edjuan+edalber+edana;
      
      System.out.println("La edad de Juan es "+edjuan);
      System.out.println("La edad de Alberto es "+edalber);
      System.out.println("La edad de Ana es "+edana);
      System.out.println("La edad de la mama es "+edmama);
        
    }
}
