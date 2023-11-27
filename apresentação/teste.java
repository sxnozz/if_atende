package apresentação;

import java.util.List;

import model.Aluno;
import persistencia.AlunoDAO;

public class teste {
    public static void main(String[] args) {

    //Cria um aluno
    //Aluno aluno = new Aluno("2022", "tds","123","jongas@gmail","manha","16","joao pedro",2,null, null);
    //AlunoDAO alunoDAO = new AlunoDAO();
    //alunoDAO.salvar(aluno);
        
        
    // editar 
    //Aluno aluno = new Aluno("2050","lulamolusco@gmail.com", "gremio", "pirocona", "2", "bleach", "16anos",1,null, null);
  //   AlunoDAO alunoDAO = new AlunoDAO();
//     alunoDAO.editar(aluno);



    //Excluir 
   
   // AlunoDAO alunodao= new AlunoDAO();
    //alunodao.excluir(1);

    



      //BUSCAR POR ID
    AlunoDAO alunoDAO = new AlunoDAO();
    Aluno aluno = alunoDAO.buscar(3);
    System.out.println(aluno);
 




         }
     
      }


    