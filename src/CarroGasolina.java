// Classe CarroGasolina
public class CarroGasolina extends Carro {

    public CarroGasolina(String modelo, String cor) {
        super(modelo, cor);
    }

    @Override
    public void ligar() {
        System.out.println("O carro a gasolina " + getModelo() + " está ligando com motor a combustão!");
    }
}
