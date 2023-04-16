package week05;

import java.util.*;

public class Deck {
	
	private List<Card> cards = new ArrayList<>();
	
	private String[] name = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	private String[] suit = {"Spades","Diamonds","Hearts","Clubs"};
	private int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	
	
	public Deck() {
		for (int s = 0; s < 4; s++) {
			for (int n = 0; n < 13; n++) {
				cards.add(new Card(this.name[n],this.suit[s],this.value[n]));
			}
		}
	}
	
	public void describe() {
		for (Card c : cards) {
			System.out.println(c.getName() + " of " + c.getSuit());
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(getCards());
	}
	
	public List<Card> drawCard() {
		List<Card> hand = new ArrayList<>();
		if (getCards().isEmpty()) {
			System.out.println("Deck Empty");
		} else {
			hand.add(getCards().remove(0));
		} return hand;
	}
	
	
	public List<Card> getCards() {
		return cards;
	}
}