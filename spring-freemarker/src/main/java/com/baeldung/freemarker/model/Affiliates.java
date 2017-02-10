package com.baeldung.freemarker.model;

import java.util.List;

/**
 * Created by SuM_ on 1/27/17.
 */
public class Affiliates {

    private AffiliatesWrapper payload;

    public AffiliatesWrapper getPayload() {
        return payload;
    }

    public void setPayload(AffiliatesWrapper payload) {
        this.payload = payload;
    }

    private static class AffiliatesWrapper {

        private Metadata metadata;
        private List<Data> data;

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        public Metadata getMetadata() {
            return metadata;
        }

        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }

        private static class Metadata {

            private int queryCount;
            private int perPageCount;
            private int pageCount;
            private int page;

            public int getQueryCount() {
                return queryCount;
            }

            public void setQueryCount(int queryCount) {
                this.queryCount = queryCount;
            }

            public int getPerPageCount() {
                return perPageCount;
            }

            public void setPerPageCount(int perPageCount) {
                this.perPageCount = perPageCount;
            }

            public int getPageCount() {
                return pageCount;
            }

            public void setPageCount(int pageCount) {
                this.pageCount = pageCount;
            }

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }
        }

        private static class Data {

            private String _id;
            private Referral referral;
            private String name;
            private String email;
            private String phone;
            private long ct;
            private double createBy;
            private Rate rate;
            private Address address;
            private boolean verified;

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

            public double getCreateBy() {
                return createBy;
            }

            public void setCreateBy(double createBy) {
                this.createBy = createBy;
            }

            public Rate getRate() {
                return rate;
            }

            public void setRate(Rate rate) {
                this.rate = rate;
            }

            public Address getAddress() {
                return address;
            }

            public void setAddress(Address address) {
                this.address = address;
            }

            public boolean getVerified() {
                return verified;
            }

            public void setVerified(boolean verified) {
                this.verified = verified;
            }

        }

        private static class Address {
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

            private String postalCode;
            private String state;
            private String city;
        }

        private static class Rate {

            private double serviceFee;

            public double getServiceFee() {
                return serviceFee;
            }

            public void setServiceFee(double serviceFee) {
                this.serviceFee = serviceFee;
            }
        }

        private static class Referral {

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

    }

}
