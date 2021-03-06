/*
 * #%L
 * JBossOSGi Deployment
 * %%
 * Copyright (C) 2010 - 2012 JBoss by Red Hat
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
/*
 * JBoss, Home of Professional Open Source
 * Copyright 2005, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public-
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.osgi.deployment.deployer;

import org.jboss.osgi.spi.Attachable;
import org.jboss.osgi.vfs.VirtualFile;

/**
 * An abstraction of a bundle deployment
 *
 * @author thomas.diesler@jboss.com
 * @since 27-May-2009
 */
public interface Deployment extends Attachable {
    /**
     * Get the root virtual file
     */
    VirtualFile getRoot();

    /**
     * Get the bundle location
     */
    String getLocation();

    /**
     * Get the bundle symbolic name
     */
    String getSymbolicName();

    /**
     * Get the bundle version
     *
     * Consider making Version serializable
     * https://www.osgi.org/members/bugzilla/show_bug.cgi?id=1744
     */
    String getVersion();

    /**
     * Get the start level associated with this deployment
     */
    Integer getStartLevel();

    /**
     * Set the start level associated with this deployment
     */
    void setStartLevel(Integer startLevel);

    /**
     * Get the autostart flag associated with this deployment
     */
    boolean isAutoStart();

    /**
     * Set the autostart flag associated with this deployment
     */
    void setAutoStart(boolean autoStart);

    /**
     * Get the update flag associated with this deployment
     */
    boolean isBundleUpdate();

    /**
     * Set the update flag associated with this deployment
     */
    void setBundleUpdate(boolean update);
}