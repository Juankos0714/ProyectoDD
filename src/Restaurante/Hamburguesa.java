package Restaurante;

class Hamburguesa {
    private String pan;
    private String carne;
    private String queso;
    private String verduras;
    private String salsa;
    private String ripioPapa;

    private Hamburguesa(String pan, String carne, String queso, String verduras, String salsa, String ripioPapa) {
        this.pan = pan;
        this.carne = carne;
        this.queso = queso;
        this.verduras = verduras;
        this.salsa = salsa;
        this.ripioPapa = ripioPapa;
    }

    public void mostrar() {
        System.out.println("MI HAMBURGUESA:");
        System.out.println("Pan: " + pan);
        System.out.println("Carne: " + carne);
        System.out.println("Queso: " + queso);
        System.out.println("Verduras: " + verduras);
        System.out.println("Salsa: " + salsa);
        System.out.println("Ripio de Papa: " + ripioPapa);
    }

    public static class Builder {
        private String pan = "Sin pan";
        private String carne = "Sin carne";
        private String queso = "Sin queso";
        private String verduras = "Sin verduras";
        private String salsa = "Sin salsa";
        private String ripioPapa = "Sin ripio de papa";

        public Builder conPan(String pan) {
            this.pan = pan;
            return this;
        }

        public Builder conCarne(String carne) {
            this.carne = carne;
            return this;
        }

        public Builder conQueso(String queso) {
            this.queso = queso;
            return this;
        }

        public Builder conVerduras(String verduras) {
            this.verduras = verduras;
            return this;
        }

        public Builder conSalsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public Builder conRipioPapa(String ripioPapa) {
            this.ripioPapa = ripioPapa;
            return this;
        }

        public Hamburguesa construir() {
            return new Hamburguesa(pan, carne, queso, verduras, salsa, ripioPapa);
        }
    }
}
