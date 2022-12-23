public class vipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public vipCustomer(){
        this("default",100,"880225560and");

    }



    public vipCustomer(String name, int creditLimit) {
       this(name,creditLimit,"8802255605and@");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public vipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
