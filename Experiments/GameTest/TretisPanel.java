import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer; // not used the timer, but did use it for debuging


public class TretisPanel extends JPanel implements KeyListener, ActionListener{

	private static final long serialVersionUID = 1L;
	
	Tretiscontrol con;
	public static int spin, num=1,yNum=1,xNum =1,offSet,offSet2,dropDownTo=500;
	public static boolean shapeEnd,reached=false,onSide=true,firstShape=false;

	public int iPlus20,jPlus20;
	
	TretisShape1 shape1;
	TretisShape2 shape2;
	TretisShape3 shape3;
	TretisShape4 shape4;
	TretisShape5 shape5;
	
	Timer time;

	public TretisPanel() throws InterruptedException{
	
		con = new Tretiscontrol();
		shape1 = new TretisShape1();
		shape2 = new TretisShape2();
		shape3 = new TretisShape3();
		shape4 = new TretisShape4();
		shape5 = new TretisShape5();
		spin=0;
	
		this.setSize(350,300);
		this.setVisible(true);
	
	
		addKeyListener(this);
		this.setFocusable(true);
		this.requestFocus();
		time = new Timer(30,this);
		time.start();
	}
	public void paint(Graphics g){
	
			g.setColor(Color.black);
			g.fillRect(0,0,350,560);
		for(int i = 0;i<375;i++){System.out.println();}     //put this in just to slow the program down, without spending to much time, as its a demo.
			for(int i = 1;i<27;i++){
				iPlus20=i*20;
				for(int j = 1;j<15;j++){
					jPlus20=j*20;
					//*****************  Inside the two for loops, five different colours of each Shape for each element of the Array and white for background.  ********************//
					if(con.cont[i][j]==0){
						g.setColor(Color.white);
					}
					if(con.cont[i][j]==1){
						g.setColor(Color.cyan);
					}
					if(con.cont[i][j]==2){
						g.setColor(Color.red);
					}
					if(con.cont[i][j]==3){
						g.setColor(Color.yellow);
					}
					if(con.cont[i][j]==4){
						g.setColor(Color.green);
					}
					if(con.cont[i][j]==5){
						g.setColor(Color.blue);
					}
					if(con.cont[i][j]==100){
						g.setColor(Color.white);
					}
					//******************  ********************************************   ******************************************************//
					g.fillRect(jPlus20, iPlus20, 20, 20);
				}
			}
			
		if(num==1){
			TretisShape1.num=1;
			shape1.paint(g);
			TretisPanel.shapeEnd=false;
			con.checkRow1();
			if(shape1.onSide==false){con.checkCols7(xNum);}    
			if(shape1.onSide==true){con.checkCols4(xNum);}  
			
			if(reached==true){ 
				
					if(shape1.onSide==false){
						con.cont[yNum-2][xNum]=Tretiscontrol.colr;
						con.cont[yNum-1][xNum]=Tretiscontrol.colr;
						con.cont[yNum][xNum]=Tretiscontrol.colr;	
					}
					
					if(shape1.onSide==true){
						con.cont[yNum][xNum-2]=Tretiscontrol.colr;
						con.cont[yNum][xNum-1]=Tretiscontrol.colr;
						con.cont[yNum][xNum]=Tretiscontrol.colr;
					}
	
			}
		}
		if(num==2){
		   TretisShape2.num=2;
			shape2.paint(g);
			TretisPanel.shapeEnd=false;
			con.checkRow1();
			if(shape2.onSide==1){con.checkCols2(xNum);}
			if(shape2.onSide==2){con.checkCols4(xNum);}
			if(shape2.onSide==3){con.checkCols6(xNum);}
			if(shape2.onSide==4){con.checkCols3(xNum);}
			//con.cont[1][9]=Tretiscontrol.colr;
			if(reached==true){                                 //this draws the shape where it lands on the panel and sets the array.
				if(shape2.onSide==1){
				
					con.cont[yNum][xNum]=Tretiscontrol.colr;
					con.cont[yNum+1][xNum]=Tretiscontrol.colr;
					con.cont[yNum+2][xNum]=Tretiscontrol.colr;
					con.cont[yNum+1][xNum+1]=Tretiscontrol.colr;
				}
				                                 //this draws the shape where it lands on the panel and sets the array.
					if(shape2.onSide==2){
						con.cont[yNum+1][xNum-1]=Tretiscontrol.colr;
						con.cont[yNum+1][xNum]=Tretiscontrol.colr;
						con.cont[yNum+1][xNum-2]=Tretiscontrol.colr;
						con.cont[yNum][xNum-1]=Tretiscontrol.colr;
					}
				                               //this draws the shape where it lands on the panel and sets the array.
					if(shape2.onSide==3){
						con.cont[yNum][xNum]=Tretiscontrol.colr;
						con.cont[yNum][xNum+1]=Tretiscontrol.colr;
						con.cont[yNum][xNum-1]=Tretiscontrol.colr;
						con.cont[yNum+1][xNum]=Tretiscontrol.colr;
					}
				                                //this draws the shape where it lands on the panel and sets the array.
					if(shape2.onSide==4){
						con.cont[yNum-2][xNum]=Tretiscontrol.colr;
						con.cont[yNum-1][xNum]=Tretiscontrol.colr;   //on its back pointing up
						con.cont[yNum][xNum]=Tretiscontrol.colr;
						con.cont[yNum-1][xNum-1]=Tretiscontrol.colr;
					}
				}
		}
		if(num==3){
		TretisShape3.num=3;
			shape3.paint(g);
			TretisPanel.shapeEnd=false;
			con.checkRow1();
			con.checkCols8(xNum);
			//con.cont[1][9]=Tretiscontrol.colr;
			if(reached==true){             
				if(shape3.onSide==true){                          //this draws the shape where it lands on the panel and sets the array.
					con.cont[yNum][xNum-1]=Tretiscontrol.colr;
					con.cont[yNum][xNum]=Tretiscontrol.colr;
					con.cont[yNum+1][xNum-1]=Tretiscontrol.colr;
					con.cont[yNum+1][xNum]=Tretiscontrol.colr;
				}
				if(shape3.onSide==false){                          //this draws the shape where it lands on the panel and sets the array.
					con.cont[yNum][xNum-1]=Tretiscontrol.colr;
					con.cont[yNum][xNum]=Tretiscontrol.colr;
					con.cont[yNum+1][xNum-1]=Tretiscontrol.colr;
					con.cont[yNum+1][xNum]=Tretiscontrol.colr;
					}
				}
		}
		 if(num==4){
		 TretisShape4.num=4;
			shape4.paint(g);
			TretisPanel.shapeEnd=false;
			con.checkRow1();
			if(shape4.onSide==false){con.checkCols9(xNum);}
			if(shape4.onSide==true){con.checkCols1(xNum);}
			//con.cont[1][9]=Tretiscontrol.colr;
			if(reached==true){                                 //this draws the shape where it lands on the panel and sets the array.
				if(shape4.onSide==true){
				con.cont[yNum+1][xNum]=Tretiscontrol.colr;
				con.cont[yNum][xNum]=Tretiscontrol.colr;
				con.cont[yNum][xNum+1]=Tretiscontrol.colr;
				con.cont[yNum+1][xNum-1]=Tretiscontrol.colr;
				}
				if(shape4.onSide==false){
				con.cont[yNum][xNum-1]=Tretiscontrol.colr;
				con.cont[yNum+1][xNum-1]=Tretiscontrol.colr;
				con.cont[yNum+1][xNum]=Tretiscontrol.colr;
				con.cont[yNum+2][xNum]=Tretiscontrol.colr;
				}
			}
		}
		if(num==5){
		TretisShape5.num=5;
			shape5.paint(g);
			TretisPanel.shapeEnd=false;
			con.checkRow1();
		if(shape5.onSide==false){con.checkCols2(xNum);}
		if(shape5.onSide==true){con.checkCols10(xNum);}
		if(reached==true){                                 //this draws the shape where it lands on the panel and sets the array.
			if(shape5.onSide==true){
		con.cont[yNum+1][xNum]=Tretiscontrol.colr;
		con.cont[yNum][xNum]=Tretiscontrol.colr;
		con.cont[yNum+1][xNum+1]=Tretiscontrol.colr;
		con.cont[yNum][xNum-1]=Tretiscontrol.colr;
			}
			if(shape5.onSide==false){
		con.cont[yNum][xNum+1]=Tretiscontrol.colr;
		con.cont[yNum+1][xNum+1]=Tretiscontrol.colr;
		con.cont[yNum+1][xNum]=Tretiscontrol.colr;
		con.cont[yNum+2][xNum]=Tretiscontrol.colr;
			}
		}
		}
		
		repaint();
		
				g.dispose();
		
			}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			if(shape1.onSide==false){
			if(shape1.x3>20){         
			shape1.x1=shape1.x1-20;
			shape1.x2=shape1.x2-20;
			shape1.x3=shape1.x3-20;
			}
			}
			if(shape1.onSide==true){
			if(shape1.x3>60){         
				shape1.x1=shape1.x1-20;
				shape1.x2=shape1.x2-20;
				shape1.x3=shape1.x3-20;
				}
			}
			/*
			 *      Shape 2 has to have different cooriinates for each position.
			 */
			if(shape2.onSide==1){
			if(shape2.x3>20){
			shape2.x1=shape2.x1-20;
			shape2.x2=shape2.x2-20;
			shape2.x3=shape2.x3-20;
			shape2.x4=shape2.x4-20;
			}
			}
			if(shape2.onSide==2){
			if(shape2.x3>60){
				shape2.x1=shape2.x1-20;
				shape2.x2=shape2.x2-20;
				shape2.x3=shape2.x3-20;
				shape2.x4=shape2.x4-20;
			}
			}
			if(shape2.onSide==3){
				if(shape2.x3>40){
					shape2.x1=shape2.x1-20;
					shape2.x2=shape2.x2-20;
					shape2.x3=shape2.x3-20;
					shape2.x4=shape2.x4-20;
				}
			}
			if(shape2.onSide==4){
				if(shape2.x3>40){
					shape2.x1=shape2.x1-20;
					shape2.x2=shape2.x2-20;
					shape2.x3=shape2.x3-20;
					shape2.x4=shape2.x4-20;
				}
			}
			if(shape3.x3>40){
			shape3.x1=shape3.x1-20;
			shape3.x2=shape3.x2-20;
			shape3.x3=shape3.x3-20;
			shape3.x4=shape3.x4-20;
			}
		
