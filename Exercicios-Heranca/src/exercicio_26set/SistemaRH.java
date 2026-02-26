package br.com.exercicio_26set;

public class SistemaRH {

    public static void main(String[] args) {

        // Criando Funcionários - POLIMORFISMO
        Funcionario[] funcionario = new Funcionario[3];

        Desenvolvedor dev = new Desenvolvedor(
                "Alice", "123.456.789-00",
                5000.0, 3, 145.0);
        dev.registrarHorasExtras(10);
        funcionario[0] = dev;

        Gerente ger = new Gerente("Bob", "987.654.321-00",
                8000.0, 5.0, 500.0);

        ger.setBonusPerformance(2000.0);
        ger.setComissao(500.0);
        funcionario[1] = ger;

        Estagiario estagiario = new Estagiario(
                "Charlie", "111.222.333-44",
                200, 6.0);

        estagiario.registrarHoras(5);
        funcionario[2] = estagiario;

        //Processando folha de pagamento
        System.out.println("=== FOLHA DE PAGAMENTO ===");
        double totalFolha = 0;

        for (Funcionario func : funcionario) {
            func.exibirDados();
            totalFolha += func.calcularSalario();
            System.out.println("---");
        }

        System.out.println("TOTAL DA FOLHA: R$ " + totalFolha);

        //Desmonstração de polimorfismo
        System.out.println("\n=== DEMONSTRALÇÃO DE POLIMOFISMO ===");
        for(Funcionario func : funcionario) {
            System.out.println(func.getNome() + " - Salario: R$ " + func.calcularSalario());
        }
    }
}
