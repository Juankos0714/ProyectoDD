package InterfacesGraficas.src.fabricas.interfaces;

public class CajaPassword implements Interfaz {
    public void usar() {
        System.out.println("Se usa la caja de contraseña");
    }

    public void visualizar() {
        System.out.println("Se visualiza la caja de contraseña");
    }

    public void cambiarColor() {
        System.out.println("Se cambia el color de la caja de contraseña");
    }
}
