package scripts.ScriptTesting;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import org.tribot.api.General;
import org.tribot.api2007.Login;
import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;

import scripts.myAPI.abcImplementer;
import scripts.myAPI.myGE;

@ScriptManifest(name = "myTest", category = "First", authors = {"oak"})
public class myTest extends Script {

private boolean onStart() {
		
		General.println("start");
		return true;
	}
	
public void run() {
		
		if (onStart()) {
			
			General.println("start1");

			if (Login.getLoginState() == Login.STATE.LOGINSCREEN ) {
				
				General.println("start2");
				abcImplementer.abcReturn(Login.login("korosun524@yahoo.com", "classy123"), 1);
			}
			
			General.println("start3");
			
			
			myGE.openGE();
			myGE.buyGE("nature rune", 50);
			myGE.collectcompletedRSItem(1, 561);
			
			General.sleep(2000);
			
			myGE.openGE();
			myGE.buyGE("bucket", 2);
			myGE.collectcompletedRSItem(1, 1925);
			
		    General.println("done");
			}
	}
}
