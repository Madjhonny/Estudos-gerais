package Estudos_Getter_Setter.Exercicio1;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa.setNome("Carlos");
        pessoa.setIdade(25);
        pessoa.setAltura(1.90);

        pessoa2.setNome("João");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Nome 2: " +pessoa2.getNome());
    }
}