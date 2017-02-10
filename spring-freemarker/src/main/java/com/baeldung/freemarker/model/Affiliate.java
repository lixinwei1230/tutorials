package com.baeldung.freemarker.model;

import java.util.List;

/**
 * Created by SuM_ on 1/27/17.
 */
public class Affiliate {

    private AffiliateWrapper payload;

    public AffiliateWrapper getPayload() {
        return payload;
    }

    public void setPayload(AffiliateWrapper payload) {
        this.payload = payload;
    }

    private static class AffiliateWrapper {
        private String _id;
        private Referral referral;
        private String name;
        private String email;
        private String phone;
        private long ct;
        private int __v;
        private Rate rate;
        private GeoLoc geoLoc;
        private Address address;
        private boolean verified;
        private StripeAccount stripeAccount;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public Referral getReferral() {
            return referral;
        }

        public void setReferral(Referral referral) {
            this.referral = referral;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public long getCt() {
            return ct;
        }

        public void setCt(long ct) {
            this.ct = ct;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public Rate getRate() {
            return rate;
        }

        public void setRate(Rate rate) {
            this.rate = rate;
        }

        public GeoLoc getGeoLoc() {
            return geoLoc;
        }

        public void setGeoLoc(GeoLoc geoLoc) {
            this.geoLoc = geoLoc;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public boolean isVerified() {
            return verified;
        }

        public void setVerified(boolean verified) {
            this.verified = verified;
        }

        public StripeAccount getStripeAccount() {
            return stripeAccount;
        }

        public void setStripeAccount(StripeAccount stripeAccount) {
            this.stripeAccount = stripeAccount;
        }

        public class Referral {

            private String code;
            private List<Object> history;

            public List<Object> getHistory() {
                return history;
            }

            public void setHistory(List<Object> history) {
                this.history = history;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }
        }

        public class Rate {

            private double salesTax;
            private double serviceFee;


            public double getSalesTax() {
                return salesTax;
            }

            public void setSalesTax(double salesTax) {
                this.salesTax = salesTax;
            }

            public double getServiceFee() {
                return serviceFee;
            }

            public void setServiceFee(int serviceFee) {
                this.serviceFee = serviceFee;
            }
        }

        public class GeoLoc {
            private double lng;
            private double lat;

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }

        public class Address {

            private String postalCode;
            private String state;
            private String city;
            private String lineOne;
            private String lineTwo;
            private String country;

            public String getPostalCode() {
                return postalCode;
            }

            public void setPostalCode(String postalCode) {
                this.postalCode = postalCode;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getLineOne() {
                return lineOne;
            }

            public void setLineOne(String lineOne) {
                this.lineOne = lineOne;
            }

            public String getLineTwo() {
                return lineTwo;
            }

            public void setLineTwo(String lineTwo) {
                this.lineTwo = lineTwo;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }
        }

        private static class StripeAccount {
            private String id;
            private String verificationStatus;
            private boolean chargesEnabled;
            private boolean transfersEnabled;
            private List<BankAccount> bankAccounts;
            private String entityType;
            private String legalBusinessName;
            private String legalFirstName;
            private String legalLastName;
            private DateOfBirth dateOfBirth;
            private BillingAddress billingAddress;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getVerificationStatus() {
                return verificationStatus;
            }

            public void setVerificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
            }

            public boolean isChargesEnabled() {
                return chargesEnabled;
            }

            public void setChargesEnabled(boolean chargesEnabled) {
                this.chargesEnabled = chargesEnabled;
            }

            public boolean isTransfersEnabled() {
                return transfersEnabled;
            }

            public void setTransfersEnabled(boolean transfersEnabled) {
                this.transfersEnabled = transfersEnabled;
            }

            public List<BankAccount> getBankAccounts() {
                return bankAccounts;
            }

            public void setBankAccounts(List<BankAccount> bankAccounts) {
                this.bankAccounts = bankAccounts;
            }

            public String getEntityType() {
                return entityType;
            }

            public void setEntityType(String entityType) {
                this.entityType = entityType;
            }

            public String getLegalBusinessName() {
                return legalBusinessName;
            }

            public void setLegalBusinessName(String legalBusinessName) {
                this.legalBusinessName = legalBusinessName;
            }

            public String getLegalFirstName() {
                return legalFirstName;
            }

            public void setLegalFirstName(String legalFirstName) {
                this.legalFirstName = legalFirstName;
            }

            public String getLegalLastName() {
                return legalLastName;
            }

            public void setLegalLastName(String legalLastName) {
                this.legalLastName = legalLastName;
            }

            public DateOfBirth getDateOfBirth() {
                return dateOfBirth;
            }

            public void setDateOfBirth(DateOfBirth dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
            }

            public BillingAddress getBillingAddress() {
                return billingAddress;
            }

            public void setBillingAddress(BillingAddress billingAddress) {
                this.billingAddress = billingAddress;
            }

            public static class BankAccount {
                private boolean isDefault;
                private String last4;
                private String routingNumber;
                private String status;
                private String bankName;

                public boolean getIsDefault() {
                    return isDefault;
                }

                public void setIsDefault(boolean aDefault) {
                    isDefault = aDefault;
                }

                public String getLast4() {
                    return last4;
                }

                public void setLast4(String last4) {
                    this.last4 = last4;
                }

                public String getRoutingNumber() {
                    return routingNumber;
                }

                public void setRoutingNumber(String routingNumber) {
                    this.routingNumber = routingNumber;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getBankName() {
                    return bankName;
                }

                public void setBankName(String bankName) {
                    this.bankName = bankName;
                }
            }

            public class DateOfBirth {
                private String day;
                private String month;
                private String year;

                public String getDay() {
                    return day;
                }

                public void setDay(String day) {
                    this.day = day;
                }

                public String getMonth() {
                    return month;
                }

                public void setMonth(String month) {
                    this.month = month;
                }

                public String getYear() {
                    return year;
                }

                public void setYear(String year) {
                    this.year = year;
                }
            }

            public class BillingAddress {
                private String city;
                private String country;
                private String line1;
                private String line2;
                private String postal_code;
                private String state;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public String getLine1() {
                    return line1;
                }

                public void setLine1(String line1) {
                    this.line1 = line1;
                }

                public String getLine2() {
                    return line2;
                }

                public void setLine2(String line2) {
                    this.line2 = line2;
                }

                public String getPostal_code() {
                    return postal_code;
                }

                public void setPostal_code(String postal_code) {
                    this.postal_code = postal_code;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }
            }

        }

    }

}
