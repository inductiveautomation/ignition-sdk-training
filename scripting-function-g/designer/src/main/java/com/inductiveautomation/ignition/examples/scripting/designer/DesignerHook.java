package com.inductiveautomation.ignition.examples.scripting.designer;

import com.inductiveautomation.ignition.common.licensing.LicenseState;
import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.ignition.common.script.hints.PropertiesFileDocProvider;
import com.inductiveautomation.ignition.designer.model.AbstractDesignerModuleHook;
import com.inductiveautomation.ignition.designer.model.DesignerContext;
import com.inductiveautomation.ignition.examples.scripting.client.ClientScriptModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This is the Designer-scope module hook.  The minimal implementation contains a startup method.
 */
public class DesignerHook extends AbstractDesignerModuleHook {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void startup(DesignerContext context, LicenseState activationState) throws Exception {
        // implement functionality as required
    }

    // override additional methods as required

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        super.initializeScriptManager(manager);

        manager.addScriptModule(
                "system.example",
                new ClientScriptModule(),
                new PropertiesFileDocProvider()
        );
    }

}
