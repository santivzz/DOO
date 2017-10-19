/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.models;

/**
 *
 * @author seg-5
 */
public class Authentication {

    public static boolean authenticate(String user, String contra) {

        String usuarioDB = "Daniel";
        String contraDB = "1234";
        if (user.equals(usuarioDB) && contra.equals(contraDB)) {
            return true;
        } else {
            return false;
        }
    }
}
