package com.m1s04.techdive;

import java.time.LocalTime;

public class Ex01SaudacaoHoraAtual {
    public static void main(String[] args) {
        String saudacao = "";

        int horaAtual = LocalTime.now().getHour();
        int minutoAtual = LocalTime.now().getMinute();

        if (horaAtual < 12) {
            saudacao = "Bom dia, ";
        } else if (horaAtual <= 18) {
            saudacao = "Boa tarde, ";
        } else if (horaAtual <= 24) {
            saudacao = "Boa noite, ";
        }
        System.out.println(saudacao + "no momento são " + horaAtual + ":" + minutoAtual + "h.");
    }
}
