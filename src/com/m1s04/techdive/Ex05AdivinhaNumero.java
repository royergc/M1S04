package com.m1s04.techdive;

import java.util.Random;
import java.util.Scanner;

public class Ex05AdivinhaNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando.");
        int numeroEscolhido = scanner.nextInt();
        while(numeroEscolhido < 1 || numeroEscolhido > 5) {
            System.out.println("Numero escolhido precisa estar entre 1 e 5, escolha novamente");
            numeroEscolhido = scanner.nextInt();
        }
//        numeroSorteado = (int) ((Math.random() * 5) + 1);
        int numeroSorteado = random.nextInt(5) + 1;

        if(numeroEscolhido == numeroSorteado) {
            System.out.println("Voce acertou!");
        } else {
            System.out.println("Voce errou, o numero correto era " + numeroSorteado);
        }
    }
}
