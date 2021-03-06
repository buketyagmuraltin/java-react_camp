package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getName());	
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi : " + campaign.getName());	
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getName());		
	}

}
