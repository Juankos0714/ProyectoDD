package ProgramaInicial;

class Hamburguesa {
    private String pan;
    private String carne;
    private String queso;
    private String lechuga;
    private String tomate;
    private String cebolla;

    public Hamburguesa(String pan, String carne, String queso, String lechuga, String tomate, String cebolla) {
        this.pan = pan;
        this.carne = carne;
        this.queso = queso;
        this.lechuga = lechuga;
        this.tomate = tomate;
        this.cebolla = cebolla;
    }

    public Hamburguesa(String pan, String carne) {
        this.pan = pan;
        this.carne = carne;
        this.queso = "";
        this.lechuga = "";
        this.tomate = "";
        this.cebolla = "";
    }

    public Hamburguesa(String pan, String carne, String queso) {
        this.pan = pan;
        this.carne = carne;
        this.queso = queso;
        this.lechuga = "";
        this.tomate = "";
        this.cebolla = "";
    }

    public Hamburguesa(String pan, String dummy, String queso, boolean esConQueso) {
        this.pan = pan;
        this.carne = "";
        this.queso = queso;
        this.lechuga = "";
        this.tomate = "";
        this.cebolla = "";
    }

    public Hamburguesa(String orden) {
        if (orden.equals("kaos")) {
            this.carne = "carne";
            this.pan = "pan";
            this.lechuga = "lechuga";
            this.queso = "queso";
            this.tomate = "tomate";
            this.cebolla = "cebolla";
        }
    }

    public void mostrar() {
        String resultado = "";

        if (!pan.isEmpty()) resultado += pan + " ";
        if (!carne.isEmpty()) resultado += carne + " ";
        if (!queso.isEmpty()) resultado += queso + " ";
        if (!lechuga.isEmpty()) resultado += lechuga + " ";
        if (!tomate.isEmpty()) resultado += tomate + " ";
        if (!cebolla.isEmpty()) resultado += cebolla + " ";

        System.out.println(resultado.trim());
    }
}



