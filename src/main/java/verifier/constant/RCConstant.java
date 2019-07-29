package verifier.constant;

public interface RCConstant {

    class Persistence {

        public static final int LENGTH_64 = 64;
        public static final int LENGTH_256 = 256;
        public static final int LENGTH_512 = 512;
        public static final int LENGTH_1024 = 1024;
    }

    class Config {

        public static final String TEMP_STOP_TOKEN_REFRESH = "temp_stop_token_refresh";
    }

    class AttributeKey {

        public static final String CLIENT_APP = "CLIENT_APP";
    }

    class Refresh {

        public static final long DEFAULT_REFRESH_SECONDS_BEFORE = 2592000L;
        public static final String REFRESH_TOKEN_EXPIRED = "Refresh token has expired";
        public static final String INVALID_REFRESH_TOKEN = "Invalid refresh token";
        public static final String GOOGLE_REFRESH_TOKEN_CONTENT_TYPE = "application/x-www-form-urlencoded";
    }

    class Env {

        public static final String PROD_ENV = "prod";
        public static final String DEV_ENV = "dev";
    }

    class Url {

        public static final String BOX_AUTH_URL = "https://account.box.com/api/oauth2/authorize";

        public static final String PLATFORM_AUTH_URL = "/restapi/oauth/authorize";
        public static final String PLATFORM_TOKEN_URL = "/restapi/oauth/token";

        public static final String GOOGLE_AUTH_URL = "https://accounts.google.com/o/oauth2/auth";
        public static final String GOOGLE_TOKEN_URL = "https://www.googleapis.com/oauth2/v4/token";

        public static final String DROPBOX_AUTH_URL = "https://www.dropbox.com/oauth2/authorize";
        public static final String DROPBOX_TOKEN_URL = "https://www.dropbox.com/oauth2/token";
    }
}
