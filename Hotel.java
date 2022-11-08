public class Hotel {
    public static void main(String[] args) {
        

SingleRoom singleRoom = new SingleRoom(50);

Sweet sweet = new Sweet(50);



System.out.println("total coast of s1:"+singleRoom.reserver() );
System.out.println("total coast of s2:"+sweet.reserver() );


HotelRoomDinenerDecorator hotelDinner = new HotelRoomDinenerDecorator(singleRoom , 70);

System.out.println("total coast of single room:"+hotelDinner.reserver() );



    }
}
