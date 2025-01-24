public class Piece {
    char piece;
    Integer[][] location = {{0},{0}};

    
    
    public Piece(char piece, Integer[][] location){
        this.piece = piece;
        this.location = location;
    }
    public boolean canMove(Integer[][] location) {
        if(piece == 'R'){
            
        }
        return false;
    }
    public void setPiece(char piece) {
        this.piece = piece;
    }
    public void setLocation(Integer[][] location) {
        this.location = location;
    }
    public Integer[][] getLocation() {
        return location;
    }
    public char getPiece() {
        return piece;
    }
}
