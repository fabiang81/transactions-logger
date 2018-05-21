package com.multiva.cecoban.transactionlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiva.cecoban.transactionlog.model.Transaction;
import com.multiva.cecoban.transactionlog.repo.TransactionRepository;

@RestController
public class TransactionLogController {
	
	@Autowired
	TransactionRepository repository;
	
	@GetMapping("/transactions/{id}")
	public Transaction getTransaction(@PathVariable("id") Long solicitudId) {
		return repository.findOne(solicitudId);
	}
	
	@PostMapping("/transactions")
	public Transaction createTransaction(@RequestBody Transaction transaction) {
		return repository.save(transaction);
	}

}
