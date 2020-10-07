package com.klayrocha.pagamento.data.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.klayrocha.pagamento.entity.Venda;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonPropertyOrder({"id","data","produtos","valorTotal"})
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class VendaVO extends RepresentationModel<VendaVO> implements Serializable {
	
	private static final long serialVersionUID = -7334701345685781346L;

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("data")
	private Date data;
	
	@JsonProperty("produtos")
	private List<ProdutoVendaVO> produtos;
	
	@JsonProperty("valorTotal")
	private Double valorTotal;

	public static VendaVO create(Venda venda) {
		return new ModelMapper().map(venda, VendaVO.class);
	}
}
