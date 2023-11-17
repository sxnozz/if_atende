package Model.java;

public class Professor extends Aluno {

   private Long id_professor;
   private String senha;
   private String nome;
   private String mat_professor;
   private String mat_aluno;


   public Professor(){
    super();
    this.senha = " ";
    this.nome = " ";
    this.mat_aluno = mat_professor;
    this.mat_professor = " ";
   }


    public Professor(String senha,String nome,String mat_professor){

        this.senha = senha;
        this.nome = nome;
        this.mat_professor = mat_professor;
        
    }
    public Long getId_professor() {
        return id_professor;
    }
    public void setId_professor(Long id_professor) {
        this.id_professor = id_professor;
    }
    public String getMat_professor() {
        return mat_professor ;
    }
    public void setMat_professor(String mat_professor) {
        this.mat_professor = mat_professor;
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

    

}