package org.exercicio06;

public class Veiculos {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculos(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("\nPlaca: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.printf("Quilometragem: %.2f km\n", this.quilometragem);
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
            System.out.printf("\nViagem registrada: %.2f km adicionados no veículo %s.\n", km, this.placa);
        } else {
            System.out.println("\nERRO: A quilometragem deve ser maior que zero.");
        }
    }

    public static void main(String[] args) {
        Veiculos veiculo1 = new Veiculos("YAP7G1E", "Corolla", 1966, 50500.0);
        Veiculos veiculo2 = new Veiculos("LUX59S2", "Fusca", 1970, 33000.0);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        veiculo1.registrarViagem(680.5);
        veiculo2.registrarViagem(320.0);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
