package main;
import negocio.*;


import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        Estoque lista1 = new Estoque();
        int op;

        do{
            System.out.println("--DIGITE--");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Visualizar Produtos");
            System.out.println("3- Ver quantidade de produtos");
            System.out.println("4- Apagar todos os produtos");
            System.out.println("0- Sair");
            op = ler.nextInt();
            switch(op){
                case 1:
                    lista1.criarProduto();
                    break;

                case 2:
                    lista1.listarProdutos();
                    break;

                case 3:
                    System.out.println("Total de itens cadastrados: "
                            +lista1.obterQuantidadeDeProdutos());
                    break;

                case 4:
                    if(lista1.getLista().isEmpty()){
                        System.out.println("Não há produtos para excluir.");
                    }else{
                        int confirma;
                        System.out.println("Tem certeza que deseja EXCLUIR TUDO?\n1-SIM\n2-Não");
                        confirma = ler.nextInt();
                        if(confirma==1){
                            lista1.apagarTudo();
                            System.out.println("Produtos excluidos com sucesso!");
                        }else{
                            System.out.println("Opção cancelada!!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        }while(op!=0);
    }

}
