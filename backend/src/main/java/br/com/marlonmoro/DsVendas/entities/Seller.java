package br.com.marlonmoro.DsVendas.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "tb_sellers")
public class Seller {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @OneToMany(mappedBy = "seller")
  private List<Sale> sales = new ArrayList<>();

  public Seller() {
  }

  public Seller(Long id, String name) {
    this.id = id;
    this.name = name;
  }
}
