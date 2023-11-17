public class Aluno {

    private long id_aluno;
    private String ano;
    private String periodo;
    private String curso; 
    private String mat_aluno;
    private String senha;
    private String email;
    private String idade;
    private String nome;

    public Aluno() {
        this.ano = " ";
        this.curso = " ";
        this.periodo = " ";
        this.idade = " ";
        this.nome = " ";

        this.mat_aluno = "20XXSS.CC_" + this.id_aluno;
    }

    public Aluno(String ano, String curso, String senha, String email, String periodo, String idade, String nome) {
        this.email = email;
        this.ano = ano;
        this.curso = curso;
        this.periodo = periodo;
        this.senha = senha;
        this.idade = idade;
        this.nome = nome;

        this.mat_aluno = ano + periodo + "SS." + curso + id_aluno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id_aluno;
    }

    public void setId(long id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getMat_aluno() {
        return mat_aluno;
    }

    public void setMat_aluno(String mat_aluno) {
        this.mat_aluno = mat_aluno;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     public String getIdadeString() {
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

    @Override
    public String toString(){
      return "ID:" + id_aluno + " Nome:" + nome + " idade:" + idade + " matricula:" + mat_aluno + " email: " + email;
    }

}