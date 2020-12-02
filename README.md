# 2020322085 G201 林钰宸
# JAVA-5
## 1.实验内容
+ 1.在某课上,学生要提交实验结果，该结果存储在一个文本文件A中
+ 2.学生的基本信息；
+ 3.学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
## 2.实验要求
+ 1. 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
+ 2.允许提供输入参数，统计古诗中某个字或词出现的次数
+ 3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
+ 4.考虑操作中可能出现的异常，在程序中设计异常处理程序
## 3.实验核心步骤

```
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

```
## 4.实验搜索文字
```
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
```



## 5.实验感想
1. 通过本次实验学会了输出字节流和输入自己流
2. 学会了whle循环的使用
3. 学会了如何通过字节数组获取字节数的个数

