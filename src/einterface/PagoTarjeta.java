package einterface;

public class PagoTarjeta implements Pago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("El pago se realizará con tarjeta "+ monto);
    }

    @Override
    public void devolverCambio(double monto) {

    }
}
