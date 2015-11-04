/*******************************************************************************
 * Copyright (c) 2015 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.packagedrone.repo.adapter.deb.aspect.internal;

import org.eclipse.packagedrone.repo.Severity;

/**
 * Receive validation messages
 */
@FunctionalInterface
public interface ValidationListener
{
    /**
     * Receive a validation message
     *
     * @param severity
     *            the severity
     * @param message
     *            the actual message
     */
    public void validationMessage ( Severity severity, String message );
}
