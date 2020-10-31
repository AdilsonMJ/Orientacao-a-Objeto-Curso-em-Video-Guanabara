package OrangeBankProject;
//VOCE PODE  APRENDER  CARAIO!!!! 

public interface InterfaceBanco {
    public abstract void abrirConta(String tipo, String nome);
    public abstract void consultarConta();
    public abstract void depositar(float valor);
    public abstract void sacar(float valor);
    public abstract void pagar(float valor);
    public abstract void fecharConta();
}
