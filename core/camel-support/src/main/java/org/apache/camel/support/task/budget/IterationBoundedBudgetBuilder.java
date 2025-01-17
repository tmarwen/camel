/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.support.task.budget;

import java.time.Duration;

/**
 * A helper builder of iteration bounded builders. Provide generic/safe default values, but should be adjusted on a
 * per-case basis. By default, execute the iterations for up to Integer.MAX_VALUE.
 */
public class IterationBoundedBudgetBuilder implements BudgetBuilder<IterationBudget> {
    private static final int DEFAULT_MAX_ITERATIONS = Integer.MAX_VALUE;
    private static final long DEFAULT_INITIAL_DELAY = 0;
    private static final long DEFAULT_INTERVAL = 1000;

    protected long initialDelay = DEFAULT_INITIAL_DELAY;
    protected long interval = DEFAULT_INTERVAL;
    protected int maxIterations = DEFAULT_MAX_ITERATIONS;

    public IterationBoundedBudgetBuilder withInitialDelay(Duration duration) {
        this.initialDelay = duration.toMillis();

        return this;
    }

    public IterationBoundedBudgetBuilder withInterval(Duration duration) {
        this.interval = duration.toMillis();

        return this;
    }

    public IterationBoundedBudgetBuilder withMaxIterations(int maxIterations) {
        this.maxIterations = maxIterations;

        return this;
    }

    @Override
    public IterationBoundedBudget build() {
        return new IterationBoundedBudget(initialDelay, interval, maxIterations);
    }
}
