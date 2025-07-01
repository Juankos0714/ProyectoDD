package InterfacesGraficas.src;

import InterfacesGraficas.src.fabrica.FabricaDeListas;

public class admin {
    public static void main(String[] args) {
        FabricaDeListas fabrica = new FabricaDeListas();
        fabrica.renderizarInterfaz();
    }
}
