package com.m1s04.techdive;

import java.util.Scanner;

public class Ex10CalculadoraPAePG {
    public static void main(String[] args) {
        int escolhaPAPG;
        int valorInicial;
        int raiz;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira o valor inicial: ");
        valorInicial = scanner.nextInt();
        System.out.println("Agora insira o valor da raiz: ");
        raiz = scanner.nextInt();
        System.out.printf("Você deseja calcular: %n(1) - PA %n(2) - PG %n");
        escolhaPAPG = scanner.nextInt();

        if(escolhaPAPG == 1) {
            System.out.println("Você escolheu PA");
            System.out.printf("A PA escolhida com o valor inicial %d e a raiz %d é: ", valorInicial, raiz);
            System.out.printf("%n%d",valorInicial);
            for(int i = 1; i < 10; i++) {
                valorInicial += raiz;
                System.out.printf(" %d", valorInicial);
            }
            System.out.printf("%n");
        } else if(escolhaPAPG == 2){
            System.out.println("Você escolheu PG");
            System.out.printf("A PG escolhida com o valor inicial %d e a raiz %d é: ", valorInicial, raiz);
            System.out.printf("%n%d",valorInicial);
            for(int i = 1; i < 10; i++) {
                valorInicial *= raiz;
                System.out.printf(" %d", valorInicial);
            }
            System.out.printf("%n");
        } else {
            System.out.println("Opção inválida, você deve escolher 1 para PA ou 2 para PG.");
        }
    }
}
