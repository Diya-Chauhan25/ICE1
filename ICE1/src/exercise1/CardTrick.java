/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author diyac
 * Modifier: Diya Hitendrasinh Chauhan
 * Student ID: 991764581
 * 
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random() * 13) + 1);
            card.setSuit(suits[(int)(Math.random() * 4)]);
            magicHand[i] = card;
        }

        // Hardcoded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(7);  // your chosen value
        luckyCard.setSuit("Hearts");

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() &&
                card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("You WIN! Lucky card is in the magic hand.");
        } else {
            System.out.println("You lose. Lucky card not found.");
        }
        
        System.out.println("\nMagic Hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }
}
