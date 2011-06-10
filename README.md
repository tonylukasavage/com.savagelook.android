# com.savagelook.android

A collection of Android helper classes and functions in Java.  

## Class List

* [JsonHelper.java](https://github.com/tonylukasavage/com.savagelook.android/blob/master/com/savagelook/android/JsonHelper.java) - A collection of JSON handling functions. Includes Retrieving JSON from a remote URL.
* __KeyValuePair.java__ - A generic key/value pait class. Useful for populating Android Spinners.
* __Lazy.java__ - A collection of static classes for operations I don't have a better home for.  
* __ToastSingleton.java__ - I hate how Toasts in Android are shown sequentially. To prevent this I operate on a single instance of a Toast throughout my apps.
* __Toaster.java__ - A class that utilizes ToastSingleton.java and delivers Toasts with convenient static functions.
* __UrlJsonAsyncTask.java__ - This is a custom AsyncTask for a very common Android problem.  I __very__ often need to retrieve JSON from a remote URL, display a ProgressDialog while this occurs, operate on the data when it is returned, and then close the ProgressDialog.  With this class that work is reduced down to just a few lines of code.

## Docs

Coming soon...
