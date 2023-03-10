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

public class Panel5XprSrv extends CgpExpressionServer
{
	public void executeExpression(int _caseNumber)
	{
		switch (_caseNumber)
		{
			case 1000:
				{
			if (CgpSystem.isPlatform(CgpSystem.HMI))
			{
				WindowDB.BasePopups.close();
				WindowDB.BasePopups.open((short)(278), (short)(40));
				if(WindowDB.BasePopups.changePanel(10001))
					WindowDB.BasePopups.show(true);
				else
					WindowDB.BasePopups.close();
			}
			else
			{
				CgpSystem.setError("Not_Published_For_PeV", (byte)0);
				CgpSystem.outputError("");
			}
				}
				return;
			case 1005:
				{
end:{TagDB._CurPanelID.write(1,0);
}				}
				return;
		}
	}

	public float executeFloatExpression(int i)
	{
		switch (i)
		{
			case 1001:
			case 1003:
				{
					quality = CgpTag.TAG_QUALITY_GOOD;
					return ((float)0f);
				}
			case 1002:
				{
					quality = CgpTag.TAG_QUALITY_GOOD;
					return ((float)16384f);
				}
			case 1004:
				{
					quality = CgpTag.TAG_QUALITY_GOOD;
					return ((float)10.00f);
				}
		}
		return 0.0f;
	}

}
