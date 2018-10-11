package com.kavya.credit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kavya.expense.Expense;
import com.kavya.user.User;
import com.kavya.wallet.Wallet;

@Repository
public interface CreditRepository extends JpaRepository<Credit,Integer> {



}
