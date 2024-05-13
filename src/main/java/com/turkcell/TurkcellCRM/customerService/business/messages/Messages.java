package com.turkcell.TurkcellCRM.customerService.business.messages;

public class Messages {
    public static class AddressErrors{
        public static final String ADDRESS_NOT_FOUND= "addressNotFound";
        public static final String ADDRESS_ALREADY_EXISTS= "addressAlreadyExists";
    }

    public static class ContactInfoErrors{
        public static final String CONTACTINFO_NOT_FOUND= "contactInfoNotFound";
        public static final String CONTACTINFO_ALREADY_EXISTS= "contactInfoAlreadyExists";
    }

    public static class IndividualCustomerErrors {
        public static final String CUSTOMER_NOT_FOUND= "individualCustomerNotFound";
        public static final String CUSTOMER_ALREADY_EXISTS= "individualCustomerAlreadyExists";
        public static final String CUSTOMERS_NOT_FOUND= "individualCustomersNotFound";
    }
}
