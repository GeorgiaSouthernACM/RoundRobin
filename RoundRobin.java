import java.util.*;
public class RoundRobin {

	public static void main(String[] args) {
		final int quantum=4;
		
		Process P1 = new Process(4,"P1");
		Process P2 = new Process(8,"P2");
		Process P3 = new Process(9,"P3");
		Process P4 = new Process(3,"P4");
		Process P5 = new Process(5,"P5");
		Process P6 = new Process(4,"P6");

		//need to add them backward because the current way violates the essential rule of filo
		ArrayList<Process> processQueue = new ArrayList();
		processQueue.add(P1);
		processQueue.add(P2);
		processQueue.add(P3);
		processQueue.add(P4);
		processQueue.add(P5);
		processQueue.add(P6);
		
		int processTime;

		for (int i=0;i<processQueue.size(); i++){
			processTime=0;
			for(int j=0; j<4; j++){
				if (processQueue.get(i).getTime()==0){
					break;
				}
				else {
				System.out.print(processQueue.get(i).getName()+" ");
				processTime=processQueue.get(i).getTime();
				processTime--;
					processQueue.get(i).setTime(processTime);
				}	
			
			}
			if ((processQueue.get(0).getTime()==0)&&(processQueue.get(1).getTime()==0)
					&&(processQueue.get(2).getTime()==0)&&(processQueue.get(3).getTime()==0)&&(processQueue.get(4).getTime()==0)&&(processQueue.get(5).getTime()==0)){
				break;
			}
			else if (i+1==processQueue.size())
				i=0;

		}
		}
	}


