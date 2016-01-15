/*    */ package com.netfinworks.restx.persist.typehandler;
/*    */ 
/*    */ import com.netfinworks.common.util.money.Money;
/*    */ import java.math.BigDecimal;
/*    */ import java.sql.CallableStatement;
/*    */ import java.sql.PreparedStatement;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import org.apache.ibatis.type.BaseTypeHandler;
/*    */ import org.apache.ibatis.type.JdbcType;
/*    */ import org.apache.ibatis.type.MappedTypes;
/*    */ 
/*    */ @MappedTypes({Money.class})
/*    */ public class MoneyTypeHandler extends BaseTypeHandler<Money>
/*    */ {
/*    */   public void setNonNullParameter(PreparedStatement ps, int i, Money parameter, JdbcType jdbcType)
/*    */     throws SQLException
/*    */   {
/* 28 */     ps.setBigDecimal(i, parameter.getAmount());
/*    */   }
/*    */ 
/*    */   public Money getNullableResult(ResultSet rs, String columnName) throws SQLException
/*    */   {
/* 33 */     BigDecimal value = rs.getBigDecimal(columnName);
/* 34 */     if (value != null) {
/* 35 */       return new Money(value);
/*    */     }
/* 37 */     return null;
/*    */   }
/*    */ 
/*    */   public Money getNullableResult(ResultSet rs, int columnIndex) throws SQLException
/*    */   {
/* 42 */     BigDecimal value = rs.getBigDecimal(columnIndex);
/* 43 */     if (value != null) {
/* 44 */       return new Money(value);
/*    */     }
/* 46 */     return null;
/*    */   }
/*    */ 
/*    */   public Money getNullableResult(CallableStatement cs, int columnIndex) throws SQLException
/*    */   {
/* 51 */     BigDecimal value = cs.getBigDecimal(columnIndex);
/* 52 */     if (value != null) {
/* 53 */       return new Money(value);
/*    */     }
/* 55 */     return null;
/*    */   }
/*    */ }

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.typehandler.MoneyTypeHandler
 * JD-Core Version:    0.6.2
 */