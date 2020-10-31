package UEC;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class Lutador {
    //Atributos
    private String  nome;
    private String  nacionalidade;
    private int     idade;
    private float   altura;
    private float   peso;
    private String  categoria;
    private int     vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome           = nome;
        this.nacionalidade  = nacionalidade;
        this.idade          = idade;
        this.altura         = altura;
        this.vitorias       = vitorias;
        this.derrotas       = derrotas;
        this.empates        = empates;
        this.setPeso(peso);
    }

    //Getts e Setts

    public String   getNome() {
        return nome;
    }

    public void     setNome(String nome) {
        this.nome = nome;
    }

    public String   getNacionalidade() {
        return nacionalidade;
    }

    public void     setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int      getIdade() {
        return idade;
    }

    public void     setIdade(int idade) {
        this.idade = idade;
    }

    public float    getAltura() {
        return altura;
    }

    public void     setAltura(float altura) {
        this.altura = altura;
    }

    public float    getPeso() {
        return peso;
    }

    public void     setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String   getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52.2 ){
            this.categoria = "Invalido";
            System.out.println("Vai malhar Chaci de Grilo");
        } else if (this.getPeso() <= 70.3){
            this.categoria = "Pena";
        } else if (this.getPeso() <= 83.9){
            this.categoria = "Cachorro Doido";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Mamute";
        } else if (this.getPeso() > 120.2){
            categoria = "Invalida";
            System.out.println("Vai fazer dieta caralho! ");
            System.out.println("Esta acima do peso permitido ");
        } else {
            categoria = "Invalida";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    //Metodos Publicos
    public void apresentar(){
        System.out.println("BOOOOOOOA NOITEEEE  SEUS ARRROMBADOS DO CARALHO");
        System.out.println("Essa noite temos essa luta de " + this.getCategoria() );
        System.out.println("Ele que se chama " + this.getNome() );
        System.out.println("ele é  " + this.getNacionalidade() );
        System.out.println("tem " + this.getIdade() + " anos  e " + this.getAltura() + "  metro de altura");
        System.out.println("Pesando " + this.getPeso() + "  Kg");
        System.out.println("Tem acomulando " + (this.getVitorias() + this.getDerrotas() + this.getEmpates() + " lutas em tuda sua carreia"));
        System.out.println("Totalizando: " + this.getVitorias() + " Vitorias " );
        System.out.println( this.getDerrotas() + " Derrotas " );
        System.out.println( this.getEmpates() + " Empates " );
    }

    public void status(){
        System.out.println("Nome: " + this.getNome() );
        System.out.println("idade: " + this.getIdade() );
        System.out.println("Categoria: " + this.getCategoria() );
        System.out.println("Ganhou: " + this.getVitorias() + " vezes");
        System.out.println("Perdeu: " + this.getDerrotas() + " vezes");
        System.out.println("Ganhou: " + this.getEmpates()  + " vezes");
    }

    public void ganharLuta(){
            this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
            this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
            this.setEmpates(this.getEmpates() + 1);
    }
}
