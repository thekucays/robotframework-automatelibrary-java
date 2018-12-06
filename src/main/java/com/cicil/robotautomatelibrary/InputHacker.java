package com.cicil.robotautomatelibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cicil.extenders.WelcomeExtender;
import com.cicil.interfaces.Welcomer;
import com.testinium.deviceinformation.helper.ProcessHelper;

public class InputHacker extends WelcomeExtender implements Welcomer{
	//don't ever forget to use this on every class, so robot will recognize it
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	
	public void welcomeTheTester() {
		super.printWelcome(this.getClass().getName());
	}
	
	public void inputTextByCode(String deviceId, String input) throws IOException{	
		welcomeTheTester();
		String commandStr = "input keyboard text ";
		
		Process process = null;
		String commandString = "";
        if(deviceId != null) {
            commandString = String.format("%s", "adb -s " + deviceId + " shell " + commandStr + input);
        } else {
            commandString = String.format("%s", "adb shell " + commandStr + input);
        }
        
        System.out.print("Command is "+commandString+"\n");
        try {
            process = ProcessHelper.runTimeExec(commandString);
        	// nyomot langsung dari https://github.com/Testinium/MobileDeviceInfo/blob/master/src/main/java/com/testinium/deviceinformation/helper/ProcessHelper.java
            //process = Runtime.getRuntime().exec(commandString);
        } catch (IOException e) {
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.print(line+"\n");
        }
	}

	
}
