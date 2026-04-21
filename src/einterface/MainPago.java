package einterface;

public class MainPago {
    public static void main(String [] args){
        Pago p1=new PagoEfectivo();
        p1.procesarPago(50);

        Pago p2=new PagoTarjeta();
        p2.procesarPago(80.50);
    }
}
