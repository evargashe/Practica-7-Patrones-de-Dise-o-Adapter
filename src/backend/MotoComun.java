package backend;

public class MotoComun extends Motor {

    public MotoComun(){
        super();
        System.out.println("Creando motor común...");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor común.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor común.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor común.");
    }
}

