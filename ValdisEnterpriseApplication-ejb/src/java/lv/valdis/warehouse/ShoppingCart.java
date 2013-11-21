/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lv.valdis.warehouse;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Valdis
 */
public class ShoppingCart{

    public ArrayList<Inventory> getList() {
        return list;
    }

    public void setList(ArrayList<Inventory> list) {
        this.list = list;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
    
    ArrayList<Inventory> list;
    private long userId;
    private Date date;
    
    
}
