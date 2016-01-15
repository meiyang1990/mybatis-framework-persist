/*     */ package com.netfinworks.restx.persist.jdbc;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.beanutils.BeanUtils;
/*     */ 
/*     */ public class DOBase
/*     */   implements HasID<String>, HasStatus<String>, BeTraced, Serializable
/*     */ {
/*     */   private static final long serialVersionUID = -8159220928911036093L;
/*     */   private String creator;
/*     */   private String modifier;
/*     */   private String status;
/*     */   private String id;
/*     */   private Date gmtCreate;
/*     */   private Date gmtModified;
/*     */ 
/*     */   public Date getGmtModified()
/*     */   {
/*  26 */     return this.gmtModified;
/*     */   }
/*     */ 
/*     */   public void setGmtModified(Date gmtModified) {
/*  30 */     this.gmtModified = gmtModified;
/*     */   }
/*     */ 
/*     */   public Date getGmtCreate() {
/*  34 */     return this.gmtCreate;
/*     */   }
/*     */ 
/*     */   public void setGmtCreate(Date gmtCreate) {
/*  38 */     this.gmtCreate = gmtCreate;
/*     */   }
/*     */ 
/*     */   public String getCreator()
/*     */   {
/*  43 */     return this.creator;
/*     */   }
/*     */ 
/*     */   public void setCreator(String creator)
/*     */   {
/*  48 */     this.creator = creator;
/*     */   }
/*     */ 
/*     */   public String getModifier()
/*     */   {
/*  53 */     return this.modifier;
/*     */   }
/*     */ 
/*     */   public void setModifier(String modifier)
/*     */   {
/*  58 */     this.modifier = modifier;
/*     */   }
/*     */ 
/*     */   public String getStatus()
/*     */   {
/*  63 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status)
/*     */   {
/*  68 */     this.status = status;
/*     */   }
/*     */ 
/*     */   public String getId()
/*     */   {
/*  73 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(String id)
/*     */   {
/*  78 */     this.id = id;
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/*     */     try
/*     */     {
/*  85 */       Map props = BeanUtils.describe(this);
/*  86 */       Iterator iProps = props.keySet().iterator();
/*  87 */       StringBuffer retBuffer = new StringBuffer();
/*  88 */       retBuffer.append(getClass().getSimpleName()).append("@").append(hashCode()).append(":");
/*     */ 
/*  90 */       while (iProps.hasNext()) {
/*  91 */         String key = (String)iProps.next();
/*     */ 
/*  94 */         if (!"class".equals(key))
/*     */         {
/*  98 */           retBuffer.append(key).append("=[").append(props.get(key)).append("]");
/*     */ 
/* 100 */           if (iProps.hasNext()) {
/* 101 */             retBuffer.append(", ");
/*     */           }
/*     */         }
/*     */       }
/* 105 */       return retBuffer.toString(); } catch (Exception e) {
/*     */     }
/* 107 */     return super.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.DOBase
 * JD-Core Version:    0.6.2
 */