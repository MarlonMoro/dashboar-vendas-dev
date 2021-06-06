package br.com.marlonmoro.DsVendas.repositories;

import br.com.marlonmoro.DsVendas.dtos.SaleSucessDto;
import br.com.marlonmoro.DsVendas.dtos.SaleSumDto;
import br.com.marlonmoro.DsVendas.entities.Sale;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SaleRepository extends JpaRepository<Sale, Long>, PagingAndSortingRepository<Sale, Long> {

  @Query("SELECT new br.com.marlonmoro.DsVendas.dtos.SaleSumDto(obj.seller, SUM(obj.amount)) FROM "
      + "Sale AS obj "
      + "GROUP BY obj.seller")
  List<SaleSumDto> amountGroupedBySeller();

  @Query("SELECT new br.com.marlonmoro.DsVendas.dtos.SaleSucessDto(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM "
      + "Sale AS obj "
      + "GROUP BY obj.seller")
  List<SaleSucessDto> sucessGroupedBySeller();

}
