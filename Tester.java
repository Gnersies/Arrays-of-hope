public class Tester
{
	public static void main(String [ ] args )
	{
		char ch[] = new char[26];
		for (int a = 65; a <= 90; a++){
			int b = a - 65;
			ch[b] = (char) a;
		}
		for (int c = 0; c <= 25; c++){
			System.out.print(ch[c] + ", ");
		}
	}
	}
