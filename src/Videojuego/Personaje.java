package Videojuego;

class Personaje {
    private String altura;
    private String peso;
    private String colorPiel;

    private String fuerza;
    private String agilidad;
    private String inteligencia;

    private String armas;
    private String armaduras;
    private String accesorios;

    private Personaje(String altura, String peso, String colorPiel, String fuerza,
                      String agilidad, String inteligencia, String armas,
                      String armaduras, String accesorios) {
        this.altura = altura;
        this.peso = peso;
        this.colorPiel = colorPiel;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.armas = armas;
        this.armaduras = armaduras;
        this.accesorios = accesorios;
    }

    public void mostrarPersonaje() {
        System.out.println("=== MI PERSONAJE ===");
        System.out.println("CARACTERÍSTICAS FÍSICAS:");
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Color de Piel: " + colorPiel);
        System.out.println("\nHABILIDADES:");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Agilidad: " + agilidad);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("\nEQUIPAMIENTO:");
        System.out.println("Armas: " + armas);
        System.out.println("Armaduras: " + armaduras);
        System.out.println("Accesorios: " + accesorios);
        System.out.println("====================");
    }

    public static class Builder {
        private String altura = "Altura promedio";
        private String peso = "Peso promedio";
        private String colorPiel = "Color neutro";
        private String fuerza = "Fuerza básica";
        private String agilidad = "Agilidad básica";
        private String inteligencia = "Inteligencia básica";
        private String armas = "Sin armas";
        private String armaduras = "Sin armadura";
        private String accesorios = "Sin accesorios";

        public Builder conAltura(String altura) {
            this.altura = altura;
            return this;
        }

        public Builder conPeso(String peso) {
            this.peso = peso;
            return this;
        }

        public Builder conColorPiel(String colorPiel) {
            this.colorPiel = colorPiel;
            return this;
        }

        public Builder conFuerza(String fuerza) {
            this.fuerza = fuerza;
            return this;
        }

        public Builder conAgilidad(String agilidad) {
            this.agilidad = agilidad;
            return this;
        }

        public Builder conInteligencia(String inteligencia) {
            this.inteligencia = inteligencia;
            return this;
        }

        public Builder conArmas(String armas) {
            this.armas = armas;
            return this;
        }

        public Builder conArmaduras(String armaduras) {
            this.armaduras = armaduras;
            return this;
        }

        public Builder conAccesorios(String accesorios) {
            this.accesorios = accesorios;
            return this;
        }

        public Personaje construir() {
            return new Personaje(altura, peso, colorPiel, fuerza, agilidad,
                    inteligencia, armas, armaduras, accesorios);
        }
    }
}
