/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfexample2;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author ky
 */
@ManagedBean (name="bean2")
@ApplicationScoped
public class Bean2 implements Serializable {
   boolean isShow;
   String msg ="default message";
   private MenuModel topMenuModel;
   public Bean2(){
       
   }
   
   @PostConstruct
   public void init(){
       buildTopMenu();
   }
   
    private void buildTopMenu(){
        topMenuModel = new DefaultMenuModel();
        

    }
    public boolean isIsShow() {
        return isShow;
    }

    public void setIsShow(boolean isShow) {
        this.isShow = isShow;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
   
   public void changeBoolean(){
       this.isShow= true;
       this.msg = "it worked!";
   
   }
   public void handleKeyEvent() {
//       for(int i=0; i<100000;i++)
//       {System.out.println("hello");}
       
        
        msg = msg.toUpperCase();
        try{
            Thread.sleep(3000);
        } catch(InterruptedException ex){
            
        }
        FacesMessage message = new FacesMessage("entry saved");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
