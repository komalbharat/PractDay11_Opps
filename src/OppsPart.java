//*Write a Program DeckOfCards.java, to initialize deck of cards having suit
   //     ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
     //   "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
       // method and then distribute 9 Cards to 4 Players and Print the Cards received by
        //the 4 Players using 2D Array...*/

public class OppsPart {
    public static void main(String[] args) {
        String[] SUITS ={            //create array using string variable
                "Clubs","Diamonds","Hearts","Spades"
        };
        String[] RANKS ={
                "2","3","4","5","6","7","8","10","Jack","Queen","King","Ace"
        };
        int n = SUITS.length*RANKS.length; /*mul Suits with Ranks*/
        String[] deck = new String[n];  /* creating deck as object*/
        for (int i=0; i<RANKS.length;i++){ /* for check i is less than Rank*/
            for (int j=0; j<SUITS.length;j++){
                deck[SUITS.length*i+j] = RANKS[i] + " of " + SUITS[j];
            }

        }
        //Shuffle
        for (int i=0; i < 4;i++){//i for players 4 players
            int r = i + (int) (Math.random() *(n-1));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
            for (int j=0;j<9;j++){ //j for cards 9 cards
                System.out.printf("\n" + deck[i]);
            }
        }



    }
}