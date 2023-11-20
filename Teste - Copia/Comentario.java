import java.util.Date;

public class Comentario {

    private Long id_comentario;
    private Date data;
    private String texto;

    public Comentario() {
        this.data = new Date();
        this.texto =" ";

    }

    public Comentario(Long id_comentario, Date data, String texto) {
        this.id_comentario = id_comentario;
        this.data = data;
        this.texto = texto;
    }
    
    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public Long getId_comentario() {
        return id_comentario;
    }
    
    public void setId_comentario(Long id_comentario) {
        this.id_comentario = id_comentario;
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Comentario [id_comentario=" + id_comentario + ", data=" + data + ", texto=" + texto + "]";
    }

}



