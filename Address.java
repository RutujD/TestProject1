package app04.com.test;

public class Address {
	
	private String postalCode;
    private String prefecture;
    private String city;
    private String street;
	
    public Address(String postalCode, String prefecture, String city, String street) {
        this.postalCode = postalCode;
        this.prefecture = prefecture;
        this.city = city;
        this.street = street;
    }

    // アクセサメソッド
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
