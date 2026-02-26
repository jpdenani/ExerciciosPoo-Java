package br.com.exercicio_26set;

public class Desenvolvedor extends Funcionario{

    private int horasExtras;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome,String matricula, double salarioBase,
                         int horasExtras, Double valorHoraExtra) {
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }
    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public void registrarHorasExtras(int horasExtra){
        this.horasExtras += horasExtras;
    }

    @Override
    public double calcularSalario() {
        //Escopo de variaveis
        double teste = 1.5;

        return salarioBase + (valorHoraExtra * horasExtras);
    }
}
