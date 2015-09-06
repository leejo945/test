package com.example.okhttpdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLayout2 extends LinearLayout {

	public MyLayout2(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyLayout2(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public MyLayout2(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		System.out.println(MyLayout2.class.getSimpleName()+"===== === dispatchTouchEvent=");
		return super.dispatchTouchEvent(ev);
	}  
	      
}
