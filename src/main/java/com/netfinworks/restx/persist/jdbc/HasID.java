package com.netfinworks.restx.persist.jdbc;

import java.io.Serializable;

public abstract interface HasID<IDType extends Serializable>
{
  public abstract IDType getId();

  public abstract void setId(IDType paramIDType);
}

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.HasID
 * JD-Core Version:    0.6.2
 */