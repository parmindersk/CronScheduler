/*
 * Copyright (C) The CronScheduler Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.timeandspace.cronscheduler;

final class MathUtils {
    private MathUtils() {}

    static long roundDown(long x, long n) {
        if (x < 0 || n < 1) {
            throw new AssertionError();
        }
        return (x / n) * n;
    }

    static long roundUp(long x, long n) {
        if (x < 0 || n < 1) {
            throw new AssertionError();
        }
        return roundDown(x + n - 1, n);
    }
}
