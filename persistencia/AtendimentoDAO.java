package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Atendimento;

public class AtendimentoDAO {
    private Conexao conexao;

    public AtendimentoDAO() {
        this.conexao = new Conexao("localhost", "3306", "root", "root", "root");
    }

    public void salvar(Atendimento atendimento) {
        try {
            this.conexao.abrirConexao();
            String sql = "INSERT INTO Atendimento VALUES(null, ?, ?, ?, ?, ?)";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setString(1, atendimento.getDataHora());
            statement.setString(2, atendimento.getMateria());
            statement.setObject(3, atendimento.getAluno());
            statement.setObject(4, atendimento.getProfessor());
            statement.setObject(5, atendimento.getComentario());

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
            String sql = "UPDATE Atendimento SET datahora=?, materia=?, aluno=?, professor=?, comentario=? WHERE id_atendimento=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setString(1, atendimento.getDataHora());
            statement.setString(2, atendimento.getMateria());
            statement.setObject(3, atendimento.getAluno());
            statement.setObject(4, atendimento.getProfessor());
            statement.setObject(5, atendimento.getComentario());
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

                    rs.getString("materia"),
                    rs.getObject("aluno"),
                    rs.getObject("comentario"),
                    rs.getObject("professor"),
                    rs.getString("datahora"), idAtendimento, null, sql
                    
                
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


	


