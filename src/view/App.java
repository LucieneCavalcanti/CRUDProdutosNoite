package view;

import java.util.Scanner;

import data.ProdutoData;
import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto obj = new Produto();
        
        Scanner entrada = new Scanner(System.in);
        int opcao =0;
        do {
            try {
                
                ProdutoData DAO = new ProdutoData();
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
                        if(DAO.incluir(obj)) System.out.println("Salvo");
                        else System.out.println("Não salvou!!!!");
                        break;
                    case 2:
                        System.out.println("Digite o id do produto:");
                        int id = entrada.nextInt();
                        //pesquisar no banco de dados o id
                        //mostrar o objeto
                        System.out.println(obj);
                        System.out.println("Digite a descrição:");
                        obj.setDescricao(entrada.next());
                        System.out.println("Digite o preço:");
                        obj.setPreco(entrada.nextFloat());
                        //update no banco
                        break;
                    case 3:
                        System.out.println("Digite o id do produto:");
                        id = entrada.nextInt();
                        //pesquisar no banco de dados o id
                        //mostrar o objeto
                        System.out.println(obj);
                        System.out.println("Deseja realmente excluir? 1-SIM|2-NÃO");
                        opcao = entrada.nextInt();
                        if(opcao==1) //apaga do banco
                            System.out.println("Apagado");
                        else
                            System.out.println("Não apagado!");    
                        break;
                    case 4:
                        System.out.println("Digite o id do produto:");
                        id = entrada.nextInt();
                        obj = null;
                        //pesquisar no banco de dados o id
                        if(obj==null)
                            System.out.println("Não encontrado!");
                        else //mostrar o objeto
                            System.out.println(obj);
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
