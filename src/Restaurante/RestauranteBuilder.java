package Restaurante;

public class RestauranteBuilder {
    public static void main(String[] args) {
        System.out.println("===== PASO 1: HAMBURGUESA BÁSICA =====");
        System.out.println("Solo pan + carne\n");

        Hamburguesa hamburguesa1 = new Hamburguesa.Builder()
                .conPan("Pan Especial")
                .conCarne("Carne de cerdo")
                .construir();
        hamburguesa1.mostrar();

        System.out.println("===== PASO 2: HAMBURGUESA CON QUESO =====");
        // Hamburguesa CON queso
        System.out.println("Hamburguesa CON queso:");
        Hamburguesa hamburguesa2a = new Hamburguesa.Builder()
                .conPan("Pan integral")
                .conCarne("Carne de res")
                .conQueso("Queso cheddar")
                .construir();
        hamburguesa2a.mostrar();

        // Hamburguesa SIN queso (omitimos .conQueso())
        System.out.println("Hamburguesa SIN queso (no llamamos .conQueso()):");
        Hamburguesa hamburguesa2b = new Hamburguesa.Builder()
                .conPan("Pan de leche")
                .conCarne("Pollo a la plancha")
                .construir(); // ¡No ponemos .conQueso()!
        hamburguesa2b.mostrar();

        System.out.println("===== PASO 3: HAMBURGUESA COMPLETA =====");
        // 1. Hamburguesa COMPLETA (todos los ingredientes)
        System.out.println("Hamburguesa COMPLETA:");
        Hamburguesa completa = new Hamburguesa.Builder()
                .conPan("Pan artesanal con semillas")
                .conCarne("Carne premium")
                .conQueso("Queso suizo derretido")
                .conVerduras("Lechuga, tomate, cebolla")
                .conSalsa("Salsa especial de la casa")
                .construir();
        completa.mostrar();

        // 2. Hamburguesa para NIÑOS (solo algunos ingredientes)
        System.out.println("Hamburguesa para NIÑOS:");
        Hamburguesa ninos = new Hamburguesa.Builder()
                .conPan("Pan de leche suave")
                .conCarne("Pollo a la plancha")
                .conQueso("Queso suave")
                .construir(); // ¡Sin verduras ni salsa!
        ninos.mostrar();

        // 3. Hamburguesa VEGETARIANA (sin carne)
        System.out.println("Hamburguesa VEGETARIANA:");
        Hamburguesa vegetariana = new Hamburguesa.Builder()
                .conPan("Pan integral")
                .conVerduras("Lechuga, tomate, aguacate, brotes")
                .conSalsa("Salsa de yogur con hierbas")
                .construir(); // ¡Sin carne ni queso!
        vegetariana.mostrar();

        System.out.println("===== PASO 4: ORDEN DIFERENTE + RIPIO DE PAPA =====");
        // 1. Orden NORMAL
        System.out.println("Construcción en orden NORMAL:");
        Hamburguesa normal = new Hamburguesa.Builder()
                .conPan("Pan brioche")
                .conCarne("Carne de conejo")
                .conQueso("Queso de bufala")
                .conVerduras("Lechuga y tomate")
                .conSalsa("Taratara")
                .conRipioPapa("Ripio crujiente")
                .construir();
        normal.mostrar();
        // 2. Orden COMPLETAMENTE DIFERENTE
        System.out.println("Construcción en orden DIFERENTE:");
        Hamburguesa diferente = new Hamburguesa.Builder()
                .conSalsa("Mayonesa picante") // ¡Empezamos por salsa!
                .conRipioPapa("Ripio extra crujiente") // Luego ripio
                .conVerduras("Cebolla caramelizada") // Después verduras
                .conQueso("Queso azul") // Luego queso
                .conCarne("Pollo apanado") // Después carne
                .conPan("Pan de centeno") // ¡Pan al final!
                .construir();
        diferente.mostrar();
        // 3. Hamburguesa de ATÚN
        System.out.println("Hamburguesa de ATÚN:");
        Hamburguesa atun = new Hamburguesa.Builder()
                .conPan("Pan pita integral")
                .conCarne("Atún en agua con limón")
                .conVerduras("Lechuga fresca y tomate cherry")
                .conSalsa("Mayonesa con ajo")
                .conRipioPapa("Ripio de papa con hierbas")
                .construir(); // Sin queso
        atun.mostrar();
    }
}
