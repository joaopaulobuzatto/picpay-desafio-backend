package br.com.joaopaulobuzatto.picpaydesafiobackend.repository;

import org.springframework.data.repository.ListCrudRepository;

import br.com.joaopaulobuzatto.picpaydesafiobackend.model.Transaction;

public interface TransactionRepository extends ListCrudRepository<Transaction, Long> {

}
