package Projects.MainDisplay;
import gpclasses.baseclasses.*;
import gpclasses.system.CgpWindow;

public class WindowDB extends CgpObject
{
	public static CgpWindow WrongPassword = new CgpWindow(400, 240, CgpWindow.WIN_POP | CgpWindow.TL | CgpWindow.NO_FRAME | CgpWindow.NON_PERSISTENT );

	static {
		WrongPassword.setPanelHistory(32);
	}
}
