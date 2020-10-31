package OrangeBankProject;
//VOCE PODE  APRENDER  CARAIO!!!! 

import java.util.Random;

public class BackEndOrangeBankCity implements InterfaceBanco{

    private      int     numeroConta;
    private      int     agencia;
    private      String  tipoDaConta;
    private      String  nomeDoDono;
    private      float   saldo;
    private      Boolean status;

    // Sets e Gets
    private int getNumeroConta() {
        return numeroConta;
    }

    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    private String getTipoDaConta() {
        return tipoDaConta;
    }

    private void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    private String getNomeDoDono() {
        return nomeDoDono;
    }

    private void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    private float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    private Boolean getStatus() {
        return status;
    }

    private void setStatus(Boolean status) {
        this.status = status;
    }

    private int getAgencia() {
        return agencia;
    }

    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    // METODOS ESPECIAIS

    @Override
    public void abrirConta(String tipo, String nome) {
        System.out.println("##### ABRINDO CONTA #####");

        if (tipo.equals("CC") || tipo.equals("CP")) {
            Random random = new Random();
            int agenciaConta = 1000 + random.nextInt(9999 - 1000 + 1);
            int numeroDaConta = 100000 + random.nextInt(999999 - 100000 + 1);

            this.setAgencia(agenciaConta);
            this.setNumeroConta(numeroDaConta);
            this.setNomeDoDono(nome);
            this.setTipoDaConta(tipo);
            this.setStatus(true);


            if (tipo.equals("CC")) {
                this.setSaldo(50);
            } else {
                this.setSaldo(150);
            }
        } else {
            System.out.println("Erro ao criar conta, favor verifique novamente o tipo de conta ");
            System.out.println("CC = Conta Corrente");
            System.out.println("CP = Conta Poupança");
        }

        System.out.println("Nome do Cliente: "  +  this.getNomeDoDono());
        System.out.println("Agencia: "          +  this.getAgencia());
        System.out.println("Conta: "            +  this.getNumeroConta());
        System.out.println("Tipo da Conta "     + this.getTipoDaConta());
    }

    @Override
    public void consultarConta() {
        System.out.println("");
        System.out.println("");
        System.out.println("#####  Dados da Conta  #####");

        if ( this.getStatus()){

            System.out.println("Nome do Cliente: " +  this.getNomeDoDono());
            System.out.println("Agencia: "       +  this.getAgencia());
            System.out.println("Conta: "         +  this.getNumeroConta());
            System.out.println("Tipo da Conta "  + this.getTipoDaConta());
            System.out.println("Status "         + this.getStatus());
            System.out.println("Saldo: "         + this.getSaldo() );
        } else{
            System.out.println("Conta não Existe! ");
        }
    }

    @Override
    public void depositar(float valor) {
        System.out.println("");
        System.out.println("");
        System.out.println("#####  Depositando  #####");

        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito Realizado com sucesso!");
            System.out.println("Saldo:  " + this.getSaldo());
        } else {
            System.out.println("Essa cuéca esta limpa! Impossivel depositar.");
        }
    }

    @Override
    public void sacar(float valor) {
        System.out.println("");
        System.out.println("");
        System.out.println("#####  Sacando Dinheiro #####");

        if (this.getStatus()){
            if(this.getSaldo() >= valor ){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Retire seu dinheiro! ");
                System.out.println("Novo Saldo: " + this.getSaldo());
            } else {
                System.out.println("Valor da cueca insuficiente! ");
                System.out.println("Saldo: " + this.getSaldo());
            }
        } else {
            System.out.println("Conta nao Existe");
        }
    }

    @Override
    public void pagar(float valor) {
        System.out.println("");
        System.out.println("");
        System.out.println("#####  Pagando Conta  #####");

        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Conta paga com sucesso");
                System.out.println("Saldo Atual: " + this.getSaldo());
            } else{
                System.out.println("Ta pobre caralho, hahaha vai ficar sem luz");
            }
        } else {
            System.out.println("Cueca não Existe");
        }
    }

    @Override
    public void fecharConta() {
        System.out.println("");
        System.out.println("");
        System.out.println("#####  Fechando Conta  #####");

        if (this.getSaldo() > 0){
            System.out.println("Deve desviar essa proprina para a cueca antes de fechar conta");
            System.out.println("Saldo: " + getSaldo());
        } else if (this.getSaldo() < 0 ){
            System.out.println("Esta devendo dinheiro ao Carlos Eduardo, paque antes de fechar a conta");
        } else {
            System.out.println("Sua cueca esta vazia, vamos fechar sua conta! ");
            this.setStatus(false);
            System.out.println("Cueca lavada com sucesso!");
        }
    }

}
