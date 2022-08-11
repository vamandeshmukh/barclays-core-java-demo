package com.barclays.corejava.demo.behavioural;

interface Visitable {

	public abstract void accept(Visitor visotor);

}

interface Visitor {

	public abstract void playGame(Game game);

}

interface Game {

	public abstract void score();

}

class Cricket implements Game, Visitable {

	@Override
	public void score() {
		System.out.println("Cricket score is great!");
	}

	@Override
	public void accept(Visitor visotor) {
		visotor.playGame(this);
	}
}

class Hockey implements Game, Visitable {

	@Override
	public void score() {
		System.out.println("Hockey score is great!");
	}

	@Override
	public void accept(Visitor visotor) {
		visotor.playGame(this);
	}

}

public class GamePlayer implements Visitor {

	@Override
	public void playGame(Game game) {
		System.out.println(this.getClass().toString() + " is being played!");
	}
}
