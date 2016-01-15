/*     */ package com.netfinworks.restx.persist.jdbc;
/*     */ 
/*     */ public class QueryConditionBase
/*     */ {
/*     */   private Integer currentPage;
/*     */   private Integer pageSize;
/*     */   private boolean isCountTotal;
/*     */   private boolean fuzzy;
/*     */   private boolean order;
/*     */ 
/*     */   public Integer getCurrentPage()
/*     */   {
/*  27 */     return this.currentPage;
/*     */   }
/*     */ 
/*     */   public void setCurrentPage(Integer currentPage)
/*     */   {
/*  34 */     if (currentPage != null)
/*  35 */       this.currentPage = Integer.valueOf(currentPage.intValue() > 1 ? currentPage.intValue() : 1);
/*     */   }
/*     */ 
/*     */   public Integer getPageSize()
/*     */   {
/*  43 */     return this.pageSize;
/*     */   }
/*     */ 
/*     */   public void setPageSize(Integer pageSize)
/*     */   {
/*  50 */     this.pageSize = pageSize;
/*     */   }
/*     */ 
/*     */   public boolean isCountTotal()
/*     */   {
/*  57 */     return this.isCountTotal;
/*     */   }
/*     */ 
/*     */   public void setCountTotal(boolean isCountTotal)
/*     */   {
/*  64 */     this.isCountTotal = isCountTotal;
/*     */   }
/*     */ 
/*     */   public boolean isFuzzy()
/*     */   {
/*  71 */     return this.fuzzy;
/*     */   }
/*     */ 
/*     */   public void setFuzzy(boolean fuzzy)
/*     */   {
/*  78 */     this.fuzzy = fuzzy;
/*     */   }
/*     */ 
/*     */   public boolean isOrder()
/*     */   {
/*  85 */     return this.order;
/*     */   }
/*     */ 
/*     */   public void setOrder(boolean order)
/*     */   {
/*  92 */     this.order = order;
/*     */   }
/*     */ 
/*     */   public PageInfo generatePageInfo() {
/*  96 */     if (this.currentPage != null) {
/*  97 */       PageInfo ret = new PageInfo();
/*  98 */       ret.setCurrentPage(this.currentPage.intValue());
/*  99 */       if (this.pageSize != null) {
/* 100 */         ret.setPageSize(this.pageSize.intValue());
/*     */       }
/* 102 */       return ret;
/*     */     }
/* 104 */     return PageInfo.EMPTY;
/*     */   }
/*     */ 
/*     */   public Integer getOffset() {
/* 108 */     if (this.currentPage != null) {
/* 109 */       return Integer.valueOf((this.currentPage.intValue() - 1) * currentPageSize());
/*     */     }
/* 111 */     return null;
/*     */   }
/*     */ 
/*     */   public Integer getStartRow() {
/* 115 */     if (this.currentPage != null) {
/* 116 */       return Integer.valueOf((this.currentPage.intValue() - 1) * currentPageSize() + 1);
/*     */     }
/* 118 */     return null;
/*     */   }
/*     */ 
/*     */   public Integer getEndRow() {
/* 122 */     if (this.currentPage != null) {
/* 123 */       return Integer.valueOf(this.currentPage.intValue() * currentPageSize());
/*     */     }
/* 125 */     return null;
/*     */   }
/*     */ 
/*     */   private int currentPageSize() {
/* 129 */     return this.pageSize == null ? 20 : this.pageSize.intValue();
/*     */   }
/*     */ }

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.QueryConditionBase
 * JD-Core Version:    0.6.2
 */