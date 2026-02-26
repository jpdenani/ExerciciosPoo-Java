package br.com.exercicio_30set;

public class Papagaio extends Animal{

    public Papagaio(String nome, int idade, String som, String tipo, String peso) {
        super(nome, idade, som, tipo, peso);
    }
    public String falar(){
        return "O papagaio fala muitas palavras.";
    }
}
