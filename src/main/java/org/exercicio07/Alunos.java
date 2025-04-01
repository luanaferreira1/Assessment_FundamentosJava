package org.exercicio07;

import java.util.Scanner;

public class Alunos {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Alunos(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.printf("Média: %.2f - ", media);
        if (media >= 7) {
            System.out.println("Situação: Aprovado.");
        } else {
            System.out.println("Situação: Reprovado.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        Alunos aluno = new Alunos(nome, matricula, nota1, nota2, nota3);

        System.out.println("\nResultado:");
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        aluno.verificarAprovacao();

        scanner.close();
    }
}