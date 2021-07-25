/**********************************************************************
 *
 * Copyright (c) 2004 Olaf Willuhn
 * All rights reserved.
 * 
 * This software is copyrighted work licensed under the terms of the
 * GNU LESSER GENERAL PUBLIC LICENSE 2.1.
 * Please consult the file "LICENSE" for details. 
 *
 **********************************************************************/

package de.willuhn.datasource.db.types;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Generisch.
 */
public class TypeGeneric implements Type
{
  /**
   * @see de.willuhn.datasource.db.types.Type#get(java.sql.ResultSet, java.lang.String)
   */
  public Object get(ResultSet rs, String name) throws SQLException
  {
    return rs.getObject(name);
  }

  /**
   * @see de.willuhn.datasource.db.types.Type#set(java.sql.PreparedStatement, int, java.lang.Object)
   */
  public void set(PreparedStatement stmt, int index, Object value) throws SQLException
  {
    if (value == null)
      stmt.setNull(index,Types.NULL);
    else
      stmt.setObject(index,value);
  }
}

/*********************************************************************
 * $Log: TypeGeneric.java,v $
 * Revision 1.1  2008/07/11 09:30:17  willuhn
 * @N Support fuer Byte-Arrays
 * @N SQL-Typen sind jetzt erweiterbar
 *
 **********************************************************************/