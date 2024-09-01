package az.developia.springbook.response;

import az.developia.springbook.entity.CustomerEntity;
import lombok.Data;

@Data
public class CustomerResponseDTO {
    private CustomerEntity customer;
}
