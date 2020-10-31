package OrangeBankProject;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class OrangeBankCity {
    public static void main(String[] args) {

        /*
            Conta deve ser Aberta usando CC = Conta corrente e CP = Conta Poupança
            metodos Disponiveis:
            1) abrirConta(tipo, nome)
            2) consultarConta()
            3) depositar(valor)
            4) sacar(valor)
            5) pagar(valor)
            6) fecharConta()
         */

        BackEndOrangeBankCity cliente1 = new BackEndOrangeBankCity();
        cliente1.abrirConta("CC", "Adilson");
        cliente1.consultarConta();


    }
}
