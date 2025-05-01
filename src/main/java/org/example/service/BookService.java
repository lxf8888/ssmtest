package org.example.service;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

//    /** + enter
    /**
     * 更新
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 查找
     * @param id
     * @return
     */
    public Book findById(Integer id);

    /**
     * 所有
     * @return
     */
    public List<Book> findAll();
}
