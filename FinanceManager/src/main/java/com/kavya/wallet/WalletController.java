package com.kavya.wallet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/financemanager/wallets")
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@RequestMapping("/{id}")
	public Wallet getWallet(@PathVariable("id") int id)
	{
		return walletService.getWallet(id);
	}
	
	@RequestMapping("")

	public List<Wallet> getAllWallet()
	{
		return walletService.getWallets();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/add")	
	public void addWallet(@RequestBody Wallet wallet)
	{
		walletService.addWallet(wallet);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}/update")	
	public void updateWallet(@RequestBody Wallet wallet)
	{		
		walletService.updateWallet(wallet);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteWallet(@PathVariable("id") int id)
	{
		walletService.deleteWallet(id);
	}
}
