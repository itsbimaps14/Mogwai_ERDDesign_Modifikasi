/**
 * Mogwai ERDesigner. Copyright (C) 2002 The Mogwai Project.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package de.erdesignerng.model.serializer;

import de.erdesignerng.model.SubjectArea;

/**
 * @author $Author: dr-death2 $
 * @version $Date: 2009-10-25 02:50:00 $
 */
public abstract class AbstractXMLSubjectAreaSerializer extends CommonAbstractXMLSerializer<SubjectArea> {
	protected static final String COLOR = "color";

	protected static final String COMMENTREFID = "commentrefid";

	protected static final String ITEM = "Item";

	protected static final String SUBJECTAREA = "Subjectarea";

	protected static final String TABLEREFID = "tablerefid";

	protected static final String VIEWREFID = "viewrefid";

	protected static final String VISIBLE = "visible";

	protected static final String EXPANDED = "expanded";

}
