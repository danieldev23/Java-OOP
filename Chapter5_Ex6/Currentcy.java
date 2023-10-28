/*
 *      Created at: 10/29/23, 1:40 AM
 *      Author: Đặng Quốc Huy (Huy Daniel)
 *      Github: https://github.com/danieldev23
 *      Facebook: https://facebook.com/huycoder2k5
 */

package Chapter5_Ex6;

class Currency {
    private String name;
    private double currentDollarRate;

    public Currency(String name, double currentDollarRate) {
        this.name = name;
        this.currentDollarRate = currentDollarRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCurrentDollarRate(double currentDollarRate) {
        this.currentDollarRate = currentDollarRate;
    }

    public double getCurrentDollarRate() {
        return currentDollarRate;
    }

    @Override
    public String toString() {
        return name + " (1 " + name + " = " + currentDollarRate + " USD)";
    }
}
