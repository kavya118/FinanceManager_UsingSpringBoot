package com.kavya.credit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kavya.expense.Expense;
import com.kavya.expense.ExpenseRepository;
import com.kavya.user.User;
import com.kavya.user.UserRepository;
import com.kavya.wallet.Wallet;
import com.kavya.wallet.WalletRepository;

@Service
public class CreditService {

	@Autowired
	private CreditRepository creditRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ExpenseRepository expenseRepo;
	
	@Autowired
	private WalletRepository walletRepo;
	
	//List<User> users=null;
	
	public List<Credit> getCredits()
	{
		//List<User> users= new ArrayList<>();
		return creditRepo.findAll();
		//return courses;
	}
	
	public Credit getCredit(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return creditRepo.findById(id).get();
	}
	
	public void addCredit(Credit credit)
	{
		
		creditRepo.save(credit);
	}
	
	
	
	public void deleteCredit(Integer id)
	{
		//listTopic.removeIf(t->t.getId().equals(id));
		creditRepo.deleteById(id);
	}
	
	public void updateCredit(Credit credit)
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
		creditRepo.save(credit);
	}
	
	public User getUser(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return userRepo.findById(id).get();
	}
	
	public Wallet getWallet(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return walletRepo.findById(id).get();
	}
	
	public Expense getExpense(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return expenseRepo.findById(id).get();
	}
}
