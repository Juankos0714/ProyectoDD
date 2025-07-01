package LaFabrica.src.fabrica;


import LaFabrica.src.fabricas.juguetes.Balon;
import LaFabrica.src.fabricas.juguetes.Juguete;

public class FabricaDeBalones extends FabricaDeJuguetes {
    public Juguete crearJuguete() {
        return new Balon();
    }
}

