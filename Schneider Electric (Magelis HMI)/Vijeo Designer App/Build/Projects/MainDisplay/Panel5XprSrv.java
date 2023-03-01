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
