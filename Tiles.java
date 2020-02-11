/* 6. This program must calculate how many tiles are needed to tile a floor.
 The tiles are 8 inches by 8 inches. Tiles can be used as a whole or a part 
of the tile can be used. Only one usable piece can be cut from a tile. 
That is, if a piece is cut from a tile, the rest of the tile must be thrown
 away. The program accepts the length and width of the room and returns how
 many whole tiles are used and how many part tiles are used. The length is
 given in inches. 
 
Input Format:
Input consists of 2 integers. The first integer corresponds to the width of 
the room and the second integer corresponds to the length of the room.
 
Output Format:
Output consists of 2 integers. The first integer corresponds to the number 
of whole tiles used and the second integer corresponds to the number of part
 tiles used.
 
 
Sample Input 1:
160
240
 
Sample Output 1:
600
0
 
 
 
Sample Input 2:
100
120
 
 
Sample Output 2:
180
15   */

import java.util.Scanner;
 class Tiles {
    public static void main(String args[])
    {
        int tile_lenght=8,tile_width=8;
        
        int required_tites,pieces_used;
        
        int remaining_length,remaining_width,actual_lenght_cover_tiles,actual_width_cover_tiles;
        
    Scanner sc=new Scanner(System.in);
    int length=sc.nextInt();
        int width=sc.nextInt();
        
        if((length%  tile_lenght != 0)&&(width%tile_width != 0)){
            
            remaining_length=length % tile_lenght;
            actual_lenght_cover_tiles=(length-remaining_length)/tile_lenght;
            
            remaining_width=width%tile_width;
            actual_width_cover_tiles=(width-remaining_width)/tile_width;
            
            required_tites=actual_lenght_cover_tiles*actual_width_cover_tiles;
            
            pieces_used=actual_lenght_cover_tiles+actual_width_cover_tiles;
             }
        else if(((length% tile_lenght == 0)&&(width%tile_width == 0)))
        {
            remaining_length=length% tile_lenght;
            actual_lenght_cover_tiles=(length-remaining_length)/tile_lenght;
            
            remaining_width=width%tile_width;
            actual_width_cover_tiles=(width-remaining_width)/tile_width;
            
            required_tites=actual_lenght_cover_tiles*actual_width_cover_tiles;
            
            pieces_used=0;
             
        }
        else
        {
            
           remaining_length=length% tile_lenght;
            actual_lenght_cover_tiles=(length-remaining_length)/tile_lenght;
            
            remaining_width=width%tile_width;
            actual_width_cover_tiles=(width-remaining_width)/tile_width;
            
            required_tites=actual_lenght_cover_tiles*actual_width_cover_tiles;
            
            
           if(remaining_length==0){
             pieces_used=actual_lenght_cover_tiles;
            }
            else 
            {
               pieces_used=actual_width_cover_tiles;
            }
 }        
        
        System.out.println("the no of required tiles : "+ required_tites);
       System.out.println("the no of pieces required : "+ pieces_used);
    }
    
}