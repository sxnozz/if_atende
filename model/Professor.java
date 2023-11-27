package model;

import java.util.ArrayList;
import java.util.List;

public class Professor {

   private Long idProfessor;
   private String senha;
   private String nome;
   private String matProfessor;
   private String emailProfessor;
   private List <Atendimento> listaAtendimento;


   public Professor(){
    super();
    this.senha = " ";
    this.nome = " ";
    this.matProfessor = " ";
    this.emailProfessor = " ";
    this.listaAtendimento = new ArrayList<Atendimento>() {
            
        };
    
   }


    public Professor(String senha,String nome,String matProfessor , String emailProfessor,Long idProfessor, List <Atendimento> listaAtendimento){

        this.senha = senha;
        this.nome = nome;
        this.matProfessor = matProfessor;
        this.emailProfessor = emailProfessor;
        this.idProfessor = idProfessor;
        this.listaAtendimento = listaAtendimento;
        
    }


    public String getemailProfessor(){
        return emailProfessor;
    }

    public void setemailProfessor(String emailProfessor){
    this.emailProfessor = emailProfessor;

}
    public Long getidProfessor() {
        return idProfessor;
    }
    public void setidProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }
    public String getMatProfessor() {
        return matProfessor ;
    }
    public void setMatProfessor(String matProfessor) {
        this.matProfessor = matProfessor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public List<Atendimento> getListaAtendimento() {
        return listaAtendimento;
    }
    public void setListaAtendimento(List<Atendimento> listaAtendimento) {
        this.listaAtendimento = listaAtendimento;
    }


    @Override
    public String toString() {
        return "Professor [idProfessor=" + idProfessor + ", senha=" + senha + ", nome=" + nome + ", matProfessor="
                + matProfessor + ", emailProfessor=" + emailProfessor + ", listaAtendimento=" + listaAtendimento + "]";
    }


  


   
    

    

}