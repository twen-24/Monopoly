

class Card
{
	public static String prompt = "";

  	//constructors
	public Card(String prompt){
		//enter prompt from prompt file
		this.prompt = prompt;
	}

  	public int getPrompt()
  	{
  		return prompt;
  	}

  	//toString
  	public String toString(){
		return prompt;
	}
 }
 
 
