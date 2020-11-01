package CadastroPessoas;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float num){
        this.setSalario(this.getSalario() + num);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
