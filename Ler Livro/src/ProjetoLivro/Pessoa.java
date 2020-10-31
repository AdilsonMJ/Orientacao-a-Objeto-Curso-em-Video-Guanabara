package ProjetoLivro;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class Pessoa {
   private String nome;
   private String sexo;
   private int idade;

   public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
   }

    public Pessoa(String nome, String sexo, int idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
