package com.m1s04.techdive;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex06CalculadoraDeIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento no formato dd/mm/aaaa: ");
        String dataDigitada = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataDigitada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period periodo = Period.between(dataNascimento, LocalDate.now());
        int idadeEmAnos = periodo.getYears();

        if (idadeEmAnos >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
