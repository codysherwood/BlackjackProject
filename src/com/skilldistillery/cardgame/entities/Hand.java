package com.skilldistillery.cardgame.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand;

	public abstract int getHandvalue();

	public abstract void addCard();

	public Hand() {
		hand = new ArrayList<>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [hand=");
		builder.append(hand);
		builder.append("]");
		return builder.toString();
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

}
