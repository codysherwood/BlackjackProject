package com.skilldistillery.cardgame.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	Suit(String theName) {
		suitName = theName;
	}

	final private String suitName;

	@Override
	public String toString() {
		return suitName;
	}

	public String getSuitName() {
		return suitName;
	}

}
