package com.netfinworks.restx.persist.jdbc;

public abstract interface HasStatus<StatusType>
{
  public abstract StatusType getStatus();

  public abstract void setStatus(StatusType paramStatusType);
}

/* Location:           C:\Users\lenovo\Desktop\restful-framework-persist-2.0.0\
 * Qualified Name:     com.netfinworks.restx.persist.jdbc.HasStatus
 * JD-Core Version:    0.6.2
 */