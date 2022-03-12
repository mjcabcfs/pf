/**
 *
 */
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

/**
 * @author MA
 *
 */
public class MoveMouse {

	/**
	 * @param args
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("pressing CTRL +C to EXIT.");
		Robot r = new Robot();
		int st = 12;
		if(args.length > 0 && args[0].matches("^[0-9]+$")) {
			st = Integer.valueOf(args[0]);
		}
        boolean xP = true;
        while(true) {

        	Thread.sleep(st*1000);
        	PointerInfo pI = MouseInfo.getPointerInfo();
    		Point point = pI.getLocation();
    		int y = (int)point.getY();
    		int x = (int)point.getX();
        	if(xP) {
        		x+=50;
        	} else {
        		x-=50;
        	}
        	xP = !xP;
        	System.out.println(y);
        	r.mouseMove(x, y);
        }
	}

}
