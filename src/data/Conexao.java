package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private Connection conexao;
    public Connection getConexao(){
        return conexao;
    }
    public Conexao() throws Exception{
        String url="jdbc:sqlserver://LAB01-MAQ18:1433;databaseName=bdLPIINoite;encrypt=false;trustServerCertificate=true";
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String usuario="aluno"; //usuario do banco (SQL Server)
        String senha="dbo";

        Class.forName(driver);
        conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conectado....");
    }
}
