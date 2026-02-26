package br.com.exercicio_30set_2;

public class Caminhao extends Veiculos{
    public Caminhao(String modelo, String marca, int ano,
                    String cor, String cambio, String vMax,
                    String zeroCem, double preco) {
        super(modelo, marca, ano, cor, preco, vMax, cambio, zeroCem);
    }

    public String carga(){
        return "O caminhão é usado para transportar cargas pesadas.";
    }
}
