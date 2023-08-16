package com.skilldistillery.cardgame.blackjack.app;

import com.skilldistillery.cardgame.entities.Card;
import com.skilldistillery.cardgame.entities.Hand;
import com.skilldistillery.cardgame.entities.Rank;

public class BlackJackHand extends Hand {

	@Override
	public int getHandvalue() {
		int total = 0;
		for (Card card : hand) {
			int value = card.getValue();
			total += value;
		}
		return total;
	}

	@Override
	public void addCard() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[hand=");
		builder.append(hand);
		builder.append("]");
		return builder.toString();
	}

	 

}
