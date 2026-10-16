plugins { id("com.android.application") version "8.7.3" }

android {
    namespace = "es.pantanero.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "es.pantanero.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
