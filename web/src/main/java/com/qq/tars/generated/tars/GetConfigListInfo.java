// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.generated.tars;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class GetConfigListInfo {

	@TarsStructProperty(order = 0, isRequire = true)
	public String appname = "";
	@TarsStructProperty(order = 1, isRequire = false)
	public String servername = "";
	@TarsStructProperty(order = 2, isRequire = false)
	public boolean bAppOnly = false;
	@TarsStructProperty(order = 3, isRequire = false)
	public String host = "";
	@TarsStructProperty(order = 4, isRequire = false)
	public String setdivision = "";
	@TarsStructProperty(order = 5, isRequire = false)
	public String containername = "";

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public String getServername() {
		return servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public boolean getBAppOnly() {
		return bAppOnly;
	}

	public void setBAppOnly(boolean bAppOnly) {
		this.bAppOnly = bAppOnly;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getSetdivision() {
		return setdivision;
	}

	public void setSetdivision(String setdivision) {
		this.setdivision = setdivision;
	}

	public String getContainername() {
		return containername;
	}

	public void setContainername(String containername) {
		this.containername = containername;
	}

	public GetConfigListInfo() {
	}

	public GetConfigListInfo(String appname, String servername, boolean bAppOnly, String host, String setdivision, String containername) {
		this.appname = appname;
		this.servername = servername;
		this.bAppOnly = bAppOnly;
		this.host = host;
		this.setdivision = setdivision;
		this.containername = containername;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(appname);
		result = prime * result + TarsUtil.hashCode(servername);
		result = prime * result + TarsUtil.hashCode(bAppOnly);
		result = prime * result + TarsUtil.hashCode(host);
		result = prime * result + TarsUtil.hashCode(setdivision);
		result = prime * result + TarsUtil.hashCode(containername);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof GetConfigListInfo)) {
			return false;
		}
		GetConfigListInfo other = (GetConfigListInfo) obj;
		return (
			TarsUtil.equals(appname, other.appname) &&
			TarsUtil.equals(servername, other.servername) &&
			TarsUtil.equals(bAppOnly, other.bAppOnly) &&
			TarsUtil.equals(host, other.host) &&
			TarsUtil.equals(setdivision, other.setdivision) &&
			TarsUtil.equals(containername, other.containername) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(appname, 0);
		if (null != servername) {
			_os.write(servername, 1);
		}
		_os.write(bAppOnly, 2);
		if (null != host) {
			_os.write(host, 3);
		}
		if (null != setdivision) {
			_os.write(setdivision, 4);
		}
		if (null != containername) {
			_os.write(containername, 5);
		}
	}


	public void readFrom(TarsInputStream _is) {
		this.appname = _is.readString(0, true);
		this.servername = _is.readString(1, false);
		this.bAppOnly = _is.read(bAppOnly, 2, false);
		this.host = _is.readString(3, false);
		this.setdivision = _is.readString(4, false);
		this.containername = _is.readString(5, false);
	}

}