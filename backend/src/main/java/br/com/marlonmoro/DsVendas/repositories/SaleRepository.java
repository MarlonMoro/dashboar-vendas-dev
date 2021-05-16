package br.com.marlonmoro.DsVendas.repositories;

import br.com.marlonmoro.DsVendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SaleRepository extends JpaRepository<Sale, Long>, PagingAndSortingRepository<Sale, Long> {

}
