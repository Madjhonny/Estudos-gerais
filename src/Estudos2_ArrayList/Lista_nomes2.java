// UTLIZANDO ARRAYLIST JUNTO A EXCEÇÕES

package Estudos2_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista_nomes2 {

    public static void main (String [] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Vitor");
        nomes.add("Guilherme");
        nomes.add("Pedro");

        System.out.println(nomes);

        Scanner scanner = new Scanner(System.in);
        String nomeSelecionado = "";

        while (true) {

            try {
                System.out.print("Escolha um nome para ser removido: ");
                nomeSelecionado = scanner.nextLine();

                if (!nomeSelecionado.equals("Carlos") && !nomeSelecionado.equals("Vitor") && !nomeSelecionado.equals("Guilherme") && !nomeSelecionado.equals("Pedro")) {
                    throw new IllegalArgumentException("Escolha apenas entre os nomes informados: " + nomes);

                }
                break;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        nomes.remove(nomeSelecionado);
        System.out.println("Nome removido com sucesso!");
        System.out.println("Lista atualizada: " + nomes);

        scanner.close();

    }
}
