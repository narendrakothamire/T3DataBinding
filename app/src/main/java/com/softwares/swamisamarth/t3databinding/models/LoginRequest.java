package com.softwares.swamisamarth.t3databinding.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by C145557 on 9/29/2016.
 */

public class LoginRequest {

    @SerializedName("AppName")
    private String mAppName = "";
    @SerializedName("EmployeeId")
    private String mEmployeeId;
    @SerializedName("MacAdd")
    private String mMacAdd ="";
    @SerializedName("MachinId")
    private String mMachinId = "";
    @SerializedName("Password")
    private String mPassword;

    public String getAppName() {
        return mAppName;
    }

    public void setAppName(String appName) {
        mAppName = appName;
    }

    public String getEmployeeId() {
        return mEmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        mEmployeeId = employeeId;
    }

    public String getMacAdd() {
        return mMacAdd;
    }

    public void setMacAdd(String macAdd) {
        mMacAdd = macAdd;
    }

    public String getMachinId() {
        return mMachinId;
    }

    public void setMachinId(String machinId) {
        mMachinId = machinId;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

}