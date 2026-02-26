package br.com.exercicio_30set;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String som, String tipo, String peso) {
        super(nome, idade, som, tipo, peso);
    }
    public String correr(){
        return "O cachorro corre rápido.";
    }
}
