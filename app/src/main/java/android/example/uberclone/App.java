package android.example.uberclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9hFWr6FRVRxryJpZgglrVPAlRR9f3tJA3gC23kTi")
                // if defined
                .clientKey("LXSEWuXNYMGOU9HdYtuNPdxjlA8YLLDjUVqIS2Ow")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
