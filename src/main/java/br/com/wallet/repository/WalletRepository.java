package br.com.wallet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wallet.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet,  Long>{

}
 