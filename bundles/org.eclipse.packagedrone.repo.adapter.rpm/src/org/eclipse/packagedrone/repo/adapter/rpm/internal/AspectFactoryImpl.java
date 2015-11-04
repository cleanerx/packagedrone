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
package org.eclipse.packagedrone.repo.adapter.rpm.internal;

import org.eclipse.packagedrone.repo.adapter.rpm.Constants;
import org.eclipse.packagedrone.repo.aspect.ChannelAspect;
import org.eclipse.packagedrone.repo.aspect.ChannelAspectFactory;
import org.eclipse.packagedrone.repo.aspect.extract.Extractor;

public class AspectFactoryImpl implements ChannelAspectFactory
{
    @Override
    public ChannelAspect createAspect ()
    {
        return new ChannelAspect () {

            @Override
            public String getId ()
            {
                return Constants.RPM_ASPECT_ID;
            }

            @Override
            public Extractor getExtractor ()
            {
                return new RpmExtractor ();
            }
        };
    }

}
