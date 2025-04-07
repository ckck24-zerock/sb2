package org.zerock.sb2.product;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.sb2.product.dto.ProductAddDTO;
import org.zerock.sb2.product.dto.ProductReadDTO;
import org.zerock.sb2.product.service.ProductService;

import java.util.List;

@SpringBootTest
@Log4j2
public class ProductServiceTests {

    @Autowired
    private ProductService service;

    @Test
    public void testAddProduct() {

        ProductAddDTO dto = new ProductAddDTO();
        dto.setPname("Sample Product");
        dto.setPrice(8000);
        dto.setImageNames(List.of("aaa.jpg","bbb.jpg","ccc.jpg"));

        Long pno = service.add(dto);

        log.info(pno);
    }


    @Test
    public void testReadProduct() {

        ProductReadDTO dto = service.read(33L);
        log.info(dto);
    }

}
