import java.util.Date;

public class Atendimento {
    private long id_atendimento;
    private Comentario comentario;
    private Date data_hora;
    private String materia;
    private String  diaSemana;
    


   



    public Atendimento(){
        this.id_atendimento = 0;
        this.data_hora = new Date();
    }

    public Atendimento(long id_atendimento,Comentario comentario,Date data_hora){
        this.id_atendimento = id_atendimento;
        this.comentario = comentario;
        this.data_hora = data_hora;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Date getdata_hora() {
        return data_hora;
    }

    public void setdata_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public long getId_atendimento() {
        return id_atendimento;
    }

    public void setId_atendimento(long id_atendimento) {
        this.id_atendimento = id_atendimento;
    }

    @Override
    public String toString() {
        return "Atendimento [id_atendimento=" + id_atendimento + ", comentario=" + comentario + ", data_hora="
                + data_hora + ", materia=" + materia + ", diaSemana=" + diaSemana + "]";
    }



    

}
