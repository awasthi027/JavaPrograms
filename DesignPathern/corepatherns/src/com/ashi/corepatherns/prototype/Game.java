package com.ashi.corepatherns.prototype;

public class Game implements Cloneable {
	
	private int id;
	private String name;
	private MemeberShip memeberShip;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// Deep copy example
		Game game = new Game();
		game.setMemeberShip(new MemeberShip());
		return game;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public MemeberShip getMemeberShip() {
		return memeberShip;
	}

	public void setMemeberShip(MemeberShip memeberShip) {
		this.memeberShip = memeberShip;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", memeberShip=" + memeberShip + "]";
	}


}
