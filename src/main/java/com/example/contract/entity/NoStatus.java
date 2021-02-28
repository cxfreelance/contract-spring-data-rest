package com.example.contract.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "noDrivers", types = {Contract.class})
public interface NoStatus {

    String getStatus();

}
