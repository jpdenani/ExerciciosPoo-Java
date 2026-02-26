package br.com.exercicio_30set_2;

public class Onibus extends Veiculos {

    public Onibus(String modelo, String marca, int ano,
                  String cor, String cambio, String vMax,
                  String zeroCem, double preco) {
        super(modelo, marca, ano, cor, preco, vMax, cambio, zeroCem);
    }

    public String capacidade(){
        return "O ônibus tem grande capacidade de passageiros.";
    }
}
