package ic;

public class PostGresql implements Database{
    @Override
    public void conectar(String cadena) {
        System.out.println("Conectandose a PostGresql "+cadena);
    }
}