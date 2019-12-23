package br.com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wallet.entity.UserWallet;

public interface UserWalletRepository extends JpaRepository<UserWallet ,Long >{

}
