package com.motorcyclescommandpattern.invoker;
/*author Saiprakash Reddy*/

import com.motorcyclescommandpattern.button.Button;

public class SimpleController  {
	
	Button slot;  // only one button
	  
    public SimpleController()
    {
    }
  
    public void setCommand(Button command)
    {
  
        slot = command;
    }
  
    public void buttonWasPressed()
    {
        slot.execute();
    }

}
