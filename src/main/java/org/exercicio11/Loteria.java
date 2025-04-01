package org.exercicio11;

import java.util.*;

public class Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> sorteados = new HashSet<>();
        while (sorteados.size() < 6) {
            sorteados.add(random.nextInt(60) + 1);
        }

        Set<Integer> apostados = new HashSet<>();
        System.out.println("Digite 6 números entre 1 e 60:");

        while (apostados.size() < 6) {
            System.out.print("Número " + (apostados.size() + 1) + ": ");
            try {
                int numero = scanner.nextInt();
                if (numero < 1 || numero > 60) {
                    System.out.println("ERRO: Número inválido. Digite entre 1 e 60.");
                } else if (!apostados.add(numero)) {
                    System.out.println("ERRO: Número repetido. Digite outro número.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Valor inválido. Digite um número.");
                scanner.next();
            }
        }

        Set<Integer> acertos = new HashSet<>(sorteados);
        acertos.retainAll(apostados);

        System.out.println("\nNúmeros sorteados: " + sorteados);
        System.out.println("Seus números: " + apostados);
        System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);
        scanner.close();
    }
}
