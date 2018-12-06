package com.cicil.robotautomatelibrary;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import com.cicil.extenders.WelcomeExtender;
import com.cicil.interfaces.Welcomer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;


public class QRDecoder extends WelcomeExtender implements Welcomer{
	//don't ever forget to use this on every class, so robot will recognize it
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	public String decodeQRFromImgUrl(String qrUrl) throws Exception{
		// be a good boy
		welcomeTheTester();
		
		URL url = new URL(qrUrl);
		BufferedImage bufferedImage = ImageIO.read(url);
		
		// here comes the ZXing's part
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result result = new MultiFormatReader().decode(binaryBitmap);
		
		// finally, get the string
		String resultString = result.toString();
		return resultString;
	}

	public void welcomeTheTester() {
		super.printWelcome(this.getClass().getName());
	}
}
