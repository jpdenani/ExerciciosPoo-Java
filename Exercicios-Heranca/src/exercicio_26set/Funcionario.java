package br.com.exercicio_26set;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;
    //construtor
    public Funcionario (String nome, String matricula, Double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }
    //getters e setters
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //método para ser implementado nas subclasses
    public abstract double calcularSalario();

    //método abstrato deve ser implementado nas subclasses
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salaraio Final: " + calcularSalario());
    }
}
