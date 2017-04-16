Android-QuickSideBar
==========
帮助快速查阅对应分组的侧边栏，可以配合任意列表，demo中给出配合RecyclerView(浮动分组使用stickyheadersrecyclerview)。

#### 使用gradle 依赖:
```java
   compile 'com.bigkoo:quicksidebar:1.0.3'
```

## Demo 图片
![](https://github.com/saiwu-bigkoo/Android-QuickSideBar/blob/master/preview/quicksidebardemo.gif)

##### Config in xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.v7.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
    <!-- 这个是浮动的提示 ，配合字母栏实现放大浮动提示滑动到哪个字母-->
    <!--下面的自定义属性都是默认的,可以不写-->
    <!--app:sidebarBackgroundColor 浮动框颜色-->
    <!--app:sidebarTextColor 字母颜色-->
    <!--app:sidebarTextSize 字母尺寸-->
    <com.bigkoo.quicksidebar.QuickSideBarTipsView
        android:id="@+id/quickSideBarTipsView"
        android:layout_width="@dimen/height_quicksidebartips"
        android:layout_height="match_parent"
        android:layout_toLeftOf="@+id/quickSideBarView"
        app:sidebarBackgroundColor="@color/colorPrimary"
        app:sidebarTextColor="@android:color/white"
        app:sidebarTextSize="@dimen/textSize_quicksidebartips" />
    <!-- 这个是字母栏的提示 -->
    <!--下面的自定义属性都是默认的,可以不写-->
    <!--app:sidebarItemHeight 每个字母的高度-->
    <!--app:sidebarTextColor 正常状态下字母颜色-->
    <!--app:sidebarTextColorChoose 选中了的字母颜色-->
    <!--app:sidebarTextSize 正常状态字母尺寸-->
    <!--app:sidebarTextSizeChoose 选中字母尺寸-->
    <com.bigkoo.quicksidebar.QuickSideBarView
        android:id="@id/quickSideBarView"
        android:layout_width="20dp"
        android:layout_height="match_parent"
        android:layout_alignParentRight="true"
        android:layout_marginTop="45dp"
        app:sidebarItemHeight="@dimen/height_quicksidebaritem"
        app:sidebarTextColor="@android:color/black"
        app:sidebarTextColorChoose="@color/colorPrimary"
        app:sidebarTextSize="@dimen/textSize_quicksidebar"
        app:sidebarTextSizeChoose="@dimen/textSize_quicksidebar_choose" />
</RelativeLayout>
```

##### config in java code

```java
//联动请看
OnQuickSideBarTouchListener
```
>## 更新说明
>v1.0.3
 - 宽高计算使用Measured <br />
 - 修复默认的字母表写错字母问题 <br />

>v1.0.2
 - 修复选择字母与实际手指触碰错位问题 <br />
 - 字母表由item平均高度变为固定高度并居中  <br />

>v1.0.1 
 - 解决属性和其他开源库冲突问题  <br />

