package ProjetoLivro;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class Livros implements Publicacao{
    private String titulo;
    private String autor;
    private int totalDePaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;


    public String detalhes() {
        return "Livros{" +
                "\n Titulo: " + titulo + '\'' +
                "\n Autor: " + autor + '\'' +
                "\n Total De Paginas: " + totalDePaginas + " Pagina Atual " + this.getPaginaAtual() +
                "\n Aberto: " + aberto +
                "\n Leitor: " + leitor.getNome()  + " \n " +
                '}';
    }

    public Livros(String titulo, String autor, int totalDePaginas ,Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalDePaginas(totalDePaginas);
        this.setLeitor(leitor);

        this.setPaginaAtual(0);
        this.setAberto(false);
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotalDePaginas() {
        return totalDePaginas;
    }

    private void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    private boolean getAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    private int getPaginaAtual() {
        return paginaAtual;
    }

    private void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPaginaAtual(0);
    }

    @Override
    public void folhear(int p) {
        if((this.getPaginaAtual() + p) > this.getTotalDePaginas()){
            this.setPaginaAtual(this.getTotalDePaginas());
        } else {
            this.setPaginaAtual(this.getPaginaAtual() + p);
        }
    }

    @Override
    public void avancarPag() {

        if(this.getTotalDePaginas() == this.getPaginaAtual()){
            fechar();
         } else {
            this.setPaginaAtual(this.getPaginaAtual() + 1 );
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPaginaAtual() == 0 ){
           fechar();
        } else {
            this.setPaginaAtual(this.getPaginaAtual() - 1 );
        }
    }
}
