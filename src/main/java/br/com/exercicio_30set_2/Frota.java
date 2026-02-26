package br.com.exercicio_30set_2;

public class Frota {
    public static void main(String[] args) {
        Veiculos[] veiculo = new Veiculos[4];

        veiculo[0] = new Carro("Onix", "Chevrolet", 2020, "Prata",
                "Automático", "200 km/h",
                "9 segundos", 60000);
        veiculo[1] = new Caminhao("FH", "Volvo", 2018, "Branco",
                "Manual", "120 km/h",
                "30 segundos", 350000);
        veiculo[2] = new Moto("Ninja", "Kawasaki", 2021, "Verde",
                "Manual", "280 km/h",
                "3 segundos", 45000);
        veiculo[3] = new Onibus("Paradiso G8 1800 DD", "Marcopolo", 2019, "Azul",
                "Automático", "100 km/h",
                "40 segundos", 800000);

        for (int i = 0; i < veiculo.length; i++) {
            Veiculos v = veiculo[i];
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Ano: " + v.getAno());
            System.out.println("Cor: " + v.getCor());
            System.out.println("Preço: R$" + v.getPreco());
            System.out.println("Velocidade Máxima: " + v.getVMax());
            System.out.println("Câmbio: " + v.getCambio());
            System.out.println("0 a 100 km/h: " + v.getZeroCem());
            if (v instanceof Carro) {
                Carro carro = (Carro) v;
                System.out.println(carro.tipo());
            } else if (v instanceof Caminhao) {
                Caminhao caminhao = (Caminhao) v;
                System.out.println(caminhao.carga());
            } else if (v instanceof Moto) {
                Moto moto = (Moto) v;
                System.out.println(moto.manobra());
            } else if (v instanceof Onibus) {
                Onibus onibus = (Onibus) v;
                System.out.println(onibus.capacidade());
            }
            System.out.println("----------------------------");

        }
    }

}
