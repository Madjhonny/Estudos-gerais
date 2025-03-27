package Estudos_Getter_Setter.Exercicio1;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        }

        else{
            System.out.println("Idade inválida!");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0) {
            this.altura = altura;
        }
        else {
            System.out.println("Altura inválida!");
        }
    }
}
