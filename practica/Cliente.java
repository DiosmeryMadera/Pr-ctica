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
public class Cliente extends Persona{
        private final int IdCliente;
        private final String TiendaC;
        
    public Cliente(int IdCliente, String TiendaC, String Nombre, String Apellido, String CorreoElectronico, String FechaNa, String Sexo, int Edad) {
        super(Nombre, Apellido, CorreoElectronico, FechaNa, Sexo, Edad);
             this.IdCliente = IdCliente;
             this.TiendaC = TiendaC;
        
     }
            public void ContactarRepresentante(){
            System.out.println("El cliente " + Nombre + " desea contactar con un representante");
        }
        
          public void SolicitarInformacion(){
            System.out.println("El cliente " + Nombre + " desea solicitar info de la tienda " + TiendaC);
        }
  
}
