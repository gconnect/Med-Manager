package com.gconsult.medicalapp.database;

/**
 * Created by Gconsult on 4/10/2018.
 */

public class DbUpdateManager {

    protected SQLiteDatabase mDatabase;


    DbUpdateManager(SQLiteDatabase database) {
        this.mDatabase = database;
    }

    public void title(long timeStamp, String title) {
        update(DbHelper.TASK_TITLE_COLUMN, timeStamp, title);
    }

    public void date(long timeStamp, long date) {
        update(DbHelper.TASK_DATE_COLUMN, timeStamp, date);
    }

    public void priority(long timeStamp, int priority) {
        update(DbHelper.TASK_PRIORITY_COLUMN, timeStamp, priority);
    }

    public void status(long timeStamp, int status){
        update(DbHelper.TASK_STATUS_COLUMN, timeStamp, status);
    }

    public void task(ModelTask task){
        title(task.getTimeStamp(), task.getTitle());
        date(task.getTimeStamp(), task.getDate());
        priority(task.getTimeStamp(), task.getPriority());
        status(task.getTimeStamp(), task.getStatus());
    }

    private void update(String column, long key, String value) {
        ContentValues cv = new ContentValues();
        cv.put(column, value);
        mDatabase.update(DbHelper.TASKS_TABLE, cv, DbHelper.
                TASK_TIME_STAMP_COLUMN + " = " + key, null);
    }


    private void update(String column, long key, long value) {
        ContentValues cv = new ContentValues();
        cv.put(column, value);
        mDatabase.update(DbHelper.TASKS_TABLE, cv, DbHelper.TASK_TIME_STAMP_COLUMN + " = " + key, null);
    }
}
