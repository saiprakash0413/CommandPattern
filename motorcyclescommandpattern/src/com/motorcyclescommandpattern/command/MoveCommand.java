package com.motorcyclescommandpattern.command;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.button.Button;
import com.motorcyclescommandpattern.invoker.RemoteControl;

public class MoveCommand implements Button {
	
	RemoteControl remoteControl;
    public MoveCommand(RemoteControl remoteControl)
    {
        this.remoteControl = remoteControl;
    }
    public void execute()
    {
    	remoteControl.move();
    }

}
