package com.neoway.ssmvc.dao;

import com.neoway.ssmvc.domain.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图书DAO
 * @author 20190712713
 * @date 2019/8/26
 */
public interface BookDao {

    /**
     * 通过ID查询单本图书
     *
     * @param id 图书id
     * @return 图书实体
     */
    Book queryById(long id);

    /**
     * 查询所有图书
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 图书实体列表
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 减少馆藏数量
     *
     * @param bookId 图书id
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(long bookId);

}
