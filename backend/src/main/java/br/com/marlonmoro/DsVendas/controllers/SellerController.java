package br.com.marlonmoro.DsVendas.controllers;

import br.com.marlonmoro.DsVendas.dtos.SellerDto;
import br.com.marlonmoro.DsVendas.services.SellerService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sellers")
@RestController
public class SellerController {

  private SellerService sellerService;

  @GetMapping
  public ResponseEntity<List<SellerDto>> findAllSellers() {

    return ResponseEntity.ok(sellerService.getAllSellers());

  }

  public SellerController(SellerService sellerService) {
    this.sellerService = sellerService;
  }
}
