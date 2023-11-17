import java.util.Date;

public class Atendimento {
    private long id_atendimento;
    private String comentario;
    private Date data_hora;
    private Materia materia;
    private String  diaSemana;
    


   



    public Atendimento(){
        this.comentario = " ";
        this.id_atendimento = 0;
        this.data_hora = new Date();
    }

    public Atendimento(long id_atendimento,String comentario,Date data_hora){
        this.id_atendimento = id_atendimento;
        this.comentario = comentario;
        this.data_hora = data_hora;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
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
    public String toString(){
        return "HorarioAtendimento [diaSemana="+diaSemana+"horario"+ data_hora+"]";
    }

}
