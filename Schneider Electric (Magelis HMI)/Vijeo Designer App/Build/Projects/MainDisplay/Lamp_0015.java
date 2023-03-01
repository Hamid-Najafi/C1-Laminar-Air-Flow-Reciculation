package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

public class Lamp_0015 extends CgpSmartObject
{
	public CgpFont[][] lampFonts;
	public String[][] labels;
	public int langID = 0;
	public int[] labelClr;
	public int[] label3DClr;
	public int direction;
	public int vertAlign;
	public int horzAlign;
	private int	curState = 0;

	public int	controlID01 = -1;
	public CgpTag	controlTag01;
	public int[]	foreClr;
	public int[]	backClr;
	public int[]	pattern;
	public CgpExpressionServer exprServer;
	public boolean	blink = false;
	public boolean	curBlink = false;
	public int[]	blinkStates;
	public int	blinkSpeed = CgpBlinkAnimation.SPEED_SLOW;

	private String[]	curLabels;
	private CgpFont[]	curFont;
	private int quality = 0;
	private CgpCanvas	c;

	public int	statesNum = 2;
	public Lamp_0015(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
	{
		super(_x1, _y1, _x2, _y2, 0, _contextID, _container);
	}

	public void drawBackground(CgpCanvas c)
	{
	}

	public void draw(int nHandleDC)
	{
		if (c == null)
			c = new CgpCanvas(nHandleDC);


		int labelX = (x1 + 3);
		int labelY = (y1 + 3);
		int labelWidth = (x2 - 3)-(x1 + 3)+1;
		int labelHeight = (y2 - 3)-(y1 + 3)+1;

		curLabels = labels[langID];
		curFont = lampFonts[langID];
		if(blink && curBlink)
		{
		Square05.draw(c,x1,y1,x2,y2,backClr[curState],backClr[curState],pattern[curState],false,0);

	c.drawStringWithBorder(CgpColor.makeTransparentColor(0), labelClr[curState], CgpColor.makeTransparentColor(0), label3DClr[curState], 1, 1, curLabels[curState], labelX, labelY, labelWidth, labelHeight, CgpText.DISPLAY_ANGLE_0, direction, horzAlign, vertAlign, 0, curFont[curState]);
		}
		else
		{
		Square05.draw(c,x1,y1,x2,y2,foreClr[curState],backClr[curState],pattern[curState],false,0);

	c.drawStringWithBorder(CgpColor.makeTransparentColor(0), labelClr[curState], CgpColor.makeTransparentColor(0), label3DClr[curState], 1, 1, curLabels[curState], labelX, labelY, labelWidth, labelHeight, CgpText.DISPLAY_ANGLE_0, direction, horzAlign, vertAlign, 0, curFont[curState]);

		}
		if(quality == CgpTag.TAG_QUALITY_UNKNOWN)
		{
			c.fillRectWithBorder(	0x00000000, 1, CgpLinePattern.LINE_NONE, x1, y1,
				x2 - x1 + 1, y2 - y1 + 1, 0x80000000, 0x00000000 ,
				CgpFillPattern.FILL_DOWNWARD_DIAGONAL, CgpRectangle.SQUARE_CORNERS, 1, 1);
		}
	}

	public boolean onVariableChange(CgpDataChangeEvent DataChangeEvent)
	{
		if (DataChangeEvent.tag == TagDB._UserLevel)
		{
			checkSecurity();
		}
		if(controlID01 != -1)
		{
			curState = (exprServer.executeIntExpression(controlID01) != 0)?1:0;
			quality = exprServer.quality;
		}
		else
		{
			curState = (controlTag01.getIntValue(0) != 0)?1:0;
			quality = controlTag01.getTagDataQuality();
		}
		if(curState > statesNum - 1 || curState < 0)
			curState = statesNum;
		if(blinkStates[curState] == 0)
		{
			if(curBlink)
			{
				curBlink = false;
				TagDB._BlinkAnimation.removeEventListener(this, 0, contextID);
			}
		}
		else if(blinkStates[curState] == 1)
		{
			if(!curBlink)
			{
				curBlink = true;
				TagDB._BlinkAnimation.addEventListener(this, 0, contextID);
			}
			blinkSpeed = CgpBlinkAnimation.SPEED_SLOW;
		}
		else if(blinkStates[curState] == 2)
		{
			if(!curBlink)
			{
				curBlink = true;
				TagDB._BlinkAnimation.addEventListener(this, 0, contextID);
			}
			blinkSpeed = CgpBlinkAnimation.SPEED_FAST;
		}
		if(curBlink)
		{
			int blinkCount = TagDB._BlinkAnimation.getIntValue();
			if((blinkCount % 2 == 0 && blinkSpeed == CgpBlinkAnimation.SPEED_FAST) || (blinkCount / 2 % 2 == 0 && blinkSpeed == CgpBlinkAnimation.SPEED_SLOW))
			{
				blink = false;
			}
			else
			{
				blink = true;
			}
		}

		if (DataChangeEvent.tag == TagDB._UserApplicationLanguage)
		{
			langID = CgpLanguageMgr.languageMgr.getAppLanguageIdByNum(TagDB._UserApplicationLanguage.getIntValue());
		}

		return true;
	}

	public void onInit()
	{
		CgpBlinkAnimation.startBlinkScript();

		langID = CgpLanguageMgr.languageMgr.getAppLanguageIdByNum(TagDB._UserApplicationLanguage.getIntValue());
		curFont = lampFonts[langID];
		curLabels = labels[langID];
	}

}

