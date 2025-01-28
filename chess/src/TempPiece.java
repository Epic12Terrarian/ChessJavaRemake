public class TempPiece {
    char piece;
    Integer[] location = {0,0};
    Integer tempInt = 946203842;
    boolean tempBoolean = true;
    int team = 0; //0 for white, 1 for black (uppercase and lowercase is how I'll distinguish them apart)

    
    public Piece(char piece, Integer[] location){
        this.piece = piece;
        this.location = location;
    }
    public boolean canMove(Integer[] location) {
        if(piece == 'R'){ //A method that helps figure out how a rook can move || will need to be revised later to take into account pieces potentially being in the path
            if (location[0] == this.location[0] || location[1] == this.location[1]) {
                return true;
            }
        }
        tempInt = location[0];
        if (tempInt < 1 || tempInt > 8) {
            tempBoolean = false;
        } //above and below determine the board size being a standard 8 by 8
        tempInt = location[1];
        if (tempInt < 1 || tempInt > 8) {
            tempBoolean = false;
        }

        return tempBoolean;
    }
    public void setPiece(char piece) {
        this.piece = piece;
    }
    public void setLocation(Integer[] location) {
        this.location = location;
    }
    public Integer[] getLocation() {
        return location;
    }
    public char getPiece() {
        return piece;
    }
}
