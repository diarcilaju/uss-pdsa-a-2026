package patron.singleton;

public class Conexion {
    private static Conexion instance;
    private Conexion(){

    }
    public synchronized static Conexion getInstance(){
        if (instance==null){
            instance=new Conexion();
        }
        return instance;
    }

    void conectar(String cadena){
        System.out.println("Conectado a "+cadena);
    }
}
