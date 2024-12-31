import java.util.ArrayList;
import java.util.List;

public class TesteCarros {
    public static void main(String[] args) {
        // Criação de uma lista que pode armazenar qualquer tipo de Carro
        List<Carro> carros = new ArrayList<>();

        // Adicionando diferentes tipos de carros à lista
        carros.add(new CarroEletrico("Tesla Model S", "Preto"));
        carros.add(new CarroGasolina("Fusca", "Azul"));
        carros.add(new CarroEletrico("Nissan Leaf", "Branco"));
        carros.add(new CarroGasolina("Chevrolet Camaro", "Vermelho"));

        // Iterando sobre a lista e ligando os carros
        for (Carro carro : carros) {
            System.out.println(carro); // Mostra os detalhes do carro
            carro.ligar(); // Chama o método ligar de cada carro
        }
    }
}
