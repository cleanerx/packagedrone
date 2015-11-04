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
package org.eclipse.packagedrone.repo.adapter.deb.aspect;

import org.eclipse.packagedrone.repo.adapter.deb.aspect.internal.AptAggregator;
import org.eclipse.packagedrone.repo.aspect.ChannelAspect;
import org.eclipse.packagedrone.repo.aspect.ChannelAspectFactory;
import org.eclipse.packagedrone.repo.aspect.aggregate.ChannelAggregator;

public class AptChannelAspectFactory implements ChannelAspectFactory
{
    public static final String ID = "apt";

    @Override
    public ChannelAspect createAspect ()
    {
        return new ChannelAspect () {

            @Override
            public String getId ()
            {
                return ID;
            }

            @Override
            public ChannelAggregator getChannelAggregator ()
            {
                return new AptAggregator ();
            }
        };
    }

}
