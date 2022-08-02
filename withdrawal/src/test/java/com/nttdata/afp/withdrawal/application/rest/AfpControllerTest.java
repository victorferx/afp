package com.nttdata.afp.withdrawal.application.rest;

import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AfpControllerTest {

  AfpController afpController;

  @BeforeEach
  void inicializar() {
    afpController = new AfpController();
    System.out.println("Inicio de la prueba");
  }

  @Test
  void findAll() {
    System.out.println("Saludo");
    assertTrue("hola".equals("hola"));
  }

  @Test
  void findById() {
    AfpDto afpDto = new AfpDto();
    afpDto.setId(Long.valueOf(1));
    afpDto.setName("Integra");

    assertNotNull(afpDto);
  }

}
