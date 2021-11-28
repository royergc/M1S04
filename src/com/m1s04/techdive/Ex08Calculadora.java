package com.m1s04.techdive;

import java.util.Scanner;

public class Ex08Calculadora {
    public static void main(String[] args) {
        double[] entrada = {0.0, 0.0};
        double resultado = 0.0;
        int operacaoEscolhida;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora basica");
        System.out.println("Insira o 1o número:");
        entrada[0] = scanner.nextDouble();
        System.out.println("Insira o 2o número:");
        entrada[1] = scanner.nextDouble();

        System.out.printf("Digite o número correspondente " +
                "a operação que deseja realizar: %n1-somar %n2-subtrair" +
                " %n3-multiplicar %n4-dividir%n");
        operacaoEscolhida = scanner.nextInt();

        switch(operacaoEscolhida) {
            case 1:
                resultado = entrada[0] + entrada[1];
                break;
            case 2:
                resultado = entrada[0] - entrada[1];
                break;
            case 3:
                resultado = entrada[0] * entrada[1];
                break;
            case 4:
                resultado = entrada[0] / entrada[1];
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        if(operacaoEscolhida > 0 && operacaoEscolhida < 5) {
            System.out.printf("O resultado da operação é: %.2f", resultado);
        }
    }
}
