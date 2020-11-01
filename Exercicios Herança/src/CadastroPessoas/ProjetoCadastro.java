package CadastroPessoas;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class ProjetoCadastro {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        aluno p2 = new aluno();
        Professor p3 = new Professor();
        funcionario p4 = new funcionario();

        p1.setNome("Pedro");
        p1.setIdade(23);
        p1.setSexo("M");

        p2.setNome("Maria");
        p1.setIdade(26);
        p1.setSexo("F");

        p3.setNome("Joao");
        p1.setIdade(28);
        p1.setSexo("M");

        p4.setNome("Laranja");
        p1.setIdade(67);
        p1.setSexo("M");

        p2.setCurso("Informatica");
        p3.setSalario(2500.54f);
        p4.setSetor("Estoque");

        p3.receberAumento(550.00f);
        p2.cancelarMatricula();
        p4.trabalho(false);


    }
}
