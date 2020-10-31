package UEC;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class UEC {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

           l[0] = new Lutador("Pretty Boy", "Françes",      31, 1.75f, 68.9f,  11, 2,   1);
           l[1] = new Lutador("Puscript",   "Brasileira",   29, 1.68f, 57.8f,  18, 2,   3);
           l[2] = new Lutador("Snapshadow", "Americano",    35, 1.65f, 80.9f,  12, 2,   1);
           l[3] = new Lutador("Dead Code",  "Australiano",  28, 1.93f, 81.6f,  13, 0,   2);
           l[4] = new Lutador("UFOCobol",   "Brasileiro",   37, 1.70f, 119.3f, 21, 4,   3);
           l[5] = new Lutador("Bacalhau",   "Portugues",    30, 1.81f, 105.7f, 1,  24,  0);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);

    }
}
