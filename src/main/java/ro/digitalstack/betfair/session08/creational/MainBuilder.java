package ro.digitalstack.betfair.session08.creational;

public class MainBuilder {
    public static void main(String[] args) {
        Account.Builder builder = new Account.Builder();
        Account.Builder builder2 = new Account.Builder();

        Account account = builder.setId(1L).setDescription("description1").build();
        Account account2 = builder2.setDescription("description2").setId(2L).build();
    }
}
