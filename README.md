# ViewPagerRefreshOnPageChange
 refresh  page setip tap dipilih

- [**ViewPager**](https://github.com/gzeinnumer/ViewPagerSimple)
read this before execute `addOnPageChangeListener`

- Listener `addOnPageChangeListener`
```java
public class MainActivity extends AppCompatActivity {

    ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ...

        viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                if (viewPagerAdapter != null) {
                    ViewPagerAdapter.Updateable fragment = (ViewPagerAdapter.Updateable)viewPagerAdapter.getItem(position);
                    if (fragment != null) {
                        fragment.update();
                    }
                }
            }
        });
    }
}
```

---

```
Copyright 2020 M. Fadli Zein
```