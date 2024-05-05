package com.edu.backend_java.modulos.sintaxe.desafio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.print("Informe o número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Informe o Número da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Informe o Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Informe seu Nome: ");
        String nomeCliente = scanner.next();

        System.out.print("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }

}
