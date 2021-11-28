package com.m1s04.techdive;

import java.util.Scanner;

public class Ex03CalculadoraIMC {
    public static void main(String[] args) {
        double altura;
        double peso;
        double imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite sua altura em metros com 2 casas decimais (Ex: 1,82): ");
        altura = scanner.nextDouble();

        System.out.println("Por favor, digite seu peso em kg: ");
        peso = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);
    }
}
