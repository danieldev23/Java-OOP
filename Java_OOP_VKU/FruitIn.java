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

class FruitIn extends Fruit {

    double extraln;

    public FruitIn(int id, String name, double price, double extraln) {
        super(id, name, price);
        this.extraln = extraln;
    }

    @Override
    public double priceForSale() {
        return price + extraln;
    }
}
