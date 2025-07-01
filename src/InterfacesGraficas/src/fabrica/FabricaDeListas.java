package InterfacesGraficas.src.fabrica;

import InterfacesGraficas.src.fabricas.interfaces.Interfaz;
import InterfacesGraficas.src.fabricas.interfaces.Listas;

public class FabricaDeListas extends FabricaDeInterfaces {
    public Interfaz crearInterfaz() {
        return new Listas();
    }
}
