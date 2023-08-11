package com.skilldistillery.enums.solutions.cards;

import com.skilldistillery.cardgame.entities.Card;
import com.skilldistillery.cardgame.entities.Deck;

public class Dealing {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		System.out.println(deck.checkDeckSize());

		int howMany = 5;

		deck.shuffle();

		for (int i = 0; i < howMany; i++) {
			Card dealtCard = deck.dealCard();
			System.out.println(dealtCard + ", ");
		}
		System.out.println();
		System.out.println(deck.checkDeckSize());
	}

}
