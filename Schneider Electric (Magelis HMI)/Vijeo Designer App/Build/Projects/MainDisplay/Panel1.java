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

	public CgpNumericDisplay DateDisplay01;
	public CgpNumericDisplay TimeDisplay01;
	public Switch_0019 Switch03;
	public Switch_0018 Switch08;
	public Lamp_0018 Lamp07;
	public Lamp_0018 Lamp05;
	public Lamp_0018 Lamp06;
	public Lamp_0018 Lamp08;
	public CgpNumericDisplay NumericDisplay02;
	public CgpNumericDisplay NumericDisplay01;
	public Lamp_0019 Lamp03;
	public CgpNumericDisplay NumericDisplay03;
	public CgpNumericDisplay NumericDisplay04;
	public Lamp_0019 Lamp04;
	CgpGraphicFile Image02;
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	CgpGraphicFile nativeImage2;
	CgpGraphicFile nativeImage3;
	CgpGraphicFile nativeImage4;
	CgpGraphicFile nativeImage5;
	CgpGraphicFile Image03;
	CgpGraphicFile Image04;
	CgpGraphicFile Image01;
	CgpGraphicFile Image05;
	CgpGraphicFile Image06;
	CgpGraphicFile Image07;
	CgpGraphicFile Image08;
	CgpGraphicFile nativeImage6;
	CgpGraphicFile nativeImage7;
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

		CgpFont textFont0 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont1 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont2 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont3 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont4 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)18, (byte)0);
		CgpFont textFont5 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)24, (byte)0);
		CgpFont textFont6 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)20, (byte)0);
		CgpFont textFont7 = new CgpFont("PF Arial", CgpFont.PLAIN, (byte)16, (byte)0);
		CgpFont textFont8 = new CgpFont("PF Arabic S", CgpFont.PLAIN, (byte)16, (byte)0);
		CgpFont textFont9 = new CgpFont("PF Arial", CgpFont.PLAIN, (byte)14, (byte)0);
		CgpFont textFont10 = new CgpFont("PF Arabic S", CgpFont.PLAIN, (byte)14, (byte)0);

		String textStrings[];
		CgpFont textFonts[];

		CgpStringDB  dbList1;
		textStrings = new String[12];
		textFonts = new CgpFont[12];
		textStrings[0] = "Laminar Air Flow Reciculation System";
		textStrings[1] = "Inverter Warning";
		textStrings[2] = "Inverter Fault";
		textStrings[3] = "AirFlow";
		textStrings[4] = "Fan Speed";
		textStrings[5] = "Fan Control";
		textStrings[6] = "Fresh Filter";
		textStrings[7] = "Recycle Filter";
		textStrings[8] = "Inverter Status";
		textStrings[9] = "Fan Status";
		textStrings[10] = "No Fault";
		textStrings[11] = "No Warning";
		textFonts[0] = textFont2;
		textFonts[1] = textFont0;
		textFonts[2] = textFont0;
		textFonts[3] = textFont2;
		textFonts[4] = textFont2;
		textFonts[5] = textFont5;
		textFonts[6] = textFont2;
		textFonts[7] = textFont2;
		textFonts[8] = textFont2;
		textFonts[9] = textFont2;
		textFonts[10] = textFont9;
		textFonts[11] = textFont9;
		dbList1 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB  dbList2;
		textStrings = new String[12];
		textFonts = new CgpFont[12];
		textStrings[0] = " \u0633\u06cc\u0633\u062a\u0645 \u0628\u0627\u0632\u06cc\u0627\u0628\u06cc \u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627\u06cc \u0644\u0627\u0645\u06cc\u0646\u0627\u0631 ";
		textStrings[1] = "\u0627\u062e\u0637\u0627\u0631 \u0627\u06cc\u0646\u0648\u0631\u062a\u0631";
		textStrings[2] = "\u062e\u0637\u0627\u06cc \u0627\u06cc\u0646\u0648\u0631\u062a\u0631";
		textStrings[3] = "\u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627";
		textStrings[4] = "\u0633\u0631\u0639\u062a \u0641\u0646";
		textStrings[5] = "\u0641\u0631\u0645\u0627\u0646 \u0641\u0646";
		textStrings[6] = "\u0641\u06cc\u0644\u062a\u0631\u0647\u0648\u0627\u06cc \u062a\u0627\u0632\u0647";
		textStrings[7] = "\u0641\u06cc\u0644\u062a\u0631\u0647\u0648\u0627\u06cc \u0628\u0627\u0632\u06cc\u0627\u0641\u062a\u06cc";
		textStrings[8] = "\u0648\u0636\u0639\u06cc\u062a \u0627\u06cc\u0646\u0648\u0631\u062a\u0631";
		textStrings[9] = "\u0648\u0636\u0639\u06cc\u062a \u0641\u0646";
		textStrings[10] = "\u0628\u062f\u0648\u0646 \u062e\u0637\u0627";
		textStrings[11] = "\u0628\u062f\u0648\u0646 \u0627\u062e\u0637\u0627\u0631";
		textFonts[0] = textFont4;
		textFonts[1] = textFont4;
		textFonts[2] = textFont4;
		textFonts[3] = textFont3;
		textFonts[4] = textFont3;
		textFonts[5] = textFont6;
		textFonts[6] = textFont3;
		textFonts[7] = textFont3;
		textFonts[8] = textFont4;
		textFonts[9] = textFont4;
		textFonts[10] = textFont10;
		textFonts[11] = textFont8;
		dbList2 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB stringDBList[] =
		{
			dbList1, 
			dbList2, 
		};

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


		DateDisplay01 = new CgpNumericDisplay(7, 20, 106, 59, panelContext, this);
		DateDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		DateDisplay01.dateTimeFormat = CgpDate.YYYY_MM_DD;
		DateDisplay01.dateTimeListenVariable = TagDB._Day;
		CgpFont	fonts64[][] = {
			{ textFont0 },
			{ textFont1 },
			};
		DateDisplay01.fonts = fonts64;
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
		CgpFont	fonts65[][] = {
			{ textFont2 },
			{ textFont3 },
			};
		TimeDisplay01.fonts = fonts65;
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
		Switch03 = new Switch_0019(262, 104, 401, 183, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap424.bmp", 0, 0, 139, 79, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		Switch03.image01 = nativeImage0;
		Switch03.image02 = nativeImage0;
		nativeImage1 = new CgpGraphicFile( "Bitmap426.bmp", 0, 0, 139, 79, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		Switch03.image03 = nativeImage1;
		Switch03.image04 = nativeImage1;

		CgpFont	fonts70[][];
		String	labels70[][];
		fonts70 = new CgpFont[2][1];
		labels70 = new String[2][1];

		labels70[0][0] = "Stop";
		fonts70[0][0] = textFont3;
		labels70[1][0] = "\u0627\u06cc\u0633\u062a";
		fonts70[1][0] = textFont3;

		Switch03.buzzer = true;
		Switch03.lampID = 1000;

		Switch03.switchFonts = fonts70;
		Switch03.labels = labels70;

		int intArray0[] = {0x00ffffff, 0x00ffffff, };
		Switch03.labelClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		Switch03.label3DClr = intArray1;
		Switch03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch03.word0 = TagDB.SINAMICS_V20_VAR.STW_ControlWord;
		Switch03.wordID0 = 1001;
		Switch03.exprServer = exprServer;
		Switch03.alwaysDrawBackground = false;

		Switch03.init();

		CgpMLText Text04 = new CgpMLText
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
			244,	// x1
			309,	// y1
			398,	// x2
			328,	// y2
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
			2,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			397,	// x1
			309,	// y1
			556,	// x2
			328,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text05.set3DColor(0x00ff0000);

		CgpMLText Text06 = new CgpMLText
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
			260,	// x1
			185,	// y1
			379,	// x2
			224,	// y2
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
			4,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			420,	// x1
			185,	// y1
			539,	// x2
			224,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text07.set3DColor(0x00ff0000);

		CgpMLText Text08 = new CgpMLText
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
			310,	// x1
			60,	// y1
			507,	// x2
			99,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text08.set3DColor(0x00ff0000);
		Switch08 = new Switch_0018(398, 104, 537, 183, panelContext, this);
		nativeImage2 = new CgpGraphicFile( "Bitmap355.bmp", 0, 0, 139, 79, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		Switch08.image01 = nativeImage2;
		Switch08.image02 = nativeImage2;
		nativeImage3 = new CgpGraphicFile( "Bitmap357.bmp", 0, 0, 139, 79, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		Switch08.image03 = nativeImage3;
		Switch08.image04 = nativeImage3;

		CgpFont	fonts87[][];
		String	labels87[][];
		fonts87 = new CgpFont[2][1];
		labels87 = new String[2][1];

		labels87[0][0] = "Start";
		fonts87[0][0] = textFont3;
		labels87[1][0] = "\u0634\u0631\u0648\u0639";
		fonts87[1][0] = textFont3;

		Switch08.buzzer = true;
		Switch08.lampID = 1002;

		Switch08.switchFonts = fonts87;
		Switch08.labels = labels87;

		Switch08.labelClr = intArray0;
		Switch08.label3DClr = intArray1;
		Switch08.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch08.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch08.word0 = TagDB.SINAMICS_V20_VAR.STW_ControlWord;
		Switch08.wordID0 = 1003;
		Switch08.word1 = TagDB.SINAMICS_V20_VAR.STW_ControlWord;
		Switch08.wordID1 = 1004;
		Switch08.exprServer = exprServer;
		Switch08.alwaysDrawBackground = false;

		Switch08.init();
		Lamp07 = new Lamp_0018(34, 126, 183, 230, panelContext, this);
		Lamp07.controlTag01 = TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1;
		nativeImage4 = new CgpGraphicFile( "Bitmap283.bmp", 0, 0, 149, 104, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		nativeImage5 = new CgpGraphicFile( "Bitmap284.bmp", 0, 0, 149, 104, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		CgpGraphicFile imageArray2[] = {nativeImage4, nativeImage5, };
		Lamp07.imageFiles = imageArray2;

		CgpFont	fonts89[][];
		String	labels89[][];
		fonts89 = new CgpFont[2][2];
		labels89 = new String[2][2];

		labels89[0][0] = "Clean";
		fonts89[0][0] = textFont7;
		labels89[1][0] = "\u062a\u0645\u06cc\u0632";
		fonts89[1][0] = textFont8;

		labels89[0][1] = "Dirty";
		fonts89[0][1] = textFont7;
		labels89[1][1] = "\u06a9\u062b\u06cc\u0641";
		fonts89[1][1] = textFont8;

		Lamp07.labelClr = intArray0;
		Lamp07.label3DClr = intArray1;

		Lamp07.lampFonts = fonts89;
		Lamp07.labels = labels89;

		Lamp07.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp07.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp07.exprServer = exprServer;
		Lamp07.alwaysDrawBackground = false;

		Lamp07.init();

		CgpMLText Text09 = new CgpMLText
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
			48,	// x1
			130,	// y1
			167,	// x2
			169,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text09.set3DColor(0x00ff0000);
		Lamp05 = new Lamp_0018(34, 253, 183, 357, panelContext, this);
		Lamp05.controlTag01 = TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2;
		Lamp05.imageFiles = imageArray2;

		CgpFont	fonts93[][];
		String	labels93[][];
		fonts93 = new CgpFont[2][2];
		labels93 = new String[2][2];

		labels93[0][0] = "Clean";
		fonts93[0][0] = textFont7;
		labels93[1][0] = "\u062a\u0645\u06cc\u0632";
		fonts93[1][0] = textFont8;

		labels93[0][1] = "Dirty";
		fonts93[0][1] = textFont7;
		labels93[1][1] = "\u06a9\u062b\u06cc\u0641";
		fonts93[1][1] = textFont8;

		Lamp05.labelClr = intArray0;
		Lamp05.label3DClr = intArray1;

		Lamp05.lampFonts = fonts93;
		Lamp05.labels = labels93;

		Lamp05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp05.exprServer = exprServer;
		Lamp05.alwaysDrawBackground = false;

		Lamp05.init();

		CgpMLText Text10 = new CgpMLText
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
			45,	// x1
			260,	// y1
			174,	// x2
			299,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text10.set3DColor(0x00ff0000);
		Lamp06 = new Lamp_0018(623, 126, 772, 230, panelContext, this);
		Lamp06.controlTag01 = TagDB.SINAMICS_V20_VAR.STOP_RUN;
		CgpGraphicFile imageArray3[] = {nativeImage5, nativeImage4, };
		Lamp06.imageFiles = imageArray3;

		CgpFont	fonts94[][];
		String	labels94[][];
		fonts94 = new CgpFont[2][2];
		labels94 = new String[2][2];

		labels94[0][0] = "Deactive";
		fonts94[0][0] = textFont7;
		labels94[1][0] = "\u0645\u062a\u0648\u0642\u0641";
		fonts94[1][0] = textFont8;

		labels94[0][1] = "Active";
		fonts94[0][1] = textFont7;
		labels94[1][1] = "\u062f\u0631\u062d\u0627\u0644 \u06a9\u0627\u0631\n";
		fonts94[1][1] = textFont8;

		Lamp06.labelClr = intArray0;
		Lamp06.label3DClr = intArray1;

		Lamp06.lampFonts = fonts94;
		Lamp06.labels = labels94;

		Lamp06.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp06.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp06.exprServer = exprServer;
		Lamp06.alwaysDrawBackground = false;

		Lamp06.init();
		Lamp08 = new Lamp_0018(623, 253, 772, 357, panelContext, this);
		Lamp08.controlTag01 = TagDB.SINAMICS_V20_VAR.READY_TO_RUN;
		Lamp08.imageFiles = imageArray3;

		CgpFont	fonts95[][];
		String	labels95[][];
		fonts95 = new CgpFont[2][2];
		labels95 = new String[2][2];

		labels95[0][0] = "Deactive";
		fonts95[0][0] = textFont7;
		labels95[1][0] = "\u0645\u062a\u0648\u0642\u0641";
		fonts95[1][0] = textFont8;

		labels95[0][1] = "Active";
		fonts95[0][1] = textFont7;
		labels95[1][1] = "\u062f\u0631\u062d\u0627\u0644 \u06af\u0631\u062f\u0634\n";
		fonts95[1][1] = textFont8;

		Lamp08.labelClr = intArray0;
		Lamp08.label3DClr = intArray1;

		Lamp08.lampFonts = fonts95;
		Lamp08.labels = labels95;

		Lamp08.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp08.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp08.exprServer = exprServer;
		Lamp08.alwaysDrawBackground = false;

		Lamp08.init();

		CgpMLText Text02 = new CgpMLText
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
			640,	// x1
			130,	// y1
			759,	// x2
			169,	// y2
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
			9,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			640,	// x1
			260,	// y1
			759,	// x2
			299,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text03.set3DColor(0x00ff0000);

		Image03 = new CgpGraphicFile
		(
			"Bitmap150.bmp",
			415,	// x1
			218,	// y1
			547,	// x2
			282,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		NumericDisplay02 = new CgpNumericDisplay(428, 229, 533, 272, panelContext, this);
		NumericDisplay02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay02.variable = TagDB.SINAMICS_V20_VAR.SPEED;
		NumericDisplay02.zeroSuppress = true;
		NumericDisplay02.zeroDisplay = true;
		NumericDisplay02.displayDigits = 5;
		NumericDisplay02.decimalPlaces = 0;
		NumericDisplay02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay02.unitStrings = new String[]{" RPM",""};
		CgpFont	fonts82[][] = {
			{ textFont7 },
			{ textFont8 },
			};
		NumericDisplay02.fonts = fonts82;
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
		NumericDisplay02.drawObject = displayDraw0;
		NumericDisplay02.alwaysDrawBackground = true;
		NumericDisplay02.exprServer = exprServer;
		NumericDisplay02.init();

		Image04 = new CgpGraphicFile
		(
			"Bitmap150.bmp",
			253,	// x1
			219,	// y1
			385,	// x2
			283,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		NumericDisplay01 = new CgpNumericDisplay(264, 230, 374, 273, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.SINAMICS_V20_VAR.ANALOG_IN_1;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 5;
		NumericDisplay01.decimalPlaces = 0;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = new String[]{" CFM",""};
		NumericDisplay01.fonts = fonts82;
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
		NumericDisplay01.drawObject = displayDraw0;
		NumericDisplay01.alwaysDrawBackground = true;
		NumericDisplay01.exprServer = exprServer;
		NumericDisplay01.init();

		Image01 = new CgpGraphicFile
		(
			"Bitmap179.bmp",
			665,	// x1
			400,	// y1
			738,	// x2
			473,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Image05 = new CgpGraphicFile
		(
			"Bitmap184.bmp",
			157,	// x1
			399,	// y1
			230,	// x2
			472,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Image06 = new CgpGraphicFile
		(
			"Bitmap183.bmp",
			59,	// x1
			399,	// y1
			132,	// x2
			472,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);
		Image07 = new CgpGraphicFile
		(
			"Bitmap263.bmp",
			0,	// x1
			0,	// y1
			169,	// x2
			59,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Image08 = new CgpGraphicFile
		(
			"Bitmap264.bmp",
			0,	// x1
			0,	// y1
			169,	// x2
			59,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Lamp03 = new Lamp_0019(234, 328, 313, 392, panelContext, this);
		int intArray4[] = {0, 2, };
		Lamp03.blinkStates = intArray4;
		Lamp03.controlTag01 = TagDB.SINAMICS_V20_VAR.WARNING;
		nativeImage6 = new CgpGraphicFile( "Bitmap261.bmp", 0, 0, 79, 64, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		nativeImage7 = new CgpGraphicFile( "Bitmap262.bmp", 0, 0, 79, 64, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		CgpGraphicFile imageArray5[] = {nativeImage6, nativeImage7, };
		Lamp03.imageFiles = imageArray5;
		Lamp03.exprServer = exprServer;
		Lamp03.alwaysDrawBackground = false;

		Lamp03.init();

		NumericDisplay03 = new CgpNumericDisplay(403, 339, 503, 379, panelContext, this);
		NumericDisplay03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay03.variable = TagDB.SINAMICS_V20_VAR.LAST_FAULT;
		NumericDisplay03.zeroSuppress = true;
		NumericDisplay03.zeroDisplay = false;
		NumericDisplay03.displayDigits = 5;
		NumericDisplay03.decimalPlaces = 0;
		NumericDisplay03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay03.unitStrings = null;
		NumericDisplay03.fonts = fonts82;
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
		NumericDisplay03.drawObject = displayDraw0;
		NumericDisplay03.alwaysDrawBackground = false;
		NumericDisplay03.exprServer = exprServer;
		NumericDisplay03.init();

		NumericDisplay04 = new CgpNumericDisplay(299, 340, 393, 380, panelContext, this);
		NumericDisplay04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay04.variable = TagDB.SINAMICS_V20_VAR.LAST_WARNING;
		NumericDisplay04.zeroSuppress = true;
		NumericDisplay04.zeroDisplay = false;
		NumericDisplay04.displayDigits = 5;
		NumericDisplay04.decimalPlaces = 0;
		NumericDisplay04.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay04.unitStrings = null;
		NumericDisplay04.fonts = fonts82;
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
		NumericDisplay04.drawObject = displayDraw0;
		NumericDisplay04.alwaysDrawBackground = true;
		NumericDisplay04.exprServer = exprServer;
		NumericDisplay04.init();
		Lamp04 = new Lamp_0019(485, 328, 564, 392, panelContext, this);
		Lamp04.blinkStates = intArray4;
		Lamp04.controlTag01 = TagDB.SINAMICS_V20_VAR.FAULT;
		Lamp04.imageFiles = imageArray5;
		Lamp04.exprServer = exprServer;
		Lamp04.alwaysDrawBackground = false;

		Lamp04.init();

		CgpMLText Text11 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			10,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			403,	// x1
			341,	// y1
			502,	// x2
			380,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text11.set3DColor(0x00ff0000);

		CgpMLText Text12 = new CgpMLText
		(
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			stringDBList,	// string list
			0,	// lineSpacing
			11,	// stringID
			1,	// languageID
			CgpMLText.TYPE_STATIC_TEXT, //type
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			300,	// x1
			340,	// y1
			392,	// x2
			381,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text12.set3DColor(0x00ff0000);
		((CgpWindow)owner).drawBack();

		CgpTouchAnimation TouchImage01 = new CgpExprTouchAnimation
		(
			Image01,	// object name
			CgpTouchAnimation.TOUCH_BEEP,
			exprServer,
			1005,	// expindx
			-1,	// expindx
			-1	// expindx
		);

		CgpTouchAnimation TouchImage05 = new CgpExprTouchAnimation
		(
			Image05,	// object name
			CgpTouchAnimation.TOUCH_BEEP,
			exprServer,
			1006,	// expindx
			-1,	// expindx
			-1	// expindx
		);

		CgpTouchAnimation TouchImage06 = new CgpExprTouchAnimation
		(
			Image06,	// object name
			CgpTouchAnimation.TOUCH_BEEP,
			exprServer,
			1007,	// expindx
			-1,	// expindx
			-1	// expindx
		);

		CgpVisibilityAnimation Text11Visible = new CgpVisibilityAnimation
		(
			Text11,	// object name
			exprServer,
			1008	// index
		);

		CgpVisibilityAnimation Text12Visible = new CgpVisibilityAnimation
		(
			Text12,	// object name
			exprServer,
			1009	// index
		);

		CgpMLText MLTextList[] =
		{
			Text01,
			Text04,
			Text05,
			Text06,
			Text07,
			Text08,
			Text09,
			Text10,
			Text02,
			Text03,
			Text11,
			Text12,
		};
		CgpFontAnimation fontMLText = new CgpFontAnimation(TagDB._UserApplicationLanguage, MLTextList,0);
		TagDB._UserApplicationLanguage.addEventListener(fontMLText, 0, panelContext);
		TagDB._Day.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch03, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.STOP_RUN.addEventListener(Switch03, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch08, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.STOP_RUN.addEventListener(Switch08, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1.addEventListener(Lamp07, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp07, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp05, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2.addEventListener(Lamp05, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp06, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.STOP_RUN.addEventListener(Lamp06, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp08, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.READY_TO_RUN.addEventListener(Lamp08, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.SPEED.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.ANALOG_IN_1.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.WARNING.addEventListener(Lamp03, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.LAST_FAULT.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.LAST_WARNING.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.FAULT.addEventListener(Lamp04, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.LAST_FAULT.addEventListener(Text11Visible, 0, panelContext);
		TagDB.SINAMICS_V20_VAR.LAST_WARNING.addEventListener(Text12Visible, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[31];
		zOrderList[0] = DateDisplay01;
		zOrderList[1] = TimeDisplay01;
		zOrderList[2] = Text01;
		zOrderList[3] = Switch03;
		zOrderList[4] = Text04;
		zOrderList[5] = Text05;
		zOrderList[6] = Text06;
		zOrderList[7] = Text07;
		zOrderList[8] = Text08;
		zOrderList[9] = Switch08;
		zOrderList[10] = Lamp07;
		zOrderList[11] = Text09;
		zOrderList[12] = Lamp05;
		zOrderList[13] = Text10;
		zOrderList[14] = Lamp06;
		zOrderList[15] = Lamp08;
		zOrderList[16] = Text02;
		zOrderList[17] = Text03;
		zOrderList[18] = Image03;
		zOrderList[19] = NumericDisplay02;
		zOrderList[20] = Image04;
		zOrderList[21] = NumericDisplay01;
		zOrderList[22] = Image01;
		zOrderList[23] = Image05;
		zOrderList[24] = Image06;
		zOrderList[25] = Lamp03;
		zOrderList[26] = NumericDisplay03;
		zOrderList[27] = NumericDisplay04;
		zOrderList[28] = Lamp04;
		zOrderList[29] = Text11;
		zOrderList[30] = Text12;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			TouchImage06,
			TouchImage05,
			TouchImage01,
			Switch08,
			Switch03,
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
		tagListVector.add(TagDB.SINAMICS_V20_VAR.STOP_RUN);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.WARNING);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.LAST_WARNING);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.SPEED);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.READY_TO_RUN);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.ANALOG_IN_1);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.DIGITAL_IN_1);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.DIGITAL_IN_2);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.FAULT);
		tagListVector.add(TagDB.SINAMICS_V20_VAR.LAST_FAULT);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		Image02.clean();
		nativeImage0.clean();
		nativeImage1.clean();
		nativeImage2.clean();
		nativeImage3.clean();
		nativeImage4.clean();
		nativeImage5.clean();
		Image03.clean();
		Image04.clean();
		Image01.clean();
		Image05.clean();
		Image06.clean();
		Image07.clean();
		Image08.clean();
		nativeImage6.clean();
		nativeImage7.clean();

		Lamp04.shutdown();

		NumericDisplay04.shutdown();

		NumericDisplay03.shutdown();

		Lamp03.shutdown();

		NumericDisplay01.shutdown();

		NumericDisplay02.shutdown();

		Lamp08.shutdown();

		Lamp06.shutdown();

		Lamp05.shutdown();

		Lamp07.shutdown();

		Switch08.shutdown();

		Switch03.shutdown();

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

		// Image07
		_g.drawImage(Image07, 232 + _dx, 331 + _dy);
		// Image08
		_g.drawImage(Image08, 393 + _dx, 331 + _dy);
		NumericDisplay03.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