			if(shape4.onSide==true){
				if(shape4.x3>40){
					shape4.x1=shape4.x1-20;
					shape4.x2=shape4.x2-20;
					shape4.x3=shape4.x3-20;
					shape4.x4=shape4.x4-20;
				}
			}
			if(shape4.onSide==false){
				if(shape4.x3>40){
					shape4.x1=shape4.x1-20;
					shape4.x2=shape4.x2-20;
					shape4.x3=shape4.x3-20;
					shape4.x4=shape4.x4-20;
				}
			}
			if(shape5.onSide==true){
				if(shape5.x3>40){
					shape5.x1=shape5.x1-20;
					shape5.x2=shape5.x2-20;
					shape5.x3=shape5.x3-20;
					shape5.x4=shape5.x4-20;
				}
			}
			if(shape5.onSide==false){
				if(shape5.x3>20){
					shape5.x1=shape5.x1-20;
					shape5.x2=shape5.x2-20;
					shape5.x3=shape5.x3-20;
					shape5.x4=shape5.x4-20;
				}
			}
	
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			if(shape1.x3<261){
				shape1.x1=shape1.x1+20;
				shape1.x2=shape1.x2+20;
				shape1.x3=shape1.x3+20;
			}
			if(shape2.onSide==1){
			if(shape2.x3<260){
				shape2.x1=shape2.x1+20;
				shape2.x2=shape2.x2+20;
				shape2.x3=shape2.x3+20;
				shape2.x4=shape2.x4+20;
			}
			}
			if(shape2.onSide==2){
			if(shape2.x3<280){
			shape2.x1=shape2.x1+20;
			shape2.x2=shape2.x2+20;
			shape2.x3=shape2.x3+20;
			shape2.x4=shape2.x4+20;
			}
			}
			if(shape2.onSide==3){
				if(shape2.x3<260){
				shape2.x1=shape2.x1+20;
				shape2.x2=shape2.x2+20;
				shape2.x3=shape2.x3+20;
				shape2.x4=shape2.x4+20;
				}
			}
			if(shape2.onSide==4){
				if(shape2.x3<280){
				shape2.x1=shape2.x1+20;
				shape2.x2=shape2.x2+20;
				shape2.x3=shape2.x3+20;
				shape2.x4=shape2.x4+20;
				}
			}
			if(shape3.x3<261){
			shape3.x1=shape3.x1+20;
			shape3.x2=shape3.x2+20;
			shape3.x3=shape3.x3+20;
			shape3.x4=shape3.x4+20;
			}
			if(shape4.onSide==true){
				if(shape4.x3<260){
					shape4.x1=shape4.x1+20;
					shape4.x2=shape4.x2+20;
					shape4.x3=shape4.x3+20;
					shape4.x4=shape4.x4+20;
				}
			}
			if(shape4.onSide==false){
				if(shape4.x3<280){
					shape4.x1=shape4.x1+20;
					shape4.x2=shape4.x2+20;
					shape4.x3=shape4.x3+20;
					shape4.x4=shape4.x4+20;
				}
			}
			
