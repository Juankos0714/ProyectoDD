package LaFabrica.src.fabricas.juguetes;

public class Carro implements Juguete {
    public void jugar() {
        System.out.println("El Carro avanza!!");
    }

    public void mostrarTipo() {
        System.out.println("Carro de carreras");
    }

    public void hacerSonido() {
        System.out.println("Brum Brum");
    }
}
