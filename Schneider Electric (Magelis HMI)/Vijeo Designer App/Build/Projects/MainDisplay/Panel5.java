package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.baseclasses.CgpReferenceTag;
import gpclasses.system.CgpRefTagFactory;
import gpclasses.util.misc.*;
import gpclasses.util.io.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.script.*;
import gpclasses.plugins.illuminatedSwitch.*;
import gpclasses.userScripts.*;
import gpclasses.alarms.*;
import java.text.Format;
import java.util.Vector;

public class Panel5 extends CgpPanel
{
	public Panel5XprSrv exprServer;

	public CgpNumericDisplay DateDisplay01;
	public CgpNumericDisplay TimeDisplay01;
	public CgpNumericDisplay NumericDisplay01;
	public CgpNumericDisplay NumericDisplay02;
	public CgpNumericDisplay StringDisplay01;
	public CgpNumericDisplay NumericDisplay03;
	public CgpNumericDisplay NumericDisplay04;
	public CgpNumericDisplay NumericDisplay05;
	CgpGraphicFile Image02;
	CgpGraphicFile Image03;
	CgpGraphicFile Image04;
	CgpGraphicFile Image07;
	CgpGraphicFile Image08;
	CgpGraphicFile Image09;
	CgpGraphicFile Image10;
	CgpGraphicFile Image06;
	public CgpSmartKeypadDec  decKeypad;
	private CgpMasterPanel masterPanel = null;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel5XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Settings";
	}
	public int getPanelID()
	{
		return 5;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		CgpFont textFont0 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)18, (byte)0);
		CgpFont textFont1 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)20, (byte)0);
		CgpFont textFont2 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)20, (byte)0);
		CgpFont textFont3 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont4 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont5 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont6 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont7 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)18, (byte)0);
		CgpFont textFont8 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)24, (byte)0);
		CgpFont textFont9 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)24, (byte)0);
		CgpFont textFont10 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)28, (byte)0);
		CgpFont textFont11 = new CgpFont("PF Arial S", CgpFont.BOLD, (byte)28, (byte)0);

		String textStrings[];
		CgpFont textFonts[];

		CgpStringDB  dbList1;
		textStrings = new String[9];
		textFonts = new CgpFont[9];
		textStrings[0] = "Fan Calibration Base";
		textStrings[1] = "Fan Calibration Factor";
		textStrings[2] = "Fan Speed Eqation";
		textStrings[3] = "Laminar Air Flow Reciculation System";
		textStrings[4] = "ACCEL TIME";
		textStrings[5] = "DECEL TIME";
		textStrings[6] = "REF FREQ";
		textStrings[7] = "\u0647\u0634\u062f\u0627\u0631: \u0628\u062f\u0648\u0646 \u0627\u06af\u0627\u0647\u06cc \u062a\u063a\u06cc\u06cc\u0631 \u062f\u0627\u062f\u0647 \u0646\u0634\u0648\u062f";
		textStrings[8] = "Wrong Config Can Damage Motor";
		textFonts[0] = textFont0;
		textFonts[1] = textFont0;
		textFonts[2] = textFont2;
		textFonts[3] = textFont5;
		textFonts[4] = textFont2;
		textFonts[5] = textFont2;
		textFonts[6] = textFont2;
		textFonts[7] = textFont10;
		textFonts[8] = textFont11;
		dbList1 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB  dbList2;
		textStrings = new String[9];
		textFonts = new CgpFont[9];
		textStrings[0] = "\u062b\u0627\u0628\u062a \u06a9\u0627\u0644\u06cc\u0628\u0631 \u0641\u0646";
		textStrings[1] = "\u0636\u0631\u06cc\u0628 \u06a9\u0627\u0644\u06cc\u0628\u0631 \u0641\u0646";
		textStrings[2] = "\u0645\u0639\u0627\u062f\u0644\u0647 \u062d\u0631\u06a9\u062a \u0641\u0646";
		textStrings[3] = " \u0633\u06cc\u0633\u062a\u0645 \u0628\u0627\u0632\u06cc\u0627\u0628\u06cc \u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627\u06cc \u0644\u0627\u0645\u06cc\u0646\u0627\u0631 ";
		textStrings[4] = "\u0632\u0645\u0627\u0646 \u0634\u062a\u0627\u0628";
		textStrings[5] = "\u0632\u0645\u0627\u0646 \u06a9\u0627\u0647\u0634";
		textStrings[6] = "\u0641\u0631\u06a9\u0627\u0646\u0633 \u0645\u0631\u062c\u0639";
		textStrings[7] = "\u0647\u0634\u062f\u0627\u0631: \u0628\u062f\u0648\u0646 \u0627\u06af\u0627\u0647\u06cc \u062a\u063a\u06cc\u06cc\u0631 \u062f\u0627\u062f\u0647 \u0646\u0634\u0648\u062f";
		textStrings[8] = "Wrong Config Can Damage Motor";
		textFonts[0] = textFont1;
		textFonts[1] = textFont1;
		textFonts[2] = textFont1;
		textFonts[3] = textFont7;
		textFonts[4] = textFont1;
		textFonts[5] = textFont1;
		textFonts[6] = textFont1;
		textFonts[7] = textFont10;
		textFonts[8] = textFont10;
		dbList2 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB stringDBList[] =
		{
			dbList1, 
			dbList2, 
		};

		decKeypad = new CgpSmartKeypadDec(panelContext, this);
		decKeypad.init();
		Image02 = new CgpGraphicFile
		(
			"Bitmap52.bmp",
			0,	// x1
			0,	// y1
			799,	// x2
			479,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);


		CgpMLText Text02 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			0,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			246,	// x1
			158,	// y1
			439,	// x2
			200,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text02.set3DColor(0x00ff0000);

		CgpMLText Text03 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			1,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			22,	// x1
			160,	// y1
			226,	// x2
			197,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text03.set3DColor(0x00ff0000);

		CgpMLText Text04 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			2,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			68,	// x1
			290,	// y1
			387,	// x2
			329,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text04.set3DColor(0x00ff0000);

		DateDisplay01 = new CgpNumericDisplay(7, 20, 106, 59, panelContext, this);
		DateDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		DateDisplay01.dateTimeFormat = CgpDate.YYYY_MM_DD;
		DateDisplay01.dateTimeListenVariable = TagDB._Day;
		CgpFont	fonts70[][] = {
			{ textFont3 },
			{ textFont4 },
			};
		DateDisplay01.fonts = fonts70;
		DateDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		DateDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		DateDisplay01.enableInput = false;
		DateDisplay01.barcode = false;
		DateDisplay01.frameColor = 0x006e726e;
		DateDisplay01.foreColor = 0x00b2b2b2;
		DateDisplay01.textColor = 0x00ffffff;
		DateDisplay01.text3DColor = 0x00000000;
		DateDisplay01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		DateDisplay01.changeColor = false;
		DateDisplay01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_BlankArea(0,0,0,0);
		DateDisplay01.drawObject = displayDraw0;
		DateDisplay01.alwaysDrawBackground = false;
		DateDisplay01.init();

		TimeDisplay01 = new CgpNumericDisplay(127, 20, 206, 59, panelContext, this);
		TimeDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_TIME;
		TimeDisplay01.dateTimeFormat = CgpDate.H24_MM_SS;
		TimeDisplay01.dateTimeListenVariable = TagDB._Seconds;
		CgpFont	fonts71[][] = {
			{ textFont5 },
			{ textFont6 },
			};
		TimeDisplay01.fonts = fonts71;
		TimeDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		TimeDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		TimeDisplay01.enableInput = false;
		TimeDisplay01.barcode = false;
		TimeDisplay01.frameColor = 0x006e726e;
		TimeDisplay01.foreColor = 0x00b2b2b2;
		TimeDisplay01.textColor = 0x00ffffff;
		TimeDisplay01.text3DColor = 0x00000000;
		TimeDisplay01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		TimeDisplay01.changeColor = false;
		TimeDisplay01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		TimeDisplay01.drawObject = displayDraw0;
		TimeDisplay01.alwaysDrawBackground = false;
		TimeDisplay01.init();

		CgpMLText Text01 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			3,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			247,	// x1
			1,	// y1
			549,	// x2
			40,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text01.set3DColor(0x00ff0000);

		Image03 = new CgpGraphicFile
		(
			"Bitmap275.bmp",
			19,	// x1
			194,	// y1
			230,	// x2
			288,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Image04 = new CgpGraphicFile
		(
			"Bitmap275.bmp",
			241,	// x1
			194,	// y1
			452,	// x2
			288,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Image07 = new CgpGraphicFile
		(
			"Bitmap278.bmp",
			44,	// x1
			321,	// y1
			412,	// x2
			379,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		NumericDisplay01 = new CgpNumericDisplay(259, 206, 437, 273, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		NumericDisplay01.variable = TagDB.FanCalibrationBase;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 5;
		NumericDisplay01.decimalPlaces = 0;
		NumericDisplay01.unitStrings = null;
		CgpFont	fonts55[][] = {
			{ textFont8 },
			{ textFont9 },
			};
		NumericDisplay01.fonts = fonts55;
		NumericDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay01.enableInput = true;
		NumericDisplay01.displayPopupKeypad = true;
		NumericDisplay01.keypad = decKeypad;
		NumericDisplay01.beepOnTouch = true;
		NumericDisplay01.barcode = false;
		NumericDisplay01.frameColor = 0x006e726e;
		NumericDisplay01.foreColor = 0x00b2b2b2;
		NumericDisplay01.textColor = 0x00ffffff;
		NumericDisplay01.text3DColor = 0x00000000;
		NumericDisplay01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay01.changeColor = false;
		NumericDisplay01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay01.drawObject = displayDraw0;
		NumericDisplay01.alwaysDrawBackground = true;
		NumericDisplay01.exprServer = exprServer;
		NumericDisplay01.useLocalMinMax  = true;
		NumericDisplay01.minExpr   = 1001;
		NumericDisplay01.maxExpr   = 1002;
		NumericDisplay01.init();

		NumericDisplay02 = new CgpNumericDisplay(38, 209, 213, 273, panelContext, this);
		NumericDisplay02.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		NumericDisplay02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		NumericDisplay02.variable = TagDB.FanCalibrationFactor;
		NumericDisplay02.zeroSuppress = true;
		NumericDisplay02.zeroDisplay = true;
		NumericDisplay02.displayDigits = 5;
		NumericDisplay02.decimalPlaces = 2;
		NumericDisplay02.unitStrings = null;
		NumericDisplay02.fonts = fonts55;
		NumericDisplay02.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay02.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay02.enableInput = true;
		NumericDisplay02.displayPopupKeypad = true;
		NumericDisplay02.keypad = decKeypad;
		NumericDisplay02.beepOnTouch = true;
		NumericDisplay02.barcode = false;
		NumericDisplay02.frameColor = 0x006e726e;
		NumericDisplay02.foreColor = 0x00b2b2b2;
		NumericDisplay02.textColor = 0x00ffffff;
		NumericDisplay02.text3DColor = 0x00000000;
		NumericDisplay02.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay02.changeColor = false;
		NumericDisplay02.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay02.drawObject = displayDraw0;
		NumericDisplay02.alwaysDrawBackground = true;
		NumericDisplay02.exprServer = exprServer;
		NumericDisplay02.useLocalMinMax  = true;
		NumericDisplay02.minExpr   = 1003;
		NumericDisplay02.maxExpr   = 1004;
		NumericDisplay02.init();

		StringDisplay01 = new CgpNumericDisplay(78, 330, 380, 369, panelContext, this);
		StringDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_STRING;
		StringDisplay01.variable = TagDB.FanSpeedEqation;
		StringDisplay01.stringLength = 26;
		CgpFont	fonts59[][] = {
			{ textFont5 },
			{ textFont7 },
			};
		StringDisplay01.fonts = fonts59;
		StringDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		StringDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		StringDisplay01.enableInput = false;
		StringDisplay01.barcode = false;
		StringDisplay01.frameColor = 0x006e726e;
		StringDisplay01.foreColor = 0x00b2b2b2;
		StringDisplay01.textColor = 0x00ffffff;
		StringDisplay01.text3DColor = 0x00000000;
		StringDisplay01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		StringDisplay01.changeColor = false;
		StringDisplay01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		StringDisplay01.drawObject = displayDraw0;
		StringDisplay01.alwaysDrawBackground = true;
		StringDisplay01.exprServer = exprServer;
		StringDisplay01.init();

		CgpMLText Text05 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			4,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			463,	// x1
			275,	// y1
			608,	// x2
			321,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text05.set3DColor(0x00ff0000);

		Image08 = new CgpGraphicFile
		(
			"Bitmap409.bmp",
			457,	// x1
			316,	// y1
			611,	// x2
			377,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		NumericDisplay03 = new CgpNumericDisplay(471, 327, 597, 366, panelContext, this);
		NumericDisplay03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay03.variable = TagDB.SINAMICS_V20_VAR.ACCEL_TIME;
		NumericDisplay03.zeroSuppress = true;
		NumericDisplay03.zeroDisplay = true;
		NumericDisplay03.displayDigits = 4;
		NumericDisplay03.decimalPlaces = 2;
		NumericDisplay03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay03.unitStrings = null;
		CgpFont	fonts84[][] = {
			{ textFont8 },
			{ textFont1 },
			};
		NumericDisplay03.fonts = fonts84;
		NumericDisplay03.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay03.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay03.enableInput = true;
		NumericDisplay03.displayPopupKeypad = true;
		NumericDisplay03.keypad = decKeypad;
		NumericDisplay03.beepOnTouch = true;
		NumericDisplay03.barcode = false;
		NumericDisplay03.frameColor = 0x006e726e;
		NumericDisplay03.foreColor = 0x00b2b2b2;
		NumericDisplay03.textColor = 0x00ffffff;
		NumericDisplay03.text3DColor = 0x00000000;
		NumericDisplay03.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay03.changeColor = false;
		NumericDisplay03.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay03.drawObject = displayDraw0;
		NumericDisplay03.alwaysDrawBackground = true;
		NumericDisplay03.exprServer = exprServer;
		NumericDisplay03.init();

		CgpMLText Text06 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			5,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			626,	// x1
			276,	// y1
			771,	// x2
			322,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text06.set3DColor(0x00ff0000);

		Image09 = new CgpGraphicFile
		(
			"Bitmap409.bmp",
			620,	// x1
			317,	// y1
			774,	// x2
			378,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		NumericDisplay04 = new CgpNumericDisplay(635, 326, 761, 365, panelContext, this);
		NumericDisplay04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay04.variable = TagDB.SINAMICS_V20_VAR.DECEL_TIME;
		NumericDisplay04.zeroSuppress = true;
		NumericDisplay04.zeroDisplay = true;
		NumericDisplay04.displayDigits = 4;
		NumericDisplay04.decimalPlaces = 2;
		NumericDisplay04.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay04.unitStrings = null;
		NumericDisplay04.fonts = fonts84;
		NumericDisplay04.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay04.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay04.enableInput = true;
		NumericDisplay04.displayPopupKeypad = true;
		NumericDisplay04.keypad = decKeypad;
		NumericDisplay04.beepOnTouch = true;
		NumericDisplay04.barcode = false;
		NumericDisplay04.frameColor = 0x006e726e;
		NumericDisplay04.foreColor = 0x00b2b2b2;
		NumericDisplay04.textColor = 0x00ffffff;
		NumericDisplay04.text3DColor = 0x00000000;
		NumericDisplay04.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay04.changeColor = false;
		NumericDisplay04.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay04.drawObject = displayDraw0;
		NumericDisplay04.alwaysDrawBackground = true;
		NumericDisplay04.exprServer = exprServer;
		NumericDisplay04.init();

		CgpMLText Text07 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			6,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			543,	// x1
			170,	// y1
			688,	// x2
			216,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text07.set3DColor(0x00ff0000);

		Image10 = new CgpGraphicFile
		(
			"Bitmap409.bmp",
			537,	// x1
			211,	// y1
			691,	// x2
			272,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		NumericDisplay05 = new CgpNumericDisplay(551, 222, 677, 261, panelContext, this);
		NumericDisplay05.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay05.variable = TagDB.SINAMICS_V20_VAR.REF_FREQ;
		NumericDisplay05.zeroSuppress = true;
		NumericDisplay05.zeroDisplay = true;
		NumericDisplay05.displayDigits = 3;
		NumericDisplay05.decimalPlaces = 2;
		NumericDisplay05.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay05.unitStrings = null;
		NumericDisplay05.fonts = fonts84;
		NumericDisplay05.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay05.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay05.enableInput = true;
		NumericDisplay05.displayPopupKeypad = true;
		NumericDisplay05.keypad = decKeypad;
		NumericDisplay05.beepOnTouch = true;
		NumericDisplay05.barcode = false;
		NumericDisplay05.frameColor = 0x006e726e;
		NumericDisplay05.foreColor = 0x00b2b2b2;
		NumericDisplay05.textColor = 0x00ffffff;
		NumericDisplay05.text3DColor = 0x00000000;
		NumericDisplay05.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay05.changeColor = false;
		NumericDisplay05.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay05.drawObject = displayDraw0;
		NumericDisplay05.alwaysDrawBackground = true;
		NumericDisplay05.exprServer = exprServer;
		NumericDisplay05.init();

		CgpMLText Text08 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			7,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x000000ff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			184,	// x1
			105,	// y1
			610,	// x2
			155,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text08.set3DColor(0x00ff0000);

		CgpMLText Text09 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			8,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x000000ff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			48,	// x1
			72,	// y1
			730,	// x2
			116,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text09.set3DColor(0x00ff0000);

		Image06 = new CgpGraphicFile
		(
			"Bitmap240.bmp",
			59,	// x1
			399,	// y1
			132,	// x2
			472,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);
		((CgpWindow)owner).drawBack();

		CgpTouchAnimation TouchText01 = new CgpExprTouchAnimation
		(
			Text01,	// object name
			CgpTouchAnimation.TOUCH_BEEP,
			exprServer,
			1000,	// expindx
			-1,	// expindx
			-1	// expindx
		);

		CgpTouchAnimation TouchImage06 = new CgpExprTouchAnimation
		(
			Image06,	// object name
			CgpTouchAnimation.TOUCH_BEEP,
			exprServer,
			1005,	// expindx
			-1,	// expindx
			-1	// expindx
		);

		CgpMLText MLTextList[] =
		{
			Text02,
			Text03,
			Text04,
			Text01,
			Text05,
			Text06,
			Text07,
			Text08,
			Text09,
		};
		CgpFontAnimation fontMLText = new CgpFontAnimation(TagDB._UserApplicationLanguage, MLTextList,0);
		TagDB._UserApplicationLanguage.addEventListener(fontMLText, 0, panelContext);
		TagDB._Day.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB.FanCalibrationBase.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.FanCalibrationFactor.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.FanSpeedEqation.addEventListener(StringDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(StringDisplay01, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.ACCEL_TIME.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.DECEL_TIME.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay05, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.REF_FREQ.addEventListener(NumericDisplay05, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[25];
		zOrderList[0] = Text02;
		zOrderList[1] = Text03;
		zOrderList[2] = Text04;
		zOrderList[3] = DateDisplay01;
		zOrderList[4] = TimeDisplay01;
		zOrderList[5] = Text01;
		zOrderList[6] = Image03;
		zOrderList[7] = Image04;
		zOrderList[8] = Image07;
		zOrderList[9] = NumericDisplay01;
		zOrderList[10] = NumericDisplay02;
		zOrderList[11] = StringDisplay01;
		zOrderList[12] = Text05;
		zOrderList[13] = Image08;
		zOrderList[14] = NumericDisplay03;
		zOrderList[15] = Text06;
		zOrderList[16] = Image09;
		zOrderList[17] = NumericDisplay04;
		zOrderList[18] = Text07;
		zOrderList[19] = Image10;
		zOrderList[20] = NumericDisplay05;
		zOrderList[21] = Text08;
		zOrderList[22] = Text09;
		zOrderList[23] = Image06;
		zOrderList[24] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			TouchImage06,
			NumericDisplay05,
			NumericDisplay04,
			NumericDisplay03,
			NumericDisplay02,
			NumericDisplay01,
			TouchText01,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB._Day);
		tagListVector.add(TagDB._Seconds);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.ACCEL_TIME);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.DECEL_TIME);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.REF_FREQ);
		tagListVector.add(TagDB.FanCalibrationFactor);
		tagListVector.add(TagDB.FanCalibrationBase);
		tagListVector.add(TagDB.FanSpeedEqation);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		Image02.clean();
		Image03.clean();
		Image04.clean();
		Image07.clean();
		Image08.clean();
		Image09.clean();
		Image10.clean();
		Image06.clean();

		NumericDisplay05.shutdown();

		NumericDisplay04.shutdown();

		NumericDisplay03.shutdown();

		StringDisplay01.shutdown();

		NumericDisplay02.shutdown();

		NumericDisplay01.shutdown();

		TimeDisplay01.shutdown();

		DateDisplay01.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Image02
		_g.drawImage(Image02, 0 + _dx, 0 + _dy);
		DateDisplay01.drawBackground(_g);

		TimeDisplay01.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
