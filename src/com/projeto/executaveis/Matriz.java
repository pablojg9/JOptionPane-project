package com.projeto.executaveis;


import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        int[][] notas = new int[2][3];

        notas[0][0] = 86;
        notas[0][1] = 76;
        notas[0][2] = 100;

        notas[1][0] = 50;
        notas[1][1] = 30;
        notas[1][2] = 29;

        for (int counter = 0; counter < notas.length; counter++) {
            System.out.println("====================================");

            for(int counter2 : notas[counter]){
                System.out.println("Matriz: " + counter2);
            }
        }
    }

}
