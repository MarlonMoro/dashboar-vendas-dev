package br.com.marlonmoro.DsVendas.dtos;

import br.com.marlonmoro.DsVendas.entities.Seller;
import lombok.Getter;

@Getter
public class SaleSucessDto {

  private String sellerName;
  private Long visited;
  private Long deals;

  public SaleSucessDto() {
  }

  public SaleSucessDto(Seller seller, Long visited, Long deals) {
    this.sellerName = seller.getName();
    this.visited = visited;
    this.deals = deals;
  }
}
