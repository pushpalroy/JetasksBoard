import Lib.Networking

/** This file contains versions of all the dependencies used in the module  */

object BuildPlugins {
  private const val TOOLS_BUILD = "7.2.1"
  private const val KT_LINT = "9.2.1"
  private const val SAFE_ARGS = "2.3.5"

  const val TOOLS_BUILD_GRADLE = "com.android.tools.build:gradle:${TOOLS_BUILD}"
  const val KTLINT_GRADLE_PLUGIN = "org.jlleitschuh.gradle:ktlint-gradle:${KT_LINT}"
  const val DAGGER_HILT_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:${Lib.Di.DAGGER_VERSION}"
  const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Lib.Kotlin.KOTLIN_VERSION}"
  const val ANDROID_APPLICATION_PLUGIN = "com.android.application"
  const val ANDROID_LIBRARY_PLUGIN = "com.android.library"
  const val KOTLIN_ANDROID_PLUGIN = "kotlin-android"
  const val KOTLIN_PARCELABLE_PLUGIN = "kotlin-parcelize"
  const val KOTLIN_KAPT = "kotlin-kapt"
  const val KTLINT = "org.jlleitschuh.gradle.ktlint"
  const val DAGGER_HILT = "dagger.hilt.android.plugin"
  const val SAFE_ARGS_KOTLIN = "androidx.navigation.safeargs.kotlin"
}

object Lib {
  object Kotlin {
    const val KOTLIN_VERSION = "1.7.0"
    private const val KTX_CORE_VERSION = "1.7.0"
    const val KT_STD = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${KOTLIN_VERSION}"
    const val KTX_CORE = "androidx.core:core-ktx:${KTX_CORE_VERSION}"
  }

  object Android {
    private const val COMPOSE_VERSION = "1.2.0"
    const val COMPOSE_COMPILER_VERSION = COMPOSE_VERSION
    private const val COMPOSE_ACTIVITY_VERSION = "1.5.1"
    private const val COMPOSE_CONSTRAINT_LAYOUT_VERSION = "1.0.0"
    private const val COMPOSE_NAVIGATION_VERSION = "2.5.0-alpha01"
    private const val COMPOSE_COIL_VERSION = "2.1.0"
    private const val ACCOMPANIST_VERSION = "0.24.13-rc"
    private const val ACCOMPANIST_FLOW_LAYOUT_VERSION = "0.24.13-rc"
    private const val WINDOW_METRICES_VERSION = "1.0.0"
    private const val ACTIVITY_VERSION = "1.6.0"
    private const val ACCOMPANIST_ADAPTIVE_VERSION = "0.26.4-beta"

    const val APP_COMPAT = "androidx.appcompat:appcompat:1.4.1"

    // Compose
    const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${COMPOSE_ACTIVITY_VERSION}"
    const val CONSTRAINT_LAYOUT_COMPOSE = "androidx.constraintlayout:constraintlayout-compose:${COMPOSE_CONSTRAINT_LAYOUT_VERSION}"
    const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${COMPOSE_VERSION}"
    const val COMPOSE_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${COMPOSE_VERSION}"
    const val COMPOSE_UI_UTIL = "androidx.compose.ui:ui-util:${COMPOSE_VERSION}"
    const val ACCOMPANIST_SYSTEM_UI_CONTROLLER = "com.google.accompanist:accompanist-systemuicontroller:${ACCOMPANIST_VERSION}"
    const val ACCOMPANIST_FLOW_LAYOUTS = "com.google.accompanist:accompanist-flowlayout:${ACCOMPANIST_VERSION}"
    const val COIL_COMPOSE = "io.coil-kt:coil-compose:${COMPOSE_COIL_VERSION}"
    const val COMPOSE_LIVEDATA = "androidx.compose.runtime:runtime-livedata:${COMPOSE_VERSION}"
    const val COMPOSE_NAVIGATION = "androidx.navigation:navigation-compose:${COMPOSE_NAVIGATION_VERSION}"
    const val MATERIAL_DESIGN = "androidx.compose.material:material:${COMPOSE_VERSION}"
    const val ACCOMPANIST_INSETS = "com.google.accompanist:accompanist-insets:${ACCOMPANIST_VERSION}"
    const val ACCOMPANIST_INSETS_UI = "com.google.accompanist:accompanist-insets-ui:${ACCOMPANIST_VERSION}"
    const val ACCOMPANIST_COIL = "com.google.accompanist:accompanist-coil:0.14.0"
    const val ACCOMPANIST_PERMISSION = "com.google.accompanist:accompanist-permissions:${ACCOMPANIST_VERSION}"
    const val ACCOMPANIST_ADAPTIVE = "com.google.accompanist:accompanist-adaptive:$ACCOMPANIST_ADAPTIVE_VERSION"
    const val COMPOSE_JUNIT = "androidx.compose.ui:ui-test-junit4:$COMPOSE_VERSION"
    const val HILT_TESTING = "com.google.dagger:hilt-android-testing:2.44"
    const val KAPT_HILT_TESTING = "com.google.dagger:hilt-android-compiler:2.44"
    const val COMPOSE_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest:$COMPOSE_VERSION"
    const val COMPOSE_WINDOW_MATRICES = "androidx.window:window:$WINDOW_METRICES_VERSION"
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:$ACTIVITY_VERSION"


