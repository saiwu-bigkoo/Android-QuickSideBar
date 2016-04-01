Android-QuickSideBar
==========
帮助快速查阅对应分组的侧边栏，可以配合任意列表，demo中给出配合RecyclerView(浮动分组使用stickyheadersrecyclerview)。

####使用gradle 依赖:
```java
   compile 'com.bigkoo:quicksidebar:1.0.1'
```

## Demo 图片
![](https://github.com/saiwu-bigkoo/Android-QuickSideBar/blob/master/preview/quicksidebardemo.gif)

##### Config in xml

```xml
<!-- 这个是浮动的提示 ，配合字母栏实现放大浮动提示滑动到哪个字母-->
   <com.bigkoo.quicksidebar.QuickSideBarTipsView
        android:id="@+id/quickSideBarTipsView"
        app:sidebarTextColor="@android:color/white"
        app:sidebarBackgroundColor="@color/colorPrimary"
        android:layout_toLeftOf="@+id/quickSideBarView"
        android:layout_width="@dimen/height_quicksidebartips"
        android:layout_height="match_parent"/>
<!-- 这个是字母栏的提示 -->
    <com.bigkoo.quicksidebar.QuickSideBarView
        android:id="@id/quickSideBarView"
        app:sidebarTextColorChoose="@color/colorPrimary"
        app:sidebarTextColor="@android:color/black"
        android:layout_alignParentRight="true"
        android:layout_width="20dp"
        android:layout_height="match_parent"/>
```

##### config in java code

```java
//联动请看
OnQuickSideBarTouchListener
```
>## 更新说明
>v1.0.1 解决属性和其他开源库冲突问题  <br />

