package mate.academy.springboot.swagger.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductResponseDto {
    private Long id;
    private String title;
    private BigDecimal price;
}
