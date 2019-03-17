/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.jsfexample2;
import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.swing.JOptionPane;
/**
 *
 * @author ky
 */
@ManagedBean (name="multiPracticeBean")
@ApplicationScoped
public class MultiPractice implements Serializable {
       private static final long serialVersionUID = 1L;
    public MultiPractice() {
    }
    
    public void runMutiPractice()
    {
         String strnumberofelements = JOptionPane.showInputDialog("Enter how many times you'd like to play:");
		 int numberofelements = Integer.parseInt(strnumberofelements);
			double count =0;
			int answer =0; 
			int[] storeyouranswer = new int[numberofelements];
			int[] storeanswer = new int[numberofelements];
		 for( int i = 0; i < numberofelements; i++)
	{
		int number1 = (int)(Math.random() *10);
		int number2 = (int)(Math.random() *10);
	  		
		
		String stryouranswer = JOptionPane.showInputDialog("What is " + number1 + "*" + number2 + "?  ");			  
		int youranswer = Integer.parseInt(stryouranswer);
		
		storeyouranswer[i] = youranswer;
		answer = number1 * number2;
		storeanswer[i] = answer;
		
		if (youranswer==answer)
			count++;
	
		System.out.println();
		
		
	} 
		 //JOptionPane.showMessageDialog(null, storeyouranswer[0] + storeanswer[0]);
		/*for( int j = 0; j < numberofelements; j++)
		 {
			 
		 System.out.println("\t" + storeyouranswer[j]+"\t" + "\t" + storeanswer[j]); 
		
		 });*/
		 
		JOptionPane.showMessageDialog(null,"your score is " + ((int)count*100/numberofelements)/100.0*100 + " %" );
	}
    }

