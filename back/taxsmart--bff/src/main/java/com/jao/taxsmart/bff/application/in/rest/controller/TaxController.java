package com.jao.taxsmart.bff.application.in.rest.controller;

import com.jao.taxsmart.bff.application.in.rest.dto.Tax;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * This is a Rest Controller class for handling tax related operations.
 * It implements the TaxApi interface.
 */
@RestController
@RequiredArgsConstructor
public class TaxController implements TaxApi {

	/**
	 * This method calculates the tax based on the given fiscal revenue.
	 * Currently, it returns a fixed tax amount of 250.
	 *
	 * @param fiscalRevenue
	 *            The fiscal revenue based on which the tax is calculated.
	 * @return Tax object with the calculated tax amount.
	 */
	@Override
	public Tax calculateTax(Double fiscalRevenue) {
		return Tax.builder().taxAmount(250D).build();
	}
}