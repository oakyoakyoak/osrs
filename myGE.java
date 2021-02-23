package scripts.myAPI;

import org.tribot.api.DynamicClicking;
import org.tribot.api.General;
import org.tribot.api.input.Mouse;
import org.tribot.api2007.GrandExchange;
import org.tribot.api2007.Login;
import org.tribot.api2007.NPCs;
import org.tribot.api2007.types.RSGEOffer;
import org.tribot.api2007.types.RSItem;
import org.tribot.api2007.types.RSNPC;

public class myGE {

	public static RSNPC[] GEClerk = NPCs.findNearest("Grand Exchange Clerk");
	
	public static RSItem[] savedGEItems = new RSItem[2];
	
	public static RSItem[] savedGEItemsList() {
		
		//bucket
		savedGEItems[0] = new RSItem(0, 1925, 1, RSItem.TYPE.INVENTORY);
		//feather
		savedGEItems[1] = new RSItem(1, 314, 1, RSItem.TYPE.INVENTORY);
		//nature rune
		savedGEItems[2] = new RSItem(2, 561, 1, RSItem.TYPE.INVENTORY);
		//Rune full helm
		/*
		
		savedGEItems[3] = new RSItem(3, 1164, 1, RSItem.TYPE.INVENTORY);
		//Rune battleaxe
		savedGEItems[4] = new RSItem(4, 1374, 1, RSItem.TYPE.INVENTORY);
		//Rune chainbody
		savedGEItems[5] = new RSItem(5, 1114, 1, RSItem.TYPE.INVENTORY);
		//Rune kiteshield
		savedGEItems[6] = new RSItem(6, 1202, 1, RSItem.TYPE.INVENTORY);
		//Rune platelegs
		savedGEItems[7] = new RSItem(7, 1080, 1, RSItem.TYPE.INVENTORY);
		//Rune 2h sword 
		savedGEItems[8] = new RSItem(8, 1320, 1, RSItem.TYPE.INVENTORY);
		//Rune plateskirt 
		savedGEItems[9] = new RSItem(9, 1094, 1, RSItem.TYPE.INVENTORY);
		//Rune platebody
		savedGEItems[10] = new RSItem(10, 1128, 1, RSItem.TYPE.INVENTORY);
		*/
		return savedGEItems;
	}
	
	
	
	public static void openGE() {
		if (GrandExchange.getWindowState() == null) {
			
			GEClerk = NPCs.findNearest("Grand Exchange Clerk");
			abcImplementer.abcReturn(DynamicClicking.clickRSNPC(GEClerk[0], "Exchange Grand Exchange Clerk"), 1);
		}
	}
	
	public static int countOffers() {
		RSGEOffer[] geItems = GrandExchange.getOffers();
		int emptyOffers = 0;
		for (int j = 0; j < 8; j++) {
			if (geItems[j].getStatus() == RSGEOffer.STATUS.valueOf("EMPTY")) {
				emptyOffers++;
			}
		}
		return 8 - emptyOffers;
	}
	
	public static boolean buyGE(String string, int buyNum) {
							
		return abcImplementer.abcReturn(GrandExchange.offer(string, -1, buyNum, false), 1);	
	}
	
	public static boolean buyGE(RSItem buyItem, int buyNum) {
		
		return abcImplementer.abcReturn(GrandExchange.offer(buyItem.getDefinition().getName(), -1, buyNum, false), 1);		
	}
	
	/*
	public static RSGEOffer returnBought(int sleepTimeMin, int sleepTimeMax, int neededItem) {
		if (neededItem == -1) {
			
			try {
				
				while (GrandExchange.getWindowState() == GrandExchange.WINDOW_STATE.valueOf("SELECTION_WINDOW")) {	
					
					General.println("neededItem-1 while happening");
									
					if (Math.random() < .25) {
						
						General.println("Mouse random happened at selection screen");
						Mouse.moveBox(130, 80, 650, 375);
					}
					
					General.println("sleep -1 happening");
					General.sleep(sleepTimeMin, sleepTimeMax);
					General.println("sleep -1 done");
					if (Login.getLoginState() != Login.STATE.valueOf("INGAME")) {
						
						Login.login("korosun524@yahoo.com", "classy123");
						openGE();
					}
					
					RSGEOffer[] geItems = GrandExchange.getOffers();
					
					for (int i = 0; i < 8; i++) {
					
						if (geItems[i].getStatus() == RSGEOffer.STATUS.valueOf("COMPLETED")) {
						
							General.println("shouldnt be happening2");
							return geItems[i];
					}
					}
				}
			}
		catch(Exception e) {
			
			General.println("catch happened");
			Login.logout();
			return null;
		}
				
		}
		try {
			
			while (GrandExchange.getWindowState() == GrandExchange.WINDOW_STATE.valueOf("SELECTION_WINDOW")) {	
				
				General.println("neededItem 2 while happening");
								
				if (Math.random() < .25) {
					
					General.println("Mouse random happened at selection screen");
					Mouse.moveBox(130, 80, 650, 375);
				}
				
				General.sleep(sleepTimeMin, sleepTimeMax);
				if (Login.getLoginState() != Login.STATE.valueOf("INGAME")) {
					
					Login.login("korosun524@yahoo.com", "classy123");
					openGE();
				}
				
				RSGEOffer[] geItems = GrandExchange.getOffers();
				
				for (int i = 0; i < 8; i++) {
				if (geItems[i].getItemID() == neededItem && geItems[i].getStatus() == RSGEOffer.STATUS.valueOf("COMPLETED")) {
					General.println("shouldnt be happening1");
					return geItems[i];
				}
				}
			}
		}
	catch(Exception e) {
		
		General.println("catch happened");
		Login.logout();
		return null;
	}
		General.println("shouldnt be happening");
		return null; 
	}
	*/
	
