package pres.szw.ljdtest.miantest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class ReadPropertiesFile {
	public static String browser_Name;
	public static String server_Url;
	public static void main(String[] args) throws IOException {
		//初始化properties类，用于读取java配置文件
		Properties p = new Properties();
		//加载存放在TestConfig文件夹中的文件
		InputStream ips = new FileInputStream(".\\TestConfig\\config.properties");
		//从输入流中读取属性列表（键和元素对）。
		p.load(ips);
//		p.list(System.out);
		Object [] strs = p.keySet().toArray();
		for(int i=0;i<strs.length;i++){
			System.out.println("Key:"+strs[i]+"Value:"+p.get(strs[i]));
		}
		browser_Name=p.getProperty("browserName");
		server_Url = p.getProperty("URL");
//		System.out.println(browser_Name);
//		System.out.println(server_Url);
		ips.close();
	}
}

