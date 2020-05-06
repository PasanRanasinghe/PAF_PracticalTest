package Healthcare.Payment;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

public class CardPayment extends Payment implements Serializable {
	
	private String name;
    private  String cardNumber;
    private String expires;
    private int cvv;

    public CardPayment() {}

    public CardPayment(double paymentAmount, String paymentDate, String paymentTime, int appointmentID,String name, String cardNumber, String expires, int cvv) {

        super(paymentAmount, paymentDate, paymentTime, appointmentID);

        this.name = name;
        this.cardNumber = cardNumber;
        this.expires = expires;
        this.cvv = cvv;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

}
