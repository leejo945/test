package com.example.okhttpdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLayout extends LinearLayout {

	public MyLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public MyLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		
		boolean result = super.dispatchTouchEvent(ev);
		
		System.out.println(result+ MyLayout.class.getSimpleName()+"===== === dispatchTouchEvent="  +ev.getAction());
		
		return  result; 
	}  
	      
}
