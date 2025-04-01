package org.exercicio02;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        while (true) {
            System.out.print("Digite sua senha: ");
            String senha = input.nextLine();

            String erro = validar(senha);
            if (erro == null) {
                System.out.println("\nCadastro bem sucedido. Bem-vindo, " + nome + "!");
                break;
            } else {
                System.out.println("ERRO: " + erro + " Tente novamente!");
            }
        }
        input.close();
    }

    public static String validar(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter no mínimo 8 caracteres.";
        }

        boolean maiuscula = false;
        boolean numero = false;
        boolean especial = false;
        String especiais = "@#$!%&*";

        for (char caractere : senha.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                maiuscula = true;
            } else if (Character.isDigit(caractere)) {
                numero = true;
            } else if (especiais.contains(String.valueOf(caractere))) {
                especial = true;
            }
        }

        if (!maiuscula) {
            return "A senha deve ter pelo menos uma letra maiúscula.";
        }

        if (!numero) {
            return "A senha deve ter pelo menos um número.";
        }

        if (!especial) {
            return "A senha deve ter pelo menos um caractere especial (@#$!%&*).";
        }

        return null;
    }
}
