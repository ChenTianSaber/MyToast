# MyToast
It's a Toast can be customed by yourself.And it have five Toasts for five situations.

####CASE：
![](http://wx1.sinaimg.cn/mw690/e21cb47ely1fczc7qnt8xg20bm0ix796.gif)

####How to add：
  
#####Use source code:
Copy the source code in "MyToast/mytoast/src/main/ to your program.
  
  
#####Use gradle:  

Step 1.Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.ChenTianSaber:MyToast:v0.1'
	}
 
####How to use:
![](http://wx3.sinaimg.cn/mw690/e21cb47egy1fczfnttsxij20u40800uo.jpg)
  
There are six methods.  

You can use makeMyToast(Context context,String text,int image,int toastStyle) to custom your Toast.  

Like that : MyToast.makeMyToast(this,"Hello World",R.mipmap.ic_launcher,0).show();

The others are build-in methods that you can make a nice Toast easily and quickly.
