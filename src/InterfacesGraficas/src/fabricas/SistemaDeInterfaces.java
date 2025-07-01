package InterfacesGraficas.src.fabricas;

import InterfacesGraficas.src.fabrica.FabricaDeInterfaces;
import InterfacesGraficas.src.fabrica.FabricaDeListas;
import InterfacesGraficas.src.fabrica.FabricaDeListasDesplegables;
import InterfacesGraficas.src.fabrica.FabricaDeCajasTextoCorto;
import InterfacesGraficas.src.fabrica.FabricaDeCajasPassword;

public class SistemaDeInterfaces {
    public static void main(String[] args) {
        FabricaDeInterfaces fabrica;

        fabrica = new FabricaDeListas();
        fabrica.renderizarInterfaz();

        fabrica = new FabricaDeListasDesplegables();
        fabrica.renderizarInterfaz();

        fabrica = new FabricaDeCajasTextoCorto();
        fabrica.renderizarInterfaz();

        fabrica = new FabricaDeCajasPassword();
        fabrica.renderizarInterfaz();
    }
}