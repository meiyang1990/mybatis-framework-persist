/*     */ package com.netfinworks.restx.persist.jdbc;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ public class PageInfo
/*     */   implements Serializable
/*     */ {
/*     */   public static final int DEFAULT_PAGE_SIZE = 20;
/*     */   private static final long serialVersionUID = -2737581679032661394L;
/*  20 */   private int currentPage = 1;
/*     */ 
/*  22 */   private int pageSize = 20;
/*     */ 
/*  24 */   private int totalCount = 0;
/*     */ 
/*  26 */   private int totalPage = 0;
/*     */ 
/*  30 */   public static final PageInfo EMPTY = new PageInfo();
/*     */ 
/*     */   public int getStartIndex()
/*     */   {
/*  37 */     int index = getStartRow() - 1;
/*  38 */     if (index < 0) {
/*  39 */       index = 0;
/*     */     }
/*  41 */     return index;
/*     */   }
/*     */ 
/*     */   public int getStartRow()
/*     */   {
/*  50 */     return (this.currentPage - 1) * this.pageSize + 1;
/*     */   }
/*     */ 
/*     */   public int getEndRow()
/*     */   {
/*  59 */     int last = this.currentPage * this.pageSize;
/*  60 */     return (this.totalCount > 0) && (last > this.totalCount) ? this.totalCount : last;
/*     */   }
/*     */ 
/*     */   public int getCurrentPage()
/*     */   {
/*  69 */     return this.currentPage;
/*     */   }
/*     */ 
/*     */   public void setCurrentPage(int currentPage)
/*     */   {
/*  78 */     if (currentPage < 1) {
/*  79 */       currentPage = 1;
/*     */     }
/*  81 */     this.currentPage = currentPage;
/*     */   }
/*     */ 
/*     */   public int getPageSize()
/*     */   {
/*  88 */     return this.pageSize;
/*     */   }
/*     */ 
/*     */   public void setPageSize(int pageSize)
/*     */   {
/*  97 */     if (pageSize < 0) {
/*  98 */       pageSize = 20;
/*     */     }
/* 100 */     this.pageSize = pageSize;
/*     */   }
/*     */ 
/*     */   public int getTotalCount()
/*     */   {
/* 109 */     return this.totalCount;
/*     */   }
/*     */ 
/*     */   public void setTotalCount(int totalCount)
/*     */   {
/* 118 */     if (totalCount < 0) {
/* 119 */       totalCount = 0;
/*     */     }
/* 121 */     this.totalCount = totalCount;
/* 122 */     if (totalCount % this.pageSize == 0)
/* 123 */       this.totalPage = (totalCount / this.pageSize);
/*     */     else {
/* 125 */       this.totalPage = (totalCount / this.pageSize + 1);
/*     */     }
/* 127 */     if (this.currentPage > this.totalPage) {
/* 128 */       this.currentPage = this.totalPage;
/*     */     }
/* 130 */     if (this.currentPage < 1)
/* 131 */       this.currentPage = 1;
/*     */   }
/*     */ 
/*     */   public int getTotalPage()
/*     */   {
/* 141 */     return this.totalPage;
/*     */   }
/*     */ 
/*     */   public void setTotalPage(int totalPage) {
/* 145 */     this.totalPage = totalPage;
/*     */   }
/*     */ }

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.PageInfo
 * JD-Core Version:    0.6.2
 */