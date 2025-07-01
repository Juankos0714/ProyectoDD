package BasesDeDatos.src.Fabricas.basesDeDatos;

public class Oracle implements BaseDeDatos {
    public void CrearTabla(){
        System.out.println("Se ha Creado la tabla de manera exitosa");
    }
    public void InsertarDatos(){
        System.out.println("Se han insertados los datos de manera correcta");
    }

    public void ActualizarDatos() {
        System.out.println("Se han actualizado todos los datos");
    }
}
