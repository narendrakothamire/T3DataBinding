package com.softwares.swamisamarth.t3databinding.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by C145557 on 9/29/2016.
 */

public class LoginResponse {

    @SerializedName("ClientWireInfoResponseBody")
    private Body mBody;

    @SerializedName("ClientWireInfoResponseHead")
    private Head mHead;

    public Body getBody() {
        return mBody;
    }

    public void setBody(Body body) {
        mBody = body;
    }

    public Head getHead() {
        return mHead;
    }

    public void setHead(Head head) {
        mHead = head;
    }


    public class Body {

        @SerializedName("Branch")
        private String mBranch;
        @SerializedName("Email")
        private String mEmail;
        @SerializedName("EmpId")
        private String mEmpId;
        @SerializedName("LastLoginDt")
        private String mLastLoginDt;
        @SerializedName("LastPwdModDt")
        private String mLastPwdModDt;
        @SerializedName("Msg")
        private String mMsg;
        @SerializedName("Name")
        private String mName;
        @SerializedName("Status")
        private Long mStatus;

        public String getBranch() {
            return mBranch;
        }

        public void setBranch(String branch) {
            mBranch = branch;
        }

        public String getEmail() {
            return mEmail;
        }

        public void setEmail(String email) {
            mEmail = email;
        }

        public String getEmpId() {
            return mEmpId;
        }

        public void setEmpId(String empId) {
            mEmpId = empId;
        }

        public String getLastLoginDt() {
            return mLastLoginDt;
        }

        public void setLastLoginDt(String lastLoginDt) {
            mLastLoginDt = lastLoginDt;
        }

        public String getLastPwdModDt() {
            return mLastPwdModDt;
        }

        public void setLastPwdModDt(String lastPwdModDt) {
            mLastPwdModDt = lastPwdModDt;
        }

        public String getMsg() {
            return mMsg;
        }

        public void setMsg(String msg) {
            mMsg = msg;
        }

        public String getName() {
            return mName;
        }

        public void setName(String name) {
            mName = name;
        }

        public Long getStatus() {
            return mStatus;
        }

        public void setStatus(Long status) {
            mStatus = status;
        }

    }

    public static class LoginThrowable extends Throwable{

        public LoginThrowable(Throwable cause) {
            super(cause);
        }
    }
}



