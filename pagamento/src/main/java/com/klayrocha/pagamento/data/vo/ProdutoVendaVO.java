package com.klayrocha.pagamento.data.vo;

import java.io.Serializable;

import org.modelmapper.ModelMapper;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.klayrocha.pagamento.entity.ProdutoVenda;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonPropertyOrder({ "id", "idProduto", "quantidade" })
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ProdutoVendaVO extends RepresentationModel<ProdutoVendaVO> implements Serializable {

	private static final long serialVersionUID = 3277044024726131411L;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("idProduto")
	private Long idProduto;

	@JsonProperty("quantidade")
	private Integer quantidade;

	public static ProdutoVendaVO create(ProdutoVenda produtoVenda) {
		return new ModelMapper().map(produtoVenda, ProdutoVendaVO.class);
	}

}
