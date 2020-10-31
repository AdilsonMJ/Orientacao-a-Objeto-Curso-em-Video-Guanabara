package ProjetoCorrida;
//VOCE PODE  APRENDER  CARAIO!!!! 

import java.util.Random;

public class Piloto implements Corrida{
    private String nome;
    private String nacionalidade;
    private int idade;
    private int corridas;
    private int vitorias;
    private int position;
    private Carro carro;

    public Piloto(String nome, String nacionalidade, int idade, int corridas, int vitorias, Carro carro) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setCorridas(corridas);
        this.setVitorias(vitorias);
        this.setPosition(20);
        this.setCarro(carro);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCorridas() {
        return corridas;
    }

    public void setCorridas(int corridas) {
        this.corridas = corridas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void correr() {
        System.out.println("BEEM AMIGOS DA REDE GLOBO, VAMOS COMEÇAR A TRANSMITIR O TREINO CLASSIFICATORIO PARA GP DE MONACO ");
        System.out.println("ESTA ENTRANDO NA PISTA AGORA " + this.getNome());

        Random random = new Random();

        for (int i = 5; i<= 5; ++i){
            int p1 = random.nextInt(20) + 1;
            if (p1 > this.getPosition()){
                System.out.println("Ele fez uma grande volta agora foi para " + p1);
                this.setPosition(p1);
            } else if (p1 == this.getPosition() && this.getPosition() != 1){
                System.out.println("Foi uma volta normal, ele nao conseguiu subir de posicao");
            } else {
                System.out.println("Que volta terrivel, perdeu " + (p1 - this.getPosition()) + " possicao ");
                this.setPosition(p1);
                System.out.println("Caiu para " + this.getPosition());
            }
        }


    }

    @Override
    public void vitoria() {

    }

    @Override
    public void posicao() {

    }

    @Override
    public String statusPiloto() {
        return "Piloto{" +
                "\n nome = " + nome + '\'' +
                "\n nacionalidade='" + nacionalidade + '\'' +
                "\n idade=" + idade +
                "\n corridas=" + corridas +
                "\n vitorias=" + vitorias +
                "\n position=" + position +
                "\n carro=" + carro.getFabricante() +  " \n \n " +
                '}';
    }
}
