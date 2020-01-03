package br.com.wallet.service;

import java.util.Optional;

import br.com.wallet.entity.UserWallet;

public interface UserWalletService {

	UserWallet save(UserWallet uw);
	
	Optional<UserWallet> findByUsersIdAndWalletId(Long user, Long wallet);
}
