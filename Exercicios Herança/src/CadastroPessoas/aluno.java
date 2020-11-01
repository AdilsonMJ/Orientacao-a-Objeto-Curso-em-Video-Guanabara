package CadastroPessoas;
//VOCE PODE  APRENDER  CARAIO!!!! 

import java.util.Random;

public class aluno extends Pessoa{
    private int matricula;
    private Boolean status = true;
    private String curso;

    public void cancelarMatricula(){
        if(this.getStatus()){
            this.setMatricula(000000);
            this.setStatus(false);
            System.out.println("Matricula cancelada!");
        }

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
