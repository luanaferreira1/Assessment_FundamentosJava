package org.exercicio12;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String user1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String user2 = scanner.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i < 10; i++) {
            String userAtual;

            if (i % 2 == 0) {
                userAtual = user1;
            } else {
                userAtual = user2;
            }

            System.out.print(userAtual + ", digite sua mensagem: ");
            String mensagem = scanner.nextLine();
            mensagens[i] = userAtual + ": " + mensagem;
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (String msg : mensagens) {
            System.out.println(msg);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");
        scanner.close();
    }
}

