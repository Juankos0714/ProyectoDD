package BasesDeDatos.src.Fabrica;


import BasesDeDatos.src.Fabricas.basesDeDatos.BaseDeDatos;
import BasesDeDatos.src.Fabricas.basesDeDatos.Oracle;

public class FabricaDeOracle extends FabricaDeBases {
    public BaseDeDatos crearBD() {
        return new Oracle();
    }
}
