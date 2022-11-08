
public interface Room {

    public int reserver();



}

class Sweet implements Room {

private int cost ;


public Sweet(int cost){

    this.cost = cost;
}



    @Override
    public int reserver() {
     // add reservation to db
        return this.cost;
    }



}
class SingleRoom implements Room {

    private int cost ;
    
    
    public SingleRoom(int cost){
    
        this.cost = cost;
    }
    
    
    
        @Override
        public int reserver() {
         // add reservation to db
            return this.cost;
        }
    
    
    
    }