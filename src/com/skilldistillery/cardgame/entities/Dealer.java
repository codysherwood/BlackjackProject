package com.skilldistillery.cardgame.entities;

public class Dealer extends Player {
	private Deck deck = new Deck();
	public Dealer() {
		deck = new Deck();
		shuffleDeck();
		
	}

	public void dealCard(Hand hand) {
		hand.getHand().add(deck.dealCard());
	}
	public void shuffleDeck() {
		deck.shuffle();
	}
	public void displayDealerHand() {
		System.out.println("dealers [hand =[face down, " + playerHand.getHand().get(1) + "]");
	}

}
