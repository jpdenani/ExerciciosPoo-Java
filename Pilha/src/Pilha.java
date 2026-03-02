public class Pilha {
    private No topo;

    public void push(int dado) {
        No p = new No();
        p.setDado(dado);
        p.setProximo(null);

        if (topo == null) {
            topo = p;
        } else {
            p.setProximo(topo);
            topo = p;
        }
    }

    public void consultar() {
        if (topo == null) {
            System.out.println("A pilha está vazia.");
        } else {
            No atual = topo;

            System.out.println("A pilha contém:");

            while (atual != null) {
                System.out.println(atual.getDado());
                atual = atual.getProximo();
            }
        }

    }

    public Integer pop() {
        if (topo == null) {
            System.out.println("Pilha vazia, não há itens para excluir!");
            return null;
        } else {
            int valor = topo.getDado();
            topo = topo.getProximo();
            return valor;
        }
    }

    public int tamanho(){
        No atual = topo;
        int cont = 0;
        while(atual != null){
            cont += 1;
            atual = atual.getProximo();
        }
        return cont;
    }

    public void peek(){
        if(topo == null){
            System.out.println("A pilha está vazia.");
        }else{
            System.out.println("O primeiro elemento da pilha é: " + topo.getDado());
        }
    }

    public void limpar(){
        if(topo == null){
            System.out.println("A pilha já está vazia.");
        }else{
            topo = null;
            System.out.println("Pilha limpa!");
        }
    }
}
