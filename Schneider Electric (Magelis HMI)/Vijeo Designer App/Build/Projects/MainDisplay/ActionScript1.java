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

public class ActionScript1 extends CgpUserScript
{
	public void run()
	{
			if(TagDB.SINAMICS_V20_VAR.HSW_SpeedSetpoint.getTagType() == CgpTag.TAG_TYPE_FLOAT)
				TagDB.SINAMICS_V20_VAR.HSW_SpeedSetpoint.queuedWrite(CgpExpressionServer.expressionServer.executeFloatExpression(2001), 0);
			else
				TagDB.SINAMICS_V20_VAR.HSW_SpeedSetpoint.queuedWrite(CgpExpressionServer.expressionServer.executeIntExpression(2001), 0);

	}
}
