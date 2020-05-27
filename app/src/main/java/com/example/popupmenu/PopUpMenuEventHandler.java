package com.example.popupmenu;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopUpMenuEventHandler implements PopupMenu.OnMenuItemClickListener, androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener  {
    private Context context;
    PopUpMenuEventHandler(Context context){
        this.context = context;
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId()==R.id.Admin){
            Toast.makeText(context, "Login as Admin", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId()==R.id.User){
            Toast.makeText(context, "Login as User", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
