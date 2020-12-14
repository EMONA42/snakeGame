/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author EMONA SAY HII
 */
public class KeyboardListener extends KeyAdapter {

    public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case 50:	// -> Right 
		    				//if it's not the opposite direction
		    				if(ThreadsController.directionSnake!=28) 
		    					ThreadsController.directionSnake=10;
		    			  	break;
		    	case 76:	// -> Top
							if(ThreadsController.directionSnake!=30) 
								ThreadsController.directionSnake=21;
		    				break;
		    				
		    	case 80: 	// -> Left 
							if(ThreadsController.directionSnake!=20)
								ThreadsController.directionSnake=45;
		    				break;
		    				
		    	case 90:	// -> Bottom
							if(ThreadsController.directionSnake!=40)
								ThreadsController.directionSnake=50;
		    				break;
		    	
		    	default: 	break;
 		    }
 		}
}
