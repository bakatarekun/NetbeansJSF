/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfexample2;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectorView {
     
    private String text1;   
    private String text2;
    private String text3;
 
    public String getText1() {
        return text1;
    }
 
    public void setText1(String text1) {
        this.text1 = text1;
    }
 
    public String getText2() {
        return text2;
    }
 
    public void setText2(String text2) {
        this.text2 = text2;
    }
 
    public String getText3() {
        return text3;
    }
 
    public void setText3(String text3) {
        this.text3 = text3;
    }
}