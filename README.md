# MyToast
It's a Toast can be customed by yourself.And it have some buid-in Toasts for many situations.


###How to add：
--
  
####Use source code:
Copy the source code in "MyToast/mytoast/src/main/ to your program.

  
  
####Use gradle:  

Step 1.Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.ChenTianSaber:MyToast:v0.11'
	}
 
###How to use:  
####( Don't forget .show()! ! ! )
--
to  display a finish Toast:

		MyToast.finishToast(context,"FINISH!",Toast.LENGTH_SHORT).show();
		
to  display a error Toast:

		MyToast.errorToast(context,"ERROR!",Toast.LENGTH_SHORT).show();			
to  display a appreciate Toast:

		MyToast.appreciateToast(context,"APPRECIATE!",Toast.LENGTH_SHORT).show();
		
to  display a saved Toast:

		MyToast.savedToast(context,"SAVED!",Toast.LENGTH_SHORT).show();			
to  display a delete Toast:

		MyToast.deleteToast(context,"DELETE!",Toast.LENGTH_SHORT).show();		
to  display a normal Toast:

		MyToast.NormalToast(context,"Normal",Toast.LENGTH_SHORT).show();			
to  custom a Toast:

		MyToast.makeMyToast(context,String text,int image,int toastStyle,int duration)


###Screenshots:
--

<img src="http://wx1.sinaimg.cn/mw690/e21cb47egy1fd0httptzcj20mc0zajst.jpg" width="250">
<img src="http://wx1.sinaimg.cn/mw690/e21cb47egy1fd0hu02f85j20ma0zagn2.jpg" width="250">
<img src="http://wx1.sinaimg.cn/mw690/e21cb47egy1fd0hu4mqenj20me0z2gn1.jpg" width="250">
<img src="http://wx3.sinaimg.cn/mw690/e21cb47egy1fd0hua2evaj20mg0z275o.jpg" width="250">
<img src="http://wx1.sinaimg.cn/mw690/e21cb47egy1fd0hvp4cdxj20ma0z8gmx.jpg" width="250">
<img src="http://wx4.sinaimg.cn/mw690/e21cb47egy1fd0hvqxbb1j20m80z8myi.jpg" width="250">