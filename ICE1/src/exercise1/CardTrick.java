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
 * Date Modified: 2025-05-22
 * 
 * Edit: Hard-coded a luckyCard object instead of asking user for input (GitHub edit)
 * Merged: Pulled the updated code from GitHub into NetBeans and replaced input logic
 */

public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random() * 13) + 1);
            card.setSuit(suits[(int)(Math.random() * 4)]);
            magicHand[i] = card;
        }

        // ✅ GitHub Edit: Add hardcoded luckyCard (instead of user input)
        Card luckyCard = new Card();
        luckyCard.setValue(7);      // You can choose any value (1–13)
        luckyCard.setSuit("Hearts"); // You can change suit

        // ✅ Merged in NetBeans: Replace input logic with search for hardcoded luckyCard
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() &&
                card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("🎉 You WIN! The lucky card is in the magic hand.");
        } else {
            System.out.println("❌ You lose. The lucky card was not found.");
        }

        // Print all cards for verification
        System.out.println("\nMagic Hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        System.out.println("\nLucky Card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
    }
}
