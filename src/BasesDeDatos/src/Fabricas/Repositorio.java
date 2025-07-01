package BasesDeDatos.src.Fabricas;


import BasesDeDatos.src.Fabrica.FabricaDeBases;
import BasesDeDatos.src.Fabrica.FabricaDeMySql;
import BasesDeDatos.src.Fabrica.FabricaDeOracle;

public class Repositorio {
    public static void main(String[] args){
        FabricaDeBases fabrica;
        fabrica = new FabricaDeOracle();
        fabrica.crearBD();
        fabrica = new FabricaDeMySql();
        fabrica.crearBD();
    }
}
