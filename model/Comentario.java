package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comentario {

    private Long idComentario;
    private Date data;
    private String texto;
    private List <Comentario> listaComentario;


    public Comentario() {
        this.data = new Date();
        this.texto =" ";
        this.listaComentario = new ArrayList<Comentario>() {

    };
    }

    public Comentario(String texto, Date data, long idComentario, List <Comentario> listaComentario) {
        this.texto = texto;
        this.data = data;
        this.idComentario = idComentario;
        this.listaComentario = listaComentario;
    }
    
    
    public Comentario(String string, String string2, String string3, String string4, int i, Object object,
            Object object2) {
    }

    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public Long getIdComentario() {
        return idComentario;
    }
    
    public void setIdComentario(Long idComentario) {
        this.idComentario = idComentario;
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Comentario> getListaComentario() {
        return listaComentario;
    }
    public void setListaComentario(List<Comentario> listaComentario) {
        this.listaComentario = listaComentario;
    }

    @Override
    public String toString() {
        return "Comentario [idComentario=" + idComentario + ", data=" + data + ", texto=" + texto + ", listaComentario="
                + listaComentario + "]";
    }


  

}

