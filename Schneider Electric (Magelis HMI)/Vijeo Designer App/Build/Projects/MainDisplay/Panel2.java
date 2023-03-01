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

public class Panel2 extends CgpPanel
{
	public Switch_0003 Switch01;
	public Switch_0004 Switch02;
	public CgpNumericDisplay DateDisplay01;
	public CgpNumericDisplay TimeDisplay01;
	public Switch_0005 Switch04;
	public CgpNumericDisplay NumericDisplay02;
	public CgpNumericDisplay NumericDisplay01;
	public CgpNumericDisplay NumericDisplay03;
	public CgpNumericDisplay NumericDisplay04;
	public CgpNumericDisplay NumericDisplay05;
	public CgpNumericDisplay NumericDisplay06;
	public CgpNumericDisplay NumericDisplay07;
	public CgpNumericDisplay NumericDisplay08;
	public Switch_0005 Switch05;
	CgpGraphicFile Image02;
	CgpGraphicFile Image01;
	private CgpMasterPanel masterPanel = null;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Fan";
	}
	public int getPanelID()
	{
		return 2;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		CgpFont textFont0 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont1 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)12, (byte)0);
		CgpFont textFont2 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)11, (byte)0);
		CgpFont textFont3 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont4 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)18, (byte)0);
		CgpFont textFont5 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont6 = new CgpFont("PF Arial", CgpFont.PLAIN, (byte)16, (byte)0);
		CgpFont textFont7 = new CgpFont("PF Arabic S", CgpFont.PLAIN, (byte)16, (byte)0);

		String textStrings[];
		CgpFont textFonts[];

		CgpStringDB  dbList1;
		textStrings = new String[9];
		textFonts = new CgpFont[9];
		textStrings[0] = "Laminar Air Flow Reciculation System";
		textStrings[1] = "Fan Current\n(A)";
		textStrings[2] = "Fan Freq.\n(Hz)";
		textStrings[3] = "Fan Voltage\n(V)";
		textStrings[4] = "Fan Speed\n(RPM)";
		textStrings[5] = "Fan Power\n(kW)";
		textStrings[6] = "Total Power\n(kWh)";
		textStrings[7] = "DC Bus\n(V)";
		textStrings[8] = "Fan Torque\n(Nm)";
		textFonts[0] = textFont1;
		textFonts[1] = textFont1;
		textFonts[2] = textFont1;
		textFonts[3] = textFont1;
		textFonts[4] = textFont1;
		textFonts[5] = textFont1;
		textFonts[6] = textFont1;
		textFonts[7] = textFont1;
		textFonts[8] = textFont1;
		dbList1 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB  dbList2;
		textStrings = new String[9];
		textFonts = new CgpFont[9];
		textStrings[0] = " \u0633\u06cc\u0633\u062a\u0645 \u0628\u0627\u0632\u06cc\u0627\u0628\u06cc \u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627\u06cc \u0644\u0627\u0645\u06cc\u0646\u0627\u0631 ";
		textStrings[1] = "\u062c\u0631\u06cc\u0627\u0646 \u0641\u0646\n(A)";
		textStrings[2] = "\u0641\u0631\u06a9\u0627\u0646\u0633 \u0641\u0646\n(Hz)";
		textStrings[3] = "\u0648\u0644\u062a\u0627\u0698 \u0641\u0646\n(V)";
		textStrings[4] = "\u0633\u0631\u0639\u062a \u0641\u0646\n(RPM)";
		textStrings[5] = "\u062a\u0648\u0627\u0646 \u0641\u0646\n(kW)";
		textStrings[6] = "\u062a\u0648\u0627\u0646 \u062a\u062c\u0645\u06cc\u0639\u06cc\n(kWh)";
		textStrings[7] = "\u0648\u0644\u062a\u0627\u0698 \u0645\u0633\u062a\u0642\u06cc\u0645 \u0641\u0646\n(V-DC)";
		textStrings[8] = "\u06af\u0634\u062a\u0627\u0648\u0631 \u0641\u0646\n(Nm)";
		textFonts[0] = textFont4;
		textFonts[1] = textFont5;
		textFonts[2] = textFont5;
		textFonts[3] = textFont5;
		textFonts[4] = textFont5;
		textFonts[5] = textFont5;
		textFonts[6] = textFont5;
		textFonts[7] = textFont5;
		textFonts[8] = textFont5;
		dbList2 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB stringDBList[] =
		{
			dbList1, 
			dbList2, 
		};

		Image02 = new CgpGraphicFile
		(
			"Bitmap16.bmp",
			0,	// x1
			0,	// y1
			799,	// x2
			479,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Switch01 = new Switch_0003(20, 20, 99, 59, panelContext, this);
		Switch01.frameClr = 0x006e726e;
		Switch01.foreClr = 0x00c3bfc3;
		Switch01.backClr = 0x00000000;
		Switch01.pattern = 1;

		CgpFont	fonts1[][];
		String	labels1[][];
		fonts1 = new CgpFont[2][1];
		labels1 = new String[2][1];

		labels1[0][0] = "English";
		fonts1[0][0] = textFont0;
		labels1[1][0] = "\u0627\u0646\u06af\u0644\u06cc\u0633\u06cc";
		fonts1[1][0] = textFont0;

		Switch01.buzzer = true;

		Switch01.switchFonts = fonts1;
		Switch01.labels = labels1;

		int intArray0[] = {0x00ffffff, };
		Switch01.labelClr = intArray0;
		int intArray1[] = {0x00000000, };
		Switch01.label3DClr = intArray1;
		Switch01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch01.userLangID0 = 1;
		Switch01.alwaysDrawBackground = false;

		Switch01.init();
		Switch02 = new Switch_0004(100, 20, 179, 59, panelContext, this);
		Switch02.frameClr = 0x006e726e;
		Switch02.foreClr = 0x00c3bfc3;
		Switch02.backClr = 0x00000000;
		Switch02.pattern = 1;

		CgpFont	fonts2[][];
		String	labels2[][];
		fonts2 = new CgpFont[2][1];
		labels2 = new String[2][1];

		labels2[0][0] = "Persian";
		fonts2[0][0] = textFont0;
		labels2[1][0] = "\u0641\u0627\u0631\u0633\u06cc";
		fonts2[1][0] = textFont0;

		Switch02.buzzer = true;

		Switch02.switchFonts = fonts2;
		Switch02.labels = labels2;

		Switch02.labelClr = intArray0;
		Switch02.label3DClr = intArray1;
		Switch02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch02.userLangID0 = 2;
		Switch02.alwaysDrawBackground = false;

		Switch02.init();

		DateDisplay01 = new CgpNumericDisplay(620, 20, 699, 59, panelContext, this);
		DateDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		DateDisplay01.dateTimeFormat = CgpDate.YYYY_MM_DD;
		DateDisplay01.dateTimeListenVariable = TagDB._Day;
		CgpFont	fonts6[][] = {
			{ textFont1 },
			{ textFont2 },
			};
		DateDisplay01.fonts = fonts6;
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

		TimeDisplay01 = new CgpNumericDisplay(700, 20, 779, 59, panelContext, this);
		TimeDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_TIME;
		TimeDisplay01.dateTimeFormat = CgpDate.H24_MM_SS;
		TimeDisplay01.dateTimeListenVariable = TagDB._Seconds;
		CgpFont	fonts7[][] = {
			{ textFont3 },
			{ textFont0 },
			};
		TimeDisplay01.fonts = fonts7;
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
			0,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			260,	// x1
			0,	// y1
			539,	// x2
			39,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text01.set3DColor(0x00ff0000);
		Image01 = new CgpGraphicFile
		(
			"Bitmap17.bmp",
			0,	// x1
			0,	// y1
			99,	// x2
			79,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Switch04 = new Switch_0005(200, 400, 319, 459, panelContext, this);
		Switch04.frameClr = 0x006e726e;
		Switch04.foreClr = 0x00c3bfc3;
		Switch04.backClr = 0x00000000;
		Switch04.pattern = 1;

		CgpFont	fonts22[][];
		String	labels22[][];
		fonts22 = new CgpFont[2][1];
		labels22 = new String[2][1];

		labels22[0][0] = "Logs";
		fonts22[0][0] = textFont0;
		labels22[1][0] = "\u06af\u0632\u0627\u0631\u0634\u0627\u062a";
		fonts22[1][0] = textFont0;

		Switch04.buzzer = true;

		Switch04.switchFonts = fonts22;
		Switch04.labels = labels22;

		Switch04.labelClr = intArray0;
		Switch04.label3DClr = intArray1;
		Switch04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch04.panelChange0 = 3;
		Switch04.alwaysDrawBackground = false;

		Switch04.init();

		CgpMLText Text02 = new CgpMLText
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
			280,	// x1
			100,	// y1
			379,	// x2
			139,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text02.set3DColor(0x00ff0000);

		NumericDisplay02 = new CgpNumericDisplay(280, 160, 379, 199, panelContext, this);
		NumericDisplay02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay02.variable = TagDB.SINAMICS_V20_VAR.CURRENT;
		NumericDisplay02.zeroSuppress = true;
		NumericDisplay02.zeroDisplay = true;
		NumericDisplay02.displayDigits = 3;
		NumericDisplay02.decimalPlaces = 2;
		NumericDisplay02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay02.unitStrings = null;
		CgpFont	fonts33[][] = {
			{ textFont6 },
			{ textFont7 },
			};
		NumericDisplay02.fonts = fonts33;
		NumericDisplay02.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay02.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay02.enableInput = false;
		NumericDisplay02.barcode = false;
		NumericDisplay02.frameColor = 0x006e726e;
		NumericDisplay02.foreColor = 0x00b2b2b2;
		NumericDisplay02.textColor = 0x00ffffff;
		NumericDisplay02.text3DColor = 0x00000000;
		NumericDisplay02.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay02.changeColor = false;
		NumericDisplay02.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw1 = new D_DD00001(1,1,1,1);
		NumericDisplay02.drawObject = displayDraw1;
		NumericDisplay02.alwaysDrawBackground = false;
		NumericDisplay02.init();

		CgpMLText Text06 = new CgpMLText
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
			120,	// x1
			100,	// y1
			219,	// x2
			139,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text06.set3DColor(0x00ff0000);

		NumericDisplay01 = new CgpNumericDisplay(120, 160, 219, 199, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.SINAMICS_V20_VAR.FREQ_OUTPUT;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 3;
		NumericDisplay01.decimalPlaces = 2;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = null;
		NumericDisplay01.fonts = fonts33;
		NumericDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay01.enableInput = false;
		NumericDisplay01.barcode = false;
		NumericDisplay01.frameColor = 0x006e726e;
		NumericDisplay01.foreColor = 0x00b2b2b2;
		NumericDisplay01.textColor = 0x00ffffff;
		NumericDisplay01.text3DColor = 0x00000000;
		NumericDisplay01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay01.changeColor = false;
		NumericDisplay01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay01.drawObject = displayDraw1;
		NumericDisplay01.alwaysDrawBackground = false;
		NumericDisplay01.init();

		CgpMLText Text03 = new CgpMLText
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
			440,	// x1
			100,	// y1
			539,	// x2
			139,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text03.set3DColor(0x00ff0000);

		NumericDisplay03 = new CgpNumericDisplay(440, 160, 539, 199, panelContext, this);
		NumericDisplay03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay03.variable = TagDB.SINAMICS_V20_VAR.OUTPUT_VOLTS;
		NumericDisplay03.zeroSuppress = true;
		NumericDisplay03.zeroDisplay = true;
		NumericDisplay03.displayDigits = 5;
		NumericDisplay03.decimalPlaces = 0;
		NumericDisplay03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay03.unitStrings = null;
		NumericDisplay03.fonts = fonts33;
		NumericDisplay03.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay03.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay03.enableInput = false;
		NumericDisplay03.barcode = false;
		NumericDisplay03.frameColor = 0x006e726e;
		NumericDisplay03.foreColor = 0x00b2b2b2;
		NumericDisplay03.textColor = 0x00ffffff;
		NumericDisplay03.text3DColor = 0x00000000;
		NumericDisplay03.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay03.changeColor = false;
		NumericDisplay03.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay03.drawObject = displayDraw1;
		NumericDisplay03.alwaysDrawBackground = false;
		NumericDisplay03.init();

		CgpMLText Text04 = new CgpMLText
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
			600,	// x1
			100,	// y1
			699,	// x2
			139,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text04.set3DColor(0x00ff0000);

		NumericDisplay04 = new CgpNumericDisplay(600, 160, 699, 199, panelContext, this);
		NumericDisplay04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay04.variable = TagDB.SINAMICS_V20_VAR.SPEED;
		NumericDisplay04.zeroSuppress = true;
		NumericDisplay04.zeroDisplay = true;
		NumericDisplay04.displayDigits = 5;
		NumericDisplay04.decimalPlaces = 0;
		NumericDisplay04.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay04.unitStrings = null;
		NumericDisplay04.fonts = fonts33;
		NumericDisplay04.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay04.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay04.enableInput = false;
		NumericDisplay04.barcode = false;
		NumericDisplay04.frameColor = 0x006e726e;
		NumericDisplay04.foreColor = 0x00b2b2b2;
		NumericDisplay04.textColor = 0x00ffffff;
		NumericDisplay04.text3DColor = 0x00000000;
		NumericDisplay04.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay04.changeColor = false;
		NumericDisplay04.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay04.drawObject = displayDraw1;
		NumericDisplay04.alwaysDrawBackground = false;
		NumericDisplay04.init();

		CgpMLText Text05 = new CgpMLText
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
			120,	// x1
			240,	// y1
			219,	// x2
			279,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text05.set3DColor(0x00ff0000);

		NumericDisplay05 = new CgpNumericDisplay(120, 300, 219, 339, panelContext, this);
		NumericDisplay05.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay05.variable = TagDB.SINAMICS_V20_VAR.RATED_PWR;
		NumericDisplay05.zeroSuppress = true;
		NumericDisplay05.zeroDisplay = true;
		NumericDisplay05.displayDigits = 3;
		NumericDisplay05.decimalPlaces = 2;
		NumericDisplay05.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay05.unitStrings = null;
		NumericDisplay05.fonts = fonts33;
		NumericDisplay05.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay05.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay05.enableInput = false;
		NumericDisplay05.barcode = false;
		NumericDisplay05.frameColor = 0x006e726e;
		NumericDisplay05.foreColor = 0x00b2b2b2;
		NumericDisplay05.textColor = 0x00ffffff;
		NumericDisplay05.text3DColor = 0x00000000;
		NumericDisplay05.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay05.changeColor = false;
		NumericDisplay05.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay05.drawObject = displayDraw1;
		NumericDisplay05.alwaysDrawBackground = false;
		NumericDisplay05.init();

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
			280,	// x1
			240,	// y1
			379,	// x2
			279,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text07.set3DColor(0x00ff0000);

		NumericDisplay06 = new CgpNumericDisplay(280, 300, 379, 339, panelContext, this);
		NumericDisplay06.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay06.variable = TagDB.SINAMICS_V20_VAR.TOTAL_KWH;
		NumericDisplay06.zeroSuppress = true;
		NumericDisplay06.zeroDisplay = true;
		NumericDisplay06.displayDigits = 5;
		NumericDisplay06.decimalPlaces = 0;
		NumericDisplay06.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay06.unitStrings = null;
		NumericDisplay06.fonts = fonts33;
		NumericDisplay06.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay06.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay06.enableInput = false;
		NumericDisplay06.barcode = false;
		NumericDisplay06.frameColor = 0x006e726e;
		NumericDisplay06.foreColor = 0x00b2b2b2;
		NumericDisplay06.textColor = 0x00ffffff;
		NumericDisplay06.text3DColor = 0x00000000;
		NumericDisplay06.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay06.changeColor = false;
		NumericDisplay06.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay06.drawObject = displayDraw1;
		NumericDisplay06.alwaysDrawBackground = false;
		NumericDisplay06.init();

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
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			440,	// x1
			240,	// y1
			539,	// x2
			279,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text08.set3DColor(0x00ff0000);

		NumericDisplay07 = new CgpNumericDisplay(440, 300, 539, 339, panelContext, this);
		NumericDisplay07.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay07.variable = TagDB.SINAMICS_V20_VAR.DC_BUS_VOLTS;
		NumericDisplay07.zeroSuppress = true;
		NumericDisplay07.zeroDisplay = true;
		NumericDisplay07.displayDigits = 5;
		NumericDisplay07.decimalPlaces = 0;
		NumericDisplay07.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay07.unitStrings = null;
		NumericDisplay07.fonts = fonts33;
		NumericDisplay07.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay07.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay07.enableInput = false;
		NumericDisplay07.barcode = false;
		NumericDisplay07.frameColor = 0x006e726e;
		NumericDisplay07.foreColor = 0x00b2b2b2;
		NumericDisplay07.textColor = 0x00ffffff;
		NumericDisplay07.text3DColor = 0x00000000;
		NumericDisplay07.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay07.changeColor = false;
		NumericDisplay07.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay07.drawObject = displayDraw1;
		NumericDisplay07.alwaysDrawBackground = false;
		NumericDisplay07.init();

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
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			600,	// x1
			240,	// y1
			699,	// x2
			279,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text09.set3DColor(0x00ff0000);

		NumericDisplay08 = new CgpNumericDisplay(600, 300, 699, 339, panelContext, this);
		NumericDisplay08.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay08.variable = TagDB.SINAMICS_V20_VAR.TORQUE;
		NumericDisplay08.zeroSuppress = true;
		NumericDisplay08.zeroDisplay = true;
		NumericDisplay08.displayDigits = 3;
		NumericDisplay08.decimalPlaces = 2;
		NumericDisplay08.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay08.unitStrings = null;
		NumericDisplay08.fonts = fonts33;
		NumericDisplay08.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay08.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay08.enableInput = false;
		NumericDisplay08.barcode = false;
		NumericDisplay08.frameColor = 0x006e726e;
		NumericDisplay08.foreColor = 0x00b2b2b2;
		NumericDisplay08.textColor = 0x00ffffff;
		NumericDisplay08.text3DColor = 0x00000000;
		NumericDisplay08.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay08.changeColor = false;
		NumericDisplay08.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay08.drawObject = displayDraw1;
		NumericDisplay08.alwaysDrawBackground = false;
		NumericDisplay08.init();
		Switch05 = new Switch_0005(40, 400, 159, 459, panelContext, this);
		Switch05.frameClr = 0x006e726e;
		Switch05.foreClr = 0x00c3bfc3;
		Switch05.backClr = 0x00000000;
		Switch05.pattern = 1;

		CgpFont	fonts49[][];
		String	labels49[][];
		fonts49 = new CgpFont[2][1];
		labels49 = new String[2][1];

		labels49[0][0] = "Home";
		fonts49[0][0] = textFont0;
		labels49[1][0] = "\u0635\u0641\u062d\u0647 \u0627\u0635\u0644\u06cc";
		fonts49[1][0] = textFont0;

		Switch05.buzzer = true;

		Switch05.switchFonts = fonts49;
		Switch05.labels = labels49;

		Switch05.labelClr = intArray0;
		Switch05.label3DClr = intArray1;
		Switch05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch05.panelChange0 = 1;
		Switch05.alwaysDrawBackground = false;

		Switch05.init();
		((CgpWindow)owner).drawBack();

		CgpMLText MLTextList[] =
		{
			Text01,
			Text02,
			Text06,
			Text03,
			Text04,
			Text05,
			Text07,
			Text08,
			Text09,
		};
		CgpFontAnimation fontMLText = new CgpFontAnimation(TagDB._UserApplicationLanguage, MLTextList,0);
		TagDB._UserApplicationLanguage.addEventListener(fontMLText, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch02, 0, panelContext);
		TagDB._Day.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch04, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.CURRENT.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.FREQ_OUTPUT.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.OUTPUT_VOLTS.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.SPEED.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay05, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.RATED_PWR.addEventListener(NumericDisplay05, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.TOTAL_KWH.addEventListener(NumericDisplay06, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay06, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay07, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.DC_BUS_VOLTS.addEventListener(NumericDisplay07, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.TORQUE.addEventListener(NumericDisplay08, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay08, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch05, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[23];
		zOrderList[0] = Switch01;
		zOrderList[1] = Switch02;
		zOrderList[2] = DateDisplay01;
		zOrderList[3] = TimeDisplay01;
		zOrderList[4] = Text01;
		zOrderList[5] = Switch04;
		zOrderList[6] = Text02;
		zOrderList[7] = NumericDisplay02;
		zOrderList[8] = Text06;
		zOrderList[9] = NumericDisplay01;
		zOrderList[10] = Text03;
		zOrderList[11] = NumericDisplay03;
		zOrderList[12] = Text04;
		zOrderList[13] = NumericDisplay04;
		zOrderList[14] = Text05;
		zOrderList[15] = NumericDisplay05;
		zOrderList[16] = Text07;
		zOrderList[17] = NumericDisplay06;
		zOrderList[18] = Text08;
		zOrderList[19] = NumericDisplay07;
		zOrderList[20] = Text09;
		zOrderList[21] = NumericDisplay08;
		zOrderList[22] = Switch05;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Switch05,
			Switch04,
			Switch02,
			Switch01,
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
		tagListVector.add(TagDB.SINAMICS_V20_VAR.FREQ_OUTPUT);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.SPEED);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.CURRENT);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.TORQUE);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.TOTAL_KWH);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.DC_BUS_VOLTS);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.RATED_PWR);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.OUTPUT_VOLTS);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		Image02.clean();
		Image01.clean();

		Switch05.shutdown();

		NumericDisplay08.shutdown();

		NumericDisplay07.shutdown();

		NumericDisplay06.shutdown();

		NumericDisplay05.shutdown();

		NumericDisplay04.shutdown();

		NumericDisplay03.shutdown();

		NumericDisplay01.shutdown();

		NumericDisplay02.shutdown();

		Switch04.shutdown();

		TimeDisplay01.shutdown();

		DateDisplay01.shutdown();

		Switch02.shutdown();

		Switch01.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Image02
		_g.drawImage(Image02, 0 + _dx, 0 + _dy);
		DateDisplay01.drawBackground(_g);

		TimeDisplay01.drawBackground(_g);

		// Image01
		_g.drawImage(Image01, 360 + _dx, 400 + _dy);
		NumericDisplay02.drawBackground(_g);

		NumericDisplay01.drawBackground(_g);

		NumericDisplay03.drawBackground(_g);

		NumericDisplay04.drawBackground(_g);

		NumericDisplay05.drawBackground(_g);

		NumericDisplay06.drawBackground(_g);

		NumericDisplay07.drawBackground(_g);

		NumericDisplay08.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
