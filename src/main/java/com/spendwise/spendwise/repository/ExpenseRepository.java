package com.spendwise.spendwise.repository;

import com.spendwise.spendwise.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
}