# AndroidJetpackNavigation
Using Android Jetpack Navigation

## Navigation Design of my sample 
![Alt text](/screenShots/1556790999140.jpg)


## Setup

1. Add the dependencies and plugin in app/build.gradle 

`ext {
    navigation_version = "1.0.0"
}`

`implementation "android.arch.navigation:navigation-runtime:$navigation_version"` <br />
`implementation "android.arch.navigation:navigation-runtime-ktx:$navigation_version"`<br />
`implementation "android.arch.navigation:navigation-fragment:$navigation_version"`<br />
`implementation "android.arch.navigation:navigation-fragment-ktx:$navigation_version"`<br />

`apply plugin: 'androidx.navigation.safeargs'`<br />

2. Add the plugin in project level build.gradle

`classpath 'android.arch.navigation:navigation-safe-args-gradle-plugin:1.0.0'`

## Introduction
https://medium.com/@giles112000/android-jetpack-navigation-simple-use-cfac80b3e9c6

## Reference

https://github.com/googlesamples/android-architecture-components/tree/master/NavigationBasicSample
