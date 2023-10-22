package uta.fisei.app4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public  void  onClickButtonBrowser(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public  void  onClickButtonCallPhone(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +593998644578"));
        startActivity(intent);
    }



    @SuppressLint("QueryPermissionsNeeded")
    public  void  onClickButtonGoogleMaps(View view){
        Uri uri = Uri.parse("geo: 37:2202, -100.202");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        if (intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }
        startActivity(intent);
    }
    public void onClickShowMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            //case R.id.menu_About:
                //Toast.makeText(this, "Esta es una App de prueba", Toast.LENGTH_SHORT).show();
        }
        //return true;
        return super.onOptionsItemSelected(item);
    }
}