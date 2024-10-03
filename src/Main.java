public class Main {
    public static void main(String[] args) {
        Veiculo moto = new Moto("Honda", "CB500");
        Veiculo carro = new Carro("VolksWagen", "Saveiro");

        System.out.println(carro.toString());
        System.out.println(carro.mover());
        System.out.println(moto.toString());
        System.out.println(moto.mover());

    }
}