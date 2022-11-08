public abstract class HotelRoomDecorator implements Room {
    
protected Room room ; 


  public  HotelRoomDecorator(Room room){
        this.room = room;
    }




}
  class HotelRoomDinenerDecorator extends HotelRoomDecorator {
    private int cost ; 

    
   public HotelRoomDinenerDecorator(Room room , int coast){
           super(room);
           this.cost = coast;
        }

        @Override
        public int reserver() {
           
            return room.reserver() + cost;
        }
    
    
    
    
    }
    
