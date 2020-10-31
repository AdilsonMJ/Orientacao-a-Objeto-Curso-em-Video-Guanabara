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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
}
