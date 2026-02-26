package br.com.exercicio_30set_2;

public class Moto extends Veiculos{
    public Moto(String modelo, String marca, int ano,
                String cor, String cambio, String vMax,
                String zeroCem, double preco) {
        super(modelo, marca, ano, cor, preco, vMax, cambio, zeroCem);
    }

    public String manobra() {
        return "A moto é ágil e fácil de manobrar.";
    }
}
