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
package ${package}.oms.inventory;

import ${package}.oms.AbstractExtWebIntegrationTest;


@SuppressWarnings("PMD.TestClassWithoutTestCases")
public class InventoryCustomTest extends AbstractExtWebIntegrationTest
{

	@Override
	protected String getRoute()
	{
		return "inventoryCustom";
	}
}
