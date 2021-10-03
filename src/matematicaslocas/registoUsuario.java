/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicaslocas;

/**
 *
 * @author USUARIO
 */
public class registoUsuario {
   private String nombreUsuario;
   private int fechaNacimiento;

    public registoUsuario(String nombreUsuario, int fechaNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimiento= fechaNacimiento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "registoUsuario{" + "nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + '}';
    }


   
   public void actualizar(String nombre, int edad){
       
       if(nombre.equals(this.nombreUsuario)){
           System.out.println("ingrese edad y nombre nuevos");
            String a="juan";
             int  b=   4;     
           this.nombreUsuario=a;
           this.fechaNacimiento=b;
           toString();
       } else{
             System.out.println("el nombre no coincide con el ingresado anteriormente");      
                   }
       }
   public void borrar(String nombre, int edad){
       
       if(nombre.equals(this.nombreUsuario)){
           System.out.println("ingrese edad y nombre nuevos");
            String a=null;
             int  b=   0;     
           this.nombreUsuario=a;
           this.fechaNacimiento=b;
           toString();
       } else{
             System.out.println("el nombre no coincide con el ingresado anteriormente");      
                   }
       }
   }

