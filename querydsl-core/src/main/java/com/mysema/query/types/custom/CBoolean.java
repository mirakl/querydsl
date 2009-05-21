/**
 * 
 */
package com.mysema.query.types.custom;

import com.mysema.query.types.expr.EBoolean;
import com.mysema.query.types.expr.Expr;

public abstract class CBoolean extends EBoolean implements Custom<Boolean> {
	public Expr<?> getArg(int index) {
		return getArgs().get(index);
	}
}