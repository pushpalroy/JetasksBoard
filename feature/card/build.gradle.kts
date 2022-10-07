import Lib.Android.ACCOMPANIST_SYSTEM_UI_CONTROLLER

plugins {
  id(BuildPlugins.ANDROID_LIBRARY_PLUGIN)
  id(BuildPlugins.KOTLIN_ANDROID_PLUGIN)
  id(BuildPlugins.KOTLIN_PARCELABLE_PLUGIN)
  id(BuildPlugins.KOTLIN_KAPT)
}

android {
  compileSdk = (ProjectProperties.COMPILE_SDK)

  defaultConfig {
    minSdk = (ProjectProperties.MIN_SDK)
    targetSdk = (ProjectProperties.TARGET_SDK)
    testInstrumentationRunner = "com.jetapps.card.CustomTestRunner"
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android.txt"), "proguard-common.txt",
        "proguard-specific.txt"
      )
    }
  }

  buildFeatures {
    dataBinding = true
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = Lib.Android.COMPOSE_COMPILER_VERSION
  }
  packagingOptions {
    resources.excludes.add("META-INF/LICENSE.txt")
    resources.excludes.add("META-INF/NOTICE.txt")
    resources.excludes.add("LICENSE.txt")
    resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }
}

// Required for annotation processing plugins like Dagger
kapt {
  generateStubs = true
  correctErrorTypes = true
}

dependencies {

  implementation(project(":core:domain"))
  
  implementation(project(":core:navigation"))
  implementation(project(":core:designsystem"))
  implementation(project(":core:common"))

  /* Android Designing and layout */
  implementation(Lib.Android.COMPOSE_LIVEDATA)
  implementation(Lib.Android.COMPOSE_NAVIGATION)
  implementation(Lib.Kotlin.KT_STD)
  implementation(Lib.Android.MATERIAL_DESIGN)
  implementation(Lib.Android.CONSTRAINT_LAYOUT_COMPOSE)
  implementation(Lib.Android.ACCOMPANIST_INSETS)
  implementation(Lib.Android.ACCOMPANIST_INSETS_UI)
  implementation(ACCOMPANIST_SYSTEM_UI_CONTROLLER)
  implementation(Lib.Android.ACCOMPANIST_FLOW_LAYOUTS)

  implementation(Lib.Android.APP_COMPAT)
  implementation(Lib.Kotlin.KTX_CORE)

  /* Image Loading */
  implementation(Lib.Android.COIL_COMPOSE)
  implementation(Lib.Android.ACCOMPANIST_COIL)

  /* DI */
  implementation(Lib.Di.hiltAndroid)
  implementation(Lib.Di.hiltNavigationCompose)
  implementation(Lib.Android.COMPOSE_TOOLING_PREVIEW)
  implementation("androidx.test:runner:1.4.0")
  debugImplementation(Lib.Android.COMPOSE_TOOLING)

  implementation(Lib.Android.PROFILE_INSTALLER)

  kapt(Lib.Di.hiltCompiler)
  kapt(Lib.Di.hiltAndroidCompiler)

  /* Logger */
  implementation(Lib.Logger.TIMBER)
  /* Async */
  implementation(Lib.Async.COROUTINES)
  implementation(Lib.Async.COROUTINES_ANDROID)

  /* Room */
  implementation(Lib.Room.roomRuntime)
  kapt(Lib.Room.roomCompiler)
  implementation(Lib.Room.roomKtx)
  implementation(Lib.Room.roomPaging)

  /* Testing */
  testImplementation(TestLib.JUNIT)
  testImplementation(TestLib.CORE_TEST)
  testImplementation(TestLib.ANDROID_JUNIT)
  testImplementation(TestLib.ARCH_CORE)
  testImplementation(TestLib.MOCK_WEB_SERVER)
  testImplementation(TestLib.ROBO_ELECTRIC)
  testImplementation(TestLib.COROUTINES)
  testImplementation(TestLib.MOCKK)
  androidTestImplementation(Lib.Android.COMPOSE_JUNIT)
  androidTestImplementation(Lib.Android.HILT_TESTING)
  debugImplementation(Lib.Android.COMPOSE_TEST_MANIFEST)


  kaptAndroidTest(Lib.Android.KAPT_HILT_TESTING)

  implementation(Lib.Android.CONSTRAINT_LAYOUT)
  implementation(Lib.Android.COMPOSE_CALENDAR)
  implementation(Lib.Android.COMPOSE_PLUCK)
  implementation(Lib.Android.COIL_COMPOSE)
  implementation(Lib.Android.ACCOMPANIST_COIL)
  implementation(Lib.Android.ACCOMPANIST_PERMISSION)
  implementation(Lib.Android.ACCOMPANIST_FLOW_LAYOUTS)
  implementation(Lib.Android.ACCOMPANIST_ADAPTIVE)
  implementation(Lib.Android.COMPOSE_WINDOW_MATRICES)
}