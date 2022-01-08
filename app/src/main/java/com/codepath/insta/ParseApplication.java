package com.codepath.insta;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XXqTBuXhJ8os3DraaadZ8GyUS92ikfZBpRuo2jjX")
                .clientKey("LMLilzqDaqmsrBxQQMbZLwTmF4fYljoWB4SusOGH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
