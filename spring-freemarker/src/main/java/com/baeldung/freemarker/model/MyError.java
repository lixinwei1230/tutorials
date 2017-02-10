package com.baeldung.freemarker.model;

/**
 * Created by SuM_ on 1/27/17.
 */
public class MyError {

    public ErrorWrapper getError() {
        return error;
    }

    public void setError(ErrorWrapper error) {
        this.error = error;
    }

    private ErrorWrapper error;

    private static class ErrorWrapper {
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        private String code;
    }

}
