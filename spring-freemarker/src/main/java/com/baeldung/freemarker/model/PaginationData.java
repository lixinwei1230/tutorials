package com.baeldung.freemarker.model;

/**
 * Created by SuM_ on 1/13/17.
 */
public class PaginationData {

    public int pageNumber;
    public int pageSize;
    public int pagesAvailable;
    public String sortDirection;
    public String sortField;

    public PaginationData() {

    }

    public PaginationData(int pageNumber, int pageSize, int pagesAvailable, String sortDirection, String sortField) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pagesAvailable = pagesAvailable;
        this.sortDirection = sortDirection;
        this.sortField = sortField;
    }

    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPagesAvailable() {
        return pagesAvailable;
    }
    public void setPagesAvailable(int pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }

    public String getSortDirection() {
        return sortDirection;
    }
    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public String getSortField() {
        return sortField;
    }
    public void setSortField(String sortField) {
        this.sortField = sortField;
    }
}
