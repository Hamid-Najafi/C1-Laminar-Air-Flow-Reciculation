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

		TagDB.FanCalibrationFactor = new CgpIntTag("FanCalibrationFactor", 1, TagDB.startNumber + 65, false, 1, false, -1);
		TagDB.FanCalibrationFactor.setMinMaxValues(-32768, 32767, true);
		TagDB.FanCalibrationFactor.trackChanges();

		TagDB.FanCalibrationBase = new CgpIntTag("FanCalibrationBase", 1, TagDB.startNumber + 66, false, 0, false, -1);
		TagDB.FanCalibrationBase.setMinMaxValues(-32768, 32767, true);
		TagDB.FanCalibrationBase.trackChanges();


		return TagDB2.classFactory3(tagFieldIdentifier);
	}

}
