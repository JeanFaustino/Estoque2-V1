package negocio;


import java.util.ArrayList;
import java.util.Scanner;


public class Estoque {
    private ArrayList<Produto> lista;
    Scanner ler = new Scanner(System.in);

    public Estoque() {
        lista = new ArrayList<Produto>();
        lista1();


    }

    private void lista1() {

    }

    public ArrayList<Produto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Lista Do Estoque = " + lista;
    }

    public void adicionarProduto(Produto p1) {
        this.lista.add(p1);
    }

    public void apagarTudo() {
        this.lista.clear();
    }

    public int obterQuantidadeDeProdutos() {
        return this.lista.size();
    }

    public void criarProduto() {

        Produto p1 = new Produto();
        System.out.println("Digite o nome do produto:");
        ler.nextLine();
        p1.setNome(ler.nextLine());

        System.out.println("Digite o codigo do produto:");
        p1.setCodigo(ler.nextInt());
        do {
            System.out.println("Digite a quantidade:");
            p1.setQuantidade(ler.nextInt());
            if (p1.getQuantidade() <= 0) {
                System.out.println("Erro! Quantidade inválida.");
            }
        } while (p1.getQuantidade() <= 0);
        this.lista.add(p1);
        System.out.println("Cadastrado com sucesso!");


    }

    public String excecaoListaVazia() {
        return "Não Existe Produto na lista";
    }

    public void listarProdutos() {
        if (lista.isEmpty()) {
            toString();
        } else {
            System.out.println(lista);
        }


    }
}