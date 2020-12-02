package com;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Findword {
	public static void main(String[] args)  {
		try {
			File file = new File("D:\\1\\诗.txt");
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream ();
			int len;
			byte[] data = null;
			byte[] buffer = new byte[(int) file.length()];

			while ((len=fis.read(buffer))!=-1){
			    bos.write(buffer,0,len);
			}

			data = bos.toByteArray();
			String str = new String(data);

			int count=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("输入你要查找的字或词：");
			char o = sc.next().charAt(0);
			char[] ch =str.toCharArray();
			for(int i=0;i<ch.length;i++){
			    if(o==ch[i]){
			        count++;
			    }

			}

			System.out.println("你输入的字或词在诗中出现过"+count+"次。");
			System.out.println("----------------------------");
			    fis.close();
			    bos.close();
		
		}
		catch(Exception e) {
			System.out.println("你的程序出现了异常");
		}
		
	}
}
	
