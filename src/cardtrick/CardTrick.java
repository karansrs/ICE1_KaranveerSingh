/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.
 * 
 * Modified by: Karanveer Singh
 * Student ID: 991775060
 * Date: June 6, 2025
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

      
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1)); // 1 to 13
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]); // 0 to 3
            magicHand[i] = c;
        }

        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter card value (1 to 13): ");
        int userValue = input.nextInt();
        input.nextLine(); // consume newline
        System.out.print("Enter card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.nextLine();

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("You picked the right card! It's in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}