package UEC;
//VOCE PODE  APRENDER  CARAIO!!!! 

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds = 3;
    private boolean aprovada;


    //Metodos
    public void marcarLuta(Lutador desafiado, Lutador desafiante){
        if(desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante){
            System.out.println("Luta Aprovada!!! Vai começar em 3, 2, 1 ...");
            this.setAprovada(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
            Lutar();
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
            System.out.println("Esses lutadores nao podem se pegar, categoria invalida");
        }
    }

    public void Lutar(){
        if(this.getAprovada()){
            System.out.println("## DESAFIADO ##");
            this.desafiado.apresentar();
            System.out.println("## DESAFIANTE ##");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
                switch (vencedor){
                    case 0:
                        //Empate
                        System.out.println("Empatou");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        // Desafiado vence
                        System.out.println(this.getDesafiado() + " Meteu pau é ganhou! ");
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2:
                        // Desafiante Vence
                        System.out.println(this.getDesafiante() + " Mostrou pra que veio, foi dedo no olho e tapa na cara!!! ");
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;
            }
        } else {
            System.out.println("Essa luta nao pode rolar caralhoooo");
        }
    }

    // Metodos Especiais


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRounds() {
        return rounds;
    }
}
