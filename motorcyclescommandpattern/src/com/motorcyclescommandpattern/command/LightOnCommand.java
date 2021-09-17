package com.motorcyclescommandpattern.command;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.button.Button;
import com.motorcyclescommandpattern.receiver.Light;

public class LightOnCommand implements Button {
	
	Light light;
	  
    // The constructor is passed the light it
    // is going to control.
    public LightOnCommand(Light light)
    {
       this.light = light;
    }
    public void execute()
    {
       light.on();
    }

}
