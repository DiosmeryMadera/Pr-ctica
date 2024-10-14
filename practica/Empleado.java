/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author User
 */
public class Empleado extends Persona {
        private final int IdEmpleado;
        private final int Sueldo;
        private final String Horario;
        private final String Puesto;

         public Empleado(int IdEmpleado, int Sueldo, String Horario, String Puesto, String Nombre, String Apellido, String CorreoElectronico, String FechaNa, String Sexo, int Edad) {
        super(Nombre, Apellido, CorreoElectronico, FechaNa, Sexo, Edad);

             this.IdEmpleado = IdEmpleado;
             this.Horario = Horario;
             this.Puesto = Puesto;
             this.Sueldo = Sueldo;
         }
         
        public void solicitudPermiso(){
            System.out.println("Permiso del empleado " + Nombre);
        }
        
          public void ReporteHorasExtra(){
            System.out.println("Horas extras del empledo " + Nombre);
        }
          
}
