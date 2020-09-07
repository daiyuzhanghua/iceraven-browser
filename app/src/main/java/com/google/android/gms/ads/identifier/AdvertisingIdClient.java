package com.google.android.gms.ads.identifier;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;


public class AdvertisingIdClient {

    public static final class Info {

        private String mId;

        public Info() {
            mId = "";
        }

        public Info(String id, Boolean ignored) {
            // We need to preserve the passed ID to pass Mozilla's tests.
            mId = id;
        }

        public String getId() {
            return mId;
        }
        
        public String toString() {
            return mId;
        }

    }

    public static Info getAdvertisingIdInfo(Context context) throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        return new Info();
    }

}