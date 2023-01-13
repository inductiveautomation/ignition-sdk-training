package com.inductiveautomation.ignition.examples.scripting.gateway;

import com.inductiveautomation.ignition.examples.scripting.common.AbstractScriptModule;

public class GatewayScriptModule extends AbstractScriptModule {

    @Override
    protected int multiplyImpl(int arg0, int arg1) {
        return arg0 * arg1;
    }

}
