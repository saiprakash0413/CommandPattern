package com.motorcyclescommandpattern.client;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.command.AccelerationCommand;
import com.motorcyclescommandpattern.command.FmOnControlCommand;
import com.motorcyclescommandpattern.command.LightOnCommand;
import com.motorcyclescommandpattern.command.MileageResetCommand;
import com.motorcyclescommandpattern.command.MoveCommand;
import com.motorcyclescommandpattern.invoker.RemoteControl;
import com.motorcyclescommandpattern.invoker.SimpleController;
import com.motorcyclescommandpattern.receiver.Light;

public class Client {
	
	public static void main(String[] args)
    {
        SimpleController remote =
                  new SimpleController();
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
  
        // we can change command dynamically
        remote.setCommand(new
                MoveCommand(remoteControl));
    remote.buttonWasPressed();
        remote.setCommand(new
                    LightOnCommand(light));
        remote.buttonWasPressed();
        remote.setCommand(new AccelerationCommand(remoteControl));
        remote.buttonWasPressed();
        remote.setCommand(new
        		FmOnControlCommand(remoteControl));
        remote.buttonWasPressed();
        remote.setCommand(new MileageResetCommand(remoteControl));
        remote.buttonWasPressed();
     }

}
