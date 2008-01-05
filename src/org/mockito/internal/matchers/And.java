/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.matchers;

import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class And implements ArgumentMatcher {

    private final List<ArgumentMatcher> matchers;

    public And(List<ArgumentMatcher> matchers) {
        this.matchers = matchers;
    }

    public boolean matches(Object actual) {
        for (ArgumentMatcher matcher : matchers) {
            if (!matcher.matches(actual)) {
                return false;
            }
        }
        return true;
    }

    public void appendTo(StringBuilder buffer) {
        buffer.append("and(");
        for (Iterator<ArgumentMatcher> it = matchers.iterator(); it.hasNext();) {
            it.next().appendTo(buffer);
            if (it.hasNext()) {
                buffer.append(", ");
            }
        }
        buffer.append(")");
    }
}
