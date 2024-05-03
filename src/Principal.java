import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Mari", 28);
        Pessoa pessoa2 = new Pessoa("Ana", 27);
        Pessoa pessoa3 = new Pessoa("Marcelo", 26);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas.toString());

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Esmalte", 4.99, 2);
        Produto produto2 = new Produto("Acetona", 6.19, 1);
        Produto produto3 = new Produto("Algodão", 2.50, 2);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(1).getNome());
        System.out.println(listaProdutos.toString());

        ProdutoPerecivel produto4 = new ProdutoPerecivel("Arroz", 5.99, 3, "12/05/2025");
        System.out.println(produto4);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaDePessoas.size();
        System.out.println(precoMedio);

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Javascript");

        for(String elemento : lista) {
            System.out.println(elemento);
        }

        Cachorro dog = new Cachorro();
        if( dog instanceof  Cachorro) {
            Animal animal = (Animal) dog;
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(4);
        numeros.add(1);
        Collections.sort(numeros);
        System.out.println(numeros);

        Titulo titulo1 = new Titulo("Borracha");
        Titulo titulo2 = new Titulo("Lápis");
        Titulo titulo3 = new Titulo("Caneta");
        Titulo titulo4 = new Titulo("Caderno");

        List<Titulo> listaTitulos = new LinkedList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos.toString());



    }
}
