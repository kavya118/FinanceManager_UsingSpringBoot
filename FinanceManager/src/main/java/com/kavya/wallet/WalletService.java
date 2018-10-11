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
	
	public List<Wallet> getWallets()
	{
		//List<User> users= new ArrayList<>();
		return walletRepo.findAll();
		//return courses;
	}
	
	public Wallet getWallet(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return walletRepo.findById(id).get();
	}
	
	public void addWallet(Wallet wallet)
	{
		walletRepo.save(wallet);
	}
	
	public void deleteWallet(Integer id)
	{
		//listTopic.removeIf(t->t.getId().equals(id));
		walletRepo.deleteById(id);
	}
	
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
