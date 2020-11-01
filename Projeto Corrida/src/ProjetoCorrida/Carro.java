package ProjetoCorrida;
//VOCE PODE  APRENDER  CARAIO!!!! 

public class Carro {

    private String fabricante;
    private String modelo;
    private float  potencia;

    public Carro(String fabricante, String modelo, float potencia) {
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setPotencia(potencia);
    }

    protected String getFabricante() {
        return fabricante;
    }

    private void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected float getPotencia() {
        return potencia;
    }

    private void setPotencia(float potencia) {
        this.potencia = potencia;
    }
}
