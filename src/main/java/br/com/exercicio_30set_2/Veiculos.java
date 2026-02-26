package br.com.exercicio_30set_2;

public abstract class Veiculos {
    String marca;
    String modelo;
    int ano;
    String cor;
    double preco;
    String vMax;
    String cambio;
    String zeroCem;

    public Veiculos(String marca, String modelo, int ano, String cor,
                    double preco, String vMax, String cambio,
                    String zeroCem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.vMax = vMax;
        this.cambio = cambio;
        this.zeroCem = zeroCem;
    }

    public String getMarca () {
        return marca;
    }
    public String getModelo () {
        return modelo;
    }
    public int getAno () {
        return ano;
    }
    public String getCor () {
        return cor;
    }
    public double getPreco () {
        return preco;
    }
    public String getVMax () {
        return vMax;
    }
    public String getCambio () {
        return cambio;
    }
    public String getZeroCem () {
        return zeroCem;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public void setAno (int ano) {
        this.ano = ano;
    }
    public void setCor (String cor) {
        this.cor = cor;
    }
    public void setPreco (double preco) {
        this.preco = preco;
    }
    public void setVMax (String vMax) {
        this.vMax = vMax;
    }
    public void setCambio (String cambio) {
        this.cambio = cambio;
    }
    public void setZeroCem (String zeroCem) {
        this.zeroCem = zeroCem;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: R$" + preco);
        System.out.println("Velocidade Máxima: " + vMax);
        System.out.println("Câmbio: " + cambio);
        System.out.println("0 a 100 km/h: " + zeroCem);
    }
}
