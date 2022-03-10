package com.example.instagramcodepath;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("dORp5o1S8jNWQ1W81YcXF5a0hDbIMoj2SDoc80L2")
                .clientKey("Xg8p7i7emzsuAPav0JAHFMBAYIgME0zjaapCQ4lp")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
