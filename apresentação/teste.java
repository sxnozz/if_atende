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
   
      ProfessorDAO professorDAO = new ProfessorDAO();
      AlunoDAO alunoDAO = new AlunoDAO();
      ComentarioDAO comentarioDAO = new ComentarioDAO();

    //Cria um aluno
    //Aluno aluno = new Aluno("2022", "tds","123","jongas@gmail","manha","16","joao pedro",2,null, null);
    //AlunoDAO alunoDAO = new AlunoDAO();
    //alunoDAO.salvar(aluno);
        
        
  //editar 
  //Aluno aluno = new Aluno("2050","lulamolusco@gmail.com", "gremio", "pirocona", "2", "bleach", "16anos",1,null, null);
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
    //Professor professor = new Professor("2022", "tds","123","jongas@gmail",0, null, null);
    //ProfessorDAO professorDAO = new ProfessorDAO();
    //professorDAO.salvar(professor);
        
        
    // editar Funfando
    //Professor professor = new Professor("1234","jonas123", "123", "jonas13@gmail.com", 1 , null, (long) 1);
    //ProfessorDAO professorDAO = new ProfessorDAO();
    //professorDAO.editar(professor);



    //Excluir 
   
    //ProfessorDAO professordao= new ProfessorDAO();
    //professordao.excluir(1);

    



      //BUSCAR POR ID
    //ProfessorDAO professorDAO = new ProfessorDAO();
    //Professor professor = professorDAO.buscar(2);
    //System.out.println(professor);
 
 
//Atendimento
    //Cria um Atendimento
    
    Atendimento atendimento = new Atendimento(0, null, null, null, null);
    AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    Aluno aluno = alunoDAO.buscar(0);
    Professor professor = professorDAO.buscar(0);
    atendimentoDAO.salvar(atendimento);
    
   
    // editar Funfando
    //Atendimento atendimento = new Atendimento("1234","jonas123", "123", "jonas13@gmail.com", 1 , null, (long) 1);
    //AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    //atendimentoDAO.editar(atendimento);



    //Excluir 
   
    //AtendimentoDAO atendimentodao= new AtendimentoDAO();
    //atendimentodao.excluir(1);

    



      //BUSCAR POR ID
    //AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    //Atendimento atendimento = atendimentoDAO.buscar(3);
    //System.out.println(atendimento);
 
 
















         }
     
      }


    