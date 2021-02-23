package scripts.HighAlch;

import scripts.myAPI.abcImplementer;
import scripts.myAPI.itemPrices;
import scripts.myAPI.myGE;

import org.tribot.api2007.Banking;
import org.tribot.api2007.Inventory;
import org.tribot.api2007.Login;
import org.tribot.api2007.Magic;
import org.tribot.api2007.NPCs;
import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;
import org.tribot.api2007.GrandExchange;
import org.tribot.api.DynamicClicking;

import org.tribot.api2007.GrandExchange;
import org.tribot.api2007.GrandExchange.COLLECT_METHOD;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import org.tribot.api.Clicking;
import org.tribot.api.General;
import org.tribot.api.input.Mouse;
import org.tribot.api.util.abc.ABCUtil;
import org.tribot.api2007.types.RSGEOffer;
import org.tribot.api2007.types.RSItem;
import org.tribot.api2007.types.RSItem.TYPE;
import org.tribot.api2007.types.RSItemDefinition;
import org.tribot.api2007.types.RSNPC;
import org.tribot.api2007.types.RSObject;

@ScriptManifest(name = "myHighAlcher", category = "Magic", authors = {"oak"})
public class highAlch extends Script {
	
	static int defaultAlch;
	static int howLong;
	static int tillLevelExp;
	static int totalCoins;
	public static RSNPC[] GEClerk;
	
	public static void defaultRuneAlching() {
				
		Inventory.open();
		totalCoins = Inventory.getCount("Coins");
		
		myGE.openGE();
				
		int runeArmorIndex = 0;
				
		/*
		0 Rune med helm	
		1 Rune scimitar	
	 	2 Rune longsword	
		3 Rune full helm	
		4 Rune battleaxe	
		5 Rune chainbody
		6 Rune kiteshield	
		7 Rune platelegs	
		8 Rune 2h sword	
		9 Rune plateskirt 	
		10 Rune platebody
		*/

		itemPrices.runeArmorNotedItemList();
				
		while (runeArmorIndex < 11) {
			

			int buyNum = 0;
			
			myGE.openGE();
			
			int buyTracker = 8 - myGE.countOffers();
			
			RSGEOffer[] geItems = GrandExchange.getOffers();
			int natureRune = Inventory.getCount("Nature rune");
			
			if (natureRune < 500) {
				
				myGE.openGE();
				
				int randomInt = (int) (450 - (Math.random()*150));
				
				abcImplementer.abcReturn(GrandExchange.offer(("nature rune"), -1, randomInt, false), 1);
				myGE.collectcompletedRSItem(0, 561);
				
			}		
			
			buyNum = myGE.calculateBuy(totalCoins, itemPrices.runeArmor[runeArmorIndex].getDefinition().getHighAlchemyValue() - 200 , 70);
						
			if (buyNum <= 5 || buyTracker == 0) {
				
				int currentOffers = myGE.countOffers();
				
				General.println(currentOffers + " current offer num");
				
				while (currentOffers > 0) {			
					
					highAlchCast(myGE.collectcompletedRSItem(0, -1));
					currentOffers--;
					General.sleep(2000, 5000);
					myGE.openGE();					
				}
			}
			
			if (buyNum > 5) {
				
				abcImplementer.abcReturn(myGE.buyGE(itemPrices.runeArmor[runeArmorIndex], buyNum), 1);
			}
			
			totalCoins = Inventory.getCount("Coins");
			runeArmorIndex++;
			buyTracker--;
		}		
	}
	
	public static void highAlchCast(String highAlchItem) {
		
		int x = 0;
		int y = Inventory.getCount(highAlchItem);
		RSItem[] rsItems = Inventory.find(highAlchItem);
						
		while (x < y) {
	    			
			General.println("highAlch count "+x);
	    	General.sleep(420, 600);
			General.sleep(1000);
	    	Magic.selectSpell("High Level Alchemy");
			General.sleep(500, 800);
	    	Clicking.hover(rsItems[0]);
	    	General.sleep(420, 600);  	
	    	Clicking.click(rsItems[0]);
	    	General.sleep(420, 600);
	    	General.sleep(500, 800);    	
	    	x++;
	    }
		
		while (Inventory.getCount(highAlchItem) >= 1) {
			
			General.println("highAlch count "+x);
	    	General.sleep(420, 600);
			Magic.selectSpell("High Level Alchemy");
			General.sleep(700, 1000);
	    	Clicking.hover(rsItems[0]);
	    	General.sleep(420, 600);  	
	    	Clicking.click(rsItems[0]);
	    	General.sleep(420, 600);
	    	General.sleep(500, 800);    	
	    	x++;
	    }
		
		totalCoins = Inventory.getCount("Coins");
	}
	
	private boolean onStart() {
		
		println("start");
		return true;
	}
	
	public void run() {
		
		if (onStart()) {
			
			if (Login.getLoginState() == Login.STATE.LOGINSCREEN) {
				
				abcImplementer.abcReturn(Login.login("korosun524@yahoo.com", "classy123"), 1);
			}
			
			defaultRuneAlching();			
			Login.logout();			
		    General.println("done");
			}
	}
	
}
