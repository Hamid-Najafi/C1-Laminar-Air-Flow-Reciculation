package Projects.MainDisplay;
import gpclasses.baseclasses.*;
import gpclasses.system.CgpWindow;

public class WindowDB extends CgpObject
{
	public static CgpWindow BasePopups = new CgpWindow(240, 80, CgpWindow.WIN_POP | CgpWindow.TL | CgpWindow.NO_FRAME | CgpWindow.NON_PERSISTENT );

	static {
		BasePopups.setPanelHistory(32);
	}
}
