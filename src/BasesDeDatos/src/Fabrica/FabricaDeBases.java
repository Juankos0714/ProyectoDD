package BasesDeDatos.src.Fabrica;


import BasesDeDatos.src.Fabricas.basesDeDatos.BaseDeDatos;

public abstract class FabricaDeBases {
    public void CrearBases () {
        BaseDeDatos bases = crearBD();
        bases.CrearTabla();
    }
    public abstract BaseDeDatos crearBD();
}
