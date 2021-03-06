/*
 * Copyright 2015-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.pivotal.strepsirrhini.chaosloris.web;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for schedule update
 */
public final class ScheduleUpdateInput {

    private final String expression;

    private final String name;

    @JsonCreator
    ScheduleUpdateInput(@JsonProperty("expression") String expression, @JsonProperty("name") String name) {
        this.expression = expression;
        this.name = name;
    }

    String getExpression() {
        return this.expression;
    }

    String getName() {
        return this.name;
    }

}
