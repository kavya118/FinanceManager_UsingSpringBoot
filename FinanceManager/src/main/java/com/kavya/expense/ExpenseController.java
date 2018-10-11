package com.kavya.expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/financemanager/expenses")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;
	
	@RequestMapping("/{id}")
	public Expense getExpense(@PathVariable("id") int id)
	{
		return expenseService.getExpense(id);
	}
	
	@RequestMapping("")

	public List<Expense> getAllExpense()
	{
		return expenseService.getExpenses();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/add")	
	public void addExpense(@RequestBody Expense expense)
	{
		expenseService.addExpense(expense);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}/update")	
	public void updateExpense(@RequestBody Expense expense)
	{		
		expenseService.updateExpense(expense);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteExpense(@PathVariable("id") int id)
	{
		expenseService.deleteExpense(id);
	}
}
