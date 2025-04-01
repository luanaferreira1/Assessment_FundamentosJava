package org.exercicio04;

import java.util.Scanner;

public class SimuEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo: ");
        double emprestimo = scanner.nextDouble();

        int parcelas;
        do {
            System.out.print("Quantidade de parcelas (min 6, máx 48): ");
            parcelas = scanner.nextInt();
            if (parcelas < 6 || parcelas > 48) {
                System.out.println("ERRO: Número de parcelas inválido. Digite um valor entre 6 e 48.");
            }
        } while (parcelas < 6 || parcelas > 48);

        double juros = 0.03;
        double total = emprestimo * Math.pow(1 + juros, parcelas);
        double valorParcela = total / parcelas;

        System.out.printf("\nCliente: %s\n", nome);
        System.out.printf("Valor do empréstimo: R$ %.2f\n", emprestimo);
        System.out.printf("Parcelas: %d\n", parcelas);
        System.out.printf("Valor total pago: R$ %.2f\n", total);
        System.out.printf("Valor da parcela mensal: R$ %.2f\n", valorParcela);
        scanner.close();
    }
}

