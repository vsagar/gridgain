// Copyright (C) GridGain Systems Licensed under GPLv3, http://www.gnu.org/licenses/gpl.html

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.processors.cache.distributed.dht;

import org.gridgain.grid.kernal.*;
import org.gridgain.grid.typedef.internal.*;
import org.gridgain.grid.util.future.*;

import java.io.*;
import java.util.*;

/**
 * Finished DHT future.
 *
 * @author 2012 Copyright (C) GridGain Systems
 * @version 4.0.2c.12042012
 */
public class GridDhtFinishedFuture<T> extends GridFinishedFuture<T> implements GridDhtFuture<T> {
    /**
     * Empty constructor required by {@link Externalizable}.
     */
    public GridDhtFinishedFuture() {
        // No-op.
    }

    /**
     * @param ctx Context.
     * @param t Result.
     */
    public GridDhtFinishedFuture(GridKernalContext ctx, T t) {
        super(ctx, t);
    }

    /**
     * @param ctx Context.
     * @param err Error.
     */
    public GridDhtFinishedFuture(GridKernalContext ctx, Throwable err) {
        super(ctx, err);
    }

    /** {@inheritDoc} */
    @Override public Collection<Integer> invalidPartitions() {
        return Collections.emptyList();
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return S.toString(GridDhtFinishedFuture.class, this, super.toString());
    }
}
