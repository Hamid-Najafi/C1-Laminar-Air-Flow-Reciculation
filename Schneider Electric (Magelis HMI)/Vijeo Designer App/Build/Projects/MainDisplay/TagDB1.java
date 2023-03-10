package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.trends.*;
import gpclasses.macroobjects.*;

public class TagDB1
{
	public static Object classFactory2(int tagFieldIdentifier)
	{
		TagDB.SettingModePass = new CgpIntTag("SettingModePass", 1, TagDB.startNumber + 63, false, 0, false, -1);
		TagDB.SettingModePass.setMinMaxValues(-2147483648, 2147483647, true);

		TagDB.SettingModePassConfirm = new CgpDiscreteTag("SettingModePassConfirm", 1, TagDB.startNumber + 64, false, false, false, -1);

		TagDB.FanCalibrationFactor = new CgpFloatTag("FanCalibrationFactor", 1, TagDB.startNumber + 65, false, (float)1, true, 0);
		TagDB.FanCalibrationFactor.trackChanges();

		TagDB.FanCalibrationBase = new CgpFloatTag("FanCalibrationBase", 1, TagDB.startNumber + 66, false, (float)0, false, 4);
		TagDB.FanCalibrationBase.trackChanges();

		TagDB.FanSpeedEqation = new CgpStringTag("FanSpeedEqation", TagDB.startNumber + 67, false, "", 100, false, -1);


		return TagDB2.classFactory3(tagFieldIdentifier);
	}

}
