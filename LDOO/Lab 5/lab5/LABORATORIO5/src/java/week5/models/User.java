/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.models;

/**
 *
 * @Daniel Eliseo Meza Corral 1743062
 */
public class User {
      String usuario;
      String contra;
      private String nombre;
      private String apellidos;
      
      public String getName(){
          return("nombre");
      }
      
      public String getLastName(){
          return("apellidos");
      }
      
      public String getFullName(){
          return("nombre" + "apellidos");
      }
      
      
      
      
      
      
      
    public User(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.apellidos = apellidos;   
    }
     
     public String getUsername(String user){
        return(user);}

    public Object getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
