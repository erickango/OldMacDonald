class Chick implements Animal 
{     
	private String mySound;
	private String myType;
	public Chick(String type, String sound){
		mySound = sound;
		myType = type;
	}
	public Chick(){
		mySound = "cheep";
		myType = "Chick";
	}
    public String getSound(){
    	int i = (int)(Math.random() * 2);
    	if(i == 0) mySound = "cheep";
    	else if(i == 1) mySound = "cluck";
    	return mySound;
    }
	public String getType(){
		return myType;
	}
}
