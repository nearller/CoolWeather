package com.vrpip.coolweather.util;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2018-03-18.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     * Province 省
     * 建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement,"
            + "province_name text,"
            + "province_code text)";

    /**
     * City 市
     * 建表语句
     */
    public static final String CREATE_CITY = "create table City ("
            + "id integer primary key autoincrement,"
            + "city_name text,"
            + "city_code text,"
            + "province_id integer)";

    /**
     * County 县
     * 建表语句
     */
    public static final String CREATER_COUNTY = "create table County ("
            + "id integer primary key autoincrement,"
            + "county_name text,"
            + "county_code text,"
            + "city_id integer)";

    public CoolWeatherOpenHelper (Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATER_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
