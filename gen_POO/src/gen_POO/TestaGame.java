package gen_POO;

import gen_POO_heranca.Console;
import gen_POO_heranca.Jogo;

public class TestaGame {

	public static void main(String[] args) {
		
		Jogo[] gameList = new Jogo[2];
		Console[] consoList = new Console[2];
		
		gameList[0] = new Jogo("Pokemon Violet", "Jogo - RPGJ", 299.99, "Nintnedo", "Sim");
		gameList[1] = new Jogo("Elden Ring", "Jogo - Souls Like", 250.00, "Fromsoftware", "Não");
		consoList[0] = new Console("Xbox Serie S", "Console", 2300.00, "Microsoft", "não");
		consoList[1] = new Console("Nintendo Switch", "Console", 2150.00, "Nintendo", "sim");
		
		for (Game game : gameList) {
			game.visualizar();
		}
	
		for (Console console : consoList) {
			console.visualizar();
		}
		
	}
	
}
