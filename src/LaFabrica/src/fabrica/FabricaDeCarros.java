package LaFabrica.src.fabrica;


import LaFabrica.src.fabricas.juguetes.Carro;
import LaFabrica.src.fabricas.juguetes.Juguete;

public class FabricaDeCarros extends FabricaDeJuguetes {
    public Juguete crearJuguete() {
        return new Carro();
    }
}
