package scripts.myAPI;

import org.tribot.api2007.types.RSItem;
import org.tribot.api2007.types.RSItem.TYPE;

public class itemPrices {

	public static int Runemedhelm = 11320;
	public static int Runescimitar = 15160;
	public static int Runelongsword = 19000;
	public static int Runefullhelm = 20920;
	public static int Runebattleaxe = 24760;
	public static int Runechainbody = 29800;
	public static int Runekiteshield = 32440;
	public static int Runeplatelegs = 38200;
	public static int Rune2hsword = 38200;
	public static int Runeplateskirt = 38200;
	public static int Runeplatebody = 38800;
	
	public static RSItem[] runeArmor = new RSItem[11];
		
	public static RSItem[] runeArmorNotedItemList() {
	
	//Rune med helm
	runeArmor[0] = new RSItem(0, 1148, 1, RSItem.TYPE.INVENTORY);
	//Rune scimitar
	runeArmor[1] = new RSItem(1, 1334, 1, RSItem.TYPE.INVENTORY);
	//Rune longsword
	runeArmor[2] = new RSItem(2, 1304, 1, RSItem.TYPE.INVENTORY);
	//Rune full helm
	runeArmor[3] = new RSItem(3, 1164, 1, RSItem.TYPE.INVENTORY);
	//Rune battleaxe
	runeArmor[4] = new RSItem(4, 1374, 1, RSItem.TYPE.INVENTORY);
	//Rune chainbody
	runeArmor[5] = new RSItem(5, 1114, 1, RSItem.TYPE.INVENTORY);
	//Rune kiteshield
	runeArmor[6] = new RSItem(6, 1202, 1, RSItem.TYPE.INVENTORY);
	//Rune platelegs
	runeArmor[7] = new RSItem(7, 1080, 1, RSItem.TYPE.INVENTORY);
	//Rune 2h sword 
	runeArmor[8] = new RSItem(8, 1320, 1, RSItem.TYPE.INVENTORY);
	//Rune plateskirt 
	runeArmor[9] = new RSItem(9, 1094, 1, RSItem.TYPE.INVENTORY);
	//Rune platebody
	runeArmor[10] = new RSItem(10, 1128, 1, RSItem.TYPE.INVENTORY);
	
	return runeArmor;
	}
}
	
