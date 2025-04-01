package org.exercicio03;

import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();
        double salarioAnual = salarioMensal * 12;

        System.out.println("\nNome: " + nome);
        System.out.printf("Salário Anual: R$ %.2f\n", salarioAnual);

        double impostoSimples = calcImpostoSimples(salarioAnual);
        double salarioLiqSimples = salarioAnual - impostoSimples;

        System.out.println("\nCálculo simples:");
        System.out.printf("Imposto a pagar: R$ %.2f\n", impostoSimples);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiqSimples);

        double impostoProgressivo = calcImpostoProgressivo(salarioAnual);
        double salarioLiqProgressivo = salarioAnual - impostoProgressivo;

        System.out.println("\nCálculo progressivo:");
        System.out.printf("Imposto a pagar: R$ %.2f\n", impostoProgressivo);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiqProgressivo);
        scanner.close();
    }

    public static double calcImpostoSimples(double salarioAnual) {
        if (salarioAnual <= 22847.76) {
            return 0;
        } else if (salarioAnual <= 33919.80) {
            return salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            return salarioAnual * 0.15;
        } else {
            return salarioAnual * 0.275;
        }
    }

    public static double calcImpostoProgressivo(double salarioAnual) {
        if (salarioAnual <= 22847.76) {
            return 0.0;
        } else if (salarioAnual <= 33919.80) {
            return (salarioAnual - 22847.76) * 0.075;
        } else if (salarioAnual <= 45012.60) {
            return (salarioAnual - 33919.80) * 0.15 + 829.66;
        } else {
            return (salarioAnual - 45012.60) * 0.275 + 829.66 + 1663.92;
        }
    }
}