public class Fila {

    private No inicio;
    private No fim;

    public void Consultar() {

        if (inicio == null) {
            System.out.println("A fila está vazia");
            return;
        }

        No atual = inicio;

        System.out.println("A fila contém:");

        while (atual != null) {
            System.out.println(atual.getNome());
            atual = atual.getProximo();
        }
    }

    public void Inserir(String nome) {

        No p = new No();
        p.setNome(nome);
        p.setProximo(null);

        if (inicio == null) {
            inicio = p;
            fim = p;
        }
        else {
            fim.setProximo(p);
            fim = p;
        }
    }

    public String excluir() {

        if (inicio == null) {
            System.out.println("Fila vazia!");
            return null;
        }

        No aux = inicio;
        String nomeRemovido = aux.getNome();

        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProximo();
        }

        return nomeRemovido;
    }
    public String primeiro() {

        if (inicio == null) {
            System.out.println("Fila vazia!");
            return null;
        }

        return inicio.getNome();
    }

    public void limpar() {

        inicio = null;
        fim = null;

        System.out.println("Fila limpa!");
    }
}