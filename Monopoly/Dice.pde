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
    void useDice() {
        dv1 = roll();
        dv2 = roll();
        dist = dv1+dv2;
        //print dv1, dv2, dist at specific location using roll()
    }

    //rolls the dice and returns integer value
    int roll() {
        return floor(random(1, 7));
    }

    //returns selected values of the rolled dice
    int getDV1(){
        return dv1;
    }
    int getDV2(){
        return dv2;
    }
    int getDist() {
        return dist;
    }
}