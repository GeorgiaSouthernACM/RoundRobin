
public class Process {
	
	private int time;
	private String name;
	
	public Process(int time, String name){
		this.time=time;
		this.name=name;
	}
	
	public void setTime(int time){
		this.time=time;
	}
	
	public void setName(){
		this.name=name;
	}
	
	public int getTime(){
		return time;
	}

	public String getName(){
		return name;
	}

}
