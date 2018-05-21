package com.multiva.cecoban.transactionlog.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiva.cecoban.transactionlog.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
