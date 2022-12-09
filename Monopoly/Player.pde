class Player {
    int balance;
    //position is player's index in board array
    int position;

    Player(){
        balance = 1500;
        position = 0;
    }

    //move player to a specific place on the board
    void moveTo(int pos){
        position = pos;
    }
    
    //move player a certain distance
    void move(int dist){
        //move graphics on board

        //move player coord
        position+=dist;
    }

    void drawPlayer(){
        fill(0);
        rect(0,0,10,10);
    }
}