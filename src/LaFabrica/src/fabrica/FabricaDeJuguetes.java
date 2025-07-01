package LaFabrica.src.fabrica;


import LaFabrica.src.fabricas.juguetes.Juguete;

public abstract class FabricaDeJuguetes {
    public void entregarJuguete () {
        Juguete juguete = crearJuguete();
        juguete.jugar();
    }
    public abstract Juguete crearJuguete();
}

