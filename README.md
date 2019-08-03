# NyTimeArticleApp with Android MVVM Base Architecture for Enterprise Mobile Application using Architectural Components

# Highlights

1. MVVM Architectural pattern
2. Offline Support
3. Unit test demonstration using JUnit and Mockito
4. UI unit test demonstartion using Espresso
5. Jacococ is used for code coverage, test coverage, etc.

The application has been built with **offline support**. It has been designed using **Android Architecture components** with **Room** for offline data caching. The application is built in such a way that whenvever there is a service call, the result will be stored in local database.

The whole application is built based on the MVVM architectural pattern.

# Application Architecture
![alt text](https://cdn-images-1.medium.com/max/1600/1*OqeNRtyjgWZzeUifrQT-NA.png)

# Why MVVM Architecture?

During Google I/O, Google introduced architecture components which includes LiveData and ViewModel which facilitates developing Android app using MVVM pattern. MVVM is one of the architectural patterns which enhances separation of concerns, it allows separating the user interface logic from the business (or the back-end) logic. Its target (with other MVC patterns goal) is to achieve the following principle “Keeping UI code simple and free of app logic in order to make it easier to manage”.

The main advatage of using MVVM, there is no two way dependency between ViewModel and Model unlike MVP. Here the view can observe the datachanges in the viewmodel as we are using LiveData which is lifecycle aware. The viewmodel to view communication is achieved through observer pattern (basically observing the state changes of the data in the viewmodel).

# Offline Support

Recently, Google has announced the stable version of the architecture components, which arguably were quite stable before getting to 1.0.0. This library contains 4 parts: ViewModel, LiveData, Room, and the Paging Library. This parts work great together because as one may assume — they are designed to do so. The architecture components could drastically influence and change the traditional way of developing Android apps, so they are potential game changer. Room is a library that simplifies the database manipulation by using annotation processing.

The concept behind adding offline support is to load the data that exists in the database, and make a network call that will update the value in the database. It means that the LiveData that is going to be observed by the observers is being provided by the database. Then, the update of the database is going to be propagated to the observers of the LiveData provided earlier.


# Screenshots
<img src="/screenshots/screenshot_mainpage.png" width="346" height="615" alt="Home"/>
<img src="/screenshots/screenshot_details.png" width="346" height="615" alt="Home"/>
<img src="/screenshots/screenshot_search.png" width="346" height="615" alt="Home"/>

# Programming Practices Followed
a) Android Architectural Components <br/>
b) Dagger 2 for Dependency Injection <br/>
c) MVVM <br/>
d) Retrofit with Okhttp <br/>
e) Room for data caching <br/>
f) JUnit and Mockito for Unit testing <br/>
d) Repository pattern <br/>
e) JSoup for HTML Parsing

# How to build ?

Open terminal and type the below command to generate debug build <br/>

``` ./gradlew assembleDebug ```

Open terminal and type the below command to generate release build <br/>

``` ./gradlew assembleRelease ```

<br/>

# How to generate code coverage report ?

** Mac and Linux **

Open terminal and type the following command

```./gradlew clean jacocoTestReport```


** Windows **

```.\gradlew clean jacocoTestReport```


make sure java_home path is add to system path and working


The coverage report will be generated on the following path.

``` app/build/reports ```


# Screenshots
<img src="/screenshots/screenshot_unit_test_report.png" width="700" height="600" alt="Home"/>
<img src="/screenshots/screenshot_instumental_testing.png" width="700" height="600" alt="Home"/>
