package Abstract;

import Entities.Player;

public abstract class BasePlayerManager implements PlayerService{

	@Override
	public void save(Player player) {
		System.out.println("Oyuncu kaydedildi : " + player.getFirstName());	
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu güncellendi : " + player.getFirstName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi : " + player.getFirstName());
		
	}

}
