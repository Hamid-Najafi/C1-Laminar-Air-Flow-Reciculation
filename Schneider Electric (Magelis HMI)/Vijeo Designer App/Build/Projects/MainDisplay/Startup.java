package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.macroobjects.*;
import gpclasses.graphics.*;
import gpclasses.animations.*;
import gpclasses.plugins.script.*;
import gpclasses.util.io.*;
import gpclasses.tags.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.dialogTable.*;
import gpclasses.userScripts.*;
import gpclasses.plugins.remoteTargetAlarms.*;
import gpclasses.plugins.illuminatedSwitch.*;



public class Startup extends CgpStartup
{
	public static CgpScript DateTime;
	public static Object DateTimeTimerContext;

	// Dialog table member declaration

	public static void main (String args[])
	{
		startupObject = new Startup();
		CgpStartup.main(args);

		CgpSystem.setAppBuildDateAndTimeString("02/03/2023", "16:50:09");
	}

	public String[] getPublishedPanels()
	{
		return null;
	}

	public int getDisplayWidth()
	{
		return 800;
	}

	public int getDisplayHeight()
	{
		return 480;
	}

	public CgpWindow[] getPopupWindows()
	{
		CgpWindow[] windowList =
		{
			WindowDB.BasePopups,
		};
		return windowList;
	}

	protected void preInitProject()
	{
		TagDB.StaticInit();
		new Projects.MainDisplay.TagDB();
		CgpSystem.projectName = "Projects/MainDisplay";
		CgpTag.setRetentiveStorage(new gpclasses.tags.CgpRetentiveStorage(8));
	}

	protected void postInitProject()
	{
		CgpSmartKeypad.setKeypadProperty( true,
						0x00ffffff,
						0x00ffffff,
						0x009f5f1f,
						0x005f3f1f,
						0x00744e14,
						CgpSmartKeypad.LAYOUT_STANDARD
						);

		int iPersistentContext = CgpSystem.TEM.getContextID(0);
		gpclasses.system.CgpSystem.TM.setMinPeriodicInterval(100);
		Projects.MainDisplay.TagDB._ExternalCmdTag.addEventListener(CgpScript.loadScript("Projects/MainDisplay/ExternalCmdScript"), 0, iPersistentContext);
		Projects.MainDisplay.TagDB._CurPanelID.addEventListener(CgpScript.loadScript("gpclasses/system/CgpChangePanelScript"), 0, iPersistentContext);
		DateTime = new CgpDateTimeUpdateScript();
		DateTimeTimerContext = gpclasses.system.CgpSystem.TM.createContext(CgpThread.MAX_PRIORITY-1);
		gpclasses.system.CgpSystem.TM.addTimerScript(DateTime, 1000, DateTimeTimerContext);
		gpclasses.system.CgpSystem.baseWindow.setPanelHistory(32);
		gpclasses.system.CgpSystem.TEM.setAnyHDATags(false);

		gpclasses.system.CgpSystem.setShowSystemErrorWindow(true);

		char seps[] = {' ',' '};
		CgpLanguageMgr.languageMgr.setSeperators(seps);

		CgpFont fonts[] = {
			new CgpFont("PF Arial", CgpFont.PLAIN, (byte)16, (byte)16),
			new CgpFont("PF Arabic S", CgpFont.PLAIN, (byte)16, (byte)16),
		};
		CgpLanguageMgr.languageMgr.setApplicationLanguageFonts(fonts);



		CgpSecurityControl.securityControl = new CgpSecurityControl(
			-1,
			CgpSecurityControl.ACCESS_MIN_LEVEL,
			CgpGraphics.DRAW_SECURED_NOTHING,
			65502,
			CgpSecurityControl.UNSECURED_PANEL_ACTION_NOTHING,
			0,
			0,
			false,
			true,
			false);
		CgpSecurityControl.securityControl.init();
		byte [] securityKey = {50,57,48,52,50,98,97,51,98,55,48,97,54,51,97,52,52,50,97,50,56,98,100,48,101,50,52,100,57,57,100,98,101,56,51,52,102,51,56,102,};
		CgpSecurityDB.securityDB = new CgpSecurityDB(securityKey);
		CgpSecurityDB.securityDB.init("");
		if (CgpSystem.isPlatform(CgpSystem.HMI)) CgpHdaHistorian.setAutoFlushTime(0);

		// Protocol info
		CgpCommManager.setStringProperty("SINAMICS_V20", "Con_Protocol", "Modbus (RTU)");

		// Dialog Table Functions

		gpclasses.system.CgpSystem.globalCursor = new CgpCursor("MouseArrow.bmp", "MouseHand.bmp", 20, 25, CgpColor.makeTransparentColor(0x00333333));

		gpclasses.system.CgpSystem.globalCursor.setTimeout(30);
	}

	protected void appScriptRegistration(int context)
	{
		CgpAction Action1 = new CgpAction(new ActionScript1(), "Motor Frequency Setpoint");
		CgpPeriodicTrigger PeriodicAction1 = new CgpPeriodicTrigger(1000, CgpTimerManager.SCHEDULE_MONITOR, Action1, CgpSystem.TEM.getContextID(0));
		PeriodicAction1.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action2 = new CgpAction(new ActionScript2(), "EnterSettings");
		CgpDataChangeTrigger ConditionalAction2 = new CgpDataChangeTrigger(TagDB.SettingModePassConfirm, CgpDataChangeTrigger.WHEN_TRUE, context, Action2);
		ConditionalAction2.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action3 = new CgpAction(new ActionScript3(), "Fan Speed Eqation");
		CgpPeriodicTrigger PeriodicAction3 = new CgpPeriodicTrigger(1000, CgpTimerManager.SCHEDULE_FORCE_SLEEP, Action3, CgpSystem.TEM.getContextID(0));
		PeriodicAction3.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action4 = new CgpAction(new ActionScript4(), "Motor Frequency Setpoint");
		CgpPeriodicTrigger PeriodicAction4 = new CgpPeriodicTrigger(1000, CgpTimerManager.SCHEDULE_MONITOR, Action4, CgpSystem.TEM.getContextID(0));
		PeriodicAction4.onlyPublishTo(CgpSystem.HMI);

	}

	protected void openScripts()
	{
	}

	protected void shutdownProject()
	{
		TagDB.DPS_AlarmGroup.clean();
	}

	public String getRevisionNumber()
	{
		return "19";
	}

	public void setupProjectPersistents()
	{
		int iPersistentContext = CgpSystem.TEM.getContextID(0);
		CgpTag tagListUsedInWebGate[] =
		{
			TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1,
			TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2,
		};
		CgpTag tagListIgnoredByWebgate[] =
		{
			TagDB.SettingModePass,
			TagDB.SettingModePassConfirm,
			TagDB.FanCalibrationFactor,
			TagDB.FanCalibrationBase,
			TagDB.FanSpeedEqation,
			TagDB.SINAMICS_V20_VAR.ANALOG_IN_1,
			TagDB.SINAMICS_V20_VAR.HSW_SpeedSetpoint,
		};
		appScriptRegistration(iPersistentContext);

		CgpSystem.TEM.registerTagList(iPersistentContext, tagListUsedInWebGate, tagListIgnoredByWebgate);
	}
}
