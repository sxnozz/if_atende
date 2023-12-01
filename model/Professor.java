package model;

import java.util.ArrayList;
import java.util.List;

public class Professor {

   private long idProfessor;
   private String senha;
   private String nome;
   private String matProfessor;
   private String emailProfessor;
   private List <Atendimento> listaAtendimento;


   public Professor(){
    this.idProfessor = 0;
    this.nome = " ";
    this.emailProfessor = " ";
    
    this.matProfessor = " ";
    this.senha = " ";
    this.listaAtendimento = new ArrayList<Atendimento>();
    
   }


    
    public Professor(long idProfessor, String nome,String emailProfessor, String senha,String matProfessor ){

        this.idProfessor = idProfessor;
        this.nome = nome;
        this.senha = senha;
        this.emailProfessor = emailProfessor;
        this.matProfessor = matProfessor;
         this.listaAtendimento = new ArrayList<>();
        this.listaAtendimento.addAll(listaAtendimento);
        
       
        
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