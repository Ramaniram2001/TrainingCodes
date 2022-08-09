package com.example;

/**
 * 
 * @author Haripriya.R
 *
 */
public class Greeting {
	/**
	 * 
	 * @return user msg
	 */
	public String getMessage() {
		return "Welcome";
	}
	/**
	 * 
	 * @param name
	 * @return name 
	 */
	public String birthdayWish(String name) {
		return name;
	}
	/**
	 * 
	 * @param name
	 * @return string+name
	 */
	public String birthdayWishName(String name) {
		return "Happy birthday "+name;
	}
	


}
