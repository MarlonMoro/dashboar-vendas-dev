package br.com.marlonmoro.DsVendas.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleDto {

  private Long id;
  private Integer visited;
  private Integer deals;
  private BigDecimal amount;
  private LocalDate date;
  private SellerDto seller;
}
