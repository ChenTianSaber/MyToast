package com.example.mytoast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by chentian on 22/02/2017.
 */

public class MyToast {
    private static TextView toastText;
    private static ImageView toastImage;
    private static LinearLayout linearLayout;

    /**
     * 这个是自定义Toast的函数
     * 可以自定义左边的图片，右边的文字，以及背景Style
     * @param context
     * @param text
     * @param image
     * @param toastStyle
     * @return
     */
    public static Toast makeMyToast(Context context,String text,int image,int toastStyle){
        //加载Toast布局
        View toastRoot = LayoutInflater.from(context).inflate(R.layout.toast_item, null);
        //初始化布局控件
        toastText = (TextView) toastRoot.findViewById(R.id.toast_text);
        toastImage = (ImageView) toastRoot.findViewById(R.id.toast_image);
        linearLayout = (LinearLayout) toastRoot.findViewById(R.id.toast_layout);

        //为控件设置属性
        toastText.setText(text);
        toastImage.setImageResource(image);

        //这里若是没有传入图片，则将其隐藏
        if(image==0){
            toastImage.setVisibility(View.GONE);
        }
        //若是没有传入要显示的文字，则将其填充空格（为了好看一点）
        if(text==null){
            toastText.setText("                ");
        }
        //如果传进来了toastStyle，那么就设置他
        if(toastStyle != 0){
            Drawable style = context.getDrawable(toastStyle);
            linearLayout.setBackground(style);
        }

        //Toast的初始化
        Toast toast = new Toast(context);
        //获取屏幕高度
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int height = dm.heightPixels;
        //Toast的Y坐标是屏幕高度的1/3，不会出现不适配的问题
        toast.setGravity(Gravity.TOP, 0, height*3 / 4);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(toastRoot);

        return toast;
    }

    //以下分别是内置的错误，完成，点赞，保存，删除的Toast
    public static void errorToast(Context context){
        MyToast.makeMyToast(context,"ERROR!", R.drawable.error_icon, R.drawable.error_style).show();
    }

    public static void finishToast(Context context){
        MyToast.makeMyToast(context,"FINISH!", R.drawable.finish_icon, R.drawable.finish_style).show();
    }

    public static void appreciateToast(Context context){
        MyToast.makeMyToast(context,"APPRECIATE!", R.drawable.appreciate_icon, R.drawable.appreciate_style).show();
    }

    public static void savedToast(Context context){
        MyToast.makeMyToast(context,"SAVED!", R.drawable.saved_icon, R.drawable.saved_style).show();
    }

    public static void deleteToast(Context context){
        MyToast.makeMyToast(context,"DELETE!", R.drawable.delete_icon, R.drawable.delete_style).show();
    }
}
