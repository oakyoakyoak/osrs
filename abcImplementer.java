package scripts.myAPI;

import org.tribot.api.Clicking;
import org.tribot.api.General;
import org.tribot.api.interfaces.Clickable;
import org.tribot.api.util.abc.ABCProperties;
import org.tribot.api.util.abc.ABCUtil;
import org.tribot.api2007.types.RSItem;

public class abcImplementer {

// public static ABCUtil myABC = new ABCUtil();
public static ABCProperties myABCProp = new ABCProperties();
public static ABCUtil myABC = new ABCUtil();
static int abcIntCount = 0;



	public static ABCUtil myABCsleep(ABCUtil myABC) {
	
		General.println("first count " + abcIntCount);
		int waitingTime = myABC.generateReactionTime();
		General.println(waitingTime + "reactionTimeGenerated");
		// myABCProp.setWaitingTime(waitingTime); 
		try {
			myABC.sleep(waitingTime);
			// General.sleep(5000);
			// General.println("myABC.sleep worked");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		// General.sleep(5000);
		// General.println("end of myABCsleep(myABC)");
		// General.println("second count " + abcIntCount);
		return myABC;
				
	}
		
	public static void myABCclose() {
		
		myABC.close();
		General.println("myABCclose worked");
	}	

	// public static void myABCwait(ABCUtil myABC)

	public static void performAllTimedActions() {
	
		// ABCUtil myABC = new ABCUtil();
		abcIntCount++;
		General.println("abcIntCount " + abcIntCount);
	
		General.println("Trackers called");    
	 
		if (myABC.shouldCheckTabs() == true) {
				General.println("TimedActionPerformed1");
				myABC.checkTabs();
		} else {
			General.println("False1");
			}

		if (myABC.shouldCheckXP() == true) {
			General.println("TimedActionPerformed2");
			myABC.checkXP();
        } else {
        	General.println("False2");
        }

        if (myABC.shouldExamineEntity() == true) {
        	General.println("TimedActionPerformed3");
        	myABC.examineEntity();
        } else {
        	General.println("False3");
        }

        if (myABC.shouldLeaveGame()) {
        	General.println("TimedActionPerformed4");
        	myABC.leaveGame();
        } else {
        	General.println("False4");
        }

        if (myABC.shouldMoveMouse() == true) {
        	General.println("TimedActionPerformed5");
        	myABC.moveMouse();
        } else {
        	General.println("False5");
        }

        if (myABC.shouldPickupMouse() == true) {
        	General.println("TimedActionPerformed6");
        	myABC.pickupMouse();
        } else {
        	General.println("False6");
        }

        if (myABC.shouldRightClick() == true) {
        	General.println("TimedActionPerformed7");
        	myABC.rightClick();
        } else {
        	General.println("False7");
        }

        if (myABC.shouldRotateCamera() == true) {
        	General.println("TimedActionPerformed8");
        	myABC.rotateCamera();
        } else {
        	General.println("False8");
        }
        
        General.println("All if checked");
	}

	public static boolean abcReturn(boolean x,int y) {
	
		if (x)  {
		    	
			General.println("bool x = true happened");
        
			if (y == 1) { 	
			
				try {
            	
					//General.println("bool y = 1 happened");
					//General.println("return truex1");
					return x;
				} finally {     
					
					General.println("sleep happening, should be printed after x1");
					myABCsleep(myABC);
				}
			
			}
		
			if (y == 2) { 	
			
				General.println("bool y == 2 happened");				
				performAllTimedActions();
			}
		} else { 	
			
				General.println("else Bool myABCclose(myABC) happened " + x + y);
				myABCsleep(myABC);
			}
		return x;
	}

	public static int abcReturn(int x,int y) {
	    
		if (x > 0) {
		
			General.println("int x > 0 happened");
    	    	
			if (y == 1) { 	
			
				try {
				
					//General.println("y == 1 happened");
					//General.println("return intx1");
					return x;
				} finally {
					
					General.println("sleep happening, should be printed after x1");
					myABCsleep(myABC);
				}
			}
		
			if (y == 2) { 	
			
				General.println("y == 2 happened");
				performAllTimedActions();
			}
		} else { 	
			
    			General.println("else Int myABCclose(myABC) happened "+ x + y);			
    			myABCsleep(myABC);
	    	}
		
		General.println("return x2");
		return x;
	}
	

	public static String abcReturn(String stringReturn, int y) {
	    
		if (stringReturn != null && !stringReturn.isEmpty()) {

			General.println("stringReturn != null && !stringReturn.isEmpty() happened true " + stringReturn + y);

		if (y == 1) { 	
			
			try {
				
				//General.println("String y==1 happened " + stringReturn + y);
				//General.println("return stringReturn1");
				return stringReturn;
			} finally {
				General.println("sleep happening, should be printed after stringReturn1");
				myABCsleep(myABC);
			}
		}
		
        if (y == 2) { 	
			
        	General.println("String y==2 happened " + stringReturn + y);
        	
        	performAllTimedActions();
		}
    } else { 	
			
    		General.println("else String myABCclose(myABC) happened " + stringReturn + y);
    		myABCsleep(myABC);
			
	    }
	General.println("return stringReturn2");
    return stringReturn;
}

public static RSItem[] abcReturn(RSItem[] rsItemReturn, int y) {
    
	if (rsItemReturn.length > 0) {

        General.println("rsItemReturn.length > 0 true " + rsItemReturn + y);

		if (y == 1) { 	
			
			//General.println("String y==1 happened " + rsItemReturn + y);
			try {
				
				//General.println("String y==1 happened " + rsItemReturn + y);
				//General.println("return rsItemReturn1");
				return rsItemReturn;
			} finally {
				General.println("sleep happening, should be printed after rsItemReturn1");
				myABCsleep(myABC);
			}
		}
		
        if (y == 2) { 	
			
        	General.println("String y==2 happened " + rsItemReturn + y);
        	
        	performAllTimedActions();
		}
    } else { 	
			
    		General.println("else rsItemReturn myABCclose(myABC) happened " + rsItemReturn + y);
    		myABCsleep(myABC);
			
	    }
	General.println("return rsItemReturn2");
    return rsItemReturn;
}

	public static void abcHoverOrClickOptions(int hoverOrClick, String stringOption, Clickable... nextClick) {
	
	Class<Clickable> class1 = Clickable.class;
		if (nextClick.equals(class1)) {	
			if (hoverOrClick == 0) {
				abcImplementer.abcReturn(Clicking.hover(nextClick), 1);
				abcImplementer.abcReturn(Clicking.click(nextClick), 1);		
			} 
			if (hoverOrClick == 1) 	{
				abcImplementer.abcReturn(Clicking.hover(), 1);
				abcImplementer.abcReturn(Clicking.click(stringOption), 1);
			}
			if (hoverOrClick == 2) {			
				abcImplementer.abcReturn(Clicking.click(), 1);
			} else {
				abcImplementer.abcReturn(Clicking.click(stringOption), 1);
			}
	
		} else {
			if (hoverOrClick == 0) {
				abcImplementer.abcReturn(nextClick[0].hover(), 1);
				abcImplementer.abcReturn(nextClick[0].click(), 1);		
			} 
			if (hoverOrClick == 1) 	{
				abcImplementer.abcReturn(nextClick[0].hover(), 1);
				abcImplementer.abcReturn(nextClick[0].click(stringOption), 1);
			}
			if (hoverOrClick == 2) {			
				abcImplementer.abcReturn(nextClick[0].click(), 1);
			} else {
				abcImplementer.abcReturn(nextClick[0].click(stringOption), 1);
			}
		
		}
	}	
}