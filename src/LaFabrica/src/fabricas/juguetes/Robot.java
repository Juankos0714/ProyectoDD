package LaFabrica.src.fabricas.juguetes;

public class Robot implements Juguete{
    public void jugar(){
        System.out.println("El Robot Camina y habla");
    }
    public void mostrarTipo(){
        System.out.println("Robot de pilas");
    }
    public void hacerSonido(){
        System.out.println("Bepp, Bepp");
    }
}

