package decisionMaker;

import java.util.Random;

public class DecisionMakerFreeTime {


	public DecisionMakerFreeTime() {
		Random r=new Random();
		int f=r.nextInt(5);
		String s = null;

		switch (f) {
		case 1:  s = "Study";
		break;
		case 2:  s = "Read";
		break;
		case 3:  s = "Music";
		break;
		case 4:  s = "Create";
		break;
		default:  s = "Free";
		break;

		}
		System.out.println(s);

	}

	public static void main(String[] args) {
		new DecisionMakerFreeTime();
		//for(int i=0; i<20;i++) {
		//DecisionMakerFreeTime d=new DecisionMakerFreeTime();
		//GraphicInterface gi=new GraphicInterface();
		/*
		int create=0;
		if(d.toString()=="Create") {
			create++;
		}
		
		int study=0;
		if(d.toString()=="Study") {
			study++;
		}
		
		int music=0;
		if(d.toString()=="Music") {
			music++;
		}
		
		
		int free=0;
		if(d.toString()=="Free") {
			free++;
		}
		
		int read=0;
		if(d.toString()=="Read") {
			read++;
		}
		
		System.out.printf("%2d Anz Create 2%d Anz Study %2d Anz Music %2d Anz Free %2d Read", create, study, music, free, read);
		*/
		//}

	}

}
