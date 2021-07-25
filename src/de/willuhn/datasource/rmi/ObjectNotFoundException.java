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
package de.willuhn.datasource.rmi;

import java.rmi.RemoteException;

/**
 * Exception, die geworfen wird, wenn ein Objekt nicht in der Datenbank gefunden wurde.
 */
public class ObjectNotFoundException extends RemoteException
{

  private static final long serialVersionUID = 1L;

  /**
   * ct.
   */
  public ObjectNotFoundException()
  {
    super();
  }

  /**
   * ct.
   * @param s message.
   */
  public ObjectNotFoundException(String s)
  {
    super(s);
  }

  /**
   * ct.
   * @param s message
   * @param ex cause.
   */
  public ObjectNotFoundException(String s, Throwable ex)
  {
    super(s, ex);
  }

}

/**********************************************************************
 * $Log: ObjectNotFoundException.java,v $
 * Revision 1.2  2007/04/02 23:00:42  willuhn
 * @B falscher Parameter in BeanUtil#get
 * @N PseudoIterator#asList
 *
 * Revision 1.1  2004/08/26 23:19:33  willuhn
 * @N added ObjectNotFoundException
 *
 **********************************************************************/