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
public class Persona {
         public String Nombre;   
         public String Apellido;
         public String CorreoElectronico;
         public String FechaNa;
         public String Sexo;
         public int Edad;
         
        
         Persona (String Nombre,String Apellido,String CorreoElectronico,String FechaNa, String Sexo, int Edad) {
             this.Nombre = Nombre;
             this.Apellido =Apellido;
             this.CorreoElectronico =CorreoElectronico;
             this.FechaNa = FechaNa;
             this.Sexo= Sexo;
             this.Edad =Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getFechaNa() {
        return FechaNa;
    }

    public void setFechaNa(String FechaNa) {
        this.FechaNa = FechaNa;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

         
}
