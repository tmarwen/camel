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

public class IterationBoundedBudget implements IterationBudget {
    public static final int UNLIMITED_ITERATIONS = -1;

    private final long initialDelay;
    private final long interval;
    private final int maxIterations;
    private int iterations;

    IterationBoundedBudget(long initialDelay, long interval, int maxIterations) {
        this.initialDelay = initialDelay;
        this.interval = interval;
        this.maxIterations = maxIterations;
    }

    @Override
    public long initialDelay() {
        return initialDelay;
    }

    @Override
    public long interval() {
        return interval;
    }

    @Override
    public int maxIterations() {
        return maxIterations;
    }

    public int iterations() {
        return iterations;
    }

    @Override
    public boolean next() {
        if (canContinue()) {
            if (iterations != UNLIMITED_ITERATIONS) {
                iterations++;
            }

            return true;
        }

        return false;
    }

    @Override
    public boolean canContinue() {
        if (maxIterations != UNLIMITED_ITERATIONS) {
            return iterations < maxIterations;
        }

        return true;
    }
}
