/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lv.valdis.warehouse;

import javax.ejb.Local;

/**
 *
 * @author Valdis
 */
@Local
public interface UserSessionBeanLocal {
 
boolean logIn(String name, String surname);
    
}