    const val PROFILE_INSTALLER = "androidx.profileinstaller:profileinstaller:1.2.0"

    // Constraint layout
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout-compose:1.0.1"
    const val COMPOSE_CALENDAR =  "io.github.vanpra.compose-material-dialogs:datetime:0.8.1-rc"
    const val COMPOSE_PLUCK = "com.himanshoe:pluck:1.0.0-RC2"

    const val DESIGN_SYSTEMS = ":core:designsystem"
  }

  object Di {
    const val DAGGER_VERSION = "2.43"
    const val hiltAndroid = "com.google.dagger:hilt-android:${DAGGER_VERSION}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${DAGGER_VERSION}"

    const val hiltCompiler = "androidx.hilt:hilt-compiler:1.0.0"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"
    const val hiltCore = "com.google.dagger:hilt-core:$DAGGER_VERSION"
  }

  object Room {
    private const val roomVersion = "2.4.1"
    const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
    const val roomCompiler = "androidx.room:room-compiler:$roomVersion"

    // optional - Kotlin Extensions and Coroutines support for Room
    const val roomKtx = "androidx.room:room-ktx:$roomVersion"

    // optional - Paging 3 Integration
    const val roomPaging = "androidx.room:room-paging:2.4.1"
  }

  object Async {
    private const val COROUTINES_VERSION = "1.6.4"

    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${COROUTINES_VERSION}"
    const val COROUTINES_ANDROID =
      "org.jetbrains.kotlinx:kotlinx-coroutines-android:${COROUTINES_VERSION}"
  }

  object Networking {
    private const val RETROFIT_VERSION = "2.9.0"
    const val OKHTTP_VERSION = "4.7.2"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${RETROFIT_VERSION}"
    const val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${RETROFIT_VERSION}"
    const val LOGGING = "com.squareup.okhttp3:logging-interceptor:${OKHTTP_VERSION}"
  }

  object Serialization {
    private const val GSON_VERSION = "2.8.8"
    const val GSON = "com.google.code.gson:gson:${GSON_VERSION}"
  }

  object Logger {
    private const val TIMBER_VERSION = "5.0.1"
    const val TIMBER = "com.jakewharton.timber:timber:${TIMBER_VERSION}"
  }
}

object TestLib {
  private const val COROUTINES_VERSION = "1.3.7"
  private const val ANDROID_JUNIT_VERSION = "1.0.0"
  private const val ROBO_ELECTRIC_VERSION = "4.3"
  private const val ARCH_CORE_VERSION = "2.1.0"
  private const val CORE_TEST_VERSION = "1.2.0"
  private const val JUNIT_VERSION = "4.13"
  private const val nav_version = "2.3.5"

  const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${COROUTINES_VERSION}"
  const val ROBO_ELECTRIC = "org.robolectric:robolectric:${ROBO_ELECTRIC_VERSION}"
  const val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:${Networking.OKHTTP_VERSION}"
  const val CORE_TEST = "androidx.test:core-ktx:${CORE_TEST_VERSION}"
  const val JUNIT = "junit:junit:${JUNIT_VERSION}"
  const val ANDROID_JUNIT = "androidx.test.ext:junit:${ANDROID_JUNIT_VERSION}"
  const val ARCH_CORE = "androidx.arch.core:core-testing:${ARCH_CORE_VERSION}"
  const val MOCKK = "io.mockk:mockk:1.10.5"
}
