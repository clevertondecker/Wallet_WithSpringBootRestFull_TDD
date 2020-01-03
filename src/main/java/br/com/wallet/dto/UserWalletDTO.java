package br.com.wallet.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserWalletDTO {

	// Contém apenas o IDs pois é somente para manipular os registros no DB
	// (FetchType = lazy).

	private Long id;
	@NotNull(message = "Informe o ID do usuário")
	private Long users;
	@NotNull(message = "Informe o ID da carteira.")
	private Long wallet;
}
