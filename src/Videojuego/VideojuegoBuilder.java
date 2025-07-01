package Videojuego;

public class VideojuegoBuilder {
    public static void main(String[] args) {
        System.out.println("===== CREACIÓN DE PERSONAJES =====\n");

        System.out.println("PERSONAJE GUERRERO:");
        Personaje guerrero = new Personaje.Builder()
                .conAltura("Alto (1.85m)")
                .conPeso("Pesado (90kg)")
                .conColorPiel("Moreno")
                .conFuerza("Muy fuerte")
                .conAgilidad("Agilidad media")
                .conInteligencia("Inteligencia básica")
                .conArmas("Espada de acero")
                .conArmaduras("Armadura de placas")
                .conAccesorios("Escudo de hierro")
                .construir();
        guerrero.mostrarPersonaje();

        System.out.println("PERSONAJE MAGO:");
        Personaje mago = new Personaje.Builder()
                .conAltura("Bajo (1.65m)")
                .conPeso("Ligero (60kg)")
                .conColorPiel("Pálido")
                .conFuerza("Fuerza débil")
                .conAgilidad("Muy ágil")
                .conInteligencia("Muy inteligente")
                .conArmas("Bastón mágico")
                .conArmaduras("Túnica encantada")
                .conAccesorios("Amuleto de sabiduría")
                .construir();
        mago.mostrarPersonaje();

        System.out.println("PERSONAJE ARQUERO:");
        Personaje arquero = new Personaje.Builder()
                .conArmas("Arco élfico")
                .conAccesorios("Carcaj con flechas")
                .conAgilidad("Extremadamente ágil")
                .conAltura("Mediano (1.75m)")
                .conColorPiel("Bronceado")
                .conInteligencia("Inteligencia media")
                .conFuerza("Fuerza media")
                .conPeso("Ligero (70kg)")
                .conArmaduras("Armadura de cuero")
                .construir();
        arquero.mostrarPersonaje();

        System.out.println("PERSONAJE BÁSICO:");
        Personaje basico = new Personaje.Builder()
                .conAltura("Promedio (1.70m)")
                .conFuerza("Fuerza normal")
                .construir();
        basico.mostrarPersonaje();
    }
}
