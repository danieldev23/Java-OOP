/*
 *      Created at: 10/30/23, 10:34 PM
 *      Author: Đặng Quốc Huy (Huy Daniel)
 *      Github: https://github.com/danieldev23
 *      Facebook: https://facebook.com/huycoder2k5
 *
 *
 *
 */

package java_oop_vku;

class FruitOut extends Fruit {

    String origin;
    double extraOut;

    public FruitOut(int id, String name, double price, String origin, double extraOut) {
        super(id, name, price);
        this.origin = origin;
        this.extraOut = extraOut;
    }

    @Override
    public double priceForSale() {
        return price + extraOut + 0.1*extraOut;
    }
}

