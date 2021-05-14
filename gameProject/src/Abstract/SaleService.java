package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SaleService {
	void sell(Player player, Game game);
	void sellWithCampaign(Player player, Game game,  Campaign campaign);

}