import java.util.*;
public class IPAddress
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str;
		String[] cutStr = new String[4];
		int[] ans = new int[4];

		str = in.nextLine();

		for(int i = 0; i < 4; i++)
			cutStr[i] = str.substring(i * 8, i * 8 + 8);

		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 8; j++)
				ans[i] = (cutStr[i].charAt(j) - '0') + (ans[i]<<1);

		for(int i = 0; i < 3; i++)
			System.out.print(ans[i]+".");
		System.out.print(ans[3]);
	}
}