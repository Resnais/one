/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lv.valdis.warehouse;


import javax.ejb.Stateful;


/**
 *
 * @author Valdis
 */
@Stateful
public class UserSessionBean implements UserSessionBeanLocal {

 

    @Override
    public boolean logIn(String fName, String lName) {
        System.out.println("logIn invoked");
        return true;
    }
    
}
