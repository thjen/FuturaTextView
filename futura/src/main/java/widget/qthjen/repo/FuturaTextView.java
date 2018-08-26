package widget.qthjen.repo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class FuturaTextView extends TextView {

    private int typefaceType;

    public FuturaTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.getTheme().obtainStyledAttributes(attrs, R.styleable.FuturaTextView, 0, 0);

        try {
            typefaceType = array.getInteger(R.styleable.FuturaTextView_font_name, 0);
        } finally {
            array.recycle();
        }

        if (!isInEditMode()) {
            setTypeface(CustomApp.getInstance().getTypeFace(typefaceType));
        }
    }
}
