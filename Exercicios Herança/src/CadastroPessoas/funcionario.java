package CadastroPessoas;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class funcionario extends Pessoa{
    private String setor;
    private Boolean trabalhando;

    public void trabalho(Boolean y){
        this.setTrabalhando(y);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
