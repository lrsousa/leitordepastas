package br.com.leitor;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File dir = new File("C:" + File.separator + "Users" + File.separator + "leonardo" + File.separator + "Desktop" + File.separator + "teste");
		
		leitor(dir.listFiles());
		
//		for (File f : dir.listFiles()) {
//			System.out.println(f.getAbsolutePath() + " - " + (f.isDirectory() ? "pasta" : "arquivo"));
//		}
		
	}
	
	public static void leitor(File[] fs) {
		for (File file : fs) {
			
		}
	}
}
