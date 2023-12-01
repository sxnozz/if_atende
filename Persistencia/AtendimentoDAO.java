package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Atendimento;

public class AtendimentoDAO {
    private Conexao conexao;

    public AtendimentoDAO() {
        this.conexao = new Conexao("127.0.0.1", "3306", "root", "Roberta0203!", "Projeto_Integrador");
    }

    public void salvar(Atendimento atendimento) {
        try {
            this.conexao.abrirConexao();
            String sql = "INSERT INTO Atendimento VALUES(null, ?, ?, ?, ?, ?)";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setString(1, atendimento.getMateria());
            statement.setString(2, atendimento.getDataHora());
            statement.setLong(3, atendimento.getAluno().getIdAluno());
            statement.setLong(4, atendimento.getProfessor().getidProfessor());
            statement.setLong(5, atendimento.getComentario().getIdComentario());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public void editar(Atendimento atendimento) {
        try {
            this.conexao.abrirConexao();
            String sql = "UPDATE Atendimento SET materia=?, horario=?,  id_aluno=?, id_professor=?, id_comentario=? WHERE id_atendimento=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setString(1, atendimento.getDataHora());
            statement.setString(2, atendimento.getMateria());
            statement.setLong(3, atendimento.getAluno().getIdAluno());
            statement.setLong(4, atendimento.getProfessor().getidProfessor());
            statement.setLong(5, atendimento.getComentario().getIdComentario());
            statement.setLong(6, atendimento.getIdAtendimento());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idAtendimento) {
        try {
            this.conexao.abrirConexao();
            String sql = "DELETE FROM Atendimento WHERE id_atendimento=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setLong(1, idAtendimento);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public Atendimento buscar(long idAtendimento) {
        Atendimento atendimento = null;
        try {
            this.conexao.abrirConexao();
            String sql = "SELECT * FROM Atendimento WHERE id_atendimento=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setLong(1, idAtendimento);
            ResultSet rs = statement.executeQuery();

            if (rs.next() == true) {
                atendimento = new Atendimento(

                    idAtendimento, null, sql
                    
                
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
        return atendimento;
    }
}


	


