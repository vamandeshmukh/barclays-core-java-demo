package com.barclays.corejava.demo.behavioural;

public class VistorDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		Visitor player = new GamePlayer();
		Visitable game = new Cricket();
		game.accept(player);

		Visitor player2 = new GamePlayer();
		Visitable game2 = new Hockey();
		game2.accept(player2);

		System.out.println("End");

	}

}
