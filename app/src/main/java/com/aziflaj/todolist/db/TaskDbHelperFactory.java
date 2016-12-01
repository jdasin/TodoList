package com.aziflaj.todolist.db;

import android.content.Context;
import android.os.Build;

/**
 * Created by danie on 24-Nov-16.
 */

public class TaskDbHelperFactory {
    public static TaskDbHelper getDBHelper(Context context) {
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return new DefaultTaskDbHelper(context);
        } else {
            return new NewTaskDbHelper(context);
        }
    }
}
