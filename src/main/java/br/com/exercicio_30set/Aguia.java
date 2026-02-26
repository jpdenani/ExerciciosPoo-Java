package br.com.exercicio_30set;

public class Aguia extends Animal{

    public Aguia(String nome, int idade, String som, String tipo, String peso) {
        super(nome, idade, som, tipo, peso);
    }

    public String voo(){
        return "A águia é veloz no voo.";
    }
}
