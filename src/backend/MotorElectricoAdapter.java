package backend;

public class MotorElectricoAdapter extends Motor{
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(){
        super();
        System.out.println("Creando motor el�ctrico adapter...");
        this.motorElectrico = new MotorElectrico();        
    }
    @Override
    public void encender() {
        System.out.println("Encendiendo motor el�ctrico adapter.");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor el�ctrico adapter.");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor el�ctrico adapter.");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}


