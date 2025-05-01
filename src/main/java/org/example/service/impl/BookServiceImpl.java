package org.example.service.impl;

import org.example.controller.Code;
import org.example.dao.BookDao;
import org.example.domain.Book;
import org.example.exception.BusinessException;
import org.example.exception.SystemException;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book findById(Integer id) {
////        将可能出现的异常进行包装，转换成自定义异常
//        if(id == 1){
//            throw new BusinessException(Code.BUSINESS_ERR,"请正确填写");
//        }
//        try{
//            int i = 1/0;
//        }catch(Exception e){
//            throw  new SystemException(Code.BUSINESS_ERR,"服务器超时访问，请重试",e);
//        }
        return bookDao.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
