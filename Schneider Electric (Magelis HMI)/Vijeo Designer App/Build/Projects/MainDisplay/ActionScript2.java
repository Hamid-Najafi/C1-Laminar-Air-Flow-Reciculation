package Projects.MainDisplay;

import gpclasses.userScripts.*;
import gpclasses.userScripts.CgpUserScript;
import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.util.misc.*;
import gpclasses.plugins.script.*;
import gpclasses.plugins.diag.*;
import gpclasses.util.io.*;
import java.util.Hashtable;

public class ActionScript2 extends CgpUserScript
{
	public void run()
	{
end:{//-------------------------------------
//Script Created: Mar 01, 2023
//
// Description:
//
//-------------------------------------

if(TagDB.SettingModePass.getIntValue(0)==9998)
{
TagDB._CurPanelID.write(5,0);
TagDB.SettingModePassConfirm.write(0,0);
TagDB.SettingModePass.write(0,0);

}
else
// Open popup window at coordinates 100,100
{
//WrongPassword.open(150,100);
//WrongPassword.changePanel(10001);
//WrongPassword.show(true);
// DELAY
//WrongPassword.show(false);
}
}
	}
}
