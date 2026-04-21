package patron.singleton;

public class MainConexion {
    public static void main(){
        Conexion con1=Conexion.getInstance();
        con1.conectar("localhost");
        System.out.println(con1.hashCode());

        Conexion con2=Conexion.getInstance();
        con2.conectar("localhost");
        System.out.println(con2.hashCode());
    }
}
