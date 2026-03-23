package com.spendwise.spendwise.service;

import com.spendwise.spendwise.model.Expense;
import com.spendwise.spendwise.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public void deleteExpense(String id) {
        repository.deleteById(id);
    }
}