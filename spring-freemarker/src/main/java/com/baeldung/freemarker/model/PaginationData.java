package com.baeldung.freemarker.model;

/**
 * Created by SuM_ on 1/13/17.
 */
public class PaginationData {

    private int pageIndex;
    private int pageSize;
    private int numOfItems;
    public int pagesAvailable;

    public PaginationData() {

    }

    public PaginationData(int pageIndex, int pageSize, int numOfItems) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.numOfItems = numOfItems;
        this.pagesAvailable = numOfItems / pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
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

}
