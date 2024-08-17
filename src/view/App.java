package view;

import java.util.Scanner;

import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto obj = new Produto();
        Scanner entrada = new Scanner(System.in);
        int opcao =0;
        do {
            try {
                System.out.println("------MENU------");
                System.out.println("1 - Incluir Produto"+
                "\n2 - Editar Produto"+
                "\n3 - Excluir Produto"+
                "\n4 - Pesquisar Produto"+
                "\n7 - Sair");
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite a descrição:");
                        obj.setDescricao(entrada.next());
                        System.out.println("Digite o preço:");
                        obj.setPreco(entrada.nextFloat());
                        //insert no banco
                        break;
                
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro:"+e.getMessage());
                entrada.next();
            }
        } while (opcao!=7);
    }
}
