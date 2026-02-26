package br.com.exercicio_30set;

public class Urso extends Animal{

    public Urso(String nome, int idade, String som, String tipo, String peso) {
        super(nome, idade, som, tipo, peso);
    }
    public String hibernar(){
        return "O urso está hibernando.";
    }
}
