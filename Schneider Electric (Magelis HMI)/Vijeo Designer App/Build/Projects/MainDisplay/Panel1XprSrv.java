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

public class Panel1XprSrv extends CgpExpressionServer
{
	public void executeExpression(int _caseNumber)
	{
		switch (_caseNumber)
		{
			case 1005:
				{
end:{TagDB._CurPanelID.write(4,0);
}				}
				return;
			case 1006:
				{
end:{TagDB._CurPanelID.write(3,0);
}				}
				return;
			case 1007:
				{
end:{TagDB._CurPanelID.write(2,0);
}				}
				return;
		}
	}

	public int executeIntExpression(int i)
	{
		switch (i)
		{
			case 1000:
			case 1002:
				{
					quality = TagDB.SINAMICS_V20_VAR.STOP_RUN.getTagDataQuality();
					if ((TagDB.SINAMICS_V20_VAR.STOP_RUN.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1001:
			case 1003:
				{
					return (1278);
				}
			case 1004:
				{
					return (1279);
				}
			case 1008:
				{
					quality = TagDB.SINAMICS_V20_VAR.LAST_FAULT.getTagDataQuality();
					if ((TagDB.SINAMICS_V20_VAR.LAST_FAULT.getIntValue(0)) ==0)
						return 1;
					else
						return 0;
				}
			case 1009:
				{
					quality = TagDB.SINAMICS_V20_VAR.LAST_WARNING.getTagDataQuality();
					if ((TagDB.SINAMICS_V20_VAR.LAST_WARNING.getIntValue(0)) ==0)
						return 1;
					else
						return 0;
				}
		}
		return 0;
	}

}
