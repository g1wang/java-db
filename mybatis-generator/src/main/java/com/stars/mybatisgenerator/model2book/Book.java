package com.stars.mybatisgenerator.model2book;

import javax.annotation.Generated;

public class Book {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer bookId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String bookName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String category;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String path;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getBookId() {
        return bookId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBookName() {
        return bookName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCategory() {
        return category;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCategory(String category) {
        this.category = category;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPath() {
        return path;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPath(String path) {
        this.path = path;
    }
}