// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.4.
// **********************************************************************

package com.qq.tars.quickstart.server.testapp;

import com.qq.tars.protocol.annotation.Servant;
import com.qq.tars.protocol.tars.annotation.TarsMethodParameter;

@Servant
public interface HelloServant {
	 String hello(@TarsMethodParameter(name="no")int no, @TarsMethodParameter(name="name")String name);
}
