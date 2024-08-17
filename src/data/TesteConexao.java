package data;

import java.sql.PreparedStatement;

import model.Produto;

public class TesteConexao {
public static void main(String[] args) {
    try {
        Conexao objConexao = new Conexao();
        //ProdutoData DAO = new ProdutoData();
        System.out.println("Conectado!!");
        Produto obj = new Produto(8, "asfdsadf", 8);

        String sql = "delete from tbprodutos where id=2";
        PreparedStatement ps = objConexao.getConexao().prepareStatement(sql);
        // ps.setString(1,obj.getDescricao());
        // ps.setFloat(2,obj.getPreco());
        if (ps.executeUpdate()>0) System.out.println("Apagou'");
    } catch (Exception e) {
        System.out.println("ERro:"+e.getMessage());
    }
}
}
