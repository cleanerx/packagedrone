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
package org.eclipse.packagedrone.repo.adapter.r5.internal;

import org.eclipse.packagedrone.repo.MetaKey;
import org.eclipse.packagedrone.repo.adapter.r5.internal.handler.HelpHandler;
import org.eclipse.packagedrone.repo.servlet.Handler;

public class ObrServlet extends CommonRepoServlet
{
    private static final MetaKey KEY_REPO_INDEX = new MetaKey ( "r5.repo", "obr.xml" );

    private static final long serialVersionUID = 1L;

    private final Handler helpHandler = new HelpHandler ( "OBR repository adapter" );

    public ObrServlet ()
    {
        super ( KEY_REPO_INDEX );
    }

    @Override
    protected Handler getHelpHandler ()
    {
        return this.helpHandler;
    }
}
