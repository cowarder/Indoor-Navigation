package com.example.jin.hellofengmap.location;


import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import com.example.jin.hellofengmap.MainActivity;
import com.fengmap.android.map.geometry.FMMapCoord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static android.R.attr.handle;

/**
 * Created by jin on 2017/7/28.
 * 定位位置信息
 */

public class Location {

    public static MapCoord mapCoord=new MapCoord(0,new FMMapCoord(0,0,0));

    public static boolean isProblem = false;

    public static boolean isOk=false;

}
