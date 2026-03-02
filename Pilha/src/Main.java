//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pilha pilha1 = new Pilha();

        pilha1.push(10);
        pilha1.push(20);
        pilha1.push(30);

        pilha1.consultar();
        System.out.println("Tamanho:" + pilha1.tamanho());
        pilha1.peek();

        pilha1.pop();

        pilha1.consultar();
        System.out.println("Tamanho:" + pilha1.tamanho());
        pilha1.peek();

        pilha1.limpar();
        pilha1.consultar();
        pilha1.pop();
        pilha1.peek();
        pilha1.limpar();
    }
}