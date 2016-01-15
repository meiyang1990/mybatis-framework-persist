/*    */ package com.netfinworks.restx.persist.jdbc;
/*    */ 
/*    */ public class PersistException extends RuntimeException
/*    */ {
/*    */   private static final long serialVersionUID = 8878699717574908551L;
/*    */ 
/*    */   public PersistException()
/*    */   {
/*    */   }
/*    */ 
/*    */   public PersistException(String arg0)
/*    */   {
/* 25 */     super(arg0);
/*    */   }
/*    */ 
/*    */   public PersistException(Throwable arg0)
/*    */   {
/* 33 */     super(arg0);
/*    */   }
/*    */ 
/*    */   public PersistException(String arg0, Throwable arg1)
/*    */   {
/* 41 */     super(arg0, arg1);
/*    */   }
/*    */ }

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.PersistException
 * JD-Core Version:    0.6.2
 */