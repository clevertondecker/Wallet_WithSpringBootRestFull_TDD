package br.com.wallet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wallet.entity.UserWallet;

public interface UserWalletRepository extends JpaRepository<UserWallet ,Long >{

	Optional<UserWallet> findByUsersIdAndWalletId(Long user, Long wallet);

}
