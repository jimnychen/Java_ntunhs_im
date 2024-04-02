/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.broadgame;

import java.util.Scanner;

/**
 *
 * @author jimny
 */
public class Broadgame {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        boolean isGameEnd = false;
        char Player ='X'; 
        System.out.println("Game start");
        while(!isGameEnd){
            drawBoard(board);
            boolean voildinput= false;
            while(!voildinput){
                try{
                System.out.println("player "+Player+" enter your move(row and column):");
                int row =sc.nextInt();
                int col = sc.nextInt();
                if(row>=1&&row<=3&&col>=1&&col<=3&&board[row-1][col-1]==' '){
                    board[row-1][col-1] = Player;
                    voildinput = true;
                    if(Checkwinner(board,Player)){
                        System.out.print("Player:"+Player+" WIN!");
                        isGameEnd = true;
                    }
                    Player = (Player == 'X')? 'Y':'X';
                }else{
                    System.out.println("This move is illegal try again");
                }
                }catch(Exception e){
                    System.out.println("This move is illegal try again");
                    sc.nextLine();
                }
                
            }
            if(end(board)){
                isGameEnd = true;
            }
            
        }
    }
    public static void drawBoard(char[][] board){  
        System.out.println("Board");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
                if(j!=2){
                    System.out.print("|");
                }
            }
            System.out.println("");
            if(i!=2){
                System.out.println("-+-+-");
            }
        }
        
    }
    public static boolean Checkwinner(char[][] board,char Player){
        for(int i=0;i<3;i++){
         if(board[i][0]==Player&&board[i][1]==Player&&board[i][2]==Player){
           return true;  
         }
         if(board[0][i]==Player&&board[1][i]==Player&&board[2][i]==Player){
           return true;  
         }
        }
        
        boolean isCross = true;
        boolean isCross2 = true;
        for(int i=0;i<3;i++){
                if(board[i][i]!=Player){
                     isCross=false;
                }
                if(board[i][2-i]!=Player){
                     isCross2 =false;
                }
        }
        if(isCross||isCross2){
            return true;
        }         
         return false;
         }
    public static boolean end(char[][] board){
        for(int i=0;i<3;i++){
              for(int j=2;j>=0;j--){
                  if(board[i][j]==' '){
                      return false;
                    }
              }
              
         }
        System.out.println("this is tie");
        return true;
    }
    
}