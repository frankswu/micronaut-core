/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.cache;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;

/**
 * <p>Base cache interface implemented by both {@link SyncCache} and {@link AsyncCache}.</p>
 *
 * @param <C> The native cache implementation
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface Cache<C> {

    /**
     * @return The name of the cache
     */
    String getName();

    /**
     * @return The native cache implementation
     */
    C getNativeCache();

    /**
     * @return The cache information.
     */
    default Publisher<CacheInfo> getCacheInfo() {
        return Flowable.empty();
    }
}
