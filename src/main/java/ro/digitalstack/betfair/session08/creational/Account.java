package ro.digitalstack.betfair.session08.creational;

public class Account {
    private Long id;
    private String description;

    static class Builder {
        private Long id;
        private String description;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Account build() {
            Account account = new Account();
            account.id = id;
            account.description = description;

            return account;
        }
    }
}
