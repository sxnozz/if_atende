package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;  
import model.Comentario;

public class ComentarioDAO {
    private Conexao conexao;

    public ComentarioDAO() {
        this.conexao = new Conexao("127.0.0.1", "3306", "root", "Roberta0203!", "Projeto_Integrador");
    }

    public void salvar(Comentario comentario) {
        try {
            this.conexao.abrirConexao();
            String sql = "INSERT INTO Comentario VALUES(null, ?, ?)";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setDate(1, new Date(comentario.getData().getTime()));  
            statement.setString(2, comentario.getTexto());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public void editar(Comentario comentario) {
        try {
            this.conexao.abrirConexao();
            String sql = "UPDATE Comentario SET data=?, texto=? WHERE id_comentario=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setDate(2, new Date(comentario.getData().getTime()));  
            statement.setString(1, comentario.getTexto());
            statement.setLong(3, comentario.getIdComentario());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idComentario) {
        try {
            this.conexao.abrirConexao();
            String sql = "DELETE FROM Comentario WHERE id_comentario=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setLong(1, idComentario);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
    }

    public Comentario buscar(long idComentario) {
        Comentario comentario = null;
        try {
            this.conexao.abrirConexao();
            String sql = "SELECT * FROM Comentario WHERE id_comentario=?";
            PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
            statement.setLong(1, idComentario);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                comentario = new Comentario(rs.getString("texto"), rs.getDate("data"), idComentario, null);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.conexao.fecharConexao();
        }
        return comentario;
    }
}

