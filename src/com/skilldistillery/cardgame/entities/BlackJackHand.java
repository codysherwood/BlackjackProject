package com.skilldistillery.cardgame.entities;

public class BlackJackHand extends Hand {
	
	public int getHandValue() {
		int total = 0;
		for (Card card : Hand) {
			int value = card.getValue(card(theRank));
			total += value;
		}
		return total;
	}
}
