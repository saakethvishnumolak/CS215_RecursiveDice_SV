
public class RecDieRoller 
{
	public int die;
	public int rolls;
	
	public int roll()
	{
		rolls = 0;
		die = 0;
		
		while(die != 2)
		{
			die = (int)(Math.random() * 6) + 1;
			rolls++;
			System.out.println("Roll " + rolls + ": " + die);
			
		}
		return rolls;
	}
}
