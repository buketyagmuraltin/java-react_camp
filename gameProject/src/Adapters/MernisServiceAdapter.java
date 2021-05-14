package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			boolean checker =  client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), player.getDateOfBirth());
			return checker;
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}
}