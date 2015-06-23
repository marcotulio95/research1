#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package ${package}.oms.formula;

import ${package}.oms.AbstractExtWebIntegrationTest;


/**
 * Test the bins custom route from source file to adapter. Test cases are located in abstract test class, they are
 * expecting to have csv files in binsCustom folder at classpath.
 */
@SuppressWarnings("PMD.TestClassWithoutTestCases")
public class FormulaUpdateTest extends AbstractExtWebIntegrationTest
{
	/**
	 * Gets the route name to test and with that also the scan folder name.
	 */
	@Override
	protected String getRoute()
	{
		return "formulaUpdate";
	}
}
