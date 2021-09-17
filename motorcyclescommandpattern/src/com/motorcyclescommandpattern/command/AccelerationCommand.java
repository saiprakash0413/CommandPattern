package com.motorcyclescommandpattern.command;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.button.Button;
import com.motorcyclescommandpattern.invoker.RemoteControl;

public class AccelerationCommand implements Button {
	
	RemoteControl remoteControl;
    public AccelerationCommand(RemoteControl remoteControl)
    {
        this.remoteControl = remoteControl;
    }
    public void execute()
    {
    	remoteControl.speed();
    }

}
