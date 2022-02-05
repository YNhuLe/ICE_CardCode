
/*Student name: NhuY Le
  Student Number : 991652865
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
      
      //We need to make the change on Git Hub
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        
        Card ca = new Card("Hearts", 13);
        ca.setSuit("Hearts");
      
      
      System.out.println("This is the value"+ ca);
      //print the information
     System.out.print(nineClubs);
      
    }
}
