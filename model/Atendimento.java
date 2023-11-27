package model;



public class Atendimento {
    private long idAtendimento;
    private Comentario comentario;
    private String dataHora;
    private String materia;
    private Aluno aluno;
    private Professor professor;

    
    public Atendimento(){
        this.idAtendimento = 0;
        this.dataHora = "";
        this.aluno = new Aluno();
        this.professor = new Professor();
    }

    public Atendimento(long idAtendimento,Comentario comentario,String dataHora, Aluno aluno, Professor professor){
        this.idAtendimento = idAtendimento;
        this.comentario = comentario;
        this.dataHora = dataHora;
        this.aluno = aluno;
    }
    


    


    public Atendimento(String string, Object object, Object object2, Object object3, String string2,
            long idAtendimento2, Object object4, String sql) {
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public String getDatahora() {
        return dataHora;
    }

    public void setdataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }
public Aluno getAluno() {
    return aluno;
}
public void setAluno(Aluno aluno) {
    this.aluno = aluno;
}
public Professor getProfessor() {
    return professor;
}
public void setProfessor(Professor professor) {
    this.professor = professor;
}

public String getDataHora() {
    return dataHora;
}
public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
}
public String getMateria() {
    return materia;
}
public void setMateria(String materia) {
    this.materia = materia;
}

@Override
public String toString() {
    return "Atendimento [idAtendimento=" + idAtendimento + ", comentario=" + comentario + ", dataHora=" + dataHora
            + ", materia=" + materia + ", aluno=" + aluno + ", professor=" + professor + "]";
    }


}
