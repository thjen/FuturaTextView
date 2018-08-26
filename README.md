# FuturaTextView
<img src="https://raw.githubusercontent.com/thjen/FuturaTextView/master/app/src/main/res/drawable/Screenshot_20180826-140430.png"/></br>
</br>
A beautiful TextView

## Getting started
### Requirements 
- API > 19
### Installation
Add maven jitpack.io to **build.gradle** (Project):
```
	allprojects {  
		repositories {  
			google()  
			jcenter()  
			maven { url 'https://jitpack.io' }  
		}
	}
 ```

Add a dependency in your **build.gradle** file:
```
	dependencies {   
		implementation 'com.github.thjen:FuturaTextView:1.0'  
	}
```
### Usage
- Create a CustomApp class extends from **widget.qthjen.repo.CustomApp**:
```
	public class CustomApp extends widget.qthjen.repo.CustomApp {  
	}
```
- Add name to **manifests***:
```
	<application  
		...  
		android:name=".CustomApp">  
		<activity ...>  
			...
		</activity>  
	</application>
```
- Create a **FuturaTextView** in xml code:
```
	<widget.qthjen.repo.FuturaTextView  
		android:textSize="20sp"  
		android:layout_width="wrap_content"  
		android:layout_height="wrap_content"  
		android:text="Hellow world"  
		app:font_name="mediumBt"/>
```
- There are 14 types of **font_name**
### Licence
> FuturaTextView is released under **https://github.com/thjen**

