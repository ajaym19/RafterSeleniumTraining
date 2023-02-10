package seleniumbasics;

public class LocatorsDemo {

	/*
	 * Locators:
	 * id
	 * name
	 * 
	 * class name - not recommended
	 * 
	 * xpath :  XML Path
	 * A. Absolute
	 * B. Relative
	 * 
	 * /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
	 * //*[@id="email"]
	 * 
	 * Format
	 *  //htmlTag[@attibute_name = 'value']
	 *  //input[@id='email']
	 * 
	 * 
	 * css: #email
	 * 
	 * tagName: used to identify the number of all the elements of a specific tag
	 * 
	 * LINKS: 
	 * linktext: exact match
	 * partiallinktext: partial match
	 * 
	 * HTML - 2 hours
	 * 
	 * Xpath Axes and Methods
	 * 
	 * QA:
	 * input id = qa_username
	 * 
	 * Staging
	 * input id = staging_username
	 * 
	 *  //input[@id = 'staging_username']
	 *  
	 *  QA:
	 *  input name = qa_username : username, type = input
	 *  input name = qa_username : showusername, type = suubmit
	 *  
	 *  And
	 *  OR
	 *  
	 *   //input[@id = 'qa_username' or @id = 'staging_username']
	 *   
	 *   u_0_5_K4
	 *   u_0_5_Uk
	 *   u_0_5_K4
	 *   starts-with
	 *   
	 *   //input[starts-with(@id,'u_0_5')]
	 *   
	 *   Text(): //label[text()='User']
	 *   Contains():
	 *    //label[contains(text(),'User')]
	 *    //input[contains(@id,'User')]
	 *    
	 *    
	 *    XPATH Axes
	 *    parent div 
	 *    	child 1 input id = c1
	 *    	child 2 input
	 *    
	 *    //div[@id = 'p'/input[2]]
	 *    //input[@id = 'c1']/following-sibling::input
	 *   
	 *   preceeding
	 *   following
	 *   
	 *   //input[@id='email']/parent::div/following-sibling::div/child::div/input
	 * 		preceding-sibling
	 * 
	 */
}
