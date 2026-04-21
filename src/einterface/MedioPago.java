package einterface;

public abstract class MedioPago {
    public MedioPago(){

    }

    void pagarMedio(String medio){
        System.out.println("Medio de pago "+medio);
    }
    abstract void procesar(double monto);
}
