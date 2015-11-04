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
package org.eclipse.packagedrone.utils.converter;

public class LongToStringConverter implements Converter
{
    public static final LongToStringConverter INSTANCE = new LongToStringConverter ();

    @Override
    public boolean canConvert ( final Class<?> from, final Class<?> to )
    {
        if ( from.equals ( Long.class ) && to.equals ( String.class ) )
        {
            return true;
        }
        return false;
    }

    @Override
    public String convertTo ( final Object value, final Class<?> clazz )
    {
        if ( value == null )
        {
            return null;
        }
        return value.toString ();
    }
}
