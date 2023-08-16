package com.skilldistillery.cardgame.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.cardgame.entities.Dealer;
import com.skilldistillery.cardgame.entities.Hand;
import com.skilldistillery.cardgame.entities.Player;
import com.skilldistillery.cardgame.entities.Rank;

public class BlackjackApp {
	private Dealer dealer = new Dealer();
	private Player player = new Player();
	public boolean gameOver = false;
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.run();

	}

	public void run() {
		dealStartHand();
		checkForBlackjack();
		playersTurn();
		dealersTurn();
		results();
	}

	public void dealStartHand() {
		System.out.println("Welcome, lets play blackjack");
		dealer.dealCard(player.getHand());
		System.out.println("players " + player.getHand());
		dealer.dealCard(dealer.getHand());
		System.out.println("dealers [hand =[face down ]");
		dealer.dealCard(player.getHand());
		System.out.println("players " + player.getHand());
		dealer.dealCard(dealer.getHand());
		dealer.displayDealerHand();

	}

	public void checkForBlackjack() {
		int playerHand = player.getHand().getHandvalue();
		int dealerHand = dealer.getHand().getHandvalue();
		if (playerHand == 21 & dealerHand == 21) {
			System.out.println("dealer and player both have blacjack");
			System.out.println("the game is a draw");
			gameOver = true;
		}
		if (playerHand == 21) {
			System.out.println("player has blacjack");
			System.out.println("player wins");
			gameOver = true;
		}
		if (dealerHand == 21) {
			System.out.println("dealer has blacjack");
			System.out.println("dealer wins");
			gameOver = true;
		}

	}

	public void playersTurn() {
		while (gameOver == false) {
			Hand playerHand = player.getHand();
			int handValue = player.getHand().getHandvalue();
			if (handValue > 21) {
				System.out.println(handValue + "player busts");
				gameOver = true;
				break;
			}
			System.out.println("players " + playerHand);
			System.out.println(" player total is " + handValue);
			System.out.println("enter 1 to hit or 2 to stay");
			int userChoice = kb.nextInt();
			if (userChoice == 1) {
				dealer.dealCard(playerHand);
			}
			if (userChoice == 2) {
				break;
			}
		}

	}

	public void dealersTurn() {
		while(gameOver == false) {
			System.out.println("dealers turn");
			System.out.println(dealer.getHand());
			Hand dealerHand = dealer.getHand();
			int handValue = dealer.getHand().getHandvalue();
			if (handValue < 17) {
				dealer.dealCard(dealerHand);
			}
			if (handValue > 21) {
				System.out.println(handValue + "dealer busts");
				gameOver = true;
				break;
			}
			if (handValue > 16) {
				gameOver = true;
				break;
			}
		}
	}

	public void results() {
		int playerHand = player.getHand().getHandvalue();
		int dealerHand = dealer.getHand().getHandvalue();
		if (playerHand > 21) {
			System.out.println("player busted with " + player.getHand() + " total " + playerHand + " dealer wins with "
					+ dealer.getHand() + " total " + dealerHand);
		}
		else if (dealerHand > 21) {
			System.out.println("dealer busted with " + dealer.getHand() + " total " + dealerHand + " player wins with "
					+ player.getHand() + " total " + playerHand);
		}
		else if (playerHand == dealerHand) {
			System.out.println("players " + player.getHand() + " dealers " + dealer.getHand() + " game is a draw at "
					+ playerHand);
		}
		else if (playerHand > dealerHand) {
			System.out.println("players " + player.getHand() + playerHand + " beats dealers " + dealer.getHand()
					+ dealerHand + " player wins");
		}
		else if (playerHand < dealerHand) {
			System.out.println("dealers " + dealer.getHand() + dealerHand + " beats players " + player.getHand()
					+ playerHand + " dealer wins");
		}

	}
}
