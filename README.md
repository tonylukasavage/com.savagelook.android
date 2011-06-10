# com.savagelook.android

A collection of Android helper classes and functions in Java.  

## Class List

* [JsonHelper.java](https://github.com/tonylukasavage/com.savagelook.android/blob/master/com/savagelook/android/JsonHelper.java) - A collection of JSON handling functions. Includes Retrieving JSON from a remote URL.
* [KeyValuePair.java](https://github.com/tonylukasavage/com.savagelook.android/blob/master/com/savagelook/android/KeyValuePair.java) - A generic key/value pait class. Useful for populating Android Spinners.
* [Lazy.java](https://github.com/tonylukasavage/com.savagelook.android/blob/master/com/savagelook/android/Lazy.java) - A collection of static classes for operations I don't have a better home for.  
* [ToastSingleton.java](https://github.com/tonylukasavage/com.savagelook.android/blob/master/com/savagelook/android/ToastSingleton.java) - I hate how Toasts in Android are shown sequentially. To prevent this I operate on a single instance of a Toast throughout my apps.
* [Toaster.java](https://github.com/tonylukasavage/com.savagelook.android/blob/master/com/savagelook/android/Toaster.java) - A class that utilizes ToastSingleton.java and delivers Toasts with convenient static functions.
* [UrlJsonAsyncTask.java](https://github.com/tonylukasavage/com.savagelook.android/blob/master/com/savagelook/android/UrlJsonAsyncTask.java) - This is a custom AsyncTask for a very common Android problem.  I __very__ often need to retrieve JSON from a remote URL, display a ProgressDialog while this occurs, operate on the data when it is returned, and then close the ProgressDialog.  With this class that work is reduced down to just a few lines of code.

## Docs

Coming soon...
