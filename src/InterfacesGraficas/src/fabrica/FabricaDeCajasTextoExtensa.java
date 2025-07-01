package InterfacesGraficas.src.fabrica;

import InterfacesGraficas.src.fabricas.interfaces.Interfaz;
import InterfacesGraficas.src.fabricas.interfaces.CajaTextoExtensa;

public class FabricaDeCajasTextoExtensa extends FabricaDeInterfaces {
    public Interfaz crearInterfaz() {
        return new CajaTextoExtensa();
    }
}
