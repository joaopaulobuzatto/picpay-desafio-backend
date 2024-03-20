package br.com.joaopaulobuzatto.picpaydesafiobackend.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.joaopaulobuzatto.picpaydesafiobackend.model.Wallet;

public interface WalletRepository extends CrudRepository<Wallet, Long> {

}
