package Concrete;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Entities.Player;

public class FirstCompanyPlayerManager extends BasePlayerManager {
	
	private PlayerCheckService playerCheckService;

	public FirstCompanyPlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void save(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			super.save(player);
		}else {
			System.out.println("Not a valid person.");
		}
	}
}