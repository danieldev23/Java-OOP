/*
 *      Author: Đặng Quốc Huy (Huy Daniel)
 *      Github: https://github.com/danieldev23
 *      Facebook: https://facebook.com/huycoder2k5
 *      Created at: 10/29/23, 1:37 AM
 */

package Chapter5_Ex6;

class Room {
    private int beds;
    private boolean tv;
    private boolean telephone;

    public Room(int beds, boolean tv, boolean telephone) {
        this.beds = beds;
        this.tv = tv;
        this.telephone = telephone;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setTV(boolean tv) {
        this.tv = tv;
    }

    public void setTelephone(boolean telephone) {
        this.telephone = telephone;
    }

    public int getBeds() {
        return beds;
    }

    public boolean getTV() {
        return tv;
    }

    public boolean getTelephone() {
        return telephone;
    }
}