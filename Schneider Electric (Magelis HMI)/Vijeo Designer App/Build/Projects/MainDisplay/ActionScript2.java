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
end:{if(TagDB.SettingModePass.getIntValue(0)==9998)
{
TagDB._CurPanelID.write(5,0);
}
TagDB.SettingModePass.write(0,0);
TagDB.SettingModePassConfirm.write(0,0);
}
	}
}
