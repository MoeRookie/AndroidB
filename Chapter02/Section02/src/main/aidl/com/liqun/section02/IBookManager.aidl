// IBookManager.aidl
package com.liqun.section02;
import com.liqun.section02.Book;
interface IBookManager{
    List<Book> getBookList();
    void addBook(in Book book);
}
