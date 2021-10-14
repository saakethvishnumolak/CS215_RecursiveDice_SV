
public class RecDieRollerDriver {

	public static void main(String[] args) 
	{
		RecDieRoller dieRoll = new RecDieRoller();
		
		int[] numOfRolls = new int[1000];
		
		int sumOfRolls = 0;
		for(int i = 0;i < 1000; i++)
		{
			numOfRolls[i] = dieRoll.roll();
			System.out.println("Number of Rolls: " + numOfRolls[i]);
			
			sumOfRolls += numOfRolls[i];
		}
		int mean = sumOfRolls/1000;
		System.out.println("Mean number of times to roll a 2: " + mean);
	}
}
