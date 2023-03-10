package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.trends.*;
import gpclasses.macroobjects.*;

public class TagDB2
{
	public static Object classFactory3(int tagFieldIdentifier)
	{
		TagDB.SINAMICS_V20_VAR.WDOG_TIME = new CgpIntTag("SINAMICS_V20_VAR.WDOG_TIME", 1, TagDB.startNumber + 0, true, 0, true);
		TagDB.SINAMICS_V20_VAR.WDOG_TIME.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.INVERTER_VER = new CgpIntTag("SINAMICS_V20_VAR.INVERTER_VER", 1, TagDB.startNumber + 1, true, 0, true);
		TagDB.SINAMICS_V20_VAR.INVERTER_VER.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.WDOG_ACTION = new CgpIntTag("SINAMICS_V20_VAR.WDOG_ACTION", 1, TagDB.startNumber + 2, true, 0, true);
		TagDB.SINAMICS_V20_VAR.WDOG_ACTION.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.DRIVE_MODEL = new CgpIntTag("SINAMICS_V20_VAR.DRIVE_MODEL", 1, TagDB.startNumber + 3, true, 0, true);
		TagDB.SINAMICS_V20_VAR.DRIVE_MODEL.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.Reserved = new CgpIntTag("SINAMICS_V20_VAR.Reserved", 1, TagDB.startNumber + 4, true, 0, true);
		TagDB.SINAMICS_V20_VAR.Reserved.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.FREQ_OUTPUT = new CgpIntTag("SINAMICS_V20_VAR.FREQ_OUTPUT", 1, TagDB.startNumber + 5, true, 0, true);
		TagDB.SINAMICS_V20_VAR.FREQ_OUTPUT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.STOP_RUN = new CgpDiscreteTag("SINAMICS_V20_VAR.STOP_RUN", 1, TagDB.startNumber + 6, true, false, true);

		TagDB.SINAMICS_V20_VAR.PID_FEEDBACK = new CgpIntTag("SINAMICS_V20_VAR.PID_FEEDBACK", 1, TagDB.startNumber + 7, true, 0, true);
		TagDB.SINAMICS_V20_VAR.PID_FEEDBACK.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.F2_FAULT = new CgpIntTag("SINAMICS_V20_VAR.F2_FAULT", 1, TagDB.startNumber + 8, true, 0, true);
		TagDB.SINAMICS_V20_VAR.F2_FAULT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.F3_FAULT = new CgpIntTag("SINAMICS_V20_VAR.F3_FAULT", 1, TagDB.startNumber + 9, true, 0, true);
		TagDB.SINAMICS_V20_VAR.F3_FAULT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.WARNING = new CgpDiscreteTag("SINAMICS_V20_VAR.WARNING", 1, TagDB.startNumber + 10, true, false, true);

		TagDB.SINAMICS_V20_VAR.LAST_WARNING = new CgpIntTag("SINAMICS_V20_VAR.LAST_WARNING", 1, TagDB.startNumber + 11, true, 0, true);
		TagDB.SINAMICS_V20_VAR.LAST_WARNING.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.FREQ_REF = new CgpIntTag("SINAMICS_V20_VAR.FREQ_REF", 1, TagDB.startNumber + 12, true, 0, true);
		TagDB.SINAMICS_V20_VAR.FREQ_REF.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.RUN_ENABLE = new CgpDiscreteTag("SINAMICS_V20_VAR.RUN_ENABLE", 1, TagDB.startNumber + 13, true, false, true);

		TagDB.SINAMICS_V20_VAR.CMD_FWD_REV = new CgpDiscreteTag("SINAMICS_V20_VAR.CMD_FWD_REV", 1, TagDB.startNumber + 14, true, false, true);

		TagDB.SINAMICS_V20_VAR.CMD_START = new CgpDiscreteTag("SINAMICS_V20_VAR.CMD_START", 1, TagDB.startNumber + 15, true, false, true);

		TagDB.SINAMICS_V20_VAR.FAULT_ACK = new CgpDiscreteTag("SINAMICS_V20_VAR.FAULT_ACK", 1, TagDB.startNumber + 16, true, false, true);

		TagDB.SINAMICS_V20_VAR.PID_SETP_REF = new CgpIntTag("SINAMICS_V20_VAR.PID_SETP_REF", 1, TagDB.startNumber + 17, true, 0, true);
		TagDB.SINAMICS_V20_VAR.PID_SETP_REF.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.ENABLE_PID = new CgpDiscreteTag("SINAMICS_V20_VAR.ENABLE_PID", 1, TagDB.startNumber + 18, true, false, true);

		TagDB.SINAMICS_V20_VAR.CURRENT_LMT = new CgpIntTag("SINAMICS_V20_VAR.CURRENT_LMT", 1, TagDB.startNumber + 19, true, 0, true);
		TagDB.SINAMICS_V20_VAR.CURRENT_LMT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.ACCEL_TIME = new CgpIntTag("SINAMICS_V20_VAR.ACCEL_TIME", 1, TagDB.startNumber + 20, true, 0, true);
		TagDB.SINAMICS_V20_VAR.ACCEL_TIME.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.DECEL_TIME = new CgpIntTag("SINAMICS_V20_VAR.DECEL_TIME", 1, TagDB.startNumber + 21, true, 0, true);
		TagDB.SINAMICS_V20_VAR.DECEL_TIME.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.DIGITAL_OUT_1 = new CgpDiscreteTag("SINAMICS_V20_VAR.DIGITAL_OUT_1", 1, TagDB.startNumber + 22, true, false, true);

		TagDB.SINAMICS_V20_VAR.DIGITAL_OUT_2 = new CgpDiscreteTag("SINAMICS_V20_VAR.DIGITAL_OUT_2", 1, TagDB.startNumber + 23, true, false, true);

		TagDB.SINAMICS_V20_VAR.REF_FREQ = new CgpIntTag("SINAMICS_V20_VAR.REF_FREQ", 1, TagDB.startNumber + 24, true, 0, true);
		TagDB.SINAMICS_V20_VAR.REF_FREQ.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.PID_UP_LMT = new CgpIntTag("SINAMICS_V20_VAR.PID_UP_LMT", 1, TagDB.startNumber + 25, true, 0, true);
		TagDB.SINAMICS_V20_VAR.PID_UP_LMT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.PID_LO_LMT = new CgpIntTag("SINAMICS_V20_VAR.PID_LO_LMT", 1, TagDB.startNumber + 26, true, 0, true);
		TagDB.SINAMICS_V20_VAR.PID_LO_LMT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.P_GAIN = new CgpIntTag("SINAMICS_V20_VAR.P_GAIN", 1, TagDB.startNumber + 27, true, 0, true);
		TagDB.SINAMICS_V20_VAR.P_GAIN.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.I_GAIN = new CgpIntTag("SINAMICS_V20_VAR.I_GAIN", 1, TagDB.startNumber + 28, true, 0, true);
		TagDB.SINAMICS_V20_VAR.I_GAIN.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.D_GAIN = new CgpIntTag("SINAMICS_V20_VAR.D_GAIN", 1, TagDB.startNumber + 29, true, 0, true);
		TagDB.SINAMICS_V20_VAR.D_GAIN.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.FEEDBK_GAIN = new CgpIntTag("SINAMICS_V20_VAR.FEEDBK_GAIN", 1, TagDB.startNumber + 30, true, 0, true);
		TagDB.SINAMICS_V20_VAR.FEEDBK_GAIN.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.LOW_PASS = new CgpIntTag("SINAMICS_V20_VAR.LOW_PASS", 1, TagDB.startNumber + 31, true, 0, true);
		TagDB.SINAMICS_V20_VAR.LOW_PASS.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.SPEED = new CgpIntTag("SINAMICS_V20_VAR.SPEED", 1, TagDB.startNumber + 32, true, 0, true);
		TagDB.SINAMICS_V20_VAR.SPEED.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.CURRENT = new CgpIntTag("SINAMICS_V20_VAR.CURRENT", 1, TagDB.startNumber + 33, true, 0, true);
		TagDB.SINAMICS_V20_VAR.CURRENT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.TORQUE = new CgpIntTag("SINAMICS_V20_VAR.TORQUE", 1, TagDB.startNumber + 34, true, 0, true);
		TagDB.SINAMICS_V20_VAR.TORQUE.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.ACTUAL_PWR = new CgpIntTag("SINAMICS_V20_VAR.ACTUAL_PWR", 1, TagDB.startNumber + 35, true, 0, true);
		TagDB.SINAMICS_V20_VAR.ACTUAL_PWR.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.TOTAL_KWH = new CgpIntTag("SINAMICS_V20_VAR.TOTAL_KWH", 1, TagDB.startNumber + 36, true, 0, true);
		TagDB.SINAMICS_V20_VAR.TOTAL_KWH.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.DC_BUS_VOLTS = new CgpIntTag("SINAMICS_V20_VAR.DC_BUS_VOLTS", 1, TagDB.startNumber + 37, true, 0, true);
		TagDB.SINAMICS_V20_VAR.DC_BUS_VOLTS.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.REFERENCE = new CgpIntTag("SINAMICS_V20_VAR.REFERENCE", 1, TagDB.startNumber + 38, true, 0, true);
		TagDB.SINAMICS_V20_VAR.REFERENCE.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.RATED_PWR = new CgpIntTag("SINAMICS_V20_VAR.RATED_PWR", 1, TagDB.startNumber + 39, true, 0, true);
		TagDB.SINAMICS_V20_VAR.RATED_PWR.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.OUTPUT_VOLTS = new CgpIntTag("SINAMICS_V20_VAR.OUTPUT_VOLTS", 1, TagDB.startNumber + 40, true, 0, true);
		TagDB.SINAMICS_V20_VAR.OUTPUT_VOLTS.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.FWD_REV = new CgpDiscreteTag("SINAMICS_V20_VAR.FWD_REV", 1, TagDB.startNumber + 41, true, false, true);

		TagDB.SINAMICS_V20_VAR.AT_MAX_FREQ = new CgpDiscreteTag("SINAMICS_V20_VAR.AT_MAX_FREQ", 1, TagDB.startNumber + 42, true, false, true);

		TagDB.SINAMICS_V20_VAR.CONTROL_MODE = new CgpDiscreteTag("SINAMICS_V20_VAR.CONTROL_MODE", 1, TagDB.startNumber + 43, true, false, true);

		TagDB.SINAMICS_V20_VAR.ENABLED = new CgpDiscreteTag("SINAMICS_V20_VAR.ENABLED", 1, TagDB.startNumber + 44, true, false, true);

		TagDB.SINAMICS_V20_VAR.READY_TO_RUN = new CgpDiscreteTag("SINAMICS_V20_VAR.READY_TO_RUN", 1, TagDB.startNumber + 45, true, false, true);

		TagDB.SINAMICS_V20_VAR.ANALOG_IN_1 = new CgpIntTag("SINAMICS_V20_VAR.ANALOG_IN_1", 1, TagDB.startNumber + 46, true, 0, true);
		TagDB.SINAMICS_V20_VAR.ANALOG_IN_1.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.ANALOG_IN_2 = new CgpIntTag("SINAMICS_V20_VAR.ANALOG_IN_2", 1, TagDB.startNumber + 47, true, 0, true);
		TagDB.SINAMICS_V20_VAR.ANALOG_IN_2.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.ANALOG_OUT_1 = new CgpIntTag("SINAMICS_V20_VAR.ANALOG_OUT_1", 1, TagDB.startNumber + 48, true, 0, true);
		TagDB.SINAMICS_V20_VAR.ANALOG_OUT_1.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.FREQ_ACTUAL = new CgpIntTag("SINAMICS_V20_VAR.FREQ_ACTUAL", 1, TagDB.startNumber + 49, true, 0, true);
		TagDB.SINAMICS_V20_VAR.FREQ_ACTUAL.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.PID_SETP_OUT = new CgpIntTag("SINAMICS_V20_VAR.PID_SETP_OUT", 1, TagDB.startNumber + 50, true, 0, true);
		TagDB.SINAMICS_V20_VAR.PID_SETP_OUT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.PID_OUTPUT = new CgpIntTag("SINAMICS_V20_VAR.PID_OUTPUT", 1, TagDB.startNumber + 51, true, 0, true);
		TagDB.SINAMICS_V20_VAR.PID_OUTPUT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1 = new CgpDiscreteTag("SINAMICS_V20_VAR.DIGITAL_IN_1", 1, TagDB.startNumber + 52, true, false, true);
		String[] _Msg_1_193 =
		{
		"Fresh Filter Status Changed", 
				"\u0648\u0636\u0639\u06cc\u062a \u0641\u06cc\u0644\u062a\u0631 \u0647\u0648\u0627\u06cc \u062a\u0627\u0632\u0647 \u062a\u063a\u06cc\u06cc\u0631 \u06a9\u0631\u062f", 
				};
		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1.alarm = new CgpDiscreteAlarm(1, _Msg_1_193, -1, TagDB.DPS_AlarmGroup, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1.addEventListener(TagDB.DPS_AlarmGroup, TagDB.persistentContextObject);

		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2 = new CgpDiscreteTag("SINAMICS_V20_VAR.DIGITAL_IN_2", 1, TagDB.startNumber + 53, true, false, true);
		String[] _Msg_1_194 =
		{
		"Recycle Status Changed", 
				"\u0648\u0636\u0639\u06cc\u062a \u0641\u06cc\u0644\u062a\u0631 \u0647\u0648\u0627\u06cc \u0628\u0627\u0632\u06cc\u0627\u0641\u062a\u06cc \u062a\u063a\u06cc\u06cc\u0631 \u06a9\u0631\u062f", 
				};
		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2.alarm = new CgpDiscreteAlarm(1, _Msg_1_194, -1, TagDB.DPS_AlarmGroup, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2.addEventListener(TagDB.DPS_AlarmGroup, TagDB.persistentContextObject);

		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_3 = new CgpDiscreteTag("SINAMICS_V20_VAR.DIGITAL_IN_3", 1, TagDB.startNumber + 54, true, false, true);

		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_4 = new CgpDiscreteTag("SINAMICS_V20_VAR.DIGITAL_IN_4", 1, TagDB.startNumber + 55, true, false, true);

		TagDB.SINAMICS_V20_VAR.FAULT = new CgpDiscreteTag("SINAMICS_V20_VAR.FAULT", 1, TagDB.startNumber + 56, true, false, true);

		TagDB.SINAMICS_V20_VAR.LAST_FAULT = new CgpIntTag("SINAMICS_V20_VAR.LAST_FAULT", 1, TagDB.startNumber + 57, true, 0, true);
		TagDB.SINAMICS_V20_VAR.LAST_FAULT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.F1_FAULT = new CgpIntTag("SINAMICS_V20_VAR.F1_FAULT", 1, TagDB.startNumber + 58, true, 0, true);
		TagDB.SINAMICS_V20_VAR.F1_FAULT.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.STW_ControlWord = new CgpIntTag("SINAMICS_V20_VAR.STW_ControlWord", 1, TagDB.startNumber + 59, true, 0, true);
		TagDB.SINAMICS_V20_VAR.STW_ControlWord.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.HSW_SpeedSetpoint = new CgpIntTag("SINAMICS_V20_VAR.HSW_SpeedSetpoint", 1, TagDB.startNumber + 60, true, 0, true);
		TagDB.SINAMICS_V20_VAR.HSW_SpeedSetpoint.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.ZSW_StatusWord = new CgpIntTag("SINAMICS_V20_VAR.ZSW_StatusWord", 1, TagDB.startNumber + 61, true, 0, true);
		TagDB.SINAMICS_V20_VAR.ZSW_StatusWord.setMinMaxValues(-32768, 32767, true);

		TagDB.SINAMICS_V20_VAR.HIW_ActualSpeed = new CgpIntTag("SINAMICS_V20_VAR.HIW_ActualSpeed", 1, TagDB.startNumber + 62, true, 0, true);
		TagDB.SINAMICS_V20_VAR.HIW_ActualSpeed.setMinMaxValues(-2147483648, 2147483647, true);


		new RefTagDB();

		return null;
	}
}
