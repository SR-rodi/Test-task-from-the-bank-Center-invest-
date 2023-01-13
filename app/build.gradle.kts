plugins {
    id(Plugins.application)
    id(Plugins.android)
    id(Plugins.safeargs)
    id(Plugins.serialization)
    id(Plugins.kapt)
}

android {
    namespace = Config.namespace
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(Config.proguardFile), Config.proguardRules)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Dependency.SplashScreenApp.splashScreen)
    implementation(Dependency.Data.serialization)
    implementation(Dependency.Data.swipeToRefresh)
    implementation(Dependency.Data.paging)
    implementation(Dependency.Navigation.fragment)
    implementation(Dependency.Navigation.ui)
    implementation(Dependency.LoadImage.lib)
    implementation(Dependency.Network.retrofit)
    implementation(Dependency.Network.converter)
    implementation(Dependency.Network.gson)
    implementation(Dependency.Base.livedata)
    implementation(Dependency.Base.viewModel)
    implementation(Dependency.Base.core)
    implementation(Dependency.Base.appcompat)
    implementation(Dependency.Base.material)
    implementation(Dependency.DI.dagger)
    kapt(Dependency.DI.kapt)
}