package InterfacesGraficas.src.fabrica;

import InterfacesGraficas.src.fabricas.interfaces.Interfaz;
import InterfacesGraficas.src.fabricas.interfaces.CajaPassword;

public class FabricaDeCajasPassword extends FabricaDeInterfaces {
    public Interfaz crearInterfaz() {
        return new CajaPassword();
    }
}
