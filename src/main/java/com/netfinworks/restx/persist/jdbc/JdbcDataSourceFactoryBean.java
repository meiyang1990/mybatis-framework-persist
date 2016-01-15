/*     */ package com.netfinworks.restx.persist.jdbc;
/*     */ 
/*     */ import java.util.Map;
/*     */ import javax.sql.DataSource;
/*     */ import org.apache.commons.dbcp.BasicDataSource;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.FactoryBean;
/*     */ import org.springframework.jndi.JndiObjectFactoryBean;
/*     */ 
/*     */ public class JdbcDataSourceFactoryBean
/*     */   implements FactoryBean<DataSource>
/*     */ {
/*  23 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*     */   public static final String DSTYPE_DBCP = "dbcp";
/*     */   public static final String DSTYPE_JNDI = "jndi";
/*  27 */   private String dsType = "dbcp";
/*     */   private DataSource dbcpDs;
/*     */   private String jndiName;
/*     */   private Map<String, String> dbcpConfig;
/*     */ 
/*     */   public void setDbcpConfig(Map<String, String> dbcpConfig)
/*     */   {
/*  35 */     this.dbcpConfig = dbcpConfig;
/*     */   }
/*     */ 
/*     */   public DataSource factory()
/*     */   {
/*  44 */     if ("dbcp".equalsIgnoreCase(this.dsType)) {
/*  45 */       if (this.dbcpConfig != null) {
/*  46 */         BasicDataSource ds = new BasicDataSource();
/*  47 */         String className = (String)this.dbcpConfig.get("driverClassName");
/*  48 */         ds.setDriverClassName(className);
/*     */ 
/*  51 */         String url = (String)this.dbcpConfig.get("url");
/*  52 */         ds.setUrl(url);
/*     */ 
/*  54 */         String username = (String)this.dbcpConfig.get("username");
/*  55 */         ds.setUsername(username);
/*     */ 
/*  57 */         String password = (String)this.dbcpConfig.get("password");
/*  58 */         ds.setPassword(password);
/*     */         try
/*     */         {
/*  61 */           int maxIdle = Integer.parseInt((String)this.dbcpConfig.get("maxIdle"));
/*  62 */           ds.setMaxIdle(maxIdle); } finally {
/*     */         }
/*     */         try {
/*  65 */           int maxActive = Integer.parseInt((String)this.dbcpConfig.get("maxActive"));
/*  66 */           ds.setMaxActive(maxActive);
/*     */         } finally {
/*     */         }
/*     */         try {
/*  70 */           long timeBetweenEvictionRunsMillis = Long.parseLong((String)this.dbcpConfig.get("timeBetweenEvictionRunsMillis"));
/*  71 */           ds.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
/*     */         } finally {
/*     */         }
/*     */         try {
/*  75 */           long minEvictableIdleTimeMillis = Long.parseLong((String)this.dbcpConfig.get("minEvictableIdleTimeMillis"));
/*  76 */           ds.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
/*     */         } finally {
/*     */         }
/*  79 */         return ds;
/*     */       }
/*  81 */       return this.dbcpDs;
/*     */     }
/*     */ 
/*  84 */     if ("jndi".equalsIgnoreCase(this.dsType)) {
/*  85 */       JndiObjectFactoryBean factory = new JndiObjectFactoryBean();
/*  86 */       factory.setJndiName(this.jndiName);
/*     */       try {
/*  88 */         factory.afterPropertiesSet();
/*     */       } catch (Exception e) {
/*  90 */         this.logger.error("look jndi datasource failed!", e);
/*  91 */         throw new RuntimeException(e);
/*     */       }
/*  93 */       return (DataSource)factory.getObject();
/*     */     }
/*  95 */     this.logger.error("dsType error! no datasource returned! dsType:{}", this.dsType);
/*  96 */     return null;
/*     */   }
/*     */ 
/*     */   public void setDsType(String dsType)
/*     */   {
/* 103 */     this.dsType = dsType;
/*     */   }
/*     */ 
/*     */   public void setJndiName(String jndiName)
/*     */   {
/* 110 */     this.jndiName = jndiName;
/*     */   }
/*     */ 
/*     */   public void setDbcpDs(DataSource dbcpDs)
/*     */   {
/* 117 */     this.dbcpDs = dbcpDs;
/*     */   }
/*     */ 
/*     */   public DataSource getObject() throws Exception
/*     */   {
/* 122 */     return factory();
/*     */   }
/*     */ 
/*     */   public Class<?> getObjectType()
/*     */   {
/* 127 */     return DataSource.class;
/*     */   }
/*     */ 
/*     */   public boolean isSingleton()
/*     */   {
/* 132 */     return true;
/*     */   }
/*     */ }

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.JdbcDataSourceFactoryBean
 * JD-Core Version:    0.6.2
 */