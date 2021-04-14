package com.example.api.address;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.sql.Date;

@Data
@Component
public class AddressDto {
    private long addressId;
    private String name;
    private String address;
    private String regDate;
}
