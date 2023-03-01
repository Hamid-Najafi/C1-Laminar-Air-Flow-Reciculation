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

public class Panel1 extends CgpPanel
{
	public Panel1XprSrv exprServer;

	public Switch_0003 Switch01;
	public Switch_0004 Switch02;
	public CgpNumericDisplay DateDisplay01;
	public CgpNumericDisplay TimeDisplay01;
	public Switch_0005 Switch05;
	public Switch_0005 Switch04;
	public Switch_0006 Switch03;
	public Switch_0007 Switch06;
	public Lamp_0007 Lamp01;
	public Lamp_0007 Lamp02;
	public Lamp_0015 Lamp03;
	public Lamp_0015 Lamp04;
	public Lamp_0007 Lamp05;
	public Lamp_0007 Lamp06;
	public CgpNumericDisplay NumericDisplay01;
	public CgpNumericDisplay NumericDisplay02;
	public Switch_0005 Switch07;
	CgpGraphicFile Image02;
	CgpGraphicFile Image01;
	private CgpMasterPanel masterPanel = null;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel1XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Main";
	}
	public int getPanelID()
	{
		return 1;
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
		CgpFont textFont6 = new CgpFont("PF Arial", CgpFont.PLAIN, (byte)16, (byte)0);
		CgpFont textFont7 = new CgpFont("PF Arabic S", CgpFont.PLAIN, (byte)16, (byte)0);
		CgpFont textFont8 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)18, (byte)0);
		CgpFont textFont9 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)20, (byte)0);

		String textStrings[];
		CgpFont textFonts[];

		CgpStringDB  dbList1;
		textStrings = new String[8];
		textFonts = new CgpFont[8];
		textStrings[0] = "Laminar Air Flow Reciculation System";
		textStrings[1] = "Inverter Status";
		textStrings[2] = "Fan Status";
		textStrings[3] = "Inverter Warning";
		textStrings[4] = "Inverter Fault";
		textStrings[5] = "AirFlow\n(CFM)";
		textStrings[6] = "Fan Speed\n(RPM)";
		textStrings[7] = "Fan Control";
		textFonts[0] = textFont4;
		textFonts[1] = textFont4;
		textFonts[2] = textFont4;
		textFonts[3] = textFont4;
		textFonts[4] = textFont4;
		textFonts[5] = textFont4;
		textFonts[6] = textFont4;
		textFonts[7] = textFont8;
		dbList1 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB  dbList2;
		textStrings = new String[8];
		textFonts = new CgpFont[8];
		textStrings[0] = " \u0633\u06cc\u0633\u062a\u0645 \u0628\u0627\u0632\u06cc\u0627\u0628\u06cc \u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627\u06cc \u0644\u0627\u0645\u06cc\u0646\u0627\u0631 ";
		textStrings[1] = "\u0648\u0636\u0639\u06cc\u062a \u0627\u06cc\u0646\u0648\u0631\u062a\u0631";
		textStrings[2] = "\u0648\u0636\u0639\u06cc\u062a \u0641\u0646";
		textStrings[3] = "\u0627\u062e\u0637\u0627\u0631 \u0627\u06cc\u0646\u0648\u0631\u062a\u0631";
		textStrings[4] = "\u062e\u0637\u0627\u06cc \u0627\u06cc\u0646\u0648\u0631\u062a\u0631";
		textStrings[5] = "\u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627\n(CFM)";
		textStrings[6] = "\u0633\u0631\u0639\u062a \u0641\u0646\n(RPM)";
		textStrings[7] = "\u0641\u0631\u0645\u0627\u0646 \u0641\u0646";
		textFonts[0] = textFont5;
		textFonts[1] = textFont5;
		textFonts[2] = textFont5;
		textFonts[3] = textFont5;
		textFonts[4] = textFont5;
		textFonts[5] = textFont2;
		textFonts[6] = textFont2;
		textFonts[7] = textFont9;
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

		labels32[0][0] = "Fan";
		fonts32[0][0] = textFont0;
		labels32[1][0] = "\u0641\u0646";
		fonts32[1][0] = textFont0;

		Switch05.buzzer = true;

		Switch05.switchFonts = fonts32;
		Switch05.labels = labels32;

		Switch05.labelClr = intArray0;
		Switch05.label3DClr = intArray1;
		Switch05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch05.panelChange0 = 2;
		Switch05.alwaysDrawBackground = false;

		Switch05.init();
		Switch04 = new Switch_0005(200, 400, 319, 459, panelContext, this);
		Switch04.frameClr = 0x006e726e;
		Switch04.foreClr = 0x00c3bfc3;
		Switch04.backClr = 0x00000000;
		Switch04.pattern = 1;

		CgpFont	fonts33[][];
		String	labels33[][];
		fonts33 = new CgpFont[2][1];
		labels33 = new String[2][1];

		labels33[0][0] = "Logs";
		fonts33[0][0] = textFont0;
		labels33[1][0] = "\u06af\u0632\u0627\u0631\u0634\u0627\u062a";
		fonts33[1][0] = textFont0;

		Switch04.buzzer = true;

		Switch04.switchFonts = fonts33;
		Switch04.labels = labels33;

		Switch04.labelClr = intArray0;
		Switch04.label3DClr = intArray1;
		Switch04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch04.panelChange0 = 3;
		Switch04.alwaysDrawBackground = false;

		Switch04.init();

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
		Switch03 = new Switch_0006(640, 220, 759, 279, panelContext, this);
		Switch03.frameClr = 0x000000ff;
		Switch03.foreClr = 0x000000ff;
		Switch03.backClr = 0x00000000;
		Switch03.pattern = 1;

		CgpFont	fonts35[][];
		String	labels35[][];
		fonts35 = new CgpFont[2][1];
		labels35 = new String[2][1];

		labels35[0][0] = "Stop";
		fonts35[0][0] = textFont0;
		labels35[1][0] = "\u0627\u06cc\u0633\u062a";
		fonts35[1][0] = textFont0;

		Switch03.buzzer = true;

		Switch03.switchFonts = fonts35;
		Switch03.labels = labels35;

		Switch03.labelClr = intArray0;
		Switch03.label3DClr = intArray1;
		Switch03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch03.word0 = TagDB.SINAMICS_V20_VAR.STW_ControlWord;
		Switch03.wordID0 = 1000;
		Switch03.exprServer = exprServer;
		Switch03.alwaysDrawBackground = false;

		Switch03.init();
		Switch06 = new Switch_0007(640, 140, 759, 219, panelContext, this);
		Switch06.frameClr = 0x0000ff00;
		Switch06.foreClr = 0x0000ff7f;
		Switch06.backClr = 0x00000000;
		Switch06.pattern = 1;

		CgpFont	fonts36[][];
		String	labels36[][];
		fonts36 = new CgpFont[2][1];
		labels36 = new String[2][1];

		labels36[0][0] = "Start";
		fonts36[0][0] = textFont0;
		labels36[1][0] = "\u0634\u0631\u0648\u0639";
		fonts36[1][0] = textFont0;

		Switch06.buzzer = true;

		Switch06.switchFonts = fonts36;
		Switch06.labels = labels36;

		Switch06.labelClr = intArray0;
		Switch06.label3DClr = intArray1;
		Switch06.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch06.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch06.word0 = TagDB.SINAMICS_V20_VAR.STW_ControlWord;
		Switch06.wordID0 = 1001;
		Switch06.word1 = TagDB.SINAMICS_V20_VAR.STW_ControlWord;
		Switch06.wordID1 = 1002;
		Switch06.exprServer = exprServer;
		Switch06.alwaysDrawBackground = false;

		Switch06.init();

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
			460,	// x1
			80,	// y1
			579,	// x2
			119,	// y2
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
			2,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			620,	// x1
			280,	// y1
			719,	// x2
			319,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text03.set3DColor(0x00ff0000);
		Lamp01 = new Lamp_0007(460, 120, 579, 179, panelContext, this);
		int intArray2[] = {0x0000ff00, 0x000000ff, };
		Lamp01.foreClr = intArray2;
		int intArray3[] = {0x00000000, 0x00000000, };
		Lamp01.backClr = intArray3;
		int intArray4[] = {1, 1, };
		Lamp01.pattern = intArray4;
		Lamp01.controlTag01 = TagDB.SINAMICS_V20_VAR.READY_TO_RUN;

		CgpFont	fonts41[][];
		String	labels41[][];
		fonts41 = new CgpFont[2][2];
		labels41 = new String[2][2];

		labels41[0][0] = "Active";
		fonts41[0][0] = textFont6;
		labels41[1][0] = "\u0641\u0639\u0627\u0644";
		fonts41[1][0] = textFont7;

		labels41[0][1] = "Deactive";
		fonts41[0][1] = textFont6;
		labels41[1][1] = "\u063a\u06cc\u0631\u0641\u0639\u0627\u0644";
		fonts41[1][1] = textFont7;

		int intArray5[] = {0x00ffffff, 0x00ffffff, };
		Lamp01.labelClr = intArray5;
		Lamp01.label3DClr = intArray3;

		Lamp01.lampFonts = fonts41;
		Lamp01.labels = labels41;

		Lamp01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp01.exprServer = exprServer;
		Lamp01.alwaysDrawBackground = false;

		Lamp01.init();
		Lamp02 = new Lamp_0007(620, 320, 719, 379, panelContext, this);
		Lamp02.foreClr = intArray2;
		Lamp02.backClr = intArray3;
		Lamp02.pattern = intArray4;
		Lamp02.controlTag01 = TagDB.SINAMICS_V20_VAR.RUN_ENABLE;

		CgpFont	fonts42[][];
		String	labels42[][];
		fonts42 = new CgpFont[2][2];
		labels42 = new String[2][2];

		labels42[0][0] = "Active";
		fonts42[0][0] = textFont6;
		labels42[1][0] = "\u0641\u0639\u0627\u0644";
		fonts42[1][0] = textFont7;

		labels42[0][1] = "Deactive";
		fonts42[0][1] = textFont6;
		labels42[1][1] = "\u063a\u06cc\u0631\u0641\u0639\u0627\u0644";
		fonts42[1][1] = textFont7;

		Lamp02.labelClr = intArray5;
		Lamp02.label3DClr = intArray3;

		Lamp02.lampFonts = fonts42;
		Lamp02.labels = labels42;

		Lamp02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp02.exprServer = exprServer;
		Lamp02.alwaysDrawBackground = false;

		Lamp02.init();
		Lamp03 = new Lamp_0015(460, 220, 579, 279, panelContext, this);
		Lamp03.foreClr = intArray2;
		Lamp03.backClr = intArray3;
		Lamp03.pattern = intArray4;
		int intArray6[] = {0, 2, };
		Lamp03.blinkStates = intArray6;
		Lamp03.controlTag01 = TagDB.SINAMICS_V20_VAR.WARNING;

		CgpFont	fonts43[][];
		String	labels43[][];
		fonts43 = new CgpFont[2][2];
		labels43 = new String[2][2];

		labels43[0][0] = "No Warning";
		fonts43[0][0] = textFont6;
		labels43[1][0] = "\u0628\u062f\u0648\u0646 \u0627\u062e\u0637\u0627\u0631";
		fonts43[1][0] = textFont7;

		labels43[0][1] = "Inv. Warning";
		fonts43[0][1] = textFont6;
		labels43[1][1] = "\u0627\u062e\u0637\u0627\u0631 \u0627\u06cc\u0646\u0648\u0631\u062a\u0631";
		fonts43[1][1] = textFont7;

		Lamp03.labelClr = intArray5;
		Lamp03.label3DClr = intArray3;

		Lamp03.lampFonts = fonts43;
		Lamp03.labels = labels43;

		Lamp03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp03.exprServer = exprServer;
		Lamp03.alwaysDrawBackground = false;

		Lamp03.init();
		Lamp04 = new Lamp_0015(460, 320, 579, 379, panelContext, this);
		Lamp04.foreClr = intArray2;
		Lamp04.backClr = intArray3;
		Lamp04.pattern = intArray4;
		Lamp04.blinkStates = intArray6;
		Lamp04.controlTag01 = TagDB.SINAMICS_V20_VAR.FAULT;

		CgpFont	fonts44[][];
		String	labels44[][];
		fonts44 = new CgpFont[2][2];
		labels44 = new String[2][2];

		labels44[0][0] = "No Fault";
		fonts44[0][0] = textFont6;
		labels44[1][0] = "\u0628\u062f\u0648\u0646 \u062e\u0637\u0627";
		fonts44[1][0] = textFont7;

		labels44[0][1] = "Inv. Fault";
		fonts44[0][1] = textFont6;
		labels44[1][1] = "\u062e\u0637\u0627\u06cc \u0627\u06cc\u0646\u0648\u0631\u062a\u0631";
		fonts44[1][1] = textFont7;

		Lamp04.labelClr = intArray5;
		Lamp04.label3DClr = intArray3;

		Lamp04.lampFonts = fonts44;
		Lamp04.labels = labels44;

		Lamp04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp04.exprServer = exprServer;
		Lamp04.alwaysDrawBackground = false;

		Lamp04.init();

		CgpMLText Text04 = new CgpMLText
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
			460,	// x1
			180,	// y1
			579,	// x2
			219,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text04.set3DColor(0x00ff0000);

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
			460,	// x1
			280,	// y1
			579,	// x2
			319,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text05.set3DColor(0x00ff0000);
		Lamp05 = new Lamp_0007(240, 140, 399, 239, panelContext, this);
		Lamp05.foreClr = intArray2;
		Lamp05.backClr = intArray3;
		Lamp05.pattern = intArray4;
		Lamp05.controlTag01 = TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1;

		CgpFont	fonts47[][];
		String	labels47[][];
		fonts47 = new CgpFont[2][2];
		labels47 = new String[2][2];

		labels47[0][0] = "Fresh Air Filter\n(Clean)";
		fonts47[0][0] = textFont6;
		labels47[1][0] = "\u0641\u06cc\u0644\u062a\u0631\u0647\u0648\u0627\u06cc \u062a\u0627\u0632\u0647\n(\u062a\u0645\u06cc\u0632(";
		fonts47[1][0] = textFont7;

		labels47[0][1] = "Fresh Air Filter\n(Dirty)";
		fonts47[0][1] = textFont6;
		labels47[1][1] = "\u0641\u06cc\u0644\u062a\u0631\u0647\u0648\u0627\u06cc \u062a\u0627\u0632\u0647\n(\u06a9\u062b\u06cc\u0641(";
		fonts47[1][1] = textFont7;

		Lamp05.labelClr = intArray5;
		Lamp05.label3DClr = intArray3;

		Lamp05.lampFonts = fonts47;
		Lamp05.labels = labels47;

		Lamp05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp05.exprServer = exprServer;
		Lamp05.alwaysDrawBackground = false;

		Lamp05.init();
		Lamp06 = new Lamp_0007(240, 260, 399, 359, panelContext, this);
		Lamp06.foreClr = intArray2;
		Lamp06.backClr = intArray3;
		Lamp06.pattern = intArray4;
		Lamp06.controlTag01 = TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2;

		CgpFont	fonts48[][];
		String	labels48[][];
		fonts48 = new CgpFont[2][2];
		labels48 = new String[2][2];

		labels48[0][0] = "Recycle Filter\n(Clean)";
		fonts48[0][0] = textFont6;
		labels48[1][0] = "\u0641\u06cc\u0644\u062a\u0631\u0647\u0648\u0627\u06cc \u0628\u0627\u0632\u06cc\u0627\u0641\u062a\u06cc\n(\u062a\u0645\u06cc\u0632(";
		fonts48[1][0] = textFont7;

		labels48[0][1] = "Recycle Filter\n(Dirty)";
		fonts48[0][1] = textFont6;
		labels48[1][1] = "\u0641\u06cc\u0644\u062a\u0631\u0647\u0648\u0627\u06cc \u0628\u0627\u0632\u06cc\u0627\u0641\u062a\u06cc\n(\u06a9\u062b\u06cc\u0641(";
		fonts48[1][1] = textFont7;

		Lamp06.labelClr = intArray5;
		Lamp06.label3DClr = intArray3;

		Lamp06.lampFonts = fonts48;
		Lamp06.labels = labels48;

		Lamp06.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp06.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp06.exprServer = exprServer;
		Lamp06.alwaysDrawBackground = false;

		Lamp06.init();

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
			80,	// x1
			140,	// y1
			179,	// x2
			179,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text06.set3DColor(0x00ff0000);

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
			80,	// x1
			260,	// y1
			179,	// x2
			299,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text07.set3DColor(0x00ff0000);

		NumericDisplay01 = new CgpNumericDisplay(80, 200, 179, 239, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.SINAMICS_V20_VAR.ANALOG_IN_1;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 3;
		NumericDisplay01.decimalPlaces = 0;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = null;
		CgpFont	fonts51[][] = {
			{ textFont6 },
			{ textFont7 },
			};
		NumericDisplay01.fonts = fonts51;
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
		CgpNumericDisplayDraw displayDraw1 = new D_DD00001(1,1,1,1);
		NumericDisplay01.drawObject = displayDraw1;
		NumericDisplay01.alwaysDrawBackground = false;
		NumericDisplay01.exprServer = exprServer;
		NumericDisplay01.init();

		NumericDisplay02 = new CgpNumericDisplay(80, 320, 179, 359, panelContext, this);
		NumericDisplay02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay02.variable = TagDB.SINAMICS_V20_VAR.SPEED;
		NumericDisplay02.zeroSuppress = true;
		NumericDisplay02.zeroDisplay = true;
		NumericDisplay02.displayDigits = 5;
		NumericDisplay02.decimalPlaces = 0;
		NumericDisplay02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay02.unitStrings = null;
		NumericDisplay02.fonts = fonts51;
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
			640,	// x1
			100,	// y1
			759,	// x2
			139,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text08.set3DColor(0x00ff0000);
		Switch07 = new Switch_0005(640, 400, 759, 459, panelContext, this);
		Switch07.frameClr = 0x006e726e;
		Switch07.foreClr = 0x00c3bfc3;
		Switch07.backClr = 0x00000000;
		Switch07.pattern = 1;

		CgpFont	fonts54[][];
		String	labels54[][];
		fonts54 = new CgpFont[2][1];
		labels54 = new String[2][1];

		labels54[0][0] = "Settings";
		fonts54[0][0] = textFont0;
		labels54[1][0] = "\u062a\u0646\u0638\u06cc\u0645\u0627\u062a";
		fonts54[1][0] = textFont0;

		Switch07.buzzer = true;

		Switch07.switchFonts = fonts54;
		Switch07.labels = labels54;

		Switch07.labelClr = intArray0;
		Switch07.label3DClr = intArray1;
		Switch07.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch07.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch07.panelChange0 = 4;
		Switch07.exprServer = exprServer;
		Switch07.alwaysDrawBackground = false;

		Switch07.init();
		((CgpWindow)owner).drawBack();

		CgpMLText MLTextList[] =
		{
			Text01,
			Text02,
			Text03,
			Text04,
			Text05,
			Text06,
			Text07,
			Text08,
		};
		CgpFontAnimation fontMLText = new CgpFontAnimation(TagDB._UserApplicationLanguage, MLTextList,0);
		TagDB._UserApplicationLanguage.addEventListener(fontMLText, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch02, 0, panelContext);
		TagDB._Day.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch05, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch04, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch03, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch06, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp01, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.READY_TO_RUN.addEventListener(Lamp01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp02, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.RUN_ENABLE.addEventListener(Lamp02, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.WARNING.addEventListener(Lamp03, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp03, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp04, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.FAULT.addEventListener(Lamp04, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1.addEventListener(Lamp05, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp05, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp06, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2.addEventListener(Lamp06, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.ANALOG_IN_1.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.SPEED.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch07, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[25];
		zOrderList[0] = Switch01;
		zOrderList[1] = Switch02;
		zOrderList[2] = DateDisplay01;
		zOrderList[3] = TimeDisplay01;
		zOrderList[4] = Switch05;
		zOrderList[5] = Switch04;
		zOrderList[6] = Text01;
		zOrderList[7] = Switch03;
		zOrderList[8] = Switch06;
		zOrderList[9] = Text02;
		zOrderList[10] = Text03;
		zOrderList[11] = Lamp01;
		zOrderList[12] = Lamp02;
		zOrderList[13] = Lamp03;
		zOrderList[14] = Lamp04;
		zOrderList[15] = Text04;
		zOrderList[16] = Text05;
		zOrderList[17] = Lamp05;
		zOrderList[18] = Lamp06;
		zOrderList[19] = Text06;
		zOrderList[20] = Text07;
		zOrderList[21] = NumericDisplay01;
		zOrderList[22] = NumericDisplay02;
		zOrderList[23] = Text08;
		zOrderList[24] = Switch07;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Switch07,
			Switch06,
			Switch03,
			Switch04,
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
		tagListVector.add(TagDB.SINAMICS_V20_VAR.WARNING);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.RUN_ENABLE);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.SPEED);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.READY_TO_RUN);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.ANALOG_IN_1);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.FAULT);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		Image02.clean();
		Image01.clean();

		Switch07.shutdown();

		NumericDisplay02.shutdown();

		NumericDisplay01.shutdown();

		Lamp06.shutdown();

		Lamp05.shutdown();

		Lamp04.shutdown();

		Lamp03.shutdown();

		Lamp02.shutdown();

		Lamp01.shutdown();

		Switch06.shutdown();

		Switch03.shutdown();

		Switch04.shutdown();

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
