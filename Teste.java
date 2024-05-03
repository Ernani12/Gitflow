



// Classe principal para teste
public class Teste {

        // Classe Pessoa
 static public class Pessoa {
    private String nome;
    private Carro carro;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método para associar um carro a uma pessoa
    public void comprarCarro(String modelo, String marca, int ano) {
        this.carro = new Carro(modelo, marca, ano);
    }

    // Método para exibir informações da pessoa e do carro
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        if (carro != null) {
            System.out.println("Carro: " + carro.getModelo() + " " + carro.getMarca() + " " + carro.getAno());
        } else {
            System.out.println("A pessoa não possui carro.");
        }
    }
}

// Classe Carro
public static class Carro {
    private String modelo;
    private String marca;
    private int ano;

    // Construtor
    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }
}



    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");
        pessoa.exibirInformacoes(); // A pessoa não possui carro.

        pessoa.comprarCarro("Fiesta", "Ford", 2018);
        pessoa.exibirInformacoes(); // Nome: João | Carro: Fiesta Ford 2018
    }
}
