package BasesDeDatos.src;


import BasesDeDatos.src.Fabrica.FabricaDeOracle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaDeOracle fabrica = new FabricaDeOracle();
        fabrica.crearBD();
    }
}