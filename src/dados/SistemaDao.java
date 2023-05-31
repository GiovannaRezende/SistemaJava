package dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class SistemaDao {
    
    public static Connection conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "gi2807");
        return conectado;
    }
    
    public static ResultSet fazerLogin(String u, String s) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stEntrar = conectado.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?");
        stEntrar.setString(1, u);
        stEntrar.setString(2, s);
        ResultSet resultado = stEntrar.executeQuery();
        return resultado;
    }
    
    public static ResultSet listarDepartamentos() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static void salvarDepartamento(Departamento departamento) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO departamentos VALUES(?, ?, ?, ?)");
        stSalvar.setString(1, departamento.getCodigo());
        stSalvar.setString(2, departamento.getNome());
        stSalvar.setString(3, departamento.getCidade());
        stSalvar.setString(4, departamento.getTelefone());
        stSalvar.executeUpdate();
    }
    
    public static void excluirDepartamento(String cod) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM departamentos WHERE codigo = ?");
        stExcluir.setString(1, cod);
        stExcluir.executeUpdate();
    }
    
    public static ResultSet consultarDepartamento (String cod) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE codigo = ?");
        stConsultar.setString(1, cod);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarDepartamentoPorNome(String nom) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE nome LIKE ?");
        stConsultar.setString(1, "%" + nom + "%");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarDepartamentoPorCidade(String cid) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE cidade = ?");
        stConsultar.setString(1, cid);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarDepartamentoPorCodigo(String cod) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE codigo = ?");
        stConsultar.setString(1, cod);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet listarUsuarios() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static void salvarUsuario(String nom, String sen, String car) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO usuarios VALUES (?, ?, ?)");
        stSalvar.setString(1, nom);
        stSalvar.setString(2, sen);
        stSalvar.setString(3, car);
        stSalvar.executeUpdate();       
    }
    
    public static ResultSet consultarUsuario (String usu) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
        stConsultar.setString(1, usu);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static void excluirUsuario(String usu) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM usuario WHERE nome = ?");
        stExcluir.setString(1, usu);
        stExcluir.executeUpdate();
    }
    
    public static ResultSet pesquisarUsuarioPorUsuario(String usu) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios WHERE usuario LIKE ?");
        stConsultar.setString(1, "%" + usu+ "%");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarUsuarioPorCargo(String car) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios WHERE cargo LIKE ?");
        stConsultar.setString(1, "%" + car+ "%");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
   
    public static ResultSet listarFuncionarios() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static void salvarFuncionario(String mat, String nom, String car, Double sal) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO funcionarios VALUES (?, ?, ?, ?)");
        stSalvar.setString(1, mat);
        stSalvar.setString(2, nom);
        stSalvar.setString(3, car);
        stSalvar.setDouble(4, sal);
        stSalvar.executeUpdate();       
    }
    
    public static ResultSet consultarFuncionario (String mat) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE matricula = ?");
        stConsultar.setString(1, mat);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static void excluirFuncionario(String mat) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM funcionarios WHERE matricula = ?");
        stExcluir.setString(1, mat);
        stExcluir.executeUpdate();
    }
    
    public static ResultSet pesquisarFuncionarioPorMatricula(String mat) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE matricula = ?");
        stConsultar.setString(1, mat);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarFuncionarioPorNome(String nom) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE nome LIKE ?");
        stConsultar.setString(1, "%" + nom + "%");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarFuncionarioPorCargo(String car) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE cargo LIKE ?");
        stConsultar.setString(1, "%" + car + "%");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
     
    
}
