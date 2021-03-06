package br.com.marlonmoro.DsVendas.controllers;

import br.com.marlonmoro.DsVendas.dtos.SaleDto;
import br.com.marlonmoro.DsVendas.dtos.SaleSucessDto;
import br.com.marlonmoro.DsVendas.dtos.SaleSumDto;
import br.com.marlonmoro.DsVendas.dtos.SellerDto;
import br.com.marlonmoro.DsVendas.services.SalesService;
import br.com.marlonmoro.DsVendas.services.SellerService;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sales")
@RestController
public class SaleController {

  private SalesService salesService;

  @GetMapping
  public ResponseEntity<Page<SaleDto>> findAllSellers(Pageable pageable) {

    return ResponseEntity.ok(salesService.getSalles(pageable));

  }

  @GetMapping(path = "/amount-by-seller")
  public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller() {

    return ResponseEntity.ok(salesService.amountGroupedBySeller());
  }

  @GetMapping(path = "/sucess-by-seller")
  public ResponseEntity<List<SaleSucessDto>> sucessGroupedBySeller() {

    return ResponseEntity.ok(salesService.sucessGroupedBySeller());
  }

  public SaleController(SalesService salesService) {
    this.salesService = salesService;
  }
}
