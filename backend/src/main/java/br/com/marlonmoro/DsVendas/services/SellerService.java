package br.com.marlonmoro.DsVendas.services;

import br.com.marlonmoro.DsVendas.dtos.SellerDto;
import br.com.marlonmoro.DsVendas.repositories.SellerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

  private SellerRepository sellerRepository;

  private ModelMapper mapper;

  public List<SellerDto> getAllSellers() {

    return sellerRepository.findAll().stream()
        .map(seller -> mapper.map(seller, SellerDto.class))
        .collect(
            Collectors.toList());
  }

  public SellerService(SellerRepository sellerRepository, ModelMapper mapper) {
    this.sellerRepository = sellerRepository;
    this.mapper = mapper;
  }
}
