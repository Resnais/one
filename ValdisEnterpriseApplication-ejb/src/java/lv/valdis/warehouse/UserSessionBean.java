/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lv.valdis.warehouse;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Valdis
 */
@Stateful
public class UserSessionBean implements UserSessionBeanLocal {

      
    @PersistenceContext 
    private EntityManager em;
    private User currUser;
    @EJB(name = "invSess")
    private UserSessionBeanLocal invSess;    
 
    public boolean logIn(String fName, String lName) {
        System.out.println("logIn invoked");
        
	if (lName == null || lName.equals("")) return false;
        
        Query tmpFindAllQry =  em.createNamedQuery("User.findAll");
        List<User> tmpList = tmpFindAllQry.getResultList();
        for (User tmpUser : tmpList) {
            if (tmpUser.getSurname().equals(lName)) {
        	currUser = tmpUser;
		return true;
            }
        }
	
        currUser = new User();
        currUser.setName(fName);
        currUser.setSurname(lName);
        em.persist(currUser);
        return true;
    }
    
}
