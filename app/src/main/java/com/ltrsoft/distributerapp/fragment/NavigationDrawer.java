package com.ltrsoft.distributerapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.ltrsoft.distributerapp.R;

public class NavigationDrawer extends Fragment {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    private ImageView notification;
    FrameLayout notificationSection;

    public NavigationDrawer() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.navigation_drawer_fragment, container, false);
        toolbar = view.findViewById(R.id.toolbar);
        drawerLayout = view.findViewById(R.id.drawer_layout);
        notification = view.findViewById(R.id.notification);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event here
                Notification_Fragment notificationFragment = new Notification_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main,notificationFragment).addToBackStack(null).commit();
            }
        });


        // Set the initial fragment
        Home_Fragment homeFragment = new Home_Fragment();
        toolbar.setTitle("Dashboard");

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, homeFragment).commit();

        // Setup Toolbar

        AppCompatActivity activity = (AppCompatActivity) getActivity();
        assert activity != null;
        activity.setSupportActionBar(toolbar);

        // Setup Drawer Layout and Toggle
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                getActivity(), drawerLayout, toolbar,
                R.string.navigation_drawer_open,  // String resources for accessibility
                R.string.navigation_drawer_close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();  // Synchronize the state of the drawer indicator/affordance with the linked DrawerLayout.
        // Synchronize the state of the drawer indicator/affordance with the linked DrawerLayout.
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));



        BottomNavigationView bottomNavigationView =view.findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.nav_home) {

                    BottomNav(homeFragment, "Dashboard");

                }else if (item.getItemId() == R.id.nav_add) {

                    Add_Customer_Fragment addCustomerFragment = new Add_Customer_Fragment();
                    BottomNav(addCustomerFragment, "Add Customer");
                } else if (item.getItemId() == R.id.nav_report) {

                    Report_Fragment reportFragment = new Report_Fragment();
                    BottomNav(reportFragment, "");

                } else if (item.getItemId() == R.id.nav_service) {

                    AddService_Fragment serviceFragment = new AddService_Fragment();
                    BottomNav(serviceFragment, "Add Service");

                }
                return true;
            }
        });

        navigationView = view.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_profile) {

                    Profile_Fragment profileFragment = new Profile_Fragment();
                    Sidenav(profileFragment,"Profile");


                } else if (id == R.id.nav_settings) {

                    Settings_Fragment settingsFragment = new Settings_Fragment();
                    Sidenav(settingsFragment,"Settings");

                } else if (id == R.id.nav_history)  {

                    History_Fragment historyFragment = new History_Fragment();
                    Sidenav(historyFragment,"History");

                } else if (id == R.id.nav_order) {

                    ProductOrder_Fragment productOrderFragment = new ProductOrder_Fragment();
                    Sidenav(productOrderFragment,"Order Product");

                }else if (id == R.id.nav_logout) {
                    Logout();
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }


        });



        return view;
    }

    private void Logout() {
        Toast.makeText(getActivity(), "LOGOUT", Toast.LENGTH_SHORT).show();
    }

    private void BottomNav(Fragment fragment,String title) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment).commit();

        toolbar.setTitle(title);
    }

    private void Sidenav(Fragment fragment,String title) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment).commit();

        toolbar.setTitle(title);
    }
}