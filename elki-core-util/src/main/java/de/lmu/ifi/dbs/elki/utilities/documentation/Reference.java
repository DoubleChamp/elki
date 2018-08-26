/*
 * This file is part of ELKI:
 * Environment for Developing KDD-Applications Supported by Index-Structures
 *
 * Copyright (C) 2017
 * ELKI Development Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.lmu.ifi.dbs.elki.utilities.documentation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to specify a reference.
 * 
 * @author Erich Schubert
 * @since 0.3
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PACKAGE })
public @interface Reference {
  /**
   * Publication title.
   * 
   * @return publication title
   */
  String title();

  /**
   * Publication Authors
   * 
   * @return authors
   */
  String authors();

  /**
   * Book title or Journal title etc.
   * 
   * @return book title
   */
  String booktitle();

  /**
   * Prefix to the reference, e.g. "Generalization of a method proposed in"
   * 
   * @return Prefix or empty string
   */
  String prefix() default "";
 
  /**
   * Reference URL, e.g. DOI
   * 
   * @return Reference URL or empty string
   */
  String url() default "";
  
  /**
   * BibTeX key
   * 
   * @return BibTeX in the bibliography
   */
  String bibkey() default "";
}