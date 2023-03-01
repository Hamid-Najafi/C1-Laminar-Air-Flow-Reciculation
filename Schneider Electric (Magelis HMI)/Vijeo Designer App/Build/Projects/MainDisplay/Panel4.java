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

public class Panel4 extends CgpPanel
{
	public Panel4XprSrv exprServer;

	public Switch_0003 Switch01;
	public Switch_0004 Switch02;
	public CgpNumericDisplay DateDisplay01;
	public CgpNumericDisplay TimeDisplay01;
	public CgpNumericDisplay NumericDisplay01;
	public Switch_0005 Switch05;
	public Switch_0016 Switch03;
	CgpGraphicFile Image02;
	CgpGraphicFile Image01;
	public CgpSmartKeypadDec  decKeypad;
	private CgpMasterPanel masterPanel = null;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel4XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Password";
	}
	public int getPanelID()
	{
		return 4;
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
		CgpFont textFont6 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)24, (byte)0);
		CgpFont textFont7 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)24, (byte)0);

		String textStrings[];
		CgpFont textFonts[];

		CgpStringDB  dbList1;
		textStrings = new String[2];
		textFonts = new CgpFont[2];
		textStrings[0] = "Laminar Air Flow Reciculation System";
		textStrings[1] = "Enter Password";
		textFonts[0] = textFont4;
		textFonts[1] = textFont6;
		dbList1 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB  dbList2;
		textStrings = new String[2];
		textFonts = new CgpFont[2];
		textStrings[0] = " \u0633\u06cc\u0633\u062a\u0645 \u0628\u0627\u0632\u06cc\u0627\u0628\u06cc \u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627\u06cc \u0644\u0627\u0645\u06cc\u0646\u0627\u0631 ";
		textStrings[1] = "\u0631\u0645\u0632 \u0639\u0628\u0648\u0631 \u0631\u0627 \u0648\u0627\u0631\u062f \u0646\u0645\u0627\u06cc\u06cc\u062f";
		textFonts[0] = textFont5;
		textFonts[1] = textFont7;
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
			280,	// x1
			80,	// y1
			519,	// x2
			179,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text02.set3DColor(0x00ff0000);

		NumericDisplay01 = new CgpNumericDisplay(280, 180, 519, 279, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.SettingModePass;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 4;
		NumericDisplay01.decimalPlaces = 0;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = null;
		CgpFont	fonts54[][] = {
			{ textFont6 },
			{ textFont7 },
			};
		NumericDisplay01.fonts = fonts54;
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
		Switch05 = new Switch_0005(40, 400, 159, 459, panelContext, this);
		Switch05.frameClr = 0x006e726e;
		Switch05.foreClr = 0x00c3bfc3;
		Switch05.backClr = 0x00000000;
		Switch05.pattern = 1;

		CgpFont	fonts55[][];
		String	labels55[][];
		fonts55 = new CgpFont[2][1];
		labels55 = new String[2][1];

		labels55[0][0] = "Home";
		fonts55[0][0] = textFont0;
		labels55[1][0] = "\u0635\u0641\u062d\u0647 \u0627\u0635\u0644\u06cc";
		fonts55[1][0] = textFont0;

		Switch05.buzzer = true;

		Switch05.switchFonts = fonts55;
		Switch05.labels = labels55;

		Switch05.labelClr = intArray0;
		Switch05.label3DClr = intArray1;
		Switch05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch05.panelChange0 = 1;
		Switch05.exprServer = exprServer;
		Switch05.alwaysDrawBackground = false;

		Switch05.init();
		Switch03 = new Switch_0016(360, 300, 459, 339, panelContext, this);
		Switch03.foreClr = 0x0000e600;
		Switch03.backClr = 0x00000000;
		Switch03.pattern = 1;

		CgpFont	fonts56[][];
		String	labels56[][];
		fonts56 = new CgpFont[2][1];
		labels56 = new String[2][1];

		labels56[0][0] = "Confirm";
		fonts56[0][0] = textFont3;
		labels56[1][0] = "\u062a\u0627\u06cc\u06cc\u062f";
		fonts56[1][0] = textFont0;

		Switch03.buzzer = true;

		Switch03.switchFonts = fonts56;
		Switch03.labels = labels56;

		Switch03.labelClr = intArray0;
		Switch03.label3DClr = intArray1;
		Switch03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch03.bit0 = TagDB.SettingModePassConfirm;
		Switch03.exprServer = exprServer;
		Switch03.alwaysDrawBackground = false;

		Switch03.init();
		((CgpWindow)owner).drawBack();

		CgpMLText MLTextList[] =
		{
			Text01,
			Text02,
		};
		CgpFontAnimation fontMLText = new CgpFontAnimation(TagDB._UserApplicationLanguage, MLTextList,0);
		TagDB._UserApplicationLanguage.addEventListener(fontMLText, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch02, 0, panelContext);
		TagDB._Day.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB.SettingModePass.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch05, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch03, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[10];
		zOrderList[0] = Switch01;
		zOrderList[1] = Switch02;
		zOrderList[2] = DateDisplay01;
		zOrderList[3] = TimeDisplay01;
		zOrderList[4] = Text01;
		zOrderList[5] = Text02;
		zOrderList[6] = NumericDisplay01;
		zOrderList[7] = Switch05;
		zOrderList[8] = Switch03;
		zOrderList[9] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			Switch03,
			Switch05,
			NumericDisplay01,
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
		tagListVector.add(TagDB.SettingModePass);
		tagListVector.add(TagDB.SettingModePassConfirm);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		Image02.clean();
		Image01.clean();

		Switch03.shutdown();

		Switch05.shutdown();

		NumericDisplay01.shutdown();

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

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
