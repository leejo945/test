package com.example.okhttpdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

public class TestButton extends Button {
     
	private static final String TAG = TestButton.class.getSimpleName();

	public TestButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public TestButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public TestButton(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}
//	
	@Override
	public boolean onTouchEvent(MotionEvent event) {

		 switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			System.out.println("==ACTION_DOWN==="+event.getAction());	
			break;
			 
		case MotionEvent.ACTION_MOVE:
			System.out.println("==ACTION_MOVE==="+event.getAction());	
			break;
		case MotionEvent.ACTION_UP:
			System.out.println("==ACTION_UP==="+event.getAction());	
			break;

		}
		return super.onTouchEvent(event);
	}

}
