package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.macroobjects.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.dialogTable.*;
import gpclasses.plugins.remoteTargetAlarms.*;

import gpclasses.plugins.illuminatedSwitch.*;

import java.util.Hashtable;

import Projects.ConfigurationMenu.ConfigTagDB;

public class TagDB extends ConfigTagDB
{
	public static int startNumber = CgpTagDB.NUM_SYSTEM_TAGS;
	public static Integer persistentContextObject = new Integer(CgpTagEventManager.getContextID(0));
	private static byte errorHandle = (byte)0;

	public static CgpIntTag SettingModePass;
	public static CgpDiscreteTag SettingModePassConfirm;
	public static CgpFloatTag FanCalibrationFactor;
	public static CgpFloatTag FanCalibrationBase;
	public static CgpStringTag FanSpeedEqation;
	public static _Folder1_1 SINAMICS_V20_VAR;

	// Dialog table members decalration

	public static CgpBaseAlarmGroup DPS_AlarmGroup;


	static void StaticInit()
	{
		errorHandle = CgpSystem.configureErrorHandling("UserInputMgr.txt");

		CgpHdaHistorian.setTopOfDay(0);

		CgpAlarmBuffer.setTrackUsersACK(false);

		CgpAlarmDynamicData.setDynamicMsgLength(160);

		String[] DPS_AlarmGroupTypeMsgs_0 = { "LOLO","LOLO", };
		String[] DPS_AlarmGroupTypeMsgs_1 = { "LO","LO", };
		String[] DPS_AlarmGroupTypeMsgs_2 = { "NRML","NRML", };
		String[] DPS_AlarmGroupTypeMsgs_3 = { "HI","HI", };
		String[] DPS_AlarmGroupTypeMsgs_4 = { "HIHI","HIHI", };
		String[] DPS_AlarmGroupTypeMsgs_5 = { "MIN%","MIN%", };
		String[] DPS_AlarmGroupTypeMsgs_6 = { "MAJ%","MAJ%", };
		String[] DPS_AlarmGroupTypeMsgs_7 = { "MIND","MIND", };
		String[] DPS_AlarmGroupTypeMsgs_8 = { "MAJD","MAJD", };
		String[] DPS_AlarmGroupStateMsgs_0 = { "Filter Changed","فیلتر نیاز به تغویض دارد", };
		String[] DPS_AlarmGroupStateMsgs_1 = { "ACK","ACK", };
		String[] DPS_AlarmGroupStateMsgs_2 = { "Change Filter !","فیلتر تعویض شد", };
		String[] DPS_AlarmGroupStateMsgs_3 = { "","", };
		String[] DPS_AlarmGroupLabels	= { "AlarmGroup1","AlarmGroup1", };

		DPS_AlarmGroup = CgpAlarmGroup.createAlarmGroup(1, 2, 10, 10, false, IgpAlarmGroupConstants.OPTIONAL_ACK_MODE);
		DPS_AlarmGroup.setGroupName("DPS_AlarmGroup");
		DPS_AlarmGroup.setTypeMessage(
				DPS_AlarmGroupTypeMsgs_0,
				DPS_AlarmGroupTypeMsgs_1,
				DPS_AlarmGroupTypeMsgs_2,
				DPS_AlarmGroupTypeMsgs_3,
				DPS_AlarmGroupTypeMsgs_4,
				DPS_AlarmGroupTypeMsgs_5,
				DPS_AlarmGroupTypeMsgs_6,
				DPS_AlarmGroupTypeMsgs_7,
				DPS_AlarmGroupTypeMsgs_8);
		DPS_AlarmGroup.setStateMessage(
				DPS_AlarmGroupStateMsgs_0,
				DPS_AlarmGroupStateMsgs_1,
				DPS_AlarmGroupStateMsgs_2,
				DPS_AlarmGroupStateMsgs_3);
		DPS_AlarmGroup.setGroupLabels( DPS_AlarmGroupLabels );

		DPS_AlarmGroup.setSharing(IgpAlarmEventDsConstants.SHARING_NONE);


		CgpExpressionServer.expressionServer = new XprSrv();
	}

	public TagDB()
	{
		super(68);
		//buildClassFactory();
		//super.buildClassFactory();
	}

	public void instantiate(int tagId)
	{
		classFactory(tagId);
	}

	public void buildClassFactory()
	{
		CgpSystem.buildClassFactory(getClass(), null, startNumber);
	}


	public static Object classFactory(int tagFieldIdentifier)
	{
		return TagDB0.classFactory1(tagFieldIdentifier);
	}

}
