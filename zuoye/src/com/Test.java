package com;

import java.io.*;
import java.util.Scanner;

public class Test {
	public static void txt(){
		try (FileReader fInputStream = new FileReader("D:\\1\\诗.txt");//输入流文件
			FileWriter fOutputStream  = new FileWriter("D:\\1\\诗1.txt")){
		   StringBuffer st=new StringBuffer();
		   char[] ch=new char[14];//设置有14个字符
		  while ((fInputStream.read(ch)) !=-1) {
		    st.append(ch, 0,7);
		    st.append("，");
		    st.append(ch, 7, 7);
		    st.append("。"+"\n");
		  }
		  System.out.println(st);
	      fOutputStream.write(new String(st));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
}
			
	}

