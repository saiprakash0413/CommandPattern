package com.motorcyclescommandpattern.command;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.button.Button;
import com.motorcyclescommandpattern.receiver.Light;

public class LightOffCommand implements Button {
	
	Light light;
    public LightOffCommand(Light light)
    {
        this.light = light;
    }
    public void execute()
    {
         light.off();
    }
}
