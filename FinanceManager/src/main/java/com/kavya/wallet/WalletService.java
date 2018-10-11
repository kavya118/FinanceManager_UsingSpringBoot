package com.kavya.wallet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

	@Autowired
	private WalletRepository walletRepo;
	
	//List<User> users=null;
	
	/* Fetches all wallets */
	public List<Wallet> getWallets()
	{
		return walletRepo.findAll();
	}
	
	/* Fetches a wallet with given ID */
	public Wallet getWallet(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return walletRepo.findById(id).get();
	}
	
	/* Adds a wallet to the database*/
	public void addWallet(Wallet wallet)
	{
		walletRepo.save(wallet);
	}
	
	/* Deletes a wallet */
	public void deleteWallet(Integer id)
	{
		//listTopic.removeIf(t->t.getId().equals(id));
		walletRepo.deleteById(id);
	}
	
	/*Updates a given wallet */
	public void updateWallet(Wallet wallet)
	{
		/*for(int i=0;i<listTopic.size();i++)
		{
			Topic t=listTopic.get(i);
			if(t.getId().equals(id))
			{
				listTopic.set(i, topic);
				return;
			}
		}*/
		walletRepo.save(wallet);
	}
}
