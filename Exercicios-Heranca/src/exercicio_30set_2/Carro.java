package br.com.exercicio_30set_2;

public class Carro extends Veiculos{
    public Carro(String modelo, String marca, int ano,
                 String cor, String cambio, String vMax,
                 String zeroCem, double preco) {
        super(modelo, marca, ano, cor, preco, vMax, cambio, zeroCem);
    }

    public String tipo(){
        return "O carro é um veículo de passeio.";
    }
}
