package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleService{

	@Override
	public void sell(Player player, Game game) {
		System.out.println(game.getName() + " satýldý: " + player.getFirstName() + 
				" - Fiyat: " + game.getPrice());
		
	}

	@Override
	public void sellWithCampaign(Player player, Game game, Campaign campaign) {
		System.out.println(game.getName() + " satýldý: " + player.getFirstName() + 
				" - Fiyat: " + (game.getPrice() - game.getPrice() * campaign.getDiscountRate() / 100));
	}

}
