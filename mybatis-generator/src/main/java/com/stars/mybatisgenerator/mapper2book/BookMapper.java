package com.stars.mybatisgenerator.mapper2book;

import static com.stars.mybatisgenerator.mapper2book.BookDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.stars.mybatisgenerator.model2book.Book;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BookMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(bookId, bookName, category, path);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Book> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Book> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BookResult")
    Optional<Book> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BookResult", value = {
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="book_name", property="bookName", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR)
    })
    List<Book> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, book, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, book, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer bookId_) {
        return delete(c -> 
            c.where(bookId, isEqualTo(bookId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Book record) {
        return MyBatis3Utils.insert(this::insert, record, book, c ->
            c.map(bookId).toProperty("bookId")
            .map(bookName).toProperty("bookName")
            .map(category).toProperty("category")
            .map(path).toProperty("path")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Book> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, book, c ->
            c.map(bookId).toProperty("bookId")
            .map(bookName).toProperty("bookName")
            .map(category).toProperty("category")
            .map(path).toProperty("path")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Book record) {
        return MyBatis3Utils.insert(this::insert, record, book, c ->
            c.map(bookId).toPropertyWhenPresent("bookId", record::getBookId)
            .map(bookName).toPropertyWhenPresent("bookName", record::getBookName)
            .map(category).toPropertyWhenPresent("category", record::getCategory)
            .map(path).toPropertyWhenPresent("path", record::getPath)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Book> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, book, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Book> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, book, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Book> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, book, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Book> selectByPrimaryKey(Integer bookId_) {
        return selectOne(c ->
            c.where(bookId, isEqualTo(bookId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, book, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Book record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookId).equalTo(record::getBookId)
                .set(bookName).equalTo(record::getBookName)
                .set(category).equalTo(record::getCategory)
                .set(path).equalTo(record::getPath);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Book record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookId).equalToWhenPresent(record::getBookId)
                .set(bookName).equalToWhenPresent(record::getBookName)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(path).equalToWhenPresent(record::getPath);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Book record) {
        return update(c ->
            c.set(bookName).equalTo(record::getBookName)
            .set(category).equalTo(record::getCategory)
            .set(path).equalTo(record::getPath)
            .where(bookId, isEqualTo(record::getBookId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Book record) {
        return update(c ->
            c.set(bookName).equalToWhenPresent(record::getBookName)
            .set(category).equalToWhenPresent(record::getCategory)
            .set(path).equalToWhenPresent(record::getPath)
            .where(bookId, isEqualTo(record::getBookId))
        );
    }
}