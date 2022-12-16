import java.utils.Scanner;

class Board {
    ArrayList<Place> board;
    PImage img;
    
    Board() {
        board = new ArrayList<Place>();
        img = loadImage("monopolyBoard.png");

        //type of place is prop, cc (community chest), chance, start, jail, empty, road, tax, util
        String[] names = loadStrings("Board Names.txt");
        String[] types = loadStrings("Board Types.txt");

        board.add(new Place("start","start"));
        for (int i = 0;i<names.size();i++){
            board.add(new Place(names[i],types[i]));
        }
    }

    void drawBoard() {
        image(img, 0, 0);
    }
    
}
