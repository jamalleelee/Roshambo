package com.RoshamboPlayers;

public abstract class Player {

	public String name = null;
	public int moveTaken = 0;
	public Player(String name, int moveTaken) {
		this.name = name;
		this.moveTaken = moveTaken;
	}
	
	
	public Player() {
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoveTaken() {
		return moveTaken;
	}
	public void setMoveTaken(int userMove) {
		this.moveTaken = userMove;
	}
	

}
