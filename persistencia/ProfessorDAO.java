package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Professor;

public class ProfessorDAO {
    private Conexao conexao;

    public ProfessorDAO() {
        this.conexao = new Conexao("localhost", "3306", "root", "root", "root");
    }

    public void salvar(Professor professor) {
        try {
            this.conexao.abrirConexao();
            String sql = "INSERT INTO Professor VALUES(null, ?, ?, ?)";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
           
            statement.setString(2, professor.getMatProfessor());
            statement.setString(3, professor.getSenha());
            statement.setString(4, professor.getemailProfessor());
            statement.setString(1, professor.getNome());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public void editar(Professor professor) {
        try {
            this.conexao.abrirConexao();
            String sql = "UPDATE Professor SET matProfessor=?, senha=?, email=?, nome=? WHERE id_professor=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);

            statement.setString(2, professor.getMatProfessor());
            statement.setString(3, professor.getSenha());
            statement.setString(4, professor.getemailProfessor());
            statement.setString(1, professor.getNome());
            statement.setLong(9, professor.getidProfessor()); 
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idProfessor) {
        try {
            this.conexao.abrirConexao();
            String sql = "DELETE FROM Professor WHERE id_professor=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setLong(1, idProfessor);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public Professor buscar(long idProfessor) {
        Professor professor = null;
        try {
            this.conexao.abrirConexao();
            String sql = "SELECT * FROM Professor WHERE id_professor=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setLong(1, idProfessor);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                professor = new Professor(rs.getString("nome"), rs.getString("matProfessor"), rs.getString("senha"), rs.getString("email"), idProfessor, null);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
        return professor;
    }
}

