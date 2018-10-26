// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.generated.tars;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

/**
 * 异步任务
 */
@TarsStruct
public class TaskItemReq {

	@TarsStructProperty(order = 0, isRequire = false)
	public String taskNo = "";
	@TarsStructProperty(order = 1, isRequire = false)
	public String itemNo = "";
	@TarsStructProperty(order = 2, isRequire = false)
	public String application = "";
	@TarsStructProperty(order = 3, isRequire = false)
	public String serverName = "";
	@TarsStructProperty(order = 4, isRequire = false)
	public String nodeName = "";
	@TarsStructProperty(order = 5, isRequire = false)
	public String setName = "";
	@TarsStructProperty(order = 6, isRequire = false)
	public String command = "";
	@TarsStructProperty(order = 7, isRequire = false)
	public String userName = "";
	@TarsStructProperty(order = 8, isRequire = false)
	public java.util.Map<String, String> parameters = null;

	public String getTaskNo() {
		return taskNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public java.util.Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(java.util.Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public TaskItemReq() {
	}

	public TaskItemReq(String taskNo, String itemNo, String application, String serverName, String nodeName, String setName, String command, String userName, java.util.Map<String, String> parameters) {
		this.taskNo = taskNo;
		this.itemNo = itemNo;
		this.application = application;
		this.serverName = serverName;
		this.nodeName = nodeName;
		this.setName = setName;
		this.command = command;
		this.userName = userName;
		this.parameters = parameters;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(taskNo);
		result = prime * result + TarsUtil.hashCode(itemNo);
		result = prime * result + TarsUtil.hashCode(application);
		result = prime * result + TarsUtil.hashCode(serverName);
		result = prime * result + TarsUtil.hashCode(nodeName);
		result = prime * result + TarsUtil.hashCode(setName);
		result = prime * result + TarsUtil.hashCode(command);
		result = prime * result + TarsUtil.hashCode(userName);
		result = prime * result + TarsUtil.hashCode(parameters);
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
		if (!(obj instanceof TaskItemReq)) {
			return false;
		}
		TaskItemReq other = (TaskItemReq) obj;
		return (
			TarsUtil.equals(taskNo, other.taskNo) &&
			TarsUtil.equals(itemNo, other.itemNo) &&
			TarsUtil.equals(application, other.application) &&
			TarsUtil.equals(serverName, other.serverName) &&
			TarsUtil.equals(nodeName, other.nodeName) &&
			TarsUtil.equals(setName, other.setName) &&
			TarsUtil.equals(command, other.command) &&
			TarsUtil.equals(userName, other.userName) &&
			TarsUtil.equals(parameters, other.parameters) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		if (null != taskNo) {
			_os.write(taskNo, 0);
		}
		if (null != itemNo) {
			_os.write(itemNo, 1);
		}
		if (null != application) {
			_os.write(application, 2);
		}
		if (null != serverName) {
			_os.write(serverName, 3);
		}
		if (null != nodeName) {
			_os.write(nodeName, 4);
		}
		if (null != setName) {
			_os.write(setName, 5);
		}
		if (null != command) {
			_os.write(command, 6);
		}
		if (null != userName) {
			_os.write(userName, 7);
		}
		if (null != parameters) {
			_os.write(parameters, 8);
		}
	}

	static java.util.Map<String, String> cache_parameters;
	static { 
		cache_parameters = new java.util.HashMap<String, String>();
		String var_1 = "";
		String var_2 = "";
		cache_parameters.put(var_1 ,var_2);
	}

	public void readFrom(TarsInputStream _is) {
		this.taskNo = _is.readString(0, false);
		this.itemNo = _is.readString(1, false);
		this.application = _is.readString(2, false);
		this.serverName = _is.readString(3, false);
		this.nodeName = _is.readString(4, false);
		this.setName = _is.readString(5, false);
		this.command = _is.readString(6, false);
		this.userName = _is.readString(7, false);
		this.parameters = (java.util.Map<String, String>) _is.read(cache_parameters, 8, false);
	}

}