package com.jizhong.file;

import java.io.File;

/**
 * File文件类：
 * 
 * 静态属性：
	static String pathSeparator 获取路径分隔符	";"
	static char pathSeparatorChar 获取路径分隔符 ';'

	static String separator 获取文件分隔符	windows："\" 其他系统："/"
	static String separatorChar 获取文件分隔符	'\'
 *
 */
public class TestFile {
	public static void main(String[] args) {
		//路径分隔符
		String pathSeparator = File.pathSeparator;
		
		//文件分隔符
		String separator = File.separator;
		System.out.println("路径分隔符：" + pathSeparator);
		System.out.println("文件分隔符：" + separator);
		//路径C: + File.separator + ESD C:\ESC
		// \：转义
		//构造方法1
		File file = new File("C:"+ separator + "a.txt");
		//构造方法2：String parent，String child
		File file2 = new File("C:\\","a.txt");
		
		//构造方法3：File parent，String child
		File parent = new File("C:\\");
		File file3 = new File(parent,"a.txt");//C:\\a.txt
		
	}
	
	public void createFile(String path){
		File file2 = new File("C:\\",path);
	}
}
