package arc;

public class Architect {
	public String checkingOneCmOrGram(String input)
	{
		String[] arrayOfSplits=input.split("[ ]",2);
		
		if(arrayOfSplits[1].equals("cm")||arrayOfSplits[1].equals("g"))
		{
			return input;
		}
		else if(arrayOfSplits.equals("Cm")||arrayOfSplits[1].equals("G"))
		{
			return input;
		}
		else
			return "input is not cm";
	}
	public String checkingOneMeter(String input)
	{
		String[] arrayOfSplits=input.split("[ ]",2);
		double integer=Double.parseDouble(arrayOfSplits[0]);
		double cmConversion=integer*100,kmConversion=integer/1000;
		String output="is equal to "+cmConversion+" cm, and "+cmConversion+" cm is equal to "+kmConversion+" km.";
		if(arrayOfSplits[1].equals("m"))
		{
			return output;
		}
		else if(arrayOfSplits[1].equals("M"))
		{
			return output;
		}
		else
			return "input not in meter";
	}
	
	public  String checkingAndOperatingMeterWithCm(String input)
	{
		String[] arrayOfSplits=input.split("[ ]",5);
		double outputInt=0;
		if(arrayOfSplits[1].equals("m")&&arrayOfSplits[4].equals("cm"))
		{
			double meterInput=Double.parseDouble(arrayOfSplits[0]);
			double cmInput=(Double.parseDouble(arrayOfSplits[3]))/100;
			if(arrayOfSplits[2].equals("+"))
			{
				outputInt = meterInput+cmInput;
				return meterInput+" m + "+cmInput +" cm = "+outputInt +" m";
			}
			else if (arrayOfSplits[2].equals("-")) {
				outputInt = meterInput-cmInput;
				return meterInput+" m - "+cmInput +" cm = "+outputInt +" m";
			}
		
		}
		else 
			return "invalid input";
		return "";

		
	}
	
	public  String checkingAndOperatingCmWithKm(String input)
	{
		String[] arrayOfSplits=input.split("[ ]",5);
		double outputInt=0;
		if(arrayOfSplits[1].equals("cm")&&arrayOfSplits[4].equals("km"))
		{
			double cmInput=Double.parseDouble(arrayOfSplits[0]);
			double kmInput=(Double.parseDouble(arrayOfSplits[3]))*100000;
			if(arrayOfSplits[2].equals("+"))
			{
				outputInt = cmInput+kmInput;
				return cmInput+" cm + "+kmInput +" km = "+outputInt +" cm";
			}
			else if (arrayOfSplits[2].equals("-")) {
				outputInt = kmInput-cmInput;
				return cmInput+" cm - "+kmInput +" km = "+outputInt +" cm";
			}
		
		}
		else 
			return "invalid input";
		return "";
	}
	
	public  String checkingAndOperatingCmWithM(String input)
	{
		String[] arrayOfSplits=input.split("[ ]",5);
		double outputInt=0;
		if(arrayOfSplits[1].equals("cm")&&arrayOfSplits[4].equals("m"))
		{
			double cmInput=Double.parseDouble(arrayOfSplits[0]);
			double mInput=(Double.parseDouble(arrayOfSplits[3]))*100;
			if(arrayOfSplits[2].equals("+"))
			{
				outputInt = cmInput+mInput;
				return cmInput+" cm + "+mInput +" m = "+outputInt +" cm";
			}
			else if (arrayOfSplits[2].equals("-")) {
				outputInt = mInput-cmInput;
				return cmInput+" cm - "+mInput +" m = "+outputInt +" cm";
			}
		
		}
		else 
			return "invalid input";
		return "";
	}
	
	public String kgToGramConversion(String input)
	{
		String[] arrayOfSplits=input.split("[ ]",2);
		double kgInput=Double.parseDouble(arrayOfSplits[0]);
		double output=kgInput/1000;
		if(arrayOfSplits[1].equals("kg")||arrayOfSplits[1].equals("Kg"))
		{
			return output+" g"; 
		}
		else
			return "invalid input";
	}
	public String celsiusToF(String input)
	{
		String[] arrayOfSplits=input.split("[ ]",2);
		double cInput=Double.parseDouble(arrayOfSplits[0]);
		double output=cInput+32;
		if(arrayOfSplits[1].equals("celsius")||arrayOfSplits[1].equals("c"))
		{
			return cInput+" Celsius is equal to "+ output+" Fahrenheit";
		}
		else
			return "invalid input";
	}
	public String kelvinToCelsius(String input)
	{
		String[] arrayOfSplits=input.split("[ ]",2);
		double kInput=Double.parseDouble(arrayOfSplits[0]);
		double output=kInput-273;
		if(arrayOfSplits[1].equals("kelvin")||arrayOfSplits[1].equals("k"))
		{
			return kInput+" Celsius is equal to "+ output+" Fahrenheit";
		}
		else
			return "invalid input";
	}
	
}
