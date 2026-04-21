package ic;

public class MySql implements Database{
    @Override
    public void conectar(String cadena) {
        System.out.println("Conectandonos a mysql "+cadena);
    }
}