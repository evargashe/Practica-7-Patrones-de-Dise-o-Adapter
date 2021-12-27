package frontend;

import backend.Motor;
import backend.MotoComun;
import backend.MotorEconomico;
import backend.MotorElectricoAdapter;
import java.util.Scanner;

public class Aplicacion {
    
    private static Scanner S = new Scanner(System.in);
    private static Motor motor;
    
    public static void main(String[] args) {
        System.out.println("");
        int opcion;
        do{
            opcion = preguntarOpcion();
            switch(opcion) {
                case 1:
                    motor = new MotoComun();
                    usarMotor();
                    break;
                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;
                case 3:
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                    break;
                case 4:
                    System.out.println("�Cerrando programa!");
                    break;
                default:
                    System.out.println("La opci�n ingresada NO es v�lida.");
            }
            System.out.print("\n\n");
        }while(opcion!=4);
    }

    private static int preguntarOpcion() {
        System.out.print(
                "MEN� DE OPCIONES\n"
               +"---- -- --------\n"
               +"1. Encender motor com�n.\n"
               +"2. Encender motor econ�mico.\n"
               +"3. Encender motor el�ctrico.\n"
               +"4. Salir.\n"
               +"Seleccione opci�n: "
        );
        return Integer.parseInt( S.nextLine() );
    }

    private static void usarMotor() {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
