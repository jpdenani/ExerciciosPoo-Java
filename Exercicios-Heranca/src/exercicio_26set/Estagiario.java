package br.com.exercicio_26set;

public class Estagiario extends Funcionario{

    private int horasTrabalhadas;
    private double valorHoraTrabalhada;

    public Estagiario (String nome, String matricula, int horasTrabalhadas, double valorHoraTrabalhada) {
        super(nome, matricula, 1000.0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraTrabalhada = 1.0;
    }
    public void registrarHoras(int horas) {
        this.horasTrabalhadas += horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + horasTrabalhadas * valorHoraTrabalhada;
    }
}
