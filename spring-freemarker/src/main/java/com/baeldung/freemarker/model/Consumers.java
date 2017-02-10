package com.baeldung.freemarker.model;

import java.util.List;

/**
 * Created by SuM_ on 1/27/17.
 */
public class Consumers {

    public ConsumersWrapper getPayload() {
        return payload;
    }

    public void setPayload(ConsumersWrapper payload) {
        this.payload = payload;
    }

    private ConsumersWrapper payload;

    private static class ConsumersWrapper {
        public Metadata getMetadata() {
            return metadata;
        }

        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        private Metadata metadata;
        private List<Data> data;

        private static class Metadata {
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

            private int queryCount;
            private int perPageCount;
            private int pageCount;
            private int page;
        }

        private static class Data {
            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getfName() {
                return fName;
            }

            public void setfName(String fName) {
                this.fName = fName;
            }

            public String getlName() {
                return lName;
            }

            public void setlName(String lName) {
                this.lName = lName;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public Referral getReferral() {
                return referral;
            }

            public void setReferral(Referral referral) {
                this.referral = referral;
            }

            public long getCt() {
                return ct;
            }

            public void setCt(long ct) {
                this.ct = ct;
            }

            public boolean isVerified() {
                return verified;
            }

            public void setVerified(boolean verified) {
                this.verified = verified;
            }

            private String _id;
            private String email;
            private String fName;
            private String lName;
            private String phone;
            private Referral referral;
            private long ct;
            private boolean verified;

            private static class Referral {
                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                private String code;
            }

        }
    }

}
