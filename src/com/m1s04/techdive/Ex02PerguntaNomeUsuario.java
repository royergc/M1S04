package com.m1s04.techdive;

import java.util.Scanner;

public class Ex02PerguntaNomeUsuario {
    public static void main(String[] args) {
        String nomeUsuario, sobrenomeUsuario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu sobrenome: ");
        sobrenomeUsuario = scanner.nextLine();

        System.out.println("Agora digite seu nome: ");
        nomeUsuario = scanner.nextLine();

        int totalLetras = nomeUsuario.replace(" ","").length();
        totalLetras += sobrenomeUsuario.replace(" ","").length();

        System.out.println("Seu nome completo é: " + nomeUsuario + " " + sobrenomeUsuario);
        System.out.println("Seu nome completo contém " + totalLetras + " letras.");
    }
}
