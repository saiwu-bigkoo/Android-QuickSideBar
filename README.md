Android-QuickSideBar
==========
帮助快速查阅对应分组的侧边栏，可以配合任意列表，demo中给出配合RecyclerView(浮动分组使用stickyheadersrecyclerview)。

####使用gradle 依赖:
```java
   compile 'com.bigkoo:quicksidebar:1.0.0'
```

## Demo 图片
![](https://github.com/saiwu-bigkoo/Android-QuickSideBar/blob/master/preview/quicksidebardemo.gif)

##### Config in xml

```xml
<!-- 这个是浮动的提示 ，配合字母栏实现放大浮动提示滑动到哪个字母-->
<com.bigkoo.quicksidebar.QuickSideBarTipsView
        android:id="@+id/quickSideBarTipsView"
        app:textColor="@android:color/white"
        app:backgroundColor="@color/colorPrimary"
        android:layout_toLeftOf="@+id/quickSideBarView"
        android:layout_width="@dimen/height_quicksidebartips"
        android:layout_height="match_parent"/>
<!-- 这个是字母栏的提示 -->
    <com.bigkoo.quicksidebar.QuickSideBarView
        android:id="@id/quickSideBarView"
        app:textColorChoose="@color/colorPrimary"
        app:textColor="@android:color/black"
        android:layout_alignParentRight="true"
        android:layout_width="20dp"
        android:layout_height="match_parent"/>
```

##### config in java code

```java
//联动请看
OnQuickSideBarTouchListener
```
