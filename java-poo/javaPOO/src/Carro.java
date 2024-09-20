
public class Carro extends Veiculo{

    public void ligar() {
        System.out.println("Ligado...");
        conferindoCambio();
        confereCombustivel();
    }

    public void confereCombustivel() {
        System.out.println("Conferindo Combustível...");
    }

    public void conferindoCambio() {
        System.out.println("Conferindo cambio em P");
}
}
