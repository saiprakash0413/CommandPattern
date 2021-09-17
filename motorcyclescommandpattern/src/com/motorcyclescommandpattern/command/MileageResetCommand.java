package com.motorcyclescommandpattern.command;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.button.Button;
import com.motorcyclescommandpattern.invoker.RemoteControl;


public class MileageResetCommand implements Button {
	
	RemoteControl remoteControl;
    public MileageResetCommand(RemoteControl remoteControl)
    {
        this.remoteControl = remoteControl;
    }
    public void execute()
    {
    	remoteControl.mileage();
    }

}
