package com.ashi.corepatherns.prototype;

public class ProtoTypeTest {

	 public static void main(String[] args) throws CloneNotSupportedException {
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("overwatch");
		game1.setMemeberShip(new MemeberShip()); // Shallow copy
		Game game2 = (Game) game1.clone();
		System.out.println(game1);
		System.out.println(game2);
		
	 }
}
