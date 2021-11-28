package com.m1s04.techdive;

import java.util.Scanner;

public class Ex09CalculadoraFatorial {
    public static void main(String[] args){
        int numeroCalcularFatorial = 0;
        int resultadoFatorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de 0 a 10 que deseja calcular o fatorial: ");
        numeroCalcularFatorial = scanner.nextInt();
        if(numeroCalcularFatorial > 10 || numeroCalcularFatorial < 0) {
            System.out.println("Número inválido - o número escolhido precisa estar entre 0 e 10");
        } else {
            for(int i = numeroCalcularFatorial; i > 1; i--) {
                resultadoFatorial *= i;
            }
            System.out.printf("O fatorial de %d é %d%n", numeroCalcularFatorial,resultadoFatorial);
        }
    }
}
