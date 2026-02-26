package br.com.exercicio_30set;

public class Zoologico {
    public static void main(String[] args) {

        Animal[] animais = new Animal[4];
        animais[0] = new Cachorro("Rex", 4, "Latido", "Mamífero", "15kg");
        animais[1] = new Urso("Jorge", 9, "Rugido", "Mamífero", "200kg");
        animais[2] = new Papagaio("Pirata", 2, "Parlato", "Ave", "1kg");
        animais[3] = new Aguia("Roger", 3, "Grasno", "Ave", "6kg");
        for (int i = 0; i < animais.length; i++) {
            Animal animal = animais[i];
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade() + " anos");
            System.out.println("Som: " + animal.getSom());
            System.out.println("Tipo: " + animal.getTipo());
            System.out.println("Peso: " + animal.getPeso());
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                System.out.println(cachorro.correr());
            } else if (animal instanceof Urso) {
                Urso urso = (Urso) animal;
                System.out.println(urso.hibernar());
            } else if (animal instanceof Papagaio) {
                Papagaio papagaio = (Papagaio) animal;
                System.out.println(papagaio.falar());
            } else if (animal instanceof Aguia) {
                Aguia aguia = (Aguia) animal;
                System.out.println(aguia.voo());
            };
            System.out.println("----------------------------");
        }
    }
}
