package com.wipro.school;

import com.wipro.fundamentals.Calculator;

public class ScienceInherit {
   // package -private. it doesn't matter if put protected here in same package or sub class
   protected int classSize;
   private String bookName;

   //created constructor and will call in studentInherit class
   public ScienceInherit(String bookName) {
       this.bookName = bookName;
       }


   public ScienceInherit(){
       classSize = 30;
   }

   public String getBookName()
   {  return bookName; }
   public void setBookName(String bookName){
       this.bookName = bookName;
   }

}
