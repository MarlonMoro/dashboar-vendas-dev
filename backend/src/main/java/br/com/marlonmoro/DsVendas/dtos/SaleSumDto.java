package br.com.marlonmoro.DsVendas.dtos;

import br.com.marlonmoro.DsVendas.entities.Seller;
import java.math.BigDecimal;
import lombok.Getter;

@Getter
public class SaleSumDto {

  private String sellerName;
  private BigDecimal sum;

  public SaleSumDto() {

  }

  public SaleSumDto(Seller seller, BigDecimal sum) {
    this.sellerName = seller.getName();
    this.sum = sum;
  }
}
