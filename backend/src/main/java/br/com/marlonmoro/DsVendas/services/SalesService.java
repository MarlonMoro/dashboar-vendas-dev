package br.com.marlonmoro.DsVendas.services;

import br.com.marlonmoro.DsVendas.dtos.SaleDto;
import br.com.marlonmoro.DsVendas.entities.Sale;
import br.com.marlonmoro.DsVendas.repositories.SaleRepository;
import br.com.marlonmoro.DsVendas.repositories.SellerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SalesService {

  private ModelMapper mapper;

  private SaleRepository saleRepository;

  private SellerRepository sellerRepository;


  @Transactional(readOnly = true)
  public Page<SaleDto> getSalles(Pageable page) {
    sellerRepository.findAll();
    Page<Sale> sales = saleRepository.findAll(page);
    return sales.map(sale -> mapper.map(sale, SaleDto.class));

  }

  public SalesService(ModelMapper mapper,
      SaleRepository saleRepository,
      SellerRepository sellerRepository) {
    this.mapper = mapper;
    this.saleRepository = saleRepository;
    this.sellerRepository = sellerRepository;
  }
}
