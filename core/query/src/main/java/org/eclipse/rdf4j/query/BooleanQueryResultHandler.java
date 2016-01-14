/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j.query;

/**
 * An interface that indicates that this QueryResultHandler is capable of
 * handling boolean results using the {@link #handleBoolean(boolean)} method.
 * 
 * @since 2.7.0
 * @author Peter Ansell
 */
public interface BooleanQueryResultHandler extends QueryResultHandler {

}