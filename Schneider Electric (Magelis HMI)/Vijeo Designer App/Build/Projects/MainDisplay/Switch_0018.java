package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;
import gpclasses.util.io.*;
import gpclasses.userScripts.*;

public class Switch_0018 extends CgpSmartObject
{
	private boolean secured = false;
	public int securityLevel = -1;
	public CgpFont[][] switchFonts;
	public String[][] labels;
	public int langID = 0;

	public int[] labelClr;
	public int[] label3DClr;
	public int direction;

	public int vertAlign;

	public int horzAlign;

	public CgpGraphicFile	image01;
	public CgpGraphicFile	image02;
	public CgpGraphicFile	image03;
	public CgpGraphicFile	image04;
	private boolean	pressed = false;
	public boolean	buzzer = false;

	private String[]	curLabels;
	private CgpFont[]	curFont;
	private int	curLabelIndex = 0;

	private CgpCanvas	c;
	private int		lamp = 0;
	public int	lampID;
	private int quality = 0;
	public CgpTag	word0;
	public int	wordID0;
	public CgpTag	word1;
	public int	wordID1;
	public CgpExpressionServer exprServer;
	public CgpGraphicFile overlayImageOff;
	public CgpGraphicFile overlayImageOn;

	public Switch_0018(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
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

		CgpGraphicFile image;
		if(!pressed && lamp == 0)
			image = image01;
		else if(pressed && lamp == 0)
			image = image02;
		else if(!pressed && lamp > 0)
			image = image03;
		else
			image = image04;
		ImageUserState.draw(c,x1,y1,x2,y2,
			image,
			pressed,
			lamp);

		CgpGraphicFile overlayImage;
		if (lamp == 0)
		{
			overlayImage = overlayImageOff;
		}
		else
		{
			overlayImage = overlayImageOn;
		}

		if (overlayImage != null)
		{
			int imageWidth = overlayImage.getWidth(overlayImage.x1, overlayImage.x2);
			int imageHeight = overlayImage.getHeight(overlayImage.y1, overlayImage.y2);
			c.drawImage(
				overlayImage,
				x1 + (getWidth(x1, x2) - imageWidth) / 2,
				y1 + (getHeight(y1, y2) - imageHeight) / 2
			);
		}

		int labelX = (x1 + 0);
		int labelY = (y1 + 0);
		int labelWidth = (x2 - 0)-(x1 + 0)+1;
		int labelHeight = (y2 - 0)-(y1 + 0)+1;

		if(lamp == 0)
			curLabelIndex = 0;
		else 
			curLabelIndex = 1;

		curLabels = labels[langID];
		curFont = switchFonts[langID];

		c.drawStringWithBorder(CgpColor.makeTransparentColor(0), labelClr[curLabelIndex], CgpColor.makeTransparentColor(0), label3DClr[curLabelIndex], 1, 1, curLabels[0], labelX, labelY, labelWidth, labelHeight, CgpText.DISPLAY_ANGLE_0, direction, horzAlign, vertAlign, 0, curFont[0]);
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
			if(CgpSecurityControl.securityControl.testSecurityAccess(securityLevel))
			{
				secured = false;
				this.clearSecured();
			}
			else
			{
				secured = true;
				this.setSecured();
			}
		}
		lamp = exprServer.executeIntExpression(lampID);
		quality = exprServer.quality;
		if (DataChangeEvent.tag == TagDB._UserApplicationLanguage)
		{
			langID = CgpLanguageMgr.languageMgr.getAppLanguageIdByNum(TagDB._UserApplicationLanguage.getIntValue());
		}

		return true;
	}

	public boolean onPointerPress(CgpPointerEvent PointerEvent)
	{
		if(secured)
		{
			if (drawSecuredType != DRAW_SECURED_INVISIBLE)
			{
				if(CgpSecurityControl.securityControl.lockedObjectLoginPanel > -1)
					CgpTagDB._CurPanelID.write(CgpSecurityControl.securityControl.lockedObjectLoginPanel);
				return false;
			}
			else
			{
				return false;
			}
		}
		if(PointerEvent.getRepeatCount() == 0)
		{
			pressed = true;
			if(buzzer)
				CgpSystem.beep(false);

			// When Actions
			if(word0.getTagType() == CgpTag.TAG_TYPE_FLOAT)
				word0.queuedWrite(exprServer.executeFloatExpression(wordID0), 0);
			else
				word0.queuedWrite(exprServer.executeIntExpression(wordID0), 0);
			if(word1.getTagType() == CgpTag.TAG_TYPE_FLOAT)
				word1.queuedWrite(exprServer.executeFloatExpression(wordID1), 0);
			else
				word1.queuedWrite(exprServer.executeIntExpression(wordID1), 0);
		}

		// While Actions

		return true;
	}

	public boolean onPointerRelease()
	{
		synchronized (this)
		{
			if (secured)
				return false;
			pressed = false;
		}

		// When Actions

		// While Actions

		// Release Actions
		return true;
	}

	public void onInit()
	{
		langID = CgpLanguageMgr.languageMgr.getAppLanguageIdByNum(TagDB._UserApplicationLanguage.getIntValue());
		curFont = switchFonts[langID];
		curLabels = labels[langID];
	}

}

