/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package practica;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Practica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
           
        Empleado Isabella = new Empleado(1, 50000, "8 horas diarias", "Arquitecta", "Isabella", "Almonte", "IsaAl@gmail.com","06 de Marzo 1990","Femenino", 34);
        Cliente Sarah = new Cliente(1, "Desings" ,"Sarah", "Martinez", "SM@gmail.com","22 de Febrero 2000", "Femenino", 24);
        
        
            System.out.println("Seleccione una opción:");
            System.out.println("1- Solicitar un permiso para el empleado");
            System.out.println("2- Reportar horas extra que trabajó el empleado");
            System.out.println("3- Contactar Representante del cliente");
            System.out.println("4- Solicitar Información del cliente");
            System.out.println("5- Nuevo");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            option = scanner.nextInt();
              
            if (option == 1) {
                Isabella.solicitudPermiso();
            } else if (option == 2) {
                Isabella.ReporteHorasExtra();
            } else if (option == 3) {
                Sarah.ContactarRepresentante();
            } else if (option == 4) {
                Sarah.SolicitarInformacion();
            } else {
                System.out.println("Opción no válida");
            }

        } 
    }

