package data;

import java.util.ArrayList;

import model.Produto;

public interface CRUD {
public boolean incluir(Produto obj) throws Exception;
public boolean atualizar(Produto obj) throws Exception;
public boolean excluir(int id) throws Exception;
public Produto pesquisar(int id) throws Exception;
public ArrayList<Produto> pesquisar(String pesquisa) throws Exception;
}
