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

	public Switch_0017 Switch01;
	public Switch_0017 Switch02;
	public Switch_0016 Switch03;
	public CgpNumericDisplay DateDisplay01;
	public CgpNumericDisplay TimeDisplay01;
	public CgpNumericDisplay NumericDisplay01;
	CgpGraphicFile Image02;
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	CgpGraphicFile Image03;
	CgpGraphicFile Image04;
	CgpGraphicFile Image07;
	CgpGraphicFile Image06;
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
		CgpFont textFont1 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)24, (byte)0);
		CgpFont textFont2 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)24, (byte)0);
		CgpFont textFont3 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)16, (byte)0);
		CgpFont textFont4 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont5 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)14, (byte)0);
		CgpFont textFont6 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)18, (byte)0);
		CgpFont textFont7 = new CgpFont("PF Arial", CgpFont.BOLD, (byte)20, (byte)0);
		CgpFont textFont8 = new CgpFont("PF Arabic S", CgpFont.BOLD, (byte)20, (byte)0);

		String textStrings[];
		CgpFont textFonts[];

		CgpStringDB  dbList1;
		textStrings = new String[4];
		textFonts = new CgpFont[4];
		textStrings[0] = "Enter Password";
		textStrings[1] = "Language";
		textStrings[2] = "Laminar Air Flow Reciculation System";
		textStrings[3] = "Restart";
		textFonts[0] = textFont1;
		textFonts[1] = textFont1;
		textFonts[2] = textFont3;
		textFonts[3] = textFont7;
		dbList1 = new CgpStringDB(textStrings, textFonts);

		CgpStringDB  dbList2;
		textStrings = new String[4];
		textFonts = new CgpFont[4];
		textStrings[0] = "\u0631\u0645\u0632 \u0639\u0628\u0648\u0631 \u0631\u0627 \u0648\u0627\u0631\u062f \u0646\u0645\u0627\u06cc\u06cc\u062f";
		textStrings[1] = "\u0632\u0628\u0627\u0646";
		textStrings[2] = " \u0633\u06cc\u0633\u062a\u0645 \u0628\u0627\u0632\u06cc\u0627\u0628\u06cc \u062c\u0631\u06cc\u0627\u0646 \u0647\u0648\u0627\u06cc \u0644\u0627\u0645\u06cc\u0646\u0627\u0631 ";
		textStrings[3] = "\u0631\u0627\u0647 \u0627\u0646\u062f\u0627\u0632\u06cc \u0645\u062c\u062f\u062f";
		textFonts[0] = textFont2;
		textFonts[1] = textFont2;
		textFonts[2] = textFont6;
		textFonts[3] = textFont8;
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

		Switch01 = new Switch_0017(248, 197, 351, 277, panelContext, this);

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
		Switch02 = new Switch_0017(92, 198, 192, 276, panelContext, this);

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
			425,	// x1
			107,	// y1
			664,	// x2
			184,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text02.set3DColor(0x00ff0000);
		Switch03 = new Switch_0016(491, 311, 590, 350, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap253.bmp", 0, 0, 99, 39, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		Switch03.image01 = nativeImage0;
		nativeImage1 = new CgpGraphicFile( "Bitmap254.bmp", 0, 0, 99, 39, 0, CgpColor.makeTransparentColor(0x002a2f2a),this);
		Switch03.image02 = nativeImage1;

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
		Switch03.alwaysDrawBackground = false;

		Switch03.init();

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
			88,	// x1
			105,	// y1
			355,	// x2
			184,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text03.set3DColor(0x00ff0000);

		DateDisplay01 = new CgpNumericDisplay(7, 20, 106, 59, panelContext, this);
		DateDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		DateDisplay01.dateTimeFormat = CgpDate.YYYY_MM_DD;
		DateDisplay01.dateTimeListenVariable = TagDB._Day;
		CgpFont	fonts58[][] = {
			{ textFont4 },
			{ textFont5 },
			};
		DateDisplay01.fonts = fonts58;
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
		CgpFont	fonts59[][] = {
			{ textFont3 },
			{ textFont0 },
			};
		TimeDisplay01.fonts = fonts59;
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
			2,	// stringID
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
			"Bitmap252.bmp",
			419,	// x1
			175,	// y1
			668,	// x2
			292,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		NumericDisplay01 = new CgpNumericDisplay(440, 192, 645, 274, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.SettingModePass;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 4;
		NumericDisplay01.decimalPlaces = 0;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = null;
		CgpFont	fonts54[][] = {
			{ textFont1 },
			{ textFont2 },
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
		NumericDisplay01.drawObject = displayDraw0;
		NumericDisplay01.alwaysDrawBackground = true;
		NumericDisplay01.exprServer = exprServer;
		NumericDisplay01.useLocalMinMax  = true;
		NumericDisplay01.minExpr   = 1000;
		NumericDisplay01.maxExpr   = 1001;
		NumericDisplay01.init();

		Image04 = new CgpGraphicFile
		(
			"Bitmap273.bmp",
			250,	// x1
			197,	// y1
			349,	// x2
			276,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Image07 = new CgpGraphicFile
		(
			"Bitmap274.bmp",
			93,	// x1
			197,	// y1
			192,	// x2
			276,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

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

		Image01 = new CgpGraphicFile
		(
			"Bitmap432.bmp",
			135,	// x1
			303,	// y1
			305,	// x2
			375,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

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
			148,	// x1
			314,	// y1
			292,	// x2
			367,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text04.set3DColor(0x00ff0000);
		((CgpWindow)owner).drawBack();

		CgpTouchAnimation TouchImage06 = new CgpExprTouchAnimation
		(
			Image06,	// object name
			CgpTouchAnimation.TOUCH_BEEP,
			exprServer,
			1002,	// expindx
			-1,	// expindx
			-1	// expindx
		);

		CgpTouchAnimation TouchImage01 = new CgpExprTouchAnimation
		(
			Image01,	// object name
			CgpTouchAnimation.TOUCH_BEEP,
			exprServer,
			1003,	// expindx
			-1,	// expindx
			-1	// expindx
		);

		CgpMLText MLTextList[] =
		{
			Text02,
			Text03,
			Text01,
			Text04,
		};
		CgpFontAnimation fontMLText = new CgpFontAnimation(TagDB._UserApplicationLanguage, MLTextList,0);
		TagDB._UserApplicationLanguage.addEventListener(fontMLText, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch02, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Switch03, 0, panelContext);
		TagDB._Day.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(DateDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB.SettingModePass.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NumericDisplay01, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[16];
		zOrderList[0] = Switch01;
		zOrderList[1] = Switch02;
		zOrderList[2] = Text02;
		zOrderList[3] = Switch03;
		zOrderList[4] = Text03;
		zOrderList[5] = DateDisplay01;
		zOrderList[6] = TimeDisplay01;
		zOrderList[7] = Text01;
		zOrderList[8] = Image03;
		zOrderList[9] = NumericDisplay01;
		zOrderList[10] = Image04;
		zOrderList[11] = Image07;
		zOrderList[12] = Image06;
		zOrderList[13] = Image01;
		zOrderList[14] = Text04;
		zOrderList[15] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			TouchImage01,
			TouchImage06,
			NumericDisplay01,
			Switch03,
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
		nativeImage0.clean();
		nativeImage1.clean();
		Image03.clean();
		Image04.clean();
		Image07.clean();
		Image06.clean();
		Image01.clean();

		NumericDisplay01.shutdown();

		TimeDisplay01.shutdown();

		DateDisplay01.shutdown();

		Switch03.shutdown();

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

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
