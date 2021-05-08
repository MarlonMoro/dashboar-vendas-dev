package br.com.marlonmoro.DsVendas.repositories;

import br.com.marlonmoro.DsVendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
