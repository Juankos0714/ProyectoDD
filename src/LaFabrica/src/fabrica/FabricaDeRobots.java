package LaFabrica.src.fabrica;


import LaFabrica.src.fabricas.juguetes.Juguete;
import LaFabrica.src.fabricas.juguetes.Robot;

// Fábrica de Robots
public class FabricaDeRobots extends FabricaDeJuguetes {
    public Juguete crearJuguete() {
        return new Robot();
    }
}
