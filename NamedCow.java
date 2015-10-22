class NamedCow 
{
	private String cowName, myType, mySound;

	public NamedCow(String type, String cname, String sound){
		myType = type;
		mySound = sound;
		cowName = cname;
	}          
    public NamedCow()     {         
        myType = "cow";         
        mySound = "moo";
        cowName = "I dont know";     
    }      
    public String getSound(){return mySound;}     
    public String getType(){return myType;} 
	public String getName(){
		return cowName;
	}
}
