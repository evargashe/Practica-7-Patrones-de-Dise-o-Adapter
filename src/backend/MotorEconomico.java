package backend;

public class MotorEconomico extends Motor {

    public MotorEconomico(){
        super();
        System.out.println("Creando motor econ�mico...");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor econ�mico.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el motor econ�mico.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor econ�mico.");
    }
}

