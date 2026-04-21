package einterface;

public interface Pago {
    void procesarPago(double monto);
    void devolverCambio(double monto);
}
