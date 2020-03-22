
import java.util.Scanner;

public class Sudoku{
    private static Scanner in;

	public static void main(String[] args) {
    	
    	int rowControl = 0;
    	int colonControl = 0; //column olarak degistir :dd
    	int boxControl = 0;
    	
    	int[][] sudokuEasy = { 
  			  { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, 
  			  { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
  			  { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
  			  { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
  			  { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
  			  { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
  			  { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
  			  { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
  			  { 0, 0, 0, 0, 8, 0, 0, 7, 9 } 
  			  
  							};
    	
    	int[][] sudokuNormal = {
  			  { 0, 0, 5, 2, 6, 9, 7, 8, 1 }, 
  			  { 0, 8, 0, 0, 7, 1, 4, 9, 3 },
  			  { 1, 9, 7, 8, 0, 4, 5, 6, 2 },
  			  { 8, 2, 6, 1, 9, 5, 3, 4, 7 },
  			  { 3, 7, 4, 6, 8, 2, 9, 1, 5 },
  			  { 9, 5, 1, 7, 4, 3, 6, 2, 8 },
  			  { 5, 0, 9, 3, 2, 6, 8, 7, 4 },
  			  { 2, 4, 8, 0, 5, 7, 1, 0, 6 },
  			  { 7, 6, 3, 4, 1, 8, 2, 5, 0 } 
  			  
  							};
    	
    	int[][] sudokuHard = {
  			  { 0, 0, 5, 2, 4, 9, 1, 8, 1 }, 
  			  { 0, 6, 4, 5, 0, 1, 0, 0, 0 },
  			  { 0, 0, 2, 0, 0, 0, 4, 0, 7 },
  			  { 7, 0, 0, 3, 0, 0, 0, 6, 0 },
  			  { 0, 0, 6, 0, 0, 0, 9, 0, 0 },
  			  { 0, 2, 0, 0, 0, 4, 0, 0, 1 },
  			  { 4, 0, 8, 0, 0, 0, 2, 0, 0 },
  			  { 0, 0, 0, 4, 0, 7, 8, 9, 0 },
  			  { 0, 0, 4, 0, 8, 0, 0, 0, 0 } 
  			  
  			};
    	
    	int[][] sudokuAlmostSolved = { 
  			  { 0, 3, 5, 2, 6, 9, 7, 8, 1 }, 
  			  { 6, 8, 2, 5, 7, 1, 4, 9, 3 },
  			  { 1, 9, 0, 0, 3, 4, 5, 6, 2 },
  			  { 8, 2, 6, 1, 9, 5, 3, 4, 7 },
  			  { 3, 7, 4, 6, 8, 2, 9, 1, 5 },
  			  { 9, 5, 1, 7, 4, 3, 6, 2, 8 },
  			  { 5, 1, 9, 3, 2, 6, 8, 7, 4 },
  			  { 2, 4, 8, 9, 5, 7, 1, 3, 6 },
  			  { 0, 6, 3, 4, 1, 8, 2, 5, 0 } 
  			  
  			};
    	
    	int[][] sudokuSolved = { 
    		  { 4, 3, 5, 2, 6, 9, 7, 8, 1 }, 
    		  { 6, 8, 2, 5, 7, 1, 4, 9, 3 },
    		  { 1, 9, 7, 8, 3, 4, 5, 6, 2 },
    		  { 8, 2, 6, 1, 9, 5, 3, 4, 7 },
    		  { 3, 7, 4, 6, 8, 2, 9, 1, 5 },
    		  { 9, 5, 1, 7, 4, 3, 6, 2, 8 },
    		  { 5, 1, 9, 3, 2, 6, 8, 7, 4 },
    		  { 2, 4, 8, 9, 5, 7, 1, 3, 6 },
    		  { 7, 6, 3, 4, 1, 8, 2, 5, 9 } 
    			  
    		};
  			
    	// Ornek sudokularin oldugu array abimiz bir arrayin icinde, hata yok. Bunlar nasil kullaniliyor ogren.
    	int[][][] sudokus = { sudokuEasy , sudokuNormal, sudokuHard, sudokuAlmostSolved, sudokuSolved }; 
    	
    	System.out.println("Choose your sudoku type!");
    	System.out.println("Easy          --> 1");
    	System.out.println("Normal        --> 2");
    	System.out.println("Hard          --> 3");
    	System.out.println("Almost Solved --> 4");
    	System.out.println("Solved        --> 5");
    	
    	int choose = 0;   //default easy sudoku
	    Scanner ch = new Scanner(System.in);
	    choose = ch.nextInt();
	    
	    choose--; //secilen 1 aslinda arrayde 0
	    
	    if(choose == 0) {
	    	System.out.println("You are playing EASY soduku!");
	    }
	    else if(choose == 1) {
	    	System.out.println("You are playing NORMAL soduku!");
	    }
	    else if(choose == 2) {
	    	System.out.println("You are playing HARD soduku!");
	    }
	    else if(choose == 3) {
	    	System.out.println("You are playing ALMOST SOLVED soduku!");
	    	System.out.println("The answer is 4 - 7 - 8 - 7 - 9");
	    }
	    else if(choose == 4) {
	    	System.out.println("You are playing SOLVED soduku!");
	    }
	    else{
	    	System.out.println("Your number MUST be between 1 and 5!");
		    }
	    
	    
	      
   	
/* ************************************************************************************ */
 
    	 for(int g=0 ; g<9 ; g++)     {  	 
         for(int v=0 ; v<9 ; v++)     {
        	 
        	 if(sudokus[choose][g][v] == 0) {
        		
        		//printing matrix  
        		
        		System.out.println("Your sudoku is:");
    
        		for(int colon = 0 ; colon < 9 ; colon++) {
        			
        		System.out.println("");
        		
        			if (colon == 3 || colon == 6) {	    		
        				System.out.println("- - - . - - - . - - -");
       	    	 }
        			
        		for(int row = 0 ; row < 9 ; row++) {
        			
        			if (row == 3 || row == 6) {
        				System.out.print("| "); 
       	    		 
       	    	 }
          
                System.out.print(sudokus[choose][colon][row]+" ");
               
        		}
 
        		}
        		
        		   		if(sudokus[choose][g][v] == 0) {
        		   			
       		    
        				System.out.println();
        				System.out.println();
        			    System.out.println("Enter a number (1-9) to your " + "[" + g + "]" + "[" + v + "]" + ":");
        			    
        			    int num;
        			    Scanner in = new Scanner(System.in);
            		    num = in.nextInt();
    		   			
            		 	
            		 	if(num > 0 && num < 10 ) {
            		 		sudokus[choose][g][v] = num;	
               		    }
            		 	
            		 	else					 {
            		 		
            		 		System.out.println("Your number will be greater than 0 and less than 10");
            		 		
            		 	}
        			    
            		 }	
        		   		System.out.println("");
        		 		System.out.println("****************************");
        		 	
        		 	
        		
        		 
        		 	System.out.println(" ");
        	
        	 }
  
                                      }
                                      }
  	 	
/* ************************************************************************************ */
   	         // satir kontrol
    	     for(int y=0 ; y<9 ; y++) {  
    	    	 //System.out.println("y="+y);
    	    	 //System.out.println("");
    		 
        for(int x=0 ; x<8 ; x++)      {
        	//System.out.println("x="+x);
        	//System.out.println("");
    	
    	for(int k=x+1 ; k<9 ; k++)    {
    		//System.out.println("x="+x);
    		//System.out.println("K="+k);
    	
 if(sudokus[choose][y][x] ==  sudokus[choose][y][k] ) 
  {
	 //System.out.println("ERROR");
  rowControl = 1;   //dogru degil
  }
    		
 else 
  { 
	 //System.out.println("ok");
  }
    	                              }
                                      }
                                      }	     
        
/* ************************************************************************************ */
	     // sutun kontrol
	     for(int x=0 ; x<9 ; x++) 	{  
	    	 //System.out.println("x="+x);
	    	 //System.out.println("");
		 
    for(int y=0 ; y<8 ; y++)      	{
    	//System.out.println("y="+y);
    	//System.out.println("");
	
	for(int k=y+1 ; k<9 ; k++)    	{
		//System.out.println("y="+y);
		//System.out.println("K="+k);
	
		if(sudokus[choose][y][x] ==  sudokus[choose][k][x] ) 
		{
	//System.out.println("ERROR");
colonControl = 1;   //dogru degil
		}
		
		else 
		{ 
	//System.out.println("ok");
		}
									}
                                  	}
                                  	}
	       
/* ************************************************************************************ */	
	       
	     // kutu kontrol
	     //4 tane for olacak
	     
	     for(int y=0 ; y<9 ; y=y+3) {
	     for(int x=0 ; x<9 ; x=x+3) {
	    	
	    	 
	 for(int z=y ; z<y+3 ; z++)  	{
	    	 
	 for(int t=x+1 ; t<x+3 ; t++)	{
	    	 
	    	 if(sudokus[choose][y][x] ==  sudokus[choose][z][t] ) 
	    	 {
	    	 boxControl = 1;   //dogru degil
	    	 }    	 
  	 
	    	 						}
	     						    }			                                
	     							}
	     							}
	     
/* ******************************* */	
	     
	     System.out.println("Your final sudoku is:");
	     
	     for(int colon = 0 ; colon < 9 ; colon++) {
	    	 
	    	 System.out.println("");
	    	 if (colon == 3 || colon == 6) {	    		
	    		 System.out.println("- - - . - - - . - - -"); 
	    	 }
	    	
	
     		for(int row = 0 ; row < 9 ; row++) {
     			
     			 if (row == 3 || row == 6) {
    	    		 System.out.print("| "); 
    	    	 }
     			 
             System.out.print(sudokus[choose][colon][row]+" ");
     		
     		}

     		}
	     
	     System.out.println();
	     System.out.println();
   
   if(rowControl == 1) {
	   System.out.println("You have a problem with ROW!"); 
   }
   
   if(colonControl == 1) {
	   System.out.println("You have a problem with COLON!"); 
   }
   
   if(boxControl == 1) {
	   System.out.println("You have a problem with BOX!"); 
   }
        
    // Kontrol : Hepsinin sifir oldugu durum cozulen sudokunun dogru oldugu belirtir
  
   if (rowControl == 0 && colonControl == 0 && boxControl == 0) {    
      	System.out.println("Good Job! Your sudoku is correct! :)");
      	}
   
    else {
    	System.out.println("Try again :)");
    }
   
   }
	
}
