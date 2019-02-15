package com.example.papadakis.demo_thesis;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;


public class UserActivity extends AppCompatActivity {

    //Dhmiourgoume pinaka gia ta eikonidia tou menu
    String arrayName[]={"Χρήση για γονείς",
                        "Χρήση για παιδιά",
                        "Υλικό της εφαρμογής",
                        "Πώς χρησιμοποιούμε την εφαρμογή",
                        "Κλείσιμο εφαρμογής"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //Dhmiourgia tou menu
        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.add, R.mipmap.remove)
                .addSubMenu(Color.parseColor("#258CFF"), R.mipmap.parent)
                .addSubMenu(Color.parseColor("#30A400"), R.mipmap.kids)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.info)
                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.help)
                .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.shutdown)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(UserActivity.this, arrayName[index], Toast.LENGTH_SHORT).show();

                        switch (index) {
                            case 0:

                                startActivity(new Intent(UserActivity.this, ParentsActivity.class));
                                break;

                            case 1:

                                startActivity(new Intent(UserActivity.this, Kids1Activity.class));
                                break;

                            case 2:

                                startActivity(new Intent(UserActivity.this, InfoMainActivity.class));
                                break;

                            case 3:

                                startActivity(new Intent(UserActivity.this, HelpMainActivity.class));
                                break;

                            case 4:

                                //termatismos kai epistrofh sthn arxikh
                                //finish();
                                //System.exit(0);

                                //kleisimo efarmoghs
                                //moveTaskToBack(true);
                                //android.os.Process.killProcess(android.os.Process.myPid());
                                //System.exit(1);

                                //kleisimo efarmoghs me alert box
                                final AlertDialog.Builder builder = new AlertDialog.Builder(UserActivity.this);
                                builder.setMessage("Είστε σίγουροι ότι θέλετε να τερματίσετε την εφαρμογή ; ");
                                builder.setCancelable(true);
                                builder.setNegativeButton("Επιστροφη", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.cancel();
                                    }
                                });
                                builder.setPositiveButton("Κλεισιμο", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        System.exit(0);
                                    }
                                });
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();

                                break;

                        }



                    }

                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

                    @Override
                    public void onMenuOpened() {}

                    @Override
                    public void onMenuClosed() {}
                    }
                );

        }
}
