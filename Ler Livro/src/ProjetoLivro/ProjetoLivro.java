package ProjetoLivro;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livros[] l = new Livros[3];

        p[0] = new Pessoa("Adilson", "M", 26);
        p[1] = new Pessoa("Luciani", "F", 27);

        l[0] = new Livros("Temor do Sabio", "John",     832, p[1]);
        l[1] = new Livros("Fazer amigos",   "Couch",    343, p[0]);
        l[2] = new Livros("Harry Potter",   "J.J",      591, p[1]);


        l[0].abrir();
        l[0].folhear(900);
        System.out.println(l[0].detalhes());
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

    }
}
