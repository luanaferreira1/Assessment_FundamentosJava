package org.exercicio08;

public class SistemaFunc {
    static class Funcionario {
        private String nome;
        private double salarioBase;

        public void defDados(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }

        public double getSalarioBase() {
            return salarioBase;
        }

        public double calcularSalario() {
            return salarioBase;
        }

        public void exibirDados() {
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Salário base: R$ %.2f\n", salarioBase);
            System.out.printf("Salário final: R$ %.2f\n", calcularSalario());
        }
    }

    static class Gerente extends Funcionario {
        public Gerente(String nome, double salarioBase) {
            defDados(nome, salarioBase);
        }

        @Override
        public double calcularSalario() {
            return getSalarioBase() * 1.20;
        }
    }

    static class Estagiario extends Funcionario {
        public Estagiario(String nome, double salarioBase) {
            defDados(nome, salarioBase);
        }

        @Override
        public double calcularSalario() {
            return getSalarioBase() * 0.90;
        }
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", 20000.0);
        Estagiario estagiario = new Estagiario("Jorge", 2500.0);

        System.out.println("Gerente:");
        gerente.exibirDados();

        System.out.println("\nEstagiário:");
        estagiario.exibirDados();
    }
}
