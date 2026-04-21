package patron.builder;

public class MainComputadora {
    public static void main(String [] args){
        Computadora pcGamer=new Computadora.Builder("Intel Core I9",32)
                .setTarjetaVideo(true)
                .setBluetooth(true)
                .build();

        System.out.println(pcGamer.getProcesador());
    }
}
