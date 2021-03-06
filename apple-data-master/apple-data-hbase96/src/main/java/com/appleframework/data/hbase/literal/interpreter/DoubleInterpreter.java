package com.appleframework.data.hbase.literal.interpreter;

import com.appleframework.data.hbase.literal.AbstractLiteralInterpreter;

/**
 * DoubleInterpreter.
 * 
 * @author xinzhi.zhang
 * */
public class DoubleInterpreter extends AbstractLiteralInterpreter {

    @Override
    public Class<?> getTypeCanInterpret() {
        return Double.class;
    }

    @Override
    protected Object interpret_internal(String literalValue) {
        return Double.parseDouble(literalValue);
    }
}