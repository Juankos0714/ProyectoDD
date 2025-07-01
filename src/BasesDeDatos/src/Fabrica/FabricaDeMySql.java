package BasesDeDatos.src.Fabrica;


import BasesDeDatos.src.Fabricas.basesDeDatos.BaseDeDatos;
import BasesDeDatos.src.Fabricas.basesDeDatos.MySql;

public class FabricaDeMySql extends FabricaDeBases {
    public BaseDeDatos crearBD() {
        return new MySql();
    }
}
