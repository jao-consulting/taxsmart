package com.jao.taxsmart.bff.application.in.rest.controller;

import com.jao.taxsmart.bff.application.in.rest.dto.Tax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class TaxControllerTest {

	TaxController taxController;

	@BeforeEach
	void setUp() {
		taxController = new TaxController();
	}

	@Test
	void calculatesTaxForGivenFiscalRevenue() {
		Tax tax = taxController.calculateTax(1000D);
		assertEquals(250D, tax.getTaxAmount());
	}

}