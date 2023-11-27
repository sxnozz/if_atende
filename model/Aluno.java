package model;

import java.util.ArrayList;
import java.util.List;



public class Aluno {

    private long idAluno;
    private String ano;
    private String periodo;
    private String curso; 
    private String matAluno;
    private String senha;
    private String email;
    private String idade;
    private String nome;
    private List <Atendimento> listaAtendimento;

    public Aluno() {
       this.idAluno = 0; 
       this.ano = " ";
        this.curso = " ";
        this.periodo = " ";
        this.idade = " ";
        this.nome = " ";
        this.curso = " ";
        this.listaAtendimento = new ArrayList<Atendimento>() {
            
        };

        this.matAluno = "20XXSS.CC_" + this.idAluno;
    }

    public Aluno(String ano, String curso, String senha, String email, String periodo, String idade, String nome, long idAluno, List <Atendimento> listaAtendimento, String matAluno) {
        this.idAluno = idAluno;
        this.email = email;
        this.ano = ano;
        this.curso = curso;
        this.periodo = periodo;
        this.senha = senha;
        this.idade = idade;
        this.nome = nome;
        this.listaAtendimento = listaAtendimento;

        this.matAluno = ano + periodo + "SS." + curso + idAluno;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(long idAluno) {
        this.idAluno = idAluno;
    }

    public String getmatAluno() {
        return matAluno;
    }

    public void setmatAluno(String matAluno) {
        this.matAluno = matAluno;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public List<Atendimento> getListaAtendimento() {
        return listaAtendimento;
    }
    public void setListaAtendimento(List<Atendimento> listaAtendimento) {
        this.listaAtendimento = listaAtendimento;
    }
  
   
    

    @Override
    public String toString() {
        return "Aluno [idAluno=" + idAluno + ", ano=" + ano + ", periodo=" + periodo + ", curso=" + curso
                + ", matAluno=" + matAluno + ", senha=" + senha + ", email=" + email + ", idade=" + idade + ", nome="
                + nome + ", listaAtendimento=" + listaAtendimento + "]";
    }

    }

    
    
