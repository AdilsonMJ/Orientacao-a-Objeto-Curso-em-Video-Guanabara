package ProjetoCorrida;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class ProjetoCorrida {
    public static void main(String[] args) {
        Carro[] c = new Carro[1];
        Piloto[] p = new Piloto[1];

        c[0] = new Carro("FIAT", "UNO", 400);
        p[0] = new Piloto("Adilson", "Brasileiro", 26, 10, 5, c[0]);

        System.out.println(p[0].statusPiloto());

    }
}
