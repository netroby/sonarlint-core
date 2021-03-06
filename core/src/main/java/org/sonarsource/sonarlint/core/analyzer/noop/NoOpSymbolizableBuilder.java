/*
 * SonarLint Core - Implementation
 * Copyright (C) 2009-2018 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.sonarlint.core.analyzer.noop;

import javax.annotation.CheckForNull;
import org.sonar.api.batch.fs.InputComponent;
import org.sonar.api.source.Symbolizable;
import org.sonarsource.sonarlint.core.analyzer.perspectives.PerspectiveBuilder;

public class NoOpSymbolizableBuilder extends PerspectiveBuilder<Symbolizable> {

  private static final NoOpSymbolizable NO_OP_SYMBOLIZABLE = new NoOpSymbolizable();

  public NoOpSymbolizableBuilder() {
    super(Symbolizable.class);
  }

  @CheckForNull
  @Override
  public Symbolizable loadPerspective(Class<Symbolizable> perspectiveClass, InputComponent component) {
    return NO_OP_SYMBOLIZABLE;
  }
}
