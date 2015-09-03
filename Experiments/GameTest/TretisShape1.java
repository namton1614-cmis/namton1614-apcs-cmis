import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TretisShape1 implements ActionListener {
public int x1,x2,x3,y1,y2,y3;
public int offSet,offSet2,dropDownTo;
public boolean onSide;
public static int num=0;

Timer time;	

	public TretisShape1(){
		onSide=true;
		if(TretisPanel.spin!=0){TretisPanel.spin=0;}
		time = new Timer(50,this);
		time.stop();// elements 6 7 8 
		coordinates();
	}
	public void coordinates(){
		
		//onSide=true;
		x1=120;
		x2=140;   
		x3=160;
		y1=60;
		y2=60;   
		y3=60;
		this.dropDownTo=500;
		
		// bug fix for spin 
		if(TretisPanel.spin==1){TretisPanel.spin=2;}
		if(TretisPanel.spin==3){TretisPanel.spin=0;}
		
		if(onSide==false){
			this.onSide=true;
		}
		TretisPanel.offSet = this.y2;
		TretisPanel.offSet2=this.x2;
	}
	
	public void paint(Graphics g){
		if(onSide==false){
			
			this.dropDownTo=TretisPanel.dropDownTo;
			
			if(y1>=dropDownTo+20){TretisPanel.shapeEnd=true;TretisPanel.num=2;coordinates();}
		}
		if(onSide==true){
			this.dropDownTo=TretisPanel.dropDownTo;
			if(y1>=dropDownTo+20){TretisPanel.shapeEnd=true;TretisPanel.num=2;coordinates();}
		}
		if(y1<dropDownTo+20){
			TretisPanel.reached=false; 
		y1=y1+1;
		y2=y2+1;
		y3=y3+1;
		}
		if(y1>=this.dropDownTo+20){
			TretisPanel.reached =true;
		}
		g.setColor(Color.cyan);
		Tretiscontrol.colr=1;
		
		g.fillRect(x1, y1, 20, 20);
		g.fillRect(x2, y2, 20, 20);
		g.fillRect(x3, y3, 20, 20);
		checkColumn();
		checkRow();
	}
	public void bar(){
		x1=offSet2;
		x2=offSet2;
		x3=offSet2;						// x1 and y1 are offSet
		y1=offSet+20;
		y2=offSet;                 
		y3=offSet-20;
		
	}
	public void barOnItsSide(){
		x1=offSet2-20;
		x2=offSet2;                 
		x3=offSet2+20;
		y1=offSet;
		y2=offSet;
		y3=offSet;
	}
	public void checkColumn(){
		if(onSide==false){
		switch(x3){
			case 20 : 	TretisPanel.xNum = 1;break;
			case 40 : 	TretisPanel.xNum = 2;break;
			case 60 :	TretisPanel.xNum = 3;break;
			case 80 :	TretisPanel.xNum = 4;break;
			case 100:	TretisPanel.xNum = 5;break;
			case 120: 	TretisPanel.xNum = 6;break;
			case 140: 	TretisPanel.xNum = 7;break;
			case 160: 	TretisPanel.xNum = 8;break;
			case 180: 	TretisPanel.xNum = 9;break;
			case 200: 	TretisPanel.xNum = 10;break;
			case 220: 	TretisPanel.xNum = 11;break;
			case 240: 	TretisPanel.xNum = 12;break;
			case 260: 	TretisPanel.xNum = 13;break;
			case 280: 	TretisPanel.xNum = 14;break;
		}
		}
		if(onSide==true){
			switch(x3){
				case 40 : 	TretisPanel.xNum = 2;break;
				case 60 :	TretisPanel.xNum = 3;break;
				case 80 :	TretisPanel.xNum = 4;break;
				case 100:	TretisPanel.xNum = 5;break;
				case 120: 	TretisPanel.xNum = 6;break;
				case 140: 	TretisPanel.xNum = 7;break;
				case 160: 	TretisPanel.xNum = 8;break;
				case 180: 	TretisPanel.xNum = 9;break;
				case 200: 	TretisPanel.xNum = 10;break;
				case 220: 	TretisPanel.xNum = 11;break;
				case 240: 	TretisPanel.xNum = 12;break;
				case 260: 	TretisPanel.xNum = 13;break;
				case 280: 	TretisPanel.xNum = 14;break;
			}
			}
		
	}
public void checkRow(){
		
		
		switch(y1){
		
			case 40 : 	TretisPanel.yNum = 2;break;
			case 60 :	TretisPanel.yNum = 3;break;
			case 80 :	TretisPanel.yNum = 4;break;
			case 100:	TretisPanel.yNum = 5;break;
			case 120: 	TretisPanel.yNum = 6;break;
			case 140: 	TretisPanel.yNum = 7;break;
			case 160: 	TretisPanel.yNum = 8;break;
			case 180: 	TretisPanel.yNum = 9;break;
			case 200: 	TretisPanel.yNum = 10;break;
			case 220: 	TretisPanel.yNum = 11;break;
			case 240: 	TretisPanel.yNum = 12;break;
			case 260: 	TretisPanel.yNum = 13;break;
			case 280 : 	TretisPanel.yNum = 14;break;
			case 300 :	TretisPanel.yNum = 15;break;
			case 320:	TretisPanel.yNum = 16;break;
			case 340:	TretisPanel.yNum = 17;break;
			case 360: 	TretisPanel.yNum = 18;break;
			case 380: 	TretisPanel.yNum = 19;break;
			case 400: 	TretisPanel.yNum = 20;break;
			case 420: 	TretisPanel.yNum = 21;break;
			case 440: 	TretisPanel.yNum = 22;break;
			case 460: 	TretisPanel.yNum = 23;break;
			case 480: 	TretisPanel.yNum = 24;break;
			case 500: 	TretisPanel.yNum = 25;break;
			case 520: 	TretisPanel.yNum = 26;break;
		}
		
	
	}
@Override
/*
 * 
 * 
 * (non-Javadoc)
 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
 */
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	


}
}