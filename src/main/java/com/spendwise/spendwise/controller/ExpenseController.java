package com.spendwise.spendwise.controller;

import com.spendwise.spendwise.model.Expense;
import com.spendwise.spendwise.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@CrossOrigin
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable String id) {
        service.deleteExpense(id);
    }
}