package Projects.MainDisplay;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class Square02
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, int frameClr, int foreClr, int backClr, int pattern, boolean pressed, int lamp)
{
if(pressed)
{
	if(lamp > 0)
	{
		// Rectangle
		c.fillRectWithBorder(
			frameClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

		// Line
		c.drawLine(
			(x2 - 2),
			(y1 + 2),
			(x2 - 2),
			(y2 - 2),
			0x00000000,	// LineColor
			backClr,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

		// Line
		c.drawLine(
			(x1 + 2),
			(y2 - 2),
			(x2 - 2),
			(y2 - 2),
			0x00000000,	// LineColor
			backClr,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

	}
	else
	{
		// Rectangle
		c.fillRectWithBorder(
			frameClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

		// Line
		c.drawLine(
			(x2 - 2),
			(y1 + 2),
			(x2 - 2),
			(y2 - 2),
			0x00000000,	// LineColor
			backClr,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

		// Line
		c.drawLine(
			(x1 + 2),
			(y2 - 2),
			(x2 - 2),
			(y2 - 2),
			0x00000000,	// LineColor
			backClr,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

	}
}
else
{
	if(lamp > 0)
	{
		// Rectangle
		c.fillRectWithBorder(
			frameClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

		// Line
		c.drawLine(
			(x2 - 2),
			(y1 + 2),
			(x2 - 2),
			(y2 - 2),
			0x00000000,	// LineColor
			backClr,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

		// Line
		c.drawLine(
			(x1 + 2),
			(y2 - 2),
			(x2 - 2),
			(y2 - 2),
			0x00000000,	// LineColor
			backClr,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

	}
	else
	{
		// Rectangle
		c.fillRectWithBorder(
			frameClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

		// Line
		c.drawLine(
			(x2 - 2),
			(y1 + 2),
			(x2 - 2),
			(y2 - 2),
			0x00000000,	// LineColor
			backClr,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

		// Line
		c.drawLine(
			(x1 + 2),
			(y2 - 2),
			(x2 - 2),
			(y2 - 2),
			0x00000000,	// LineColor
			backClr,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

	}
}
}
}
