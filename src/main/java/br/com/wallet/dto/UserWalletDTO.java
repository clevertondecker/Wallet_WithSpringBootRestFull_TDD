package br.com.wallet.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserWalletDTO {

	//Contém apenas o IDs pois é somente para manipular os registros no DB (FetchType = lazy).
	
	@NotNull(message= "Informe o ID da carteira.")
	private Long id;
	@NotNull(message= "Informe o ID da carteira.")
	private Long users;
	private Long wallet;
}
