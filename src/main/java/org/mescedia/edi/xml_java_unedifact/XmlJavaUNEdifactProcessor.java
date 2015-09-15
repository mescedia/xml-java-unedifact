/*
 * mescedia - Copyright (C) 2015
 * 
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License (version 2.1) as published
 * by the Free Software Foundation.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.
 * 
 * See the GNU Lesser General Public License for more details:
 * http://www.gnu.org/licenses/lgpl.txt
 */

package org.mescedia.edi.xml_java_unedifact;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class XmlJavaUNEdifactProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {

		String message = exchange.getIn().getBody(String.class) ;		
		
		// 
		// TODO adjust path settings to bindingconfigs here
		String bindingconfigPath = "/mescedia/src/unedifact/mescedia-bindingconfig";
		
		String ediMessage = XmlJavaUNEdifactConverter.getInstance().convertToUNEdifact( message, bindingconfigPath  );
		
		exchange.getIn().setBody(ediMessage);
		
	}

}
