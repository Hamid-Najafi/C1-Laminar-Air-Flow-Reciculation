package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import java.lang.System;
import gpclasses.plugins.script.*;
import java.util.Date;
import gpclasses.plugins.diag.*;
import gpclasses.util.misc.*;
import gpclasses.userScripts.*;
import gpclasses.util.io.*;

public class Panel2XprSrv extends CgpExpressionServer
{
	public void executeExpression(int _caseNumber)
	{
		switch (_caseNumber)
		{
			case 1000:
				{
end:{TagDB._CurPanelID.write(3,0);
}				}
				return;
			case 1001:
				{
end:{TagDB._CurPanelID.write(1,0);
}				}
				return;
		}
	}

}
