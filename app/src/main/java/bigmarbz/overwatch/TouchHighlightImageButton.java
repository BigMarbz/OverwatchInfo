package bigmarbz.overwatch;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * Created by Matthew on 1/8/2017.
 */

public class TouchHighlightImageButton extends ImageButton {
    private Drawable mForegroundDrawable;
    private Rect mCachedBounds = new Rect();

    public TouchHighlightImageButton(Context context) {
        super(context);
        init();
    }

    public TouchHighlightImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TouchHighlightImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        setBackgroundColor(0);
        setPadding(0,0,0,0); //Retrieve drawable resource
        TypedArray a = getContext().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        mForegroundDrawable = a.getDrawable(0);
        mForegroundDrawable.setCallback(this);
        a.recycle();
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();

        if(mForegroundDrawable.isStateful()){
            mForegroundDrawable.setState(getDrawableState());
        }
        invalidate();
    }

    protected void onDraw(Canvas canvas){
        //Draw the image initially
        super.onDraw(canvas);
        mForegroundDrawable.setBounds(mCachedBounds);
        mForegroundDrawable.draw(canvas);
    }

    protected void onSizeChanged(int w, int h, int oldw, int oldh){
        super.onSizeChanged(w, h ,oldw, oldh);
        mCachedBounds.set(0,0,w,h);
        //Cache the new bounds
    }

}
