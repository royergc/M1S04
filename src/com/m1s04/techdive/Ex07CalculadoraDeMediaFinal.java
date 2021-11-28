package com.m1s04.techdive;

import java.util.Scanner;

public class Ex07CalculadoraDeMediaFinal {
    public static void main(String[] args) {
        double somaDasNotas = 0.0;
        double mediaFinal = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira suas 3 notas do semestre.");

        for(int i = 0; i < 3; i++) {
            System.out.println( (i+1) + "a nota: ");
            somaDasNotas += scanner.nextDouble();
        }
        mediaFinal = somaDasNotas / 3;
        System.out.printf("Sua média final é: %.2f",mediaFinal);
    }
}
