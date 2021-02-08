package labirent;


import java.util.Scanner;

public class Labirent {
    
    public static int[][] labirent={{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                                    {2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
                                    {2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2},
                                    {2, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2},
                                    {2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 5, 2, 2, 2, 2, 2, 1, 2},
                                    {2, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2},
                                    {2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 5, 2},
                                    {2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2},
                                    {2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2},
                                    {2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2},
                                    {2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2},
                                    {2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2},
                                    {2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2},
                                    {2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2},
                                    {2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2},
                                    {2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 5, 2},
                                    {2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2},
                                    {2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2},
                                    {2, 5, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 4, 2},
                                    {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}};
    
    public static void main(String args []){
        Adam adam = new Adam();
        Cikis cikis = new Cikis();
        Yer yer = new Yer();
        DegerliEsya degerliEsya = new DegerliEsya();
        Scanner klavye = new Scanner(System.in);
        Duvar duvar = new Duvar();
        int toplamAdim = 0;
        for (int y = 0; y < labirent.length; y++){
		for(int x = 0; x < labirent[y].length; x++){
			int hucre = labirent[y][x];
			if(hucre == 3){
				adam.setX(x);
				adam.setY(y);
                                
			}
			if(hucre == 4){
				cikis.setX(x);
                                cikis.setY(y);
                               
			}
		}
	}
        
        int adamY = adam.getY();
        int adamX = adam.getX();
        int cikisX = cikis.getX();
        int cikisY = cikis.getY();
        int yem = degerliEsya.getDegerliEsya();
        
        while(true){
            System.out.println("-------------------\n");
            for(int y = 0; y<labirent.length; y++){
                for(int x = 0;x<labirent[y].length;x++){
                    int hucre = labirent[y][x];
                    switch(hucre){
                        case 1: System.out.print(yer.yazdir());break;
                        case 2: System.out.print(duvar.yazdir());break;
                        case 3: System.out.print(adam.yazdir());break;
                        case 4: System.out.print(cikis.yazdir());break;
                        case 5: System.out.print(degerliEsya.yazdir());break;
                    }
                
                }
                System.out.println("");
            }
            System.out.println("Total Step:"+toplamAdim);
            System.out.println("Number of Valuables Left:"+yem);
            System.out.println("");
            
            System.out.print("Your Choice to Move(W = Up, S = Down, A = Left, D = Right):");
            String secimStr = klavye.next();
            char secim = secimStr.charAt(0);
            
            switch (secim){
                
		case 'w':
                case 'W': 
                    try {
                        if(labirent[adamY-1][adamX] == 1 || labirent[adamY-1][adamX] == 4){
                        labirent[adamY][adamX] = 1; 
			labirent[--adamY][adamX] = 3; 
			toplamAdim++;
                        }
                        else if(labirent[adamY-1][adamX] == 5) {
                            labirent[adamY][adamX] = 1;
                            labirent[--adamY][adamX] = 3;
                            toplamAdim++;
                            yem--;
                        }
                        else if(labirent[adamY-1][adamX] == 2) {
                            if(labirent[adamY-2][adamX] == 1) {
                            labirent[adamY-1][adamX] = 1;
                            labirent[adamY-2][adamX] = 2;
                            }
                        }
                        break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("YOU LOST!\nYou're out of the Maze.");
                        return;
                    }
                    
		case 'a':
		case 'A':
                    try {
                        if(labirent[adamY][adamX-1] == 1 || labirent[adamY][adamX-1] == 4){
                        labirent[adamY][adamX] = 1; 
			labirent[adamY][--adamX] = 3; 
			toplamAdim++;
                        }
                        else if(labirent[adamY][adamX-1] == 5) {
                            labirent[adamY][adamX] = 1;
                            labirent[adamY][--adamX] = 3;
                            toplamAdim++;
                            yem--;
                        }
                        else if(labirent[adamY][adamX-1] == 2) {
                            if(labirent[adamY][adamX-2] == 1) {
                                labirent[adamY][adamX-1] = 1;
                                labirent[adamY][adamX-2] = 2;
                            }
                        }
					
			break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("YOU LOST!\nYou're out of the Maze.");
                        return;
                    }
					
                    
					
                    case 's':
                    case 'S':
                        try {
                            if(labirent[adamY+1][adamX] == 1 || labirent[adamY+1][adamX] == 4){
                            labirent[adamY][adamX] = 1; 
                            labirent[++adamY][adamX] = 3;
                            toplamAdim++;
                            }
                            else if(labirent[adamY+1][adamX] == 5) {
                                labirent[adamY][adamX] = 1;
                                labirent[++adamY][adamX] = 3;
                                toplamAdim++;
                                yem--;
                            }

                            else if(labirent[adamY+1][adamX] == 2) {
                                if(labirent[adamY+2][adamX] == 1) {
                                    labirent[adamY+1][adamX] = 1;
                                    labirent[adamY+2][adamX] = 2;
                                }
                            }
                            break;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("YOU LOST!\nYou're out of the Maze.");
                            return;
                        }
					
                        
				
		case 'd':
		case 'D':
                    try {
                       if(labirent[adamY][adamX+1] == 1 || labirent[adamY][adamX+1] == 4){
			labirent[adamY][adamX] = 1; 
			labirent[adamY][++adamX] = 3; 
			toplamAdim++;
                        }
                        else if(labirent[adamY][adamX+1] == 5) {
                            labirent[adamY][adamX] = 1;
                            labirent[adamY][++adamX] = 3;
                            toplamAdim++;
                            yem--;
                        }
                        else if(labirent[adamY][adamX+1] == 2) {
                            if(labirent[adamY][adamX+2] == 1) {
                                labirent[adamY][adamX+1] = 1;
                                labirent[adamY][adamX+2] = 2;
                            }
                        }

                        break; 
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("YOU LOST!\nYou're out of the Maze.");
                        return;
                    }
					
                    
                    
            }
            if(cikisX == adamX && cikisY == adamY){
		if(yem == 0) {
		System.out.println("Congratulations! You Found The Exit.");
		break;
		}
            }
        
        }
    
    }
}
