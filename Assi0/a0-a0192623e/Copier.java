import java.io.*;

public class Copier
{
	public static void main(String[] args)
	{

		byte[] buffer = new byte[1024];
		int numBytes;
		FileInputStream fis;
		FileOutputStream fos;
		BufferedInputStream bis;
		BufferedOutputStream bos;

		try{
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			while((numBytes = bis.read(buffer)) != -1)
				bos.write(buffer, 0, numBytes);

			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}
		catch(FileNotFoundException f){
			System.exit(1);
		}
		catch(IOException e){
			System.exit(2);
		}		
	}
}