			if(shape5.onSide==true){
				if(shape5.x3<260){
				shape5.x1=shape5.x1+20;
				shape5.x2=shape5.x2+20;
				shape5.x3=shape5.x3+20;
				shape5.x4=shape5.x4+20;
				}
			}
				if(shape5.onSide==false){
					if(shape5.x3<260){
					shape5.x1=shape5.x1+20;
					shape5.x2=shape5.x2+20;
					shape5.x3=shape5.x3+20;
					shape5.x4=shape5.x4+20;
				}
				}
			
		}
		if(e.getKeyCode()==KeyEvent.VK_UP){
			++spin;
			
			if(spin==1||spin==3){
				if(TretisPanel.shapeEnd==false){
					
				shape1.onSide=false;
				shape3.onSide=false;
				shape4.onSide=false;
				shape5.onSide=false;
				shape1.offSet=shape1.y2;         //offSet for 1
				shape1.offSet2=shape1.x2;
				shape4.offSet=shape4.y3;
				shape4.offSet2=shape4.x3;
				shape5.offSet=shape5.y3;
				shape5.offSet2=shape5.x3;
				
				if(shape4.onSide==false){
				shape4.shape();
				}
				if(shape1.onSide==false){
					shape1.bar();
				}
				if(shape1.onSide==false){
					shape3.square();
				}
				if(shape5.onSide==false){
					shape5.shape();
				}
				}
				System.out.println(spin);
			}
			if(spin==2||spin==4){
				if(TretisPanel.shapeEnd==false){
				shape1.onSide=true;
				shape3.onSide=true;
				shape4.onSide=true;
				shape5.onSide=true;
				shape1.offSet=shape1.y2;
				shape1.offSet2=shape1.x2;
				shape4.offSet=shape4.y3;
				shape4.offSet2=shape4.x3;
				shape5.offSet=shape5.y3;
				shape5.offSet2=shape5.x3;
				if(shape1.onSide==true){
					shape1.barOnItsSide();
				}
				if(shape1.onSide==true){
					shape3.square();
				}
				if(shape4.onSide==true){
				shape4.shapeOnItsSide();
				}
				if(shape5.onSide==true){
					shape5.shapeOnItsSide();
				}				
				}
			
			}
			System.out.println(" spin : "+spin);
			//shape2.onSide=1;
			if(firstShape==true){spin=2;} //bug fix
			if(spin==1&&spin !=3){
				System.out.println("   inside it now!");
				if(TretisPanel.shapeEnd==false){
				shape2.onSide=1;
				shape2.offSet=shape2.y2;
				shape2.offSet2=shape2.x2;
				//shape2.shapeTeeUp();
				shape2.shapeTeeRight();
				}
			}
			if(spin==2&&spin !=4){
				firstShape=false;  //bug fix
				if(TretisPanel.shapeEnd==false){
				shape2.onSide=2;
				
					shape2.offSet=shape2.y2;
					shape2.offSet2=shape2.x2;
				//shape2.shapeTeeRight();
				shape2.shapeTeeUp();
				}
			}
			if(spin==3&&spin !=1){
			
				if(TretisPanel.shapeEnd==false){
				shape2.onSide=3;
			
					shape2.offSet=shape2.y2;
					shape2.offSet2=shape2.x2;
				shape2.shapeTeeBottom();
				
				}
			}
			if(spin==4&&spin !=2){
			if(TretisPanel.shapeEnd==false){
				shape2.onSide=4;
				shape2.offSet=shape2.y2;
				shape2.offSet2=shape2.x2;
				shape2.shapeTeeLeft();
			spin=0;
			}
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	
}
