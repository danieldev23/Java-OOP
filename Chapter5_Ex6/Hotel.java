/*
 *      Created at: 10/29/23, 1:38 AM
 *      Author: Đặng Quốc Huy (Huy Daniel)
 *      Github: https://github.com/danieldev23
 *      Facebook: https://facebook.com/huycoder2k5
 */

package Chapter5_Ex6;

class Hotel {
    private Room[] rooms;
    private String name;
    private Place place;

    public Hotel(Room[] rooms, String name, Place place) {
        this.rooms = rooms;
        this.name = name;
        this.place = place;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Hotel Name: " + name + "\nLocation: " + place.getCityName() + ", " + place.getCountryName() + "\nCurrency: " + place.getCurrency() + "\nNumber of Rooms: " + rooms.length;
    }
}

