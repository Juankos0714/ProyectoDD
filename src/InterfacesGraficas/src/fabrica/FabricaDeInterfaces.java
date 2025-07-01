package InterfacesGraficas.src.fabrica;

import InterfacesGraficas.src.fabricas.interfaces.Interfaz;

public abstract class FabricaDeInterfaces {
    public void renderizarInterfaz() {
        Interfaz interfaz = crearInterfaz();
        interfaz.usar();
    }
    public abstract Interfaz crearInterfaz();
}
