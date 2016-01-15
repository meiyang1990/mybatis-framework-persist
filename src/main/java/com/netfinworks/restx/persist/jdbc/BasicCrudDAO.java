package com.netfinworks.restx.persist.jdbc;

import java.util.List;

public abstract interface BasicCrudDAO<DOType extends DOBase, IDType, ConditionType extends QueryConditionBase>
{
  public abstract int insert(DOType paramDOType)
    throws PersistException;

  public abstract DOType findById(IDType paramIDType)
    throws PersistException;

  public abstract List<DOType> query(ConditionType paramConditionType)
    throws PersistException;

  public abstract int updateById(DOType paramDOType)
    throws PersistException;

  public abstract int deleteById(IDType paramIDType)
    throws PersistException;

  public abstract int count(ConditionType paramConditionType)
    throws PersistException;
}

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.BasicCrudDAO
 * JD-Core Version:    0.6.2
 */