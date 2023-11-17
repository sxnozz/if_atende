import java.util.Date;

public class Comentario {

    private Long id_comentario;
    private Date data;

    public Comentario() {
        this.data = new Date();
    }

    public Comentario(Long id_comentario, Date data) {
        this.id_comentario = id_comentario;
        this.data = data;
    }
}



