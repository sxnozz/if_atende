package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Professor;

public class ProfessorDAO {
    private Conexao conexao;

    public ProfessorDAO() {
        this.conexao = new Conexao("127.0.0.1", "3306", "root", "Roberta0203!", "Projeto_Integrador");
    }

    public void salvar(Professor professor) {
        try {
            this.conexao.abrirConexao();
            String sql = "INSERT INTO Professor VALUES(null, ?, ?, ?, ?)";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
           
            statement.setString(1, professor.getMatProfessor());
            statement.setString(2, professor.getNome());
            statement.setString(3, professor.getSenha());
            statement.setString(4, professor.getemailProfessor());
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
            String sql = "UPDATE Professor SET mat_professor=?, senha=?, email=?, nome=? WHERE id_professor=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);

            statement.setString(2, professor.getMatProfessor());
            statement.setString(3, professor.getSenha());
            statement.setString(4, professor.getemailProfessor());
            statement.setString(1, professor.getNome());
            statement.setLong(5, professor.getidProfessor()); 
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
        try {
            this.conexao.abrirConexao();
            String sql = "SELECT * FROM Professor WHERE id_professor=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setLong(1, idProfessor);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                Professor professor = new Professor();
                professor.setidProfessor(rs.getLong("id_professor"));
                professor.setNome(rs.getString("nome"));
                professor.setMatProfessor(rs.getString("mat_professor"));
                professor.setSenha(rs.getString("senha"));
                professor.setemailProfessor(rs.getString("email"));
                return professor;
            }
            else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            this.conexao.fecharConexao();
        }
    }
}

