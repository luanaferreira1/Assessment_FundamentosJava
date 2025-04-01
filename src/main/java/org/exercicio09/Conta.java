package org.exercicio09;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 50.5;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("\nERRO: Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("\nERRO: Saldo insuficiente para saque de R$ " + valor + ".\n");
            }
        } else {
            System.out.println("ERRO: Valor de saque inválido.\n");
        }
    }

    public void exibirSaldo() {
        System.out.println("\nTitular: " + titular);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public static void main(String[] args) {
        Conta conta = new Conta("Ana");

        conta.exibirSaldo();

        conta.depositar(1000.50);
        conta.sacar(900.75);
        conta.depositar(-200.50);
        conta.sacar(800);
        conta.sacar(-800);
        conta.depositar(500);

        conta.exibirSaldo();
    }
}
