package gameProject;

import Abstract.BasePlayerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.FirstCompanyPlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {
	public static void main(String[] args) {
	BasePlayerManager basePlayerManager = new FirstCompanyPlayerManager(new MernisServiceAdapter());
	
	Player firstPlayer = new Player(1, "Buket","Altýn", 2015, "00015115");
	basePlayerManager.save(firstPlayer);
	basePlayerManager.update(firstPlayer);
	basePlayerManager.delete(firstPlayer);
	
	CampaignManager campaignManager = new CampaignManager();
	Campaign firstCampaign = new Campaign("Yaz indirimi ", 10);
	campaignManager.add(firstCampaign);
	campaignManager.update(firstCampaign);
	campaignManager.delete(firstCampaign);
	
	Game firstGame = new Game("Oyun 1 ", 100);
	SaleManager saleManager = new SaleManager();
	saleManager.sell(firstPlayer, firstGame);
	saleManager.sellWithCampaign(firstPlayer, firstGame, firstCampaign);
	}
}