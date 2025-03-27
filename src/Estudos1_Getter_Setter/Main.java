package Estudos1_Getter_Setter;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");
        pessoa.setIdade(25);
        pessoa.setAltura(1.90);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}