/*
 *      Created at: 10/29/23, 1:40 AM
 *      Author: Đặng Quốc Huy (Huy Daniel)
 *      Github: https://github.com/danieldev23
 *      Facebook: https://facebook.com/huycoder2k5
 */

package Chapter5_Ex6;

public class Main {
    public static void main(String[] args) {
        Currency usd = new Currency("USD", 1.0);
        Place paris = new Place("Paris", "France", usd, "+33-1-123456789");
        Room[] rooms = {new Room(2, true, true), new Room(1, false, true)};
        Hotel hotel = new Hotel(rooms, "Sample Hotel", paris);

        System.out.println(hotel);
    }
}

