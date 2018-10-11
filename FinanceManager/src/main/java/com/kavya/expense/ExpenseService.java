package com.kavya.expense;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepo;
	
	//List<User> users=null;
	
	public List<Expense> getExpenses()
	{
		//List<User> users= new ArrayList<>();
		return expenseRepo.findAll();
		//return courses;
	}
	
	public Expense getExpense(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return expenseRepo.findById(id).get();
	}
	
	public void addExpense(Expense expense)
	{
		expenseRepo.save(expense);
	}
	
	public void deleteExpense(Integer id)
	{
		//listTopic.removeIf(t->t.getId().equals(id));
		expenseRepo.deleteById(id);
	}
	
	public void updateExpense(Expense expense)
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
		expenseRepo.save(expense);
	}
}
