package data;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.Produto;

public class ProdutoData extends 
Conexao implements CRUD{

    @Override
    public boolean incluir(Produto obj) throws Exception {
        String sql = "insert into tbProdutos (descricao,preco) values (?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        ps.setFloat(2,obj.getPreco());
        if (ps.executeUpdate()>0) return true;
        else return false;
        //ou return ps.executeUpdate()>0
    }

    @Override
    public boolean atualizar(Produto obj) throws Exception {
        String sql = "update tbProdutos set descricao=?,preco=? where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        ps.setFloat(2,obj.getPreco());
        ps.setInt(3, obj.getId());
        if (ps.executeUpdate()>0) return true;
        else return false;
    }

    @Override
    public boolean excluir(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public Produto pesquisar(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisar'");
    }

    @Override
    public ArrayList<Produto> pesquisar(String pesquisa) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisar'");
    }

}
