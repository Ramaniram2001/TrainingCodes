package com.training;

import com.training.services.StringService;

public class Application {

	public static void main(String[] args) {
		
		StringService locn=new StringService();
		int key=13;
		switch(key) {
		case 1:
			locn.stringEquals("ram","ram");
			break;
		case 2:
			locn.stringobjectEquals();
			break;
		case 3:
			locn.usingTrim(" ramesh ");
			break;
		case 4:
			locn.lengthOfString(" ramesh ");
			break;
		case 5:
			locn.usingSubString("happy morning");
			break;
		case 6:
			locn.usingCharAtAndIndexOf("ram@2002");
			break;
		case 7:
			locn.usingReplace("ramesh", "ramya");
			break;
		case 8:
			locn.usingReplace("ramya", "malar");
			break;
		case 9:
			locn.usingConcat("ramya","ram");
			break;
		case 10:
			locn.usingCompareTo();
			break;
		case 11:
			locn.usingStringFormat("ramya",52.31881);
			break;
		case 12:
			locn.usingStringFormat(4566);
			break;
		case 13:
			locn.usingStringFormat(-421L);
			break;
		default:
			break;
		
		}
		

	}

}
