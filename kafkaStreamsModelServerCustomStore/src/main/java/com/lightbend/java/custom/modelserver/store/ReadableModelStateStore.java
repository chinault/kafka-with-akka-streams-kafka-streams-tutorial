package com.lightbend.java.custom.modelserver.store;

import com.lightbend.java.model.ModelServingInfo;

/**
 * Created by boris on 7/13/17.
 */
public interface ReadableModelStateStore {
    ModelServingInfo getCurrentServingInfo();
}

