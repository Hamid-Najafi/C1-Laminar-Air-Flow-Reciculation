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

public class Panel4XprSrv extends CgpExpressionServer
{
	public void executeExpression(int _caseNumber)
	{
		switch (_caseNumber)
		{
			case 1002:
				{
end:{TagDB._CurPanelID.write(1,0);
}				}
				return;
			case 1003:
				{
				gpclasses.system.CgpSystem.restartSystem();
				}
				return;
		}
	}

	public int executeIntExpression(int i)
	{
		switch (i)
		{
			case 1000:
				{
					quality = CgpTag.TAG_QUALITY_GOOD;
					return (1000);
				}
			case 1001:
				{
					quality = CgpTag.TAG_QUALITY_GOOD;
					return (9999);
				}
		}
		return 0;
	}

}
