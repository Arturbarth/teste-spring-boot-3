package br.com.arturbarth.springboot3.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestEntityDto implements Serializable {
    private final Long id;
    private final String nome;
    private final String email;
}
