package Session2;

public class Assigment2 {
	public static void main(String[] args)
	{
		for(int i=2;i<=100;i++)
		{
			if(i==2)
			{
				System.out.println("2 ");
			}
			else
			{
				int _count=0;
				for(int j=2;j<i-1;j++)
				{
					if(i%j==0)
					{
						_count++;
					}
				}
				if(_count==0)
					System.out.println(i+" ");
			}
		}
	}
}
