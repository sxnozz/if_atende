package apresentação;

import java.util.List;

import model.Aluno;
import Persistencia.AlunoDAO;
import model.Professor;
import Persistencia.ProfessorDAO;
import model.Atendimento;
import Persistencia.AtendimentoDAO;
import model.Comentario;
import Persistencia.ComentarioDAO;





public class teste {
    public static void main(String[] args) { 
   
      
      AlunoDAO alunoDAO = new AlunoDAO();
     

    //Cria um aluno
    //Aluno aluno = new Aluno("2022", "tds","123","jongas@gmail","manha","16","joao pedro",2,null, null);
    //AlunoDAO alunoDAO = new AlunoDAO();
    //alunoDAO.salvar(aluno);
        
        
  //editar 
  //Aluno aluno = new Aluno("2050","lulamolusco@gmail.com", "gremio", "inter", "2", "guaiba", "16anos",1,null, null);
  //AlunoDAO alunoDAO = new AlunoDAO();
 //alunoDAO.editar(aluno);



    //Excluir 
   
   // AlunoDAO alunodao= new AlunoDAO();
    //alunodao.excluir(1);

    



      //BUSCAR POR ID
    //AlunoDAO alunoDAO = new AlunoDAO();
    //Aluno aluno = alunoDAO.buscar(3);
    //System.out.println(aluno);



//PROFESSOR

     //Cria um professor
    // Professor professor = new Professor(0,"jorge peres", "jgperes@gmail.com","jg","jg");
    // ProfessorDAO professorDAO = new ProfessorDAO();
    // professorDAO.salvar(professor);
        
        
    // editar Funfando
    // Professor professor = new Professor(2,"jorge peres", "jgperes@gmail.com","jg","jg");
    // ProfessorDAO professorDAO = new ProfessorDAO();
    // professorDAO.editar(professor);



    //Excluir 
   
    //ProfessorDAO professordao= new ProfessorDAO();
    //professordao.excluir(1);

    



      //BUSCAR POR ID
    // ProfessorDAO professorDAO = new ProfessorDAO();
    // Professor professor = professorDAO.buscar(2);
    // System.out.println(professor);
 
 
//Atendimento
    //Cria um Atendimento
    
  //   Atendimento atendimento = new Atendimento();
  //   AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
  //   Aluno aluno = alunoDAO.buscar(1);
  //   Professor professor = professorDAO.buscar(1);
  //   Comentario comentario = comentarioDAO.buscar(1);
  //   atendimento.setAluno(aluno);
  //   atendimento.setProfessor(professor);
  //   atendimento.setComentario(comentario);
  //  System.out.println(professor.toString());
  //  atendimentoDAO.salvar(atendimento);
    
   
    //editar atendimento
    // Atendimento atendimento = new Atendimento(2, "12:30", "matematica");
    // AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    // Aluno aluno = alunoDAO.buscar(1);
    // Professor professor = professorDAO.buscar(1);
    // Comentario comentario = comentarioDAO.buscar(1);
    // atendimento.setAluno(aluno);
    // atendimento.setComentario(comentario);
    // atendimento.setProfessor(professor);
    // atendimentoDAO.editar(atendimento);





    //Excluir 
   
    // AtendimentoDAO atendimentoDAO= new AtendimentoDAO();
    // atendimentoDAO.excluir(2);

    



      //BUSCAR POR ID
    //  AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    //  Atendimento atendimento = atendimentoDAO.buscar(3);
    //  System.out.println(atendimento.getIdAtendimento());
 
 
    // Comentario

 //Cria um aluno
    //  Comentario comentario = new Comentario("gremio maior do sul", "12/12",0);
    //  ComentarioDAO comentarioDAO = new ComentarioDAO();
    //  comentarioDAO.salvar(comentario);
   
  //editar 
  //    Comentario c = new Comentario(2 ,"12/12" , "texto") ;
  //    ComentarioDAO cDAO = new ComentarioDAO();
  //  cDAO.editar(c);

    //Excluir 
   
    // ComentarioDAO comentarioDAO= new ComentarioDAO();
    // comentarioDAO.excluir(2);

    



      //BUSCAR POR ID
    ComentarioDAO comentarioDAO = new ComentarioDAO();
    Comentario comentario = comentarioDAO.buscar(1);
    System.out.println(comentario);















         }
     
      }


    