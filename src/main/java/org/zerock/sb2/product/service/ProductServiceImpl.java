package org.zerock.sb2.product.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.sb2.board.dto.PageRequestDTO;
import org.zerock.sb2.board.dto.PageResponseDTO;
import org.zerock.sb2.product.dto.ProductAddDTO;
import org.zerock.sb2.product.dto.ProductListAllDTO;
import org.zerock.sb2.product.repository.ProductRepository;

@Transactional
@Service
@Log4j2
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public Long add(ProductAddDTO dto) {


        return 0L;
    }

    @Transactional(readOnly = true)
    @Override
    public PageResponseDTO<ProductListAllDTO> listProducts(PageRequestDTO pageRequestDTO) {
        return repository.listAllQuerydsl(pageRequestDTO);
    }
}
