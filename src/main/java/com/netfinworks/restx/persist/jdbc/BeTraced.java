package com.netfinworks.restx.persist.jdbc;

import java.util.Date;

public abstract interface BeTraced
{
  public abstract String getCreator();

  public abstract void setCreator(String paramString);

  public abstract String getModifier();

  public abstract void setModifier(String paramString);

  public abstract Date getGmtModified();

  public abstract void setGmtModified(Date paramDate);

  public abstract Date getGmtCreate();

  public abstract void setGmtCreate(Date paramDate);
}

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.BeTraced
 * JD-Core Version:    0.6.2
 */