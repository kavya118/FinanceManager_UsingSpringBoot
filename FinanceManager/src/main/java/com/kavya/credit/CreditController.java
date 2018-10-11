package com.kavya.credit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/financemanager/credits")
public class CreditController {

	@Autowired
	private CreditService creditService;
	
	@RequestMapping("/{id}")
	public Credit getCredit(@PathVariable("id") int id)
	{
		return creditService.getCredit(id);
	}
	
	@RequestMapping("")
	public List<Credit> getAllCredit()
	{
		return creditService.getCredits();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/add")	
	public void addCredit(@RequestBody Credit credit)
	{
		//User newUser = new User(credit.getUser_money());
		//credit.setUser_money(credit.user_money);
		//credit.setUser_money(credit.user_money);
		//credit.setUser_money(credit.user_money);
		//credit.setExpense();
		//User user = creditService.a
		//System.out.println("#####################################################################"+credit.toString()+"%%%%"+credit.getExpense().toString());
		//System.out.println("#####################################################################"+credit.toString()+"%%%%"+credit.getExpense().toString());
		//System.out.println("#####################################################################"+credit.toString()+"%%%%"+credit.getExpense().toString());

		credit.setExpense(creditService.getExpense(credit.getExpense().getId()));
		credit.setUser_money(creditService.getUser(credit.getUser_money().getId()));
		credit.setWallet(creditService.getWallet(credit.getWallet().getId()));
		creditService.addCredit(credit);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}/update")	
	public void updateCredit(@RequestBody Credit credit)
	{		
		creditService.updateCredit(credit);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteCredit(@PathVariable("id") int id)
	{
		creditService.deleteCredit(id);
	}
}
