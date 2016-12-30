package com.screencapture;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenCapture {
	
	public void getScreenCapture() throws AWTException, IOException{
		Robot robot = new Robot();
		String format = "jpg";
		String fileName = "C:\\JSP & Servelets\\ConfirmationScreen\\Screenshot." + format;
		
		Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage bufferedImage = new Robot().createScreenCapture(rectangle);
		ImageIO.write(bufferedImage,format,new File(fileName));
		
		
	}

}
