package Abstract;

import Entities.Player;

public interface PlayerService {
	void save(Player player);
	void update(Player player);
	void delete(Player player);
}
