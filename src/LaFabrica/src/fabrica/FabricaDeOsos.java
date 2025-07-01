package LaFabrica.src.fabrica;


import LaFabrica.src.fabricas.juguetes.Juguete;
import LaFabrica.src.fabricas.juguetes.Oso;

public class FabricaDeOsos extends FabricaDeJuguetes{
    public Juguete crearJuguete(){
        return new Oso();
    }
}

