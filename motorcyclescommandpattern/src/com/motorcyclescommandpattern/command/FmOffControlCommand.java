package com.motorcyclescommandpattern.command;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.button.Button;
import com.motorcyclescommandpattern.invoker.RemoteControl;

public class FmOffControlCommand implements Button {
	
	RemoteControl remoteControl;
    public FmOffControlCommand(RemoteControl remoteControl)
    {
        this.remoteControl = remoteControl;
    }
    public void execute()
    {
    	remoteControl.off();
    }

}
