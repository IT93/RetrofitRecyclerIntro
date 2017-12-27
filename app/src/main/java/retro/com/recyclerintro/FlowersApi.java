package retro.com.recyclerintro;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by WeltesDev on 12/27/2017.
 */

public interface FlowersApi {

    @GET("/feeds/flowers.json")
    void getFlowers(Callback<String> flowers);
}
