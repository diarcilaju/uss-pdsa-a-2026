package oop;

public class Vehiculo {
    private Motor motor;
    private Timon timon;

    public Vehiculo(){
        this.motor=new Motor();
        this.timon=new Timon();
    }

    public void encender(){
        this.motor.encender();
        this.timon.configurar();
        System.out.println("Vehículo encendido");
    }
}
