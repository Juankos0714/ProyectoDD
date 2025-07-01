package ProgramaInicial;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE PEDIDOS DE HAMBURGUESAS ===\n");

        System.out.println("Hamburguesa completa:");
        Hamburguesa completa = new Hamburguesa("pan", "carne", "queso", "lechuga", "tomate", "cebolla");
        completa.mostrar();

        System.out.println("\nHamburguesa básica (pan y carne):");
        Hamburguesa basica = new Hamburguesa("pan", "carne");
        basica.mostrar();

        System.out.println("\nHamburguesa con queso:");
        Hamburguesa conQueso = new Hamburguesa("pan", "carne", "queso");
        conQueso.mostrar();

        System.out.println("\nHamburguesa pan y queso (usando dummy):");
        Hamburguesa panQueso = new Hamburguesa("pan", "dummy", "queso", true);
        panQueso.mostrar();

        System.out.println("\nHamburguesa Kaos (orden alterado):");
        Hamburguesa hamburguesaKaos = new Hamburguesa("kaos");
        hamburguesaKaos.mostrar();

    }
}
