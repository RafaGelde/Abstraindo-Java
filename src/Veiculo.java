public abstract class Veiculo {

    // Atributos
    private String marca;
    private String modelo;

    // Construtor
    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodo Abstrato sem Implementação
    public abstract String mover();

    // Exibir informações do objeto
    public String toString() {
        return "Marca = "+marca+ " - Modelo = "+modelo;
    }
}
