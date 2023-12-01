package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Aluno;

public class AlunoDAO {

    private Conexao conexao;

    public AlunoDAO() {
        this.conexao = new Conexao("127.0.0.1", "3306", "root", "Roberta0203!", "Projeto_Integrador");
    }

    public void salvar(Aluno aluno) {
        try {
            this.conexao.abrirConexao();
            String sql = "INSERT INTO Aluno VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);

            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getmatAluno());
            statement.setString(3, aluno.getSenha());
            statement.setString(4, aluno.getEmail());
            statement.setString(5, aluno.getIdade());
            statement.setString(6, aluno.getCurso());
            statement.setString(7, aluno.getPeriodo());
            statement.setString(8, aluno.getAno());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public void editar(Aluno aluno) {
        try {
            this.conexao.abrirConexao();
            String sql = "UPDATE Aluno SET nome=?, mat_aluno=?, senha=?, email=?, idade=?, curso=?, periodo=?, ano=? WHERE id_aluno=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);

            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getmatAluno());
            statement.setString(3, aluno.getSenha());
            statement.setString(4, aluno.getEmail());
            statement.setString(5, aluno.getIdade());
            statement.setString(6, aluno.getCurso());
            statement.setString(7, aluno.getPeriodo());
            statement.setString(8, aluno.getAno());
            statement.setLong(9, aluno.getIdAluno());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idAluno) {
        try {
            this.conexao.abrirConexao();
            String sql = "DELETE FROM Aluno WHERE id_aluno=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setLong(1, idAluno);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public Aluno buscar(long idAluno) {
        Aluno aluno = null;
        try {
            this.conexao.abrirConexao();
            String sql = "SELECT * FROM Aluno WHERE id_aluno=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
           
           
            statement.setLong(1, idAluno);
            ResultSet rs = statement.executeQuery();

        

            if (rs.next() == true) {
                aluno = new Aluno();
                    
                  aluno.setIdAluno(rs.getLong("id_aluno"));
                  aluno.setNome(rs.getString("nome"));
                  aluno.setmatAluno(rs.getString("matAluno"));
                  aluno.setSenha(rs.getString("senha"));
                  aluno.setEmail(rs.getString("email"));
                  aluno.setIdade(rs.getString("idade"));
                  aluno.setCurso(rs.getString("curso"));
                  aluno.setPeriodo(rs.getString("periodo"));
                  aluno.setAno(rs.getString("ano"));
                   
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
        return aluno;
    }
}
