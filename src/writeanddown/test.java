package writeanddown;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test {
	public static void main(String args[]) throws IOException{
		FileInputStream is=new FileInputStream("C:\\Users\\Administrator\\Desktop\\新建文本文档 (2).txt");
		InputStreamReader isr=new InputStreamReader(is);
		File file=new File("C:\\Users\\Administrator\\Desktop", "文档r.txt");//绝对路径
		if(!file.exists()){//创建文件
			file.createNewFile();
		}
		FileOutputStream os=new FileOutputStream(file);
		OutputStreamWriter osr=new OutputStreamWriter(os);
		char []buffer=new char[2056];
		int c;
		while((c=isr.read(buffer,0,buffer.length))!=-1)//读取isr中的文字内容
		{
			osr.write(buffer, 0, c);//将内容写入新文件中
			osr.flush();
		}
		isr.close();
		osr.close();
	}
}