// Prevayler(TM) - The Open-Source Prevalence Layer.
// Copyright (C) 2001-2003 Klaus Wuestefeld.
// This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License version 2.1 as published by the Free Software Foundation. This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details. You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.

package org.prevayler.test.old;

import java.util.Date;

import org.prevayler.Transaction;


/** The Addition transaction for the AddingSystem.
*/
class Addition implements Transaction {

	private final long _value;


	Addition(long value) {
		_value = value;
	}


	public void executeOn(Object prevalentSystem, Date timestamp) {
		((AddingSystem)prevalentSystem).add(_value);
	}

}
