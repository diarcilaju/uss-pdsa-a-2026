package einterface;

public class PagoEfectivo extends MedioPago implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("El pago se realizará en efectivo "+monto);
    }

    @Override
    public void devolverCambio(double monto) {

    }

    @Override
    void procesar(double monto) {
        System.out.println("Procesando con medio de pago");
    }
}
