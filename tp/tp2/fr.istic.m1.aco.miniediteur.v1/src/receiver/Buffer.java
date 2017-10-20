package receiver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buffer {
	private static StringBuffer buffer;
	private static InputStreamReader isr;
	private static BufferedReader br;
	private static OutputStreamWriter osw;
	private static BufferedWriter bw;
	
	public static void readLine() {
			try {
				isr = new InputStreamReader(System.in);
				br = new BufferedReader(isr);
				buffer = new StringBuffer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(isr != null) {
					try {
						isr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				if(br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
	}
	
	public static void read(int begin, int end) {
		try {
			char[] buf = new char[end - begin];
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			br.read(buf, begin, end - begin);
			buffer = new StringBuffer(new String(buf));
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void write() {
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write(buffer.toString());
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			if(osw != null) {
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static StringBuffer getBuffer() {
		return buffer;
	}
	
	public static void setBuffer(String s) {
		buffer = new StringBuffer(s);
	}
	
	public static void clean() {
		buffer = new StringBuffer("");
	}
}
