package com.motorcyclescommandpattern.command;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.button.Button;
import com.motorcyclescommandpattern.invoker.RemoteControl;

public class FmOnControlCommand implements Button {
	
	RemoteControl remoteControl;
    public FmOnControlCommand(RemoteControl remote)
    {
        this.remoteControl = remote;
    }
    public void execute()
    {
    	remoteControl.on();
    	remoteControl.music();
    	remoteControl.setVolume(11);
    }

}
