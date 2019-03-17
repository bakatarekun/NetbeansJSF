/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfexample2;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ky
 */
@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
    
    private static final long serialVersionUID = 1L;
   private String name;
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }

   public String getWelcomeMessage() {
//       try{
//            Thread.sleep(3000);
//        } catch(InterruptedException ex){
//            
//        }
      return "Hello " + name;
       
   }
}

