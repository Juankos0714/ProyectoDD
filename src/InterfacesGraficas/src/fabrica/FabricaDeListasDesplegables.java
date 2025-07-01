package InterfacesGraficas.src.fabrica;

import InterfacesGraficas.src.fabricas.interfaces.Interfaz;
import InterfacesGraficas.src.fabricas.interfaces.ListaDesplegable;

public class FabricaDeListasDesplegables extends FabricaDeInterfaces {
    public Interfaz crearInterfaz() {
        return new ListaDesplegable();
    }
}
