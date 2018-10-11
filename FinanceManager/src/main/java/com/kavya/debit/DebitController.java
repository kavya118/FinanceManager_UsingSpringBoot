package com.kavya.debit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/financemanager/debits")
public class DebitController {

	@Autowired
	private DebitService debitService;
	
	@RequestMapping("/{id}")
	public Debit getDebit(@PathVariable("id") int id)
	{
		return debitService.getDebit(id);
	}
	
	@RequestMapping("")
	public List<Debit> getAllDebit()
	{
		return debitService.getDebits();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/add")	
	public void addDebit(@RequestBody Debit debit)
	{
		debit.setExpense(debitService.getExpense(debit.getExpense().getId()));
		System.out.println("#####################################################################"+debit.toString()+"%%%%"+debit.getExpense().toString());
		debit.setUserid(debitService.getUser(debit.getUserid().getId()));
		System.out.println("#####################################################################"+debit.toString()+"%%%%"+debit.getExpense().toString());
		debit.setWallet(debitService.getWallet(debit.getWallet().getId()));
		System.out.println("#####################################################################"+debit.toString()+"%%%%"+debit.getExpense().toString());
		//debitService.addCredit(debit);
		debitService.addDebit(debit);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}/update")	
	public void updateDebit(@RequestBody Debit debit)
	{		
		debitService.updateDebit(debit);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteDebit(@PathVariable("id") int id)
	{
		debitService.deleteDebit(id);
	}
}
