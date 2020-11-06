# ViewPagerRefreshOnPageChange
 refresh  page setip tap dipilih

- [**ViewPager**](https://github.com/gzeinnumer/ViewPagerSimple)
read this before execute `viewPager.addOnPageChangeListener`

- Listener `viewPager.addOnPageChangeListener`
#### MainActivity.java [FullCode](https://github.com/gzeinnumer/ViewPagerSimple#mainactivityjava)
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

#### ViewPagerAdapter.java [FullCode](https://github.com/gzeinnumer/ViewPagerSimple#viewpageradapterjava)
```java
public class ViewPagerAdapter extends FragmentPagerAdapter {

    ...

    //add this
    public interface Updateable {
        void update();
    }
}
```

#### FirstFragment [FullCode](https://github.com/gzeinnumer/ViewPagerSimple#firstfragmentjava)
```java
//add implements
public class FirstFragment extends Fragment implements ViewPagerAdapter.Updateable {

    //add this
    @Override
    public void update() {
        Toast.makeText(requireContext(), "Update Here 1", Toast.LENGTH_SHORT).show();
    }

    ...

}
```

#### SecondFragment [FullCode](https://github.com/gzeinnumer/ViewPagerSimple#secondfragmentjava)
```java
//add implements
public class SecondFragment extends Fragment implements ViewPagerAdapter.Updateable {

    //add this
    @Override
    public void update() {
        Toast.makeText(requireContext(), "Update Here 2", Toast.LENGTH_SHORT).show();
    }

    ...

}
```

---

```
Copyright 2020 M. Fadli Zein
```