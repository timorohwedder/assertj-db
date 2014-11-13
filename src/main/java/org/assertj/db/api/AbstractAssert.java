/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.db.api;

import org.assertj.core.api.Descriptable;
import org.assertj.core.api.WritableAssertionInfo;
import org.assertj.core.internal.Failures;

/**
 * Parent of all the assert class of assertj-db.
 * 
 * @author Régis Pouiller
 * 
 * @param <E> the "self" type of this assertion class. Please read &quot;<a href="http://bit.ly/anMa4g"
 *          target="_blank">Emulating 'self types' using Java Generics to simplify fluent API implementation</a>&quot;
 *          for more details.
 */
public abstract class AbstractAssert<E extends Descriptable<E>> implements Descriptable<E> {

  /**
   * To notice failures in the assertion.
   */
  protected final static Failures failures = Failures.instance();

  /**
   * Info on the object to assert.
   */
  protected final WritableAssertionInfo info;

  /**
   * Class of the assertion.
   */
  protected final E myself;

  /**
   * Constructor.
   * 
   * @param selfType Class of this assert : a sub-class of {@code AbstractAssert}.
   */
  AbstractAssert(Class<E> selfType) {
    myself = selfType.cast(this);
    info = new WritableAssertionInfo();
  }
}
