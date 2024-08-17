package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        String sql = "delete from tbprodutos where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        if (ps.executeUpdate()>0) return true;
        else return false;
    }

    @Override
    public Produto pesquisar(int id) throws Exception {
        String sql = "Select * from tbprodutos where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Produto obj = null;
        if(rs.next()){
            obj = new Produto(rs.getInt("id"), 
            rs.getString("descricao"),
            rs.getFloat("preco"));
        }
        return obj;
    }

    @Override
    public ArrayList<Produto> pesquisar(String pesquisa) throws Exception {
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "Select * from tbprodutos where descricao like ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, pesquisa+"%");
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Produto obj = new Produto(rs.getInt("id"), 
            rs.getString("descricao"),
            rs.getFloat("preco"));
            lista.add(obj);
        }
        return lista;}

}
