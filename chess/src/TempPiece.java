public class TempPiece {
    char piece;
    Integer[] location = {0,0};
    Integer tempInt = 946203842;
    Integer tempInt2 = 907981;
    boolean tempBoolean = true;
    int team = 0; //0 for white, 1 for black (uppercase and lowercase is how I'll distinguish them apart)

    
    public Piece(char piece, Integer[] location){
        this.piece = piece;
        this.location = location;
        this.tempInt = location[0];
        this.tempInt2 = location[1];
        App.board[tempInt][tempInt2] = piece;
    }
    public boolean canMove(Integer[] location) {
        if(piece == 'R'){ //A method that helps figure out how a rook can move || will need to be revised later to take into account pieces potentially being in the path
            if (location[0] == this.location[0] || location[1] == this.location[1]) {
                tempBoolean = true;
            }
        }
        if(piece == 'N'){
            if(location[0] == this.location[0] + 2 && location[1] == this.location[1] + 1) {
            	tempBoolean = true;
            }
            if(location[0] == this.location[0] + 2 && location[0] == this.location[1] - 1) {
            	tempBoolean = true;
            }
            if(location[0] == this.location[0] - 2 && location[0] == this.location[1] - 1) {
            	tempBoolean = true;
            }
            if(location[0] == this.location[0] - 2 && location[0] == this.location[1] + 1) {
            	tempBoolean = true;
            }
            if(location[0] == this.location[0] + 1 && location[0] == this.location[1] + 2) {
            	tempBoolean = true;
            }
            if(location[0] == this.location[0] + 1 && location[0] == this.location[1] - 2) {
                tempBoolean = true;
            }
            if(location[0] == this.location[0] - 1 && location[0] == this.location[1] - 2) {
                tempBoolean = true;
            }
            if(location[0] == this.location[0] - 1 && location[0] == this.location[1] + 2) {
                tempBoolean = true;
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
        this.tempInt = this.location[0]
        this.tempInt = this.location[1]
        App.board[tempInt][tempInt2] = " ";
        this.location = location;
        this.tempInt = location[0];
        this.tempInt2 = location[1]
        App.board[tempInt][tempInt2] = piece;
    }
    public Integer[] getLocation() {
        return location;
    }
    public char getPiece() {
        return piece;
    }
}
