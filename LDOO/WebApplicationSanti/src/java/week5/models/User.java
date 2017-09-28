/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.models;

/**
 *
 * @author Mate_18
 */
public class User {
    private String username;
    private String password;
    
    public User(String u , String pss){
            username = u;
            password = pss;
    }  
    public String getUsername(){
        return username;
    
    }



}
