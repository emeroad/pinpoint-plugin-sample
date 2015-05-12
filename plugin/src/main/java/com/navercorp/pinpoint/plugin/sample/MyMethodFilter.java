/**
 * Copyright 2014 NAVER Corp.
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
package com.navercorp.pinpoint.plugin.sample;

import java.lang.reflect.Modifier;

import com.navercorp.pinpoint.bootstrap.instrument.MethodFilter;
import com.navercorp.pinpoint.bootstrap.instrument.MethodInfo;

/**
 * Filter accepting public methods only.
 * 
 * @author Jongho Moon
 * @see {@link MyPlugin#example6_Use_MethodFilter_To_Intercept_Multiple_Methods(com.navercorp.pinpoint.bootstrap.plugin.ProfilerPluginContext)}
 */
public class MyMethodFilter implements MethodFilter {

    @Override
    public boolean filter(MethodInfo method) {
        return !Modifier.isPublic(method.getModifiers());
    }

}