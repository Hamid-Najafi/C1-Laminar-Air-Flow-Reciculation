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

	public Switch_0003 Switch01;
	public Switch_0004 Switch02;
	public CgpNumericDisplay DateDisplay01;
	public CgpNumericDisplay TimeDisplay01;
	public Switch_0005 Switch05;
	public CgpNumericDisplay NumericDisplay01;
	public CgpNumericDisplay NumericDisplay02;
	public Switch_0010 AlarmSummary01_Switch_0010;
	public Switch_0011 AlarmSummary01_Switch_0011;
	public Switch_0012 AlarmSummary01_Switch_0012;
	public Switch_0013 AlarmSummary01_Switch_0013;
	CgpFont LBAlarmSummary01Font[];
	CgpGraphicFile Image02;
	CgpGraphicFile Image01;
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	CgpGraphicFile nativeImage2;
	CgpGraphicFile nativeImage3;
	public CgpSmartKeypadDec  decKeypad;
	private CgpMasterPanel masterPanel = null;
	public static CgpAlarmSummary AlarmSummary01;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel5XprSrv();
		String AlarmSummary01Strings[];
		CgpFont AlarmSummary01Fonts[];

		CgpStringDB dbAlarmSummary01_0;
		AlarmSummary01Strings = new String[4];
		AlarmSummary01Strings[0] = "Message";
		AlarmSummary01Strings[1] = "Date";
		AlarmSummary01Strings[2] = "Time";
		AlarmSummary01Strings[3] = "State";
		AlarmSummary01Fonts = new CgpFont[4];
		AlarmSummary01Fonts[0] = new CgpFont("PF Arial", CgpFont.BOLD, (byte)16, (byte)0);
		AlarmSummary01Fonts[1] = AlarmSummary01Fonts[0];
		AlarmSummary01Fonts[2] = AlarmSummary01Fonts[0];
		AlarmSummary01Fonts[3] = AlarmSummary01Fonts[0];
		dbAlarmSummary01_0 = new CgpStringDB(AlarmSummary01Strings, AlarmSummary01Fonts);

		CgpStringDB dbAlarmSummary01_1;
		AlarmSummary01Strings = new String[4];
		AlarmSummary01Strings[0] = "Message";
		AlarmSummary01Strings[1] = "Date";
		AlarmSummary01Strings[2] = "Time";
		AlarmSummary01Strings[3] = "State";
		AlarmSummary01Fonts = new CgpFont[4];
		AlarmSummary01Fonts[0] = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)16, (byte)0);
		AlarmSummary01Fonts[1] = AlarmSummary01Fonts[0];
		AlarmSummary01Fonts[2] = AlarmSummary01Fonts[0];
		AlarmSummary01Fonts[3] = AlarmSummary01Fonts[0];
		dbAlarmSummary01_1 = new CgpStringDB(AlarmSummary01Strings, AlarmSummary01Fonts);

		CgpStringDB AlarmSummary01DBList[] =
		{
			dbAlarmSummary01_0,
			dbAlarmSummary01_1,
		};

		int LBAlarmSummary01Widths[] = {
			150,
			100,
			100,
			100,
		};

		int LBAlarmSummary01Lengths[] = {
			9999,
			9999,
			9999,
			9999,
		};
		LBAlarmSummary01Font = new CgpFont[2];
		LBAlarmSummary01Font[0] = new CgpFont("PF Arial", CgpFont.PLAIN, (byte)16, (byte)0);
		LBAlarmSummary01Font[1] = new CgpFont("PF Arabic S", CgpFont.PLAIN, (byte)16, (byte)0);

		int AlarmSummary01_columns[] = {
			CgpAlarmFormatter.COLUMN_MESSAGE,
			CgpAlarmFormatter.COLUMN_DATE,
			CgpAlarmFormatter.COLUMN_TIME,
			CgpAlarmFormatter.COLUMN_STATE,
		};

		CgpAlarmFormatter AlarmSummary01_formatter = new CgpAlarmFormatter(CgpDate.YY_MM_DD, CgpDate.H24_MM_SS,"",
			AlarmSummary01_columns, null);
		AlarmSummary01 = new CgpAlarmSummary(
			20,
			220,
			179,
			279,
			false,
			IgpAlarmGroupConstants.ACTIVE_DISP_MODE,
			TagDB.DPS_AlarmGroup,
			AlarmSummary01_formatter,
			LBAlarmSummary01Font,
			panelContext
		);
		CgpListBox AlarmSummary01_listbox = new CgpListBox (
			20,
			220,
			179,
			279,
			LBAlarmSummary01Font[0],
			0x00000000,
			1,
			LBAlarmSummary01Widths,
			LBAlarmSummary01Lengths,
			true,
			false,
			true,
			0,
			0,
			false,
			false,
			false,
			AlarmSummary01,
			0,
			panelContext
		);
		CgpAlarmColorMgr AlarmSummary01_Colors	= new CgpAlarmColorMgr();
		int[] AlarmSummary01_DefaultTextColors	= { 0x00000000, 0x00000000, 0x00000000, 0x00000000 };
		int[] AlarmSummary01_DefaultBackColors	= { 0x000000ff, 0x0000ffff, 0x0000ff00, 0x0000ff00 };
		int[] AlarmSummary01_DefaultTextBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };
		int[] AlarmSummary01_DefaultBackBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };

		AlarmSummary01_Colors.defaultTextColors	= AlarmSummary01_DefaultTextColors;
		AlarmSummary01_Colors.defaultBackColors	= AlarmSummary01_DefaultBackColors;
		AlarmSummary01_Colors.defaultTextBlink = AlarmSummary01_DefaultTextBlink;
		AlarmSummary01_Colors.defaultBackBlink = AlarmSummary01_DefaultBackBlink;
		AlarmSummary01.setColorSet(AlarmSummary01_Colors);

		AlarmSummary01_listbox.setTitle(AlarmSummary01DBList, 0x00ffffff, 0x00000000);
		AlarmSummary01_listbox.setFrame(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		AlarmSummary01_listbox.setRule(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		AlarmSummary01.setListBox(AlarmSummary01_listbox);
		AlarmSummary01.setAutoCursorOn(true);


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

		CgpFont textFont0 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont1 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont2 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont3 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont4 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)12, (byte)0);
		CgpFont textFont5 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)18, (byte)0);
		CgpFont textFont6 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)20, (byte)0);
		CgpFont textFont7 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)20, (byte)0);
		CgpFont textFont8 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)24, (byte)0);
		CgpFont textFont9 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)24, (byte)0);

		String textStrings[];
		CgpFont textFonts[];

		CgpStringDB  dbList1;
		textStrings = new String[3];
		textFonts = new CgpFont[3];
		textStrings[0] = "Laminar Air Flow Reciculation System";
		textStrings[1] = "Fan Calibration Base";
		textStrings[2] = "Fan Calibration Factor";
		textFonts[0] = textFont4;
		textFonts[1] = textFont6;
		textFonts[2] = textFont6;
		dbList1 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB  dbList2;
		textStrings = new String[3];
		textFonts = new CgpFont[3];
		textStrings[0] = " \u0633\u06cc\u0633\u062a\u0645 \u0628\u0627\u0632\u06cc\u0627\u0628\u06cc \u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627\u06cc \u0644\u0627\u0645\u06cc\u0646\u0627\u0631 ";
		textStrings[1] = "\u062b\u0627\u0628\u062a \u06a9\u0627\u0644\u06cc\u0628\u0631 \u0641\u0646";
		textStrings[2] = "\u0636\u0631\u06cc\u0628 \u06a9\u0627\u0644\u06cc\u0628\u0631 \u0641\u0646";
		textFonts[0] = textFont5;
		textFonts[1] = textFont7;
		textFonts[2] = textFont7;
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

		CgpFont	fonts26[][];
		String	labels26[][];
		fonts26 = new CgpFont[2][1];
		labels26 = new String[2][1];

		labels26[0][0] = "English";
		fonts26[0][0] = textFont0;
		labels26[1][0] = "\u0627\u0646\u06af\u0644\u06cc\u0633\u06cc";
		fonts26[1][0] = textFont0;

		Switch01.buzzer = true;

		Switch01.switchFonts = fonts26;
		Switch01.labels = labels26;

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

		CgpFont	fonts27[][];
		String	labels27[][];
		fonts27 = new CgpFont[2][1];
		labels27 = new String[2][1];

		labels27[0][0] = "Persian";
		fonts27[0][0] = textFont0;
		labels27[1][0] = "\u0641\u0627\u0631\u0633\u06cc";
		fonts27[1][0] = textFont0;

		Switch02.buzzer = true;

		Switch02.switchFonts = fonts27;
		Switch02.labels = labels27;

		Switch02.labelClr = intArray0;
		Switch02.label3DClr = intArray1;
		Switch02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch02.userLangID0 = 2;
		Switch02.alwaysDrawBackground = false;

		Switch02.init();

		DateDisplay01 = new CgpNumericDisplay(600, 20, 699, 59, panelContext, this);
		DateDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		DateDisplay01.dateTimeFormat = CgpDate.YYYY_MM_DD;
		DateDisplay01.dateTimeListenVariable = TagDB._Day;
		CgpFont	fonts28[][] = {
			{ textFont1 },
			{ textFont2 },
			};
		DateDisplay01.fonts = fonts28;
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
		CgpFont	fonts29[][] = {
			{ textFont3 },
			{ textFont0 },
			};
		TimeDisplay01.fonts = fonts29;
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

		Switch05 = new Switch_0005(40, 400, 159, 459, panelContext, this);
		Switch05.frameClr = 0x006e726e;
		Switch05.foreClr = 0x00c3bfc3;
		Switch05.backClr = 0x00000000;
		Switch05.pattern = 1;

		CgpFont	fonts32[][];
		String	labels32[][];
		fonts32 = new CgpFont[2][1];
		labels32 = new String[2][1];

		labels32[0][0] = "Home";
		fonts32[0][0] = textFont0;
		labels32[1][0] = "\u0635\u0641\u062d\u0647 \u0627\u0635\u0644\u06cc";
		fonts32[1][0] = textFont0;

		Switch05.buzzer = true;

		Switch05.switchFonts = fonts32;
		Switch05.labels = labels32;

		Switch05.labelClr = intArray0;
		Switch05.label3DClr = intArray1;
		Switch05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch05.panelChange0 = 1;
		Switch05.alwaysDrawBackground = false;

		Switch05.init();

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
			420,	// x1
			140,	// y1
			599,	// x2
			199,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text02.set3DColor(0x00ff0000);

		NumericDisplay01 = new CgpNumericDisplay(420, 220, 599, 299, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.FanCalibrationBase;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 5;
		NumericDisplay01.decimalPlaces = 0;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
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
		CgpNumericDisplayDraw displayDraw1 = new D_DD00001(1,1,1,1);
		NumericDisplay01.drawObject = displayDraw1;
		NumericDisplay01.alwaysDrawBackground = false;
		NumericDisplay01.exprServer = exprServer;
		NumericDisplay01.useLocalMinMax  = true;
		NumericDisplay01.minExpr   = 1000;
		NumericDisplay01.maxExpr   = 1001;
		NumericDisplay01.init();

		CgpMLText Text03 = new CgpMLText
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
			200,	// x1
			140,	// y1
			379,	// x2
			199,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text03.set3DColor(0x00ff0000);

		NumericDisplay02 = new CgpNumericDisplay(200, 220, 379, 299, panelContext, this);
		NumericDisplay02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay02.variable = TagDB.FanCalibrationFactor;
		NumericDisplay02.zeroSuppress = true;
		NumericDisplay02.zeroDisplay = true;
		NumericDisplay02.displayDigits = 5;
		NumericDisplay02.decimalPlaces = 0;
		NumericDisplay02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay02.unitStrings = null;
		NumericDisplay02.fonts = fonts55;
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
		NumericDisplay02.drawObject = displayDraw1;
		NumericDisplay02.alwaysDrawBackground = false;
		NumericDisplay02.exprServer = exprServer;
		NumericDisplay02.init();
		AlarmSummary01_Switch_0010 = new Switch_0010(20, 180, 59, 219, panelContext, this);
		AlarmSummary01_Switch_0010.foreClr = 0x007f7f7f;
		nativeImage0 = new CgpGraphicFile( "Bitmap41.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0010.image01 = nativeImage0;
		AlarmSummary01_Switch_0010.image02 = nativeImage0;
		AlarmSummary01_Switch_0010.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0010.buzzer = true;
		AlarmSummary01_Switch_0010.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0011 = new Switch_0011(60, 180, 99, 219, panelContext, this);
		AlarmSummary01_Switch_0011.foreClr = 0x007f7f7f;
		nativeImage1 = new CgpGraphicFile( "Bitmap40.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0011.image01 = nativeImage1;
		AlarmSummary01_Switch_0011.image02 = nativeImage1;
		AlarmSummary01_Switch_0011.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0011.buzzer = true;
		AlarmSummary01_Switch_0011.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0012 = new Switch_0012(100, 180, 139, 219, panelContext, this);
		AlarmSummary01_Switch_0012.foreClr = 0x007f7f7f;
		nativeImage2 = new CgpGraphicFile( "Bitmap39.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0012.image01 = nativeImage2;
		AlarmSummary01_Switch_0012.image02 = nativeImage2;
		AlarmSummary01_Switch_0012.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0012.buzzer = true;
		AlarmSummary01_Switch_0012.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0013 = new Switch_0013(140, 180, 179, 219, panelContext, this);
		AlarmSummary01_Switch_0013.foreClr = 0x007f7f7f;
		nativeImage3 = new CgpGraphicFile( "Bitmap38.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0013.image01 = nativeImage3;
		AlarmSummary01_Switch_0013.image02 = nativeImage3;
		AlarmSummary01_Switch_0013.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0013.buzzer = true;
		AlarmSummary01_Switch_0013.alwaysDrawBackground = false;

		((CgpWindow)owner).drawBack();

		CgpMLText MLTextList[] =
		{
			Text01,
			Text02,
			Text03,
		};
		CgpFontAnimation fontMLText = new CgpFontAnimation(TagDB._UserApplicationLanguage, MLTextList,0);
		TagDB._UserApplicationLanguage.addEventListener(fontMLText, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(AlarmSummary01, contextObject);
		TagDB._UserApplicationLanguage.addEventListener(Switch01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch02, 0, panelContext);
		TagDB._Day.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch05, 0, panelContext);
		TagDB._Seconds.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB.FanCalibrationBase.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.FanCalibrationFactor.addEventListener(NumericDisplay02, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[16];
		zOrderList[0] = Switch01;
		zOrderList[1] = Switch02;
		zOrderList[2] = DateDisplay01;
		zOrderList[3] = TimeDisplay01;
		zOrderList[4] = Switch05;
		zOrderList[5] = Text01;
		zOrderList[6] = Text02;
		zOrderList[7] = NumericDisplay01;
		zOrderList[8] = Text03;
		zOrderList[9] = NumericDisplay02;
		zOrderList[10] = AlarmSummary01_Switch_0010;
		zOrderList[11] = AlarmSummary01_Switch_0011;
		zOrderList[12] = AlarmSummary01_Switch_0012;
		zOrderList[13] = AlarmSummary01_Switch_0013;
		zOrderList[14] = AlarmSummary01;
		zOrderList[15] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			AlarmSummary01,
			AlarmSummary01_Switch_0013,
			AlarmSummary01_Switch_0012,
			AlarmSummary01_Switch_0011,
			AlarmSummary01_Switch_0010,
			NumericDisplay01,
			Switch05,
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
		tagListVector.add(TagDB.FanCalibrationFactor);
		tagListVector.add(TagDB.FanCalibrationBase);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		Image02.clean();
		Image01.clean();
		nativeImage0.clean();
		nativeImage1.clean();
		nativeImage2.clean();
		nativeImage3.clean();
		AlarmSummary01.clean();

		AlarmSummary01_Switch_0013.shutdown();

		AlarmSummary01_Switch_0012.shutdown();

		AlarmSummary01_Switch_0011.shutdown();

		AlarmSummary01_Switch_0010.shutdown();

		NumericDisplay02.shutdown();

		NumericDisplay01.shutdown();

		Switch05.shutdown();

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
		NumericDisplay01.drawBackground(_g);

		NumericDisplay02.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
