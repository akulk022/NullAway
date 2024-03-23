package com.uber.nullaway.libmodel;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class AnnotationExample {

    @Nullable
    public String makeUpperCase(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return null;
        } else {
            return inputString.toUpperCase();
        }
    }

    public Integer @Nullable [] generateIntArray(int size) {
        if (size <= 0) {
            return null;
        } else {
            Integer[] result = new Integer[size];
            for (int i = 0; i < size; i++) {
                result[i] = i + 1;
            }
            return result;
        }
    }

    /**
     * This method exists to test that
     * we do not process this annotation.
     * Since for the purposes of this tool,
     * we are only considering the jspecify annotation.
     */
    @javax.annotation.Nullable
    public String nullReturn() {
        return null;
    }
}
