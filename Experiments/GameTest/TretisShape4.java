import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class TretisShape4 implements ActionListener {
	

public int x1,x2,x3,x4,y1,y2,y3,y4,spin;
	public int offSet,offSet2,dropDownTo;
	public boolean onSide,standingOffset=false;
	public static int num=0;
	Timer time;
	
	public TretisShape4(){
		onSide=true;
		coordinates();
		time = new Timer(20,this);	
		time.stop();
	}
	
	public void coordinates(){
		
		x1=140;											// elements 6 7 8
		x2=160;
		x3=140;
		x4=120;
		
		y1=40;
		y2=40;
		y3=60;
		y4=60;
		this.dropDownTo=500;
		if(onSide==false){
			this.onSide=true;
		}
		TretisPanel.offSet=this.y3;
		TretisPanel.offSet2=this.x3;
	}
	public void paint(Graphics g){
		g.setColor(Color.green);
		Tretiscontrol.colr=4;
		if(onSide==false){
			this.dropDownTo=TretisPanel.dropDownTo-20; 
			if(y1>=this.dropDownTo){TretisPanel.shapeEnd=true;TretisPanel.num=5;coordinates();}
		}
		if(onSide==true){          
			this.dropDownTo=TretisPanel.dropDownTo;
			if(y1>=this.dropDownTo){TretisPanel.shapeEnd=true;TretisPanel.num=5;coordinates();}
			
		}
			
		if(y1<this.dropDownTo){
			TretisPanel.reached=false;       //this is for drawing
				y1=y1+1;
				y2=y2+1;
				y3=y3+1;
				y4=y4+1;
		}
		if(y1>=this.dropDownTo){
			TretisPanel.reached =true;
		}
	
		g.fillRect(x1, y1, 20, 20);
		g.fillRect(x2, y2, 20, 20);
		g.fillRect(x3, y3, 20, 20);
		g.fillRect(x4, y4, 20, 20);
		checkColumn();
		checkRow();
	
	}
	public void shapeOnItsSide(){
		standingOffset=false;
		x1=offSet2;
		x2=offSet2+20;
		x3=offSet2;						//offSet x3 and y3
		x4=offSet2-20;
		y1=offSet-20;
		y2=offSet-20;
		y3=offSet;//120
		y4=offSet;
	}
	public void shape(){
		standingOffset=true;
		x1=offSet2-20;
		x2=offSet2-20;
		x3=offSet2;
		x4=offSet2;
		y1=offSet-20;
		y2=offSet;
		y3=offSet;
		y4=offSet+20;		
	}
	public void checkColumn(){
		
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
			
		}
		}
		if(onSide==false){
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
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	

	
}
}