// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Mona","Subedi","112");
        Customer c2 = new Customer("Elizabeth","Elizabeth","113");
        Customer c3 = new Customer("Moe","Zaw","133");

        c1.setBillingAddress(new Address("North 4th street","Chicago","IOWA", "52557"));
        c1.setShippingAddress(new Address("South 5th", "Chicago", "IOWA", "52557"));

        c2.setBillingAddress(new Address("North 4th street","Chicago","IOWA", "52557"));
        c2.setShippingAddress(new Address("South 5th", "New York", "IOWA", "52557"));

        c3.setBillingAddress(new Address("North 4th street","Chicago","IOWA", "52557"));
        c3.setShippingAddress(new Address("South 5th", "Chicago", "IOWA", "52557"));

        Customer[] arr = new Customer[]{c1,c2,c3};

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getBillingAddress().getCity() == "Chicago"){
                System.out.println(arr[i].toString());
            }

        }

    }
}