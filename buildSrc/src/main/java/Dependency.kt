object Dependency {

    private const val navigationVersion = "2.5.3"
    private const val splashScreenVersion = "1.0.0"
    private const val daggerVersion = "2.44"
    private const val retrofitVersion = "2.9.0"
    private const val gsonVersion = "2.10"
    private const val serializationVersion = "1.3.3"
    private const val pagingVersion = "3.1.1"
    private const val refreshVersion = "1.1.0"
    private const val coilVersion = "2.2.2"
    private const val viewModelVersion = "2.5.1"
    private const val coreVersion = "1.9.0"
    private const val appcompatVersion = "1.6.0"
    private const val materialVersion = "1.7.0"


    object SplashScreenApp {
        const val splashScreen = "androidx.core:core-splashscreen:$splashScreenVersion"
    }

    object DI {
        const val kapt = "com.google.dagger:dagger-compiler:$daggerVersion"
        const val dagger = "com.google.dagger:dagger:$daggerVersion"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val converter = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
        const val gson = "com.google.code.gson:gson:$gsonVersion"
    }

    object Data {
        const val serialization =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"
        const val swipeToRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:$refreshVersion"
        const val paging = "androidx.paging:paging-runtime:$pagingVersion"

    }

    object Navigation {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
        const val ui = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
    }

    object LoadImage {
        const val lib = "io.coil-kt:coil:$coilVersion"
    }

    object Base {
        const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$viewModelVersion"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$viewModelVersion"
        const val core = "androidx.core:core-ktx:$coreVersion"
        const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
        const val material = "com.google.android.material:material:$materialVersion"
    }

    object Classpath {
        private const val serializationVersion = "1.8.0"

        const val navigation =
            "androidx.navigation:navigation-safe-args-gradle-plugin:$navigationVersion"
        const val serialization = "org.jetbrains.kotlin:kotlin-serialization:$serializationVersion"
    }

}

