public class Moto extends Veiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String mover() {
    return "Estou Acelerado uma Moto!";
    }
}
