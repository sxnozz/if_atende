package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comentario {

    private long idComentario;
    private String data;
    private String texto;


    public Comentario() {
        this.idComentario = 0;
        this.data = " ";
        this.texto =" ";
    }

    public Comentario(long idComentario,String data,String texto  ) {
        this.idComentario = idComentario;
        this.data = data;
        this.texto = texto;
        
        
    }

    public String getData() {
        return data;
    }
    
    public void setData(String data) {
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

    @Override
    public String toString() {
        return "Comentario [idComentario=" + idComentario + ", data=" + data + ", texto=" + texto + "]";
    }


  

}

