package ProjetoCorrida;
//VOCE PODE  APRENDER  CARAIO!!!! 

import java.util.Random;

public class Piloto implements Corrida{
    private String nome;
    private String nacionalidade;
    private int idade;
    private int corridas;
    private int vitorias;
    private int position = 20;
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

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private int getCorridas() {
        return corridas;
    }

    private void setCorridas(int corridas) {
        this.corridas = corridas;
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getPosition() {
        return position;
    }

    private void setPosition(int position) {
        this.position = position;
    }

    private Carro getCarro() {
        return carro;
    }

    private void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void correr() {
        System.out.println("BEEM AMIGOS DA REDE GLOBO, VAMOS COMEÇAR A TRANSMITIR O TREINO CLASSIFICATORIO PARA GP DE MONACO ");
        System.out.println("ESTA ENTRANDO NA PISTA AGORA O PILOTO " + this.getNome());

        Random random = new Random();
        int p1 = 20;
        // Voltas
        for (int i = 1; i<= 5; ++i){
            System.out.println(" Volta: " + i);
            p1 = random.nextInt(20) + 1;
            if (p1 < this.getPosition()){
                System.out.println("Ele fez uma grande volta agora foi para " + p1 + " Vamos ver se ele vai segurar");
                this.setPosition(p1);
            } else if (p1 == this.getPosition() && this.getPosition() != 1){
                System.out.println("Foi uma volta normal, ele nao conseguiu subir de posicao");
            } else if(p1 > this.getPosition()){
                System.out.println("Que volta terrivel, perdeu " + (p1 - this.getPosition()) + " possicao ");
                this.setPosition(p1);
                System.out.println("Caiu para " + this.getPosition());
            } else {
                System.out.println("QUE VOOOLTA INCRIVEEEL, FOI PARA PRIMEIROOOOOOO");
                this.setPosition(p1);
            }
        }

        // Salvar
        if (p1 == 1){
            System.out.println("Grande Corrida classificatoria, amanha ele vai larga em primeiro");
            this.setPosition(p1);
            this.setVitorias(this.getVitorias() + 1);
        } else if (p1 > 1 && p1 <= 5){
            System.out.println("Nao foi o melhor treino de sua carreia, entretanto amanha ele vai iniciar a corrida em " + this.getPosition());
        } else if (p1 <= 10){
            System.out.println("Que corrida mediana, ele deve ter comido feijoada, vai largar amanha em " + this.getPosition());
        } else {
            System.out.println("Esse sem duvida foi o pior treino classificatorio da sua historia, amanha ele vai larga em " + this.getPosition());
        }

        this.setCorridas(this.getCorridas() + 1);

    }

    @Override
    public void vitoria() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void posicao(int vodka) {
        this.setPosition(vodka);
    }

    @Override
    public String statusPiloto() {
        return "Piloto{" +
                "\n nome = " + nome + '\'' +
                "\n nacionalidade: " + nacionalidade + '\'' +
                "\n idade: " + idade +
                "\n corridas: " + corridas +
                "\n vitorias: " + vitorias +
                "\n position: " + position +
                "\n carro: " + carro.getModelo() +  " fabricante:  " + carro.getFabricante() + " Potencia: " + carro.getPotencia() + " \n \n " +
                '}';
    }
}
