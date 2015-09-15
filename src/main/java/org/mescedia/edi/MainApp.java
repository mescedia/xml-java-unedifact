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

package org.mescedia.edi;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.mescedia.edi.xml_java_unedifact.CamelFileRoute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * a basic sample that shows how to use smooks to convert xml-java-unedifact
 *   
 * @author Michael Kassnel {mickas at mescedia d0t org}
 */

public class MainApp {
	
	static final Logger log = LoggerFactory.getLogger(MainApp.class);
 
    public static void main(String... args) throws Exception {
    	 	    		    	 
    	CamelContext context = new DefaultCamelContext();
	    context.addRoutes(new CamelFileRoute());		
	    context.start();  
	    
	    while(true) {
	    	Thread.sleep(99999999);
	    	
	    }
    }
}