	public static RSGEOffer returnBought(int sleepTimeMin, int sleepTimeMax, int neededItem) {
		if (neededItem > -1) {
			
			while (GrandExchange.getWindowState() == GrandExchange.WINDOW_STATE.valueOf("SELECTION_WINDOW")) {	
					
					General.println("neededItem-1 while happening");
									
					if (Math.random() < .25) {
						
						General.println("Mouse random happened at selection screen");
						Mouse.moveBox(130, 80, 650, 375);
					}
					
					General.println("sleep -1 happening");
					General.sleep(sleepTimeMin, sleepTimeMax);
					General.println("sleep -1 done");
					if (Login.getLoginState() != Login.STATE.valueOf("INGAME")) {
						
						Login.login("korosun524@yahoo.com", "classy123");
						openGE();
					}
					
					RSGEOffer[] geItems = GrandExchange.getOffers();
					
					for (int i = 0; i < 8; i++) {
					
						if (geItems[i].getStatus() == RSGEOffer.STATUS.valueOf("COMPLETED")) {
						
							General.println("shouldnt be happening2");
							return geItems[i];
					}
					}
				}
		
				
		} else {
		
			
		while (GrandExchange.getWindowState() == GrandExchange.WINDOW_STATE.valueOf("SELECTION_WINDOW")) {	
				
				General.println("neededItem 2 while happening");
								
				if (Math.random() < .25) {
					
					General.println("Mouse random happened at selection screen");
					Mouse.moveBox(130, 80, 650, 375);
				}
				
				General.sleep(sleepTimeMin, sleepTimeMax);
				if (Login.getLoginState() != Login.STATE.valueOf("INGAME")) {
					
					Login.login("korosun524@yahoo.com", "classy123");
					openGE();
				}
				
				RSGEOffer[] geItems = GrandExchange.getOffers();
				
				for (int i = 0; i < 8; i++) {
				if (geItems[i].getItemID() == neededItem && geItems[i].getStatus() == RSGEOffer.STATUS.valueOf("COMPLETED")) {
					General.println("shouldnt be happening1");
					return geItems[i];
				}
				}
			}
		}
		General.println("shouldnt be happening");
		return null;
	}
	
	public static String collectcompletedRSItem(int itemType, int neededItem) {
		
			RSGEOffer rsItem = myGE.returnBought(5000, 6000, neededItem);
			abcImplementer.abcReturn(rsItem.hover(), 1);
			abcImplementer.abcReturn(rsItem.click(), 1);
			String rsItemStr = GrandExchange.getItemName();
			RSItem[] returngeItem = GrandExchange.getCollectItems();
			General.println("rsItemStr of collected Item is "+rsItemStr);
		
			switch (itemType) {
				case 0:
					abcImplementer.abcReturn(GrandExchange.collectItems(GrandExchange.COLLECT_METHOD.NOTES, returngeItem), 1);
					break;
				case 1:
					abcImplementer.abcReturn(GrandExchange.collectItems(GrandExchange.COLLECT_METHOD.ITEMS, returngeItem), 1);
					break;
				case 2:
					abcImplementer.abcReturn(GrandExchange.collectItems(GrandExchange.COLLECT_METHOD.BANK, returngeItem), 1);
					break;
			
			}
		
				abcImplementer.abcReturn(GrandExchange.close(), 1);
				return rsItemStr;		
	}
	
	public static int calculateBuy(int Coins, int Price, int buyLimit) {
		if ((Coins/Price) > buyLimit) { 
			
			return buyLimit;
		} else {
			return (Coins/Price);				
		}	
	}
	
}
