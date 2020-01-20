package cardexample;


//line added for 2nd commit
// line added for bugfix branch but i still am lost as hell
public class Card {
   private String suit;
   private int value;
   
    public Card(String suit, int value){
        this.suit=suit;
        this.value=value;
}

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit
     */
    public void setSuit(String suit) {
        if(suit.equals("Spades")||suit.equals("Clubs")||suit.equals("Hearts")||suit.equals("Diamonds")){
            this.suit = suit;
        }
        else
            System.out.println("Please enter a valid suit (Use capital starting letter)");
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        if(value<=13){
            this.value = value;
        }
    }      
}
