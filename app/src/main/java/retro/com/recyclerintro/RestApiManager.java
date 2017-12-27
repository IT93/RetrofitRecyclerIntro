package retro.com.recyclerintro;

import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by WeltesDev on 12/27/2017.
 */

public class RestApiManager {

    private FlowersApi mFlowerApi;

    public FlowersApi getFlowerApi() {

        if(mFlowerApi == null) {
            GsonBuilder gson = new GsonBuilder();
            gson.registerTypeAdapter(String.class, new StringDesirializer());

            mFlowerApi = new RestAdapter.Builder()
                    .setEndpoint(Constants.BASE_URL)
                    .setConverter(new GsonConverter(gson.create()))
                    .build()
                    .create(FlowersApi.class);
        }
        return mFlowerApi;
    }

}
