import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
//import java.util.ArrayList;

class SingleClass {
	
	private Panel panel;
	private Button button;
	private Textbox textbox;
	private static SingleClass userInstance = null;
	private static int count=0, count1=0, count2=0, count3=0;
	private static Boolean flag= false;
	
	private SingleClass(MicroOfficeFactory cf) {
		// TODO Auto-generated constructor stub
		panel = cf.createPanel();
		button = cf.createButton();
		textbox = cf.createTextBox();
	}
	private void run () {
		panel.DisplayName(panel);
		button.DisplayName(button);
		textbox.DisplayName(textbox);
	}
	public static SingleClass getInstance(String name) {
	if(flag == false) {
		if(name.equals("Word90")) {
			if(count<2) {
			MicroOfficeFactory cf = new Word90();
			userInstance = new SingleClass(cf);
			System.out.println("Instance created..");
			userInstance.run();
			 count++;
			return userInstance;
			
				}
			else {
				System.out.println("Warning..Cannot instantiate more than 2 for Word90");
			}
			}
		if(name.equals("Word00")) {
			if(count1<2) {
			MicroOfficeFactory cf = new Word00();
			userInstance = new SingleClass(cf);
			//System.out.println("Instance created..");
			userInstance.run();
			count1++;
			return userInstance;
				}
			else {
				System.out.println("Warning..Cannot instantiate more than 2 for Word00");
			}
			}
		if(name.equals("Word10")) {
			if(count2<2) {
			MicroOfficeFactory cf = new Word10();
			userInstance = new SingleClass(cf);
			//System.out.println("Instance created..");
			userInstance.run();
			count2++;
			return userInstance;
				}
			else {
				System.out.println("Warning..Cannot instantiate more than 2 for Word10");
			}
			
			}
		if(name.equals("Word18")) {
			if(count3<2) {
				
			MicroOfficeFactory cf = new Word18();
			userInstance = new SingleClass(cf);
			//System.out.println("Instance created..");
			userInstance.run();
			count3++;
			return userInstance;
				}
			else {
				System.out.println("Warning..Cannot instantiate more than 2 for Word18");
				return null;}
			}
		
		else {
			//System.out.println("Warning..Cannot instantiate more than 2");
			return null;
	}
	}
				else { //flag =true; }
				return null;}
	
	}
	
}

public class Client {
	
	//String result="";
	String[] result1 = new String[13];
	InputStream inputSTream;
	Properties properties;
	
public static void main (String[] args) throws IOException {
		
		Client u1 = new Client();
		u1.getConfig_File();
	}
	
	public String[] getConfig_File() throws IOException {
		//int count =0;
		properties = new Properties();
		inputSTream = getClass().getClassLoader().getResourceAsStream("Config_f");
	
				if(inputSTream != null) {
					properties.load(inputSTream);
				}
				else {
					throw new FileNotFoundException("File not found in the classpath");	
				}	
				
		for (int i=0; i<properties.size(); i++) {
			if(i==0)
		{
				result1[i] = properties.getProperty("Word90");}
			
		   if(i==1) {		
				result1[i] = properties.getProperty("Word00");  }
			
			if(i==2) {
				result1[i] = properties.getProperty("Word901");
			}
			if(i==3) {
				result1[i] = properties.getProperty("Word18");
			}
			if(i==4) {
				result1[i] = properties.getProperty("Word101");
			}
			if(i==5) {
				result1[i] = properties.getProperty("Word001");
			}
			if(i==6) {
				result1[i] = properties.getProperty("Word181");
			}
			if(i==7) {
				result1[i] = properties.getProperty("Word902");
			}
			if(i==8) {
				result1[i] = properties.getProperty("Word002");
			}
			if(i==9) {
				result1[i] = properties.getProperty("Word102");
			}
			if(i==10) {
				result1[i] = properties.getProperty("Word103");
			}
			if(i==11) {
				result1[i] = properties.getProperty("Word183");
			}
			if(i==12) {
				result1[i] = properties.getProperty("Word184");
			}
		}
		for (String a : result1) {
			//System.out.println(a);
			//System.out.println("--------");
			SingleClass s = SingleClass.getInstance(a);
			System.out.println("\n");
		}
		
		inputSTream.close();
		return result1;
	}
	
}
