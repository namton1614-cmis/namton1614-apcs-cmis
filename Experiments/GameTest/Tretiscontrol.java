
public class Tretiscontrol{
	
		public int[][] cont;
		public static int colr=0,row=1,col=1;
		int num1,num2;
		private boolean rowCompleted=false;
	public boolean test;
	public Tretiscontrol(){
		num1=0;
		num2=0;
		test=false;
		cont= new int[27][15];//bug add extra one to row from 6 to seven as col 7 was not being accessed.
		int num = 0;
		for(int row=1;row<27;row++){
			for(int col=1;col<15;col++){
				
				num++;
				if(num>5)num=num-6;
				cont[row][col]=0;
			}
		
		}
		for(int numb=1;numb<15;numb++){
			//cont[5][numb]=2;
		}
	
		
	}
	
	public void checkCols1(int x3){      
		int x=x3;						//green onits side
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j][x-1]>0||cont[j-1][x+1]>0){
				
				if(test==false){		// 2 x squares chec
				num1=j;
				test=true;
				
				TretisPanel.dropDownTo=((num1-2)*20);
				}
			}
		}	
	}
	public void checkCols2(int x3){
		int x=x3;                            // red tee shape to the right      and blue standing up
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j-1][x+1]>0){
				
				if(test==false){		// 2 x squares checks
				num1=j;
				test=true;
				
				TretisPanel.dropDownTo=((num1-2)*20);
				
				}
			}
		}
	}
	public void checkCols3(int x3){
		int x=x3;                            // red tee shape to the left
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j-1][x-1]>0){
				
				if(test==false){		// 2 x squares checks
				num1=j;
				test=true;
				
				TretisPanel.dropDownTo=((num1-2)*20);
				}
			}
		}
	}
	public void checkCols4(int x3){      //  red tee up 3 x the same y
		int x=x3-1;
		test=false;
		TretisPanel.dropDownTo=500;
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j][x+1]>0||cont[j][x-1]>0){
				
				if(test==false){		//thats  a start
				num1=j;
				test=true;
				TretisPanel.dropDownTo=((num1-2)*20);
			
				}
			}
		}

	}
	public void checkCols5(int x3){      //  blue shape 5 onits side
		int x=x3;
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j][x+1]>0||cont[j-1][x-1]>0){
				
				if(test==false){		//thats  a start
				num1=j;
				test=true;
				if(cont[j-1][x-1]>0){
				TretisPanel.dropDownTo=((num1-2)*20);
				}
				else TretisPanel.dropDownTo=((num1-2)*20);
				}
			}
		}	
	}
	public void checkCols6(int x3){      //  for red tee down shape
		int x=x3;
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j-1][x-1]>0||cont[j-1][x+1]>0){
				
				if(test==false){		//thats  a start
				num1=j;
				test=true;
				if(cont[j-1][x-1]>0){
				TretisPanel.dropDownTo=((num1-2)*20);
				}
				else TretisPanel.dropDownTo=((num1-2)*20);
				}
			}
		}	
	}

	public void checkCols7(int x3){
		int x=x3;                            // bar standing up
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0){
				
				if(test==false){		
				num1=j;
				test=true;
				
				TretisPanel.dropDownTo=((num1-2)*20);
				}
			}
		}
	}
	public void checkCols8(int x3){
		int x=x3;                            // The square
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j][x-1]>0){
				
				if(test==false){		
				num1=j;
				test=true;
				
				TretisPanel.dropDownTo=((num1-2)*20);
				}
			}
		}
	}
	public void checkCols9(int x3){      
		int x=x3;						//green Stabding up
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j-1][x-1]>0){
				
				if(test==false){		// 2 x squares chec
				num1=j;
				test=true;
				
				TretisPanel.dropDownTo=((num1-2)*20);
				}
			}
		}	
	}
	public void checkCols10(int x3){      
		int x=x3;						//green onits side
		test=false;
		TretisPanel.dropDownTo=500;
	
		for(int j = 1;j<27;j++){
			if(cont[j][x]>0||cont[j][x+1]>0||cont[j-1][x-1]>0){
				
				if(test==false){		// 2 x squares chec
				num1=j;
				test=true;
				
				TretisPanel.dropDownTo=((num1-2)*20);
				}
			}
		}	
	}
	//check Rows for Completion
	int completedRow=1;
	public void checkRow1(){
			for(int i =1;i<27;i++){
				completedRow=0;
				for(int j = 1; j <15;j++){
						
					if(cont[i][j]!=0){
							completedRow++;
						if(completedRow==14){
							makeRow100(i);
						}
					}
				}
			}
		
	}
	int zeroRow = 1;
	public void checkCompletedRows(){
		if(rowCompleted==true){
			for(int i =26;i>0;i--){    //this counts down from 26 to 1
				if(cont[i][0]==100){
					for(int j =0;j<15;j++){
						
					cont[i][j]=cont[i-1][j];
					cont[i-1][0]=100;//////////////////////////////////////////////////////////////////
					}
				}
			}
		}
	}
	public void makeRow100(int row){
		int r = row;
		
		for(int num=0;num<15;num++){
			cont[r][num]=100;
			rowCompleted=true;
		}
		moveDownTo100(r);
	}	
	//make row zero will have to call move row down again until it reaches 1
	public void moveDownTo100(int row){
		int r = row;
		checkCompletedRows();
	}
}








