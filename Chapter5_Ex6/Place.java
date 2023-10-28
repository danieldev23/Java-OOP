/*
 *      Created at: 10/29/23, 1:39 AM
 *      Author: Đặng Quốc Huy (Huy Daniel)
 *      Github: https://github.com/danieldev23
 *      Facebook: https://facebook.com/huycoder2k5
 *
 *
 *
 */

package Chapter5_Ex6;

class Place {
    private String cityName;
    private String countryName;
    private Currency currency;
    private String cityHallTel;

    public Place(String cityName, String countryName, Currency currency, String cityHallTel) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.currency = currency;
        this.cityHallTel = cityHallTel;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
