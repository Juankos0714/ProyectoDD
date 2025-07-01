package BasesDeDatos.src.Fabrica;


import BasesDeDatos.src.Fabricas.basesDeDatos.BaseDeDatos;
import BasesDeDatos.src.Fabricas.basesDeDatos.SQLserver;

public class FabricaDeSqlServer extends FabricaDeBases {
    public BaseDeDatos crearBD() {
        return new SQLserver();
    }
}
