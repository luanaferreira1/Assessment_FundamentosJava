package org.exercicio10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path arquivo = Path.of("compras.txt");

        try {
            StringBuilder conteudo = new StringBuilder();

            for (int i = 1; i <= 3; i++) {
                System.out.println("\nCompra " + i);

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                System.out.print("Preço unitário: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                conteudo.append(produto)
                        .append(",")
                        .append(quantidade)
                        .append(",")
                        .append(preco)
                        .append("\n");
            }

            Files.writeString(arquivo, conteudo.toString(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("\nCompras registradas no arquivo: " + arquivo);

            System.out.println("\nResumo:");

            Files.lines(arquivo).forEach(linha -> {
                String[] dados = linha.split(",");
                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double preco = Double.parseDouble(dados[2]);

                System.out.println("Produto: " + produto);
                System.out.println("Quantidade: " + quantidade);
                System.out.printf("Preço: R$ %.2f%n", preco);
                System.out.printf("Total: R$ %.2f%n\n", quantidade * preco);
            });

        } catch (IOException e) {
            System.out.println("Erro no arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro nos números digitados");
        } finally {
            scanner.close();
        }
    }
}