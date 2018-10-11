package com.kavya.debit;

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
public class DebitService {

	@Autowired
	private DebitRepository debitRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ExpenseRepository expenseRepo;
	
	@Autowired
	private WalletRepository walletRepo;
	
	//List<User> users=null;
	
	public List<Debit> getDebits()
	{
		//List<User> users= new ArrayList<>();
		return debitRepo.findAll();
		//return courses;
	}
	
	public Debit getDebit(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return debitRepo.findById(id).get();
	}
	
	public void addDebit(Debit debit)
	{
		debitRepo.save(debit);
	}
	
	public void deleteDebit(Integer id)
	{
		//listTopic.removeIf(t->t.getId().equals(id));
		debitRepo.deleteById(id);
	}
	
	public void updateDebit(Debit debit)
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
		debitRepo.save(debit);
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
