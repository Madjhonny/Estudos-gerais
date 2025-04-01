package Estudos_Listas.Exercicio1;

public class ListaEncadeadaTeste {
    public static void main (String [] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista);

    }
}
