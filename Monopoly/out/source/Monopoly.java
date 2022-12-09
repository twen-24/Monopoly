/* autogenerated by Processing revision 1286 on 2022-12-07 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.utils.Scanner;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Monopoly extends PApplet {

int turn = 1;
Board board;
Dice dice;
Player p1,p2;

 public void setup() {
    /* size commented out by preprocessor */; //840x880
    PImage img;
    img = loadImage("monopolyBoard.png");
    //draw board
    board = new Board();
    dice = new Dice();
    board.drawBoard();
    player.drawPlayer();
}

 public void mouseClicked() {
    //roll dice
    dice.useDice();
    int dist = dice.getDist();
    //p1's turn when turn = 1
    //p2's turn when turn = -1
    if (turn = 1){
        //move player on board
        p1.move(dist);

    }else{
        //move player on board
        p2.move(dist);
    }

    //switch turn at the end of player's turn
    //if player rolled doubles, go again
    if (!(dice.getDV1() == dice.getDV2())) turn = -turn;
}


class Board {
    ArrayList<Place> board;
    PImage img;
    
    Board() {
        board = new ArrayList<Place>();
        img = loadImage("monopolyBoard.png");

        //type of place is prop, cc (community chest), chance, start, jail, empty
        String[] names = loadStrings("Board Names.txt");
        String[] types = loadStrings("Board Types.txt");

        for (int i = 0;i<names.size();i++){
            board.add(Places.new(names[i],types[i]));
        }
    }

     public void drawBoard() {
        image(img, 0, 0);
    }
    
}


class Card
{
	public static String prompt = "";

  	//constructors
	public Card(String prompt){
		//enter prompt from prompt file
		this.prompt = prompt;
	}

  	public int getPrompt()
  	{
  		return prompt;
  	}

  	//toString
  	public String toString(){
		return prompt;
	}
 }
 
 
class Dice {
    //dv = dice value
    int dv1;
    int dv2;
    int dist;
    
    //default constructor
    Dice() {
        dv1 = 0;
        dv2 = 0;
        dist = 0;
    }
    //roll and draw dice
     public void useDice() {
        dv1 = roll();
        dv2 = roll();
        dist = dv1+dv2;
        //print dv1, dv2, dist at specific location using roll()
    }

    //rolls the dice and returns integer value
     public int roll() {
        return floor(random(1, 7));
    }

    //returns selected values of the rolled dice
     public int getDV1(){
        return dv1;
    }
     public int getDV2(){
        return dv2;
    }
     public int getDist() {
        return dist;
    }
}
class Place {
    String name;
    String type;
    int value;

    Place (String name, String type) {
        this.name = name;
        this.type = type;
    }
}
class Player {
    int balance;
    //position is player's index in board array
    int position;

    Player(){
        balance = 1500;
        position = 0;
    }

    //move player to a specific place on the board
     public void moveTo(int pos){
        position = pos;
    }
    
    //move player a certain distance
     public void move(int dist){
        //move graphics on board

        //move player coord
        position+=dist;
    }

     public void drawPlayer(){
        fill(0);
        rect(0,0,10,10);
    }
}


  public void settings() { size(1024, 1024); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Monopoly" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
