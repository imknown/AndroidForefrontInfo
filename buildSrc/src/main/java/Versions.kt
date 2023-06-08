object Versions {
    object AndroidBuild {
        const val androidGradlePlugin = "8.2.0-alpha07"

        // https://developer.android.com/studio/releases/build-tools.html#notes
        const val buildTools = "34.0.0"

        const val minSdk = 21
        const val compileSdk = 34
        const val compileSdkExtension = 0
        const val compileSdkPreview = "VanillaIceCream"
        const val targetSdk = 34
        const val targetSdkPreview = "VanillaIceCream"

        const val ndk = "25.2.9519653"
        const val cmake = "3.22.1"

        const val versionCode = 62
        const val versionName = "1.17.0_unpublished"
    }

    // https://developer.android.com/studio/write/java8-support#library-desugaring
    // https://maven.google.com/web/index.html?q=desugar_jdk_libs
    // https://github.com/google/desugar_jdk_libs/blob/master/CHANGELOG.md
    const val desugarJdkLibs = "2.0.3"

    // https://github.com/material-components/material-components-android/releases
    const val material = "1.9.0"

    // region [AndroidX]
    // https://maven.google.com
    object AndroidX {
        // https://developer.android.com/jetpack/androidx/releases/activity
        const val activity = "1.8.0-alpha05"

        // https://developer.android.com/jetpack/androidx/releases/annotation
        const val annotation = "1.7.0-alpha02"
        const val annotationExperimental = "1.4.0-dev01"

        // https://developer.android.com/jetpack/androidx/releases/appcompat
        const val appcompat = "1.7.0-alpha02"

        // https://developer.android.com/jetpack/androidx/releases/arch-core
        const val archCore = "2.2.0"

        // https://developer.android.com/jetpack/androidx/releases/cardview
        const val cardView = "1.0.0"

        // https://developer.android.com/jetpack/androidx/releases/constraintlayout
        const val constraintLayout = "2.2.0-alpha10"

        // https://developer.android.com/jetpack/androidx/releases/coordinatorlayout
        const val coordinatorLayout = "1.2.0"

        // https://developer.android.com/jetpack/androidx/releases/core
        const val core = "1.12.0-alpha05"

        // https://developer.android.com/jetpack/androidx/releases/fragment
        const val fragment = "1.7.0-alpha01"

        // https://developer.android.com/jetpack/androidx/releases/lifecycle
        const val lifecycle = "2.6.1"

        // https://developer.android.com/jetpack/androidx/releases/preference
        const val preference = "1.2.0"

        // https://developer.android.com/jetpack/androidx/releases/recyclerview
        const val recyclerView = "1.3.1-rc01"

        // https://developer.android.com/jetpack/androidx/releases/savedstate
        const val savedState = "1.2.1"

        // https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout
        const val swipeRefreshLayout = "1.2.0-alpha01"

        // https://developer.android.com/jetpack/androidx/releases/webkit
        const val webkit = "1.8.0-alpha01"

        // https://developer.android.com/jetpack/androidx/releases/test
        object Test {
            const val core = "1.5.0"
            const val espressoCore = "3.5.1"
            const val extJunit = "1.1.5"
        }
    }

    object Kotlin {
        // https://github.com/JetBrains/kotlin/releases
        // https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.jetbrains.kotlin%22
        const val kotlin = "1.8.22"

        // https://github.com/Kotlin/kotlinx.coroutines/releases
        const val coroutines = "1.7.1"

        // https://github.com/Kotlin/kotlinx.serialization/releases
        const val serialization = "1.5.1"
    }

    // https://developers.google.com/android/guides/releases
    // https://firebase.google.com/support/release-notes/android
    // https://firebase.google.com/docs/android/setup#available-libraries
    object Firebase {
        const val googleServices = "4.3.15"

        // https://firebase.google.com/docs/android/learn-more#bom
        const val billOfMaterials = "32.1.0"

        // https://firebase.google.com/docs/crashlytics/get-started?platform=android
        // https://firebase.google.com/docs/crashlytics/ndk-reports
        const val firebaseCrashlyticsGradlePlugin = "2.9.5"
    }

    object ThirdParties {
        // https://github.com/topjohnwu/libsu/releases
        const val libsu = "5.1.0"

        // https://github.com/square/leakcanary/releases
        const val leakCanary = "2.11"

        // https://github.com/kittinunf/fuel/releases
        const val fuel = "2.3.1"

        // https://github.com/G00fY2/version-compare/releases
        const val versionCompare = "1.5.0"

        // https://github.com/RikkaApps/Shizuku-API#add-dependency
        // https://search.maven.org/search?q=dev.rikka
        const val shizuku = "13.1.2"
    }
}