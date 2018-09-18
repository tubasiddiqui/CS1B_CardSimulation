
public class Foothill {
   
   public static void main (String[] args) {
      
      Card card1 = new Card();
      Card card2 = new Card('K', Card.Suit.diamonds);
      Card card3 = new Card('3', Card.Suit.clubs);
      
      System.out.println(card1);
      System.out.println(card2);
      System.out.println(card3);
  
      Hand myHand = new Hand();
      myHand.takeCard(card3);
      myHand.takeCard(card2); 
      myHand.takeCard(card1);
      System.out.println("card in hand: " + myHand.toString()); 
     
      System.out.println(" cards left: " +myHand.getNumCards());
      
      System.out.println(myHand.playCard());        
      System.out.println("numCards in hand: " + myHand.getNumCards());

      System.out.println(myHand.toString()); 
      System.out.println(myHand.playCard()); 
      System.out.println(myHand.toString()); 
      System.out.println("card in hand: " +myHand.toString()); 
      
      System.out.println(myHand.inspectCard(1));
   }
   
}
