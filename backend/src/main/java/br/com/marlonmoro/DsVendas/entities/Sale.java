package br.com.marlonmoro.DsVendas.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "tb_sales")
public class Sale {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Integer visited;
  private Integer deals;
  private BigDecimal amount;
  private LocalDate date;

  @ManyToOne
  @JoinColumn(name = "seller_id")
  private Seller seller;


  public Sale() {
  }

  public Sale(Long id, Integer visited, Integer deals, BigDecimal amount, LocalDate date,
      Seller seller) {
    this.id = id;
    this.visited = visited;
    this.deals = deals;
    this.amount = amount;
    this.date = date;
    this.seller = seller;
  }
}
