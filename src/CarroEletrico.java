// Classe CarroEletrico
public class CarroEletrico extends Carro {

    public CarroEletrico(String modelo, String cor) {
        super(modelo, cor);
    }

    @Override
    public void ligar() {
        System.out.println("O carro elétrico " + getModelo() + " está ligando com energia elétrica!");
    }
}
