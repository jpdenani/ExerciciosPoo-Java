package br.com.exercicio_30set;

public abstract class Animal {
    String nome;
    int idade;
    String som;
    String tipo;
    String peso;

    //construtor
    public Animal (String nome, int idade, String som, String tipo, String peso) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
        this.tipo = tipo;
        this.peso = peso;
    }

    //acessores
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSom() {
        return som;
    }
    public String getTipo() {
        return tipo;
    }
    public String getPeso() {
        return peso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }

    //implementar nas subclasses
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Som: " + som);
        System.out.println("Tipo: " + tipo);
    }

}