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

public class ActionScript3 extends CgpUserScript
{
	public void run()
	{
			TagDB.FanSpeedEqation.write(CgpExpressionServer.expressionServer.executeStringExpression(2002), 0);

	}
}
