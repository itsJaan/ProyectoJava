/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

/**
 *
 * @author Javier
 */
public class Players {
    public String usuario[];
    public String contras[];
    public String us;
    public String con;
    public int u=0;
    public int c=0;
    
    
    public Players(String usus, String cons){
        us=usus;
        con=cons;
        
    }    
    public String Usuarios(String us){
        for(u=0 ;u<usuario.length;u++){
            usuario[u]=us;
        }
        return usuario[u];
    }
    public String Contrasenas(String con){
        for(c=0 ;c<contras.length;c++){
            contras[c]=con;
        }
        return contras[c];    
    }
    
}
