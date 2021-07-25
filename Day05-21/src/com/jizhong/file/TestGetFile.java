package com.jizhong.file;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author BaiHongyu
 *
 */
public class TestGetFile {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_281\\jmc.txt");
		//绝对路径：从当前文件的盘符开始查找路径
		System.out.println(file.getAbsolutePath());
		File file2 = new File("a.txt");
		System.out.println(file2.getAbsolutePath());
		//路径：File构造方法中传递的路径
		System.out.println("路径：" + file.getPath());
		System.out.println("路径：" + file2.getPath());
		
		//getName()：获取文件名称
		System.out.println("file文件名称：" + file.getName());
		
		//length()：获取文件大小
		System.out.println("file文件大小：" + file.length() + "字节");//195字节
		
		//public boolean exists()：此File表示的文件或目录是否实际存在。存在：true 不存：false
		System.out.println("file文件是否存在：" + file.exists());
		
		//public boolean isDirectory()：此File是否为文件夹
		/**
		 * 三元表达式：
		 * 	判断 ? 判断为真返回结果  :  判断为假返回结果
		 */
		System.out.println("file文件是否是文件夹：" + (file.isDirectory() ? "是文件夹" : "不是文件夹"));//false
		
		//public boolean isFile()：此File是否为文件
		System.out.println("file文件是否是文件：" + file.isFile());
		
		
		File file01 = new File("F:\\a.txt");
		//createNewFile()：创建文件
//		file01.createNewFile();
		
		//mkdirs()：创建文件夹，可以创建多级目录（文件夹）
//		System.out.println("文件夹创建：" + file01.mkdirs());
//		if(file01.mkdirs()){
//			System.out.println("成功");
//		}else{
//			System.out.println("失败");
//		}
		
		//delete()：删除文件|文件夹
		//删除文件夹时，如果文件夹内有其他文件，则无法删除，返回false
		//删除文件时，任何情况都可以删除
		String result = file01.delete() ? "删除成功" : "删除失败";
		System.out.println(result);
	}
}
