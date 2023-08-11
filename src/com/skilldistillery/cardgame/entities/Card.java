package com.skilldistillery.cardgame.entities;

import java.util.Objects;

public class Card {
	private Suit theSuit;
	private Rank theRank;

	public Card(Suit theSuit, Rank theRank) {
		this.theSuit = theSuit;
		this.theRank = theRank;

	}
	public int getValue(Rank rank) {
		int value = rank.getRankValue();
		return value;
		
	}

	@Override
	public String toString() {
		return  theRank + " of " + theSuit;
	}


	@Override
	public int hashCode() {
		return Objects.hash(theRank, theSuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return theRank == other.theRank && theSuit == other.theSuit;
	}

}
