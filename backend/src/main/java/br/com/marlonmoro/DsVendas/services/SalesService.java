package br.com.marlonmoro.DsVendas.services;

import br.com.marlonmoro.DsVendas.dtos.SaleDto;
import br.com.marlonmoro.DsVendas.repositories.SaleRepository;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

  private ModelMapper mapper;

  private SaleRepository saleRepository;




  public List<SaleDto> getSalles(){


    return null;
  }

}
