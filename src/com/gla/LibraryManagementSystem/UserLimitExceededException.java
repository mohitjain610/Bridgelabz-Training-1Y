package com.gla.LibraryManagementSystem;

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String msg) {
        super(msg);
    }
}

