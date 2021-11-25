package it.pradita.ac.imdbratingmovieapps.utils;

import it.pradita.ac.imdbratingmovieapps.api.ApiClient;
import it.pradita.ac.imdbratingmovieapps.api.NetworkInterface;

public class Utils {

    public static NetworkInterface getApi() {
        return ApiClient.getRetroClient().create(NetworkInterface.class);
    }

}
