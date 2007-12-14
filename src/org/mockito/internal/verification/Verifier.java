/*
 * Copyright (c) 2007 Mockito contributors 
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.verification;

import java.util.List;

import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.progress.VerificationMode;

public interface Verifier {

    abstract void verify(List<Invocation> invocations, InvocationMatcher wanted, VerificationMode mode);
    
}
