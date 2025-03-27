// USO SIMPLES DE UMA ARRAYLIST

package Estudos2_ArrayList;

import java.util.ArrayList;

public class Lista_nomes {

    public static void main (String [] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Vitor");
        nomes.add("Pedro");
        nomes.add("Gui");

      System.out.println(nomes.get(0));
      System.out.println(nomes.get(nomes.size()- 1));

    }

}
