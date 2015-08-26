package br.com.leitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	static String desktop = "C:" + File.separator + "Users" + File.separator + "leonardo" + File.separator + "Desktop" + File.separator;
	static FileWriter html;
	static PrintWriter escrever;
	
	public static void main(String[] args) throws IOException {
		
		File dir = new File(desktop + "teste");
		html = new FileWriter(desktop + "listaArquivos.html");
		escrever = new PrintWriter(html);
		
		System.out.println("Iniciando escrever arquivo...");

		escrever.println("<ul id='" + dir.getAbsolutePath() + "'>");
		leitor(dir.listFiles());
		escrever.println("</ul>");
		
		escrever.close();
		System.out.println("Fim de escrita");
		
	}
	
	public static void leitor(File[] fs) {
		for (File file : fs) {
			if(file.isFile()) {
				escrever.println("<li>" + file.getAbsolutePath() + "</li>");
			} else if(file.isDirectory()) {
				escrever.println("<li>" + file.getAbsolutePath() + "</li>");
				if(file.listFiles().length > 0) {
					escrever.println("<ul id='" + file.getAbsolutePath() + "'>");
					leitor(file.listFiles());
					escrever.println("</ul>");
				}
			}
		}
	}
}
