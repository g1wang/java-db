package com.stars.mybatisgenerator.mapper2book;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BookDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Book book = new Book();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> bookId = book.bookId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> bookName = book.bookName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> category = book.category;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> path = book.path;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Book extends SqlTable {
        public final SqlColumn<Integer> bookId = column("book_id", JDBCType.INTEGER);

        public final SqlColumn<String> bookName = column("book_name", JDBCType.VARCHAR);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<String> path = column("path", JDBCType.VARCHAR);

        public Book() {
            super("book");
        }
    }
}