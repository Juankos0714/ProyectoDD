package LaFabrica.src.fabricas;

import LaFabrica.src.fabrica.FabricaDeJuguetes;
import LaFabrica.src.fabrica.FabricaDeOsos;
import LaFabrica.src.fabrica.FabricaDeRobots;

// Cliente
public class TiendaDeJuguetes {
    public static void main(String[] args) {
        FabricaDeJuguetes fabrica;
        // Cambiar entre oso y robot
        fabrica = new FabricaDeOsos();
        fabrica.entregarJuguete();
        fabrica = new FabricaDeRobots();
        fabrica.entregarJuguete();
    }
}

