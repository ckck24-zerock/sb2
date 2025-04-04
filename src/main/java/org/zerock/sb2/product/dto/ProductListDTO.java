package org.zerock.sb2.product.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class ProductListDTO {

    private Long pno;
    private String pname;
    private int price;
    private String imgName;

    public ProductListDTO(Long pno, String pname, int price, String imgName) {
        this.pno = pno;
        this.pname = pname;
        this.price = price;
        this.imgName = imgName;

    }

}
