public class Carro {
    private String marca;
    private String  modelo;
    private int ano;
    private double velocidade;


public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.velocidade = velocidade = 0;
    }

    void acelerar(){
    velocidade = velocidade + 10;
    }

    void frear() {
    velocidade = velocidade - 10;
    }

    public String getMarca() {
    return marca;
    }

    public void setMarca(String marca) {
    this.marca = marca;
    }

    public String getModelo() {
    return modelo;
    }

    public void setModelo(String modelo) {
    this.modelo = modelo;
    }

    public int getAno() {
    return ano;
    }

    public void setAno(int ano) {
    this.ano = ano;
    }

    public double getVelocidade() {
    return velocidade;
    }

    public void setVelocidade(double velocidade) {
    this.velocidade = velocidade;
    }

    void exibirInfo() {
    System.out.println("Marca " + marca);
    System.out.println("Modelo " + modelo);
    System.out.println("Ano " + ano);
    System.out.println("Velocidade " + velocidade);

    }

}

