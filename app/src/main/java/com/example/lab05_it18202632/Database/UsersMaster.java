package com.example.lab05_it18202632.Database;

import android.provider.BaseColumns;

public final class UsersMaster {

    public UsersMaster() {
    }

    public static class Users implements BaseColumns{
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_MAME_USERNAME = "username";
        public static final String COLUMN_MAME_PASSWORD = "password";
    }
}
