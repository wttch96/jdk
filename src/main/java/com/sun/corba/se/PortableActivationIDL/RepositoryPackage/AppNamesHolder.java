package com.sun.corba.se.PortableActivationIDL.RepositoryPackage;


/**
* com/sun/corba/se/PortableActivationIDL/RepositoryPackage/AppNamesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-gyaYyR/openjdk-8-8u212-b03/src/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Friday, April 26, 2019 2:05:48 AM UTC
*/


/** Type used for a list of application names
	*/
public final class AppNamesHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public AppNamesHolder ()
  {
  }

  public AppNamesHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.type ();
  }

}
