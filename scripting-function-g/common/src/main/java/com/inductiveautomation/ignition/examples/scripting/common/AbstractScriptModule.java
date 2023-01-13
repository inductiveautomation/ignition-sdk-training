package com.inductiveautomation.ignition.examples.scripting.common;

import com.inductiveautomation.ignition.common.BundleUtil;
import com.inductiveautomation.ignition.common.script.hints.ScriptArg;
import com.inductiveautomation.ignition.common.script.hints.ScriptFunction;

public abstract class AbstractScriptModule implements MathBlackBox {
    public static final String MODULE_ID = "com.inductiveautomation.ignition.examples.scripting.ScriptingFunctionG";

    static {
        BundleUtil.get().addBundle(
                AbstractScriptModule.class.getSimpleName(),
                AbstractScriptModule.class.getClassLoader(),
                AbstractScriptModule.class.getName().replace('.', '/')
        );
    }

    @Override
    @ScriptFunction(docBundlePrefix = "AbstractScriptModule")
    public int multiply(@ScriptArg("arg0") int arg0,
                        @ScriptArg("arg1") int arg1) {

        return multiplyImpl(arg0, arg1);
    }

    protected abstract int multiplyImpl(int arg0, int arg1);
}
