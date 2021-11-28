package com.m1s04.techdive;

import java.util.Scanner;

public class Ex05AdivinhaNumero {
    public static void main(String[] args) {
        int numeroSorteado;
        int numeroEscolhido;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando.");
        numeroEscolhido = scanner.nextInt();
        numeroSorteado = (int) ((Math.random() * 5) + 1);

        if(numeroEscolhido == numeroSorteado) {
            System.out.println("Voce acertou!");
        } else {
            System.out.println("Voce errou, o numero correto era " + numeroSorteado);
        }
    }
}
