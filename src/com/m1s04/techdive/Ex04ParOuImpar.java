package com.m1s04.techdive;

import java.util.Scanner;

public class Ex04ParOuImpar {
    public static void main(String[] args) {
        int numeroTestado;
        String resultadoTeste;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira um número inteiro: ");
        numeroTestado = scanner.nextInt();

        resultadoTeste = ((numeroTestado % 2) == 0) ? "par" : "impar";

        System.out.println("O número testado é " + resultadoTeste);
    }
}
