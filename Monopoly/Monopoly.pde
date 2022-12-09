int turn = 1;
Board board;
Dice dice;
Player p1,p2;

void setup() {
    size(1024,1024); //840x880
    PImage img;
    img = loadImage("monopolyBoard.png");
    //draw board
    board = new Board();
    dice = new Dice();
    board.drawBoard();
    player.drawPlayer();
}

void mouseClicked() {
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
