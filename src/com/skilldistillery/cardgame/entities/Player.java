package com.skilldistillery.cardgame.entities;

import java.util.List;

import com.skilldistillery.cardgame.blackjack.app.BlackJackHand;

public class Player {
	protected Hand playerHand = new BlackJackHand();
	public Player() {
	}

	public Hand getHand() {
		return playerHand;
	}

	public void setPlayerHand(Hand playerHand) {
		this.playerHand = playerHand;
	}

	public void displayAllCards() {
		System.out.println(playerHand);
	}
	
	
	
}
