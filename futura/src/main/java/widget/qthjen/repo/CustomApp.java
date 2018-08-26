package widget.qthjen.repo;

import android.app.Application;
import android.graphics.Typeface;


public class CustomApp extends Application {
    private static CustomApp mInstance;
    private TypeFactory mFontFactory;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized CustomApp getInstance() {
        return mInstance;
    }

    public Typeface getTypeFace(int type) {
        if (mFontFactory == null)
            mFontFactory = new TypeFactory(this);

        switch (type) {
            case Constants.BOLD: return mFontFactory.getBold();
            case Constants.FUTURA: return mFontFactory.getFutura();
            case Constants.BOLD_ITALIC: return mFontFactory.getBoldItalic();
            case Constants.BOOK: return mFontFactory.getBook();
            case Constants.BOOK_ITALIC: return mFontFactory.getBookItalic();
            case Constants.EXTRA_BLACK: return mFontFactory.getExtra();
            case Constants.HEAVY: return mFontFactory.getHeavy();
            case Constants.HEAVY_ITALIC: return mFontFactory.getHeavyItalic();
            case Constants.LIGHT: return mFontFactory.getLight();
            case Constants.LIGHT_BT: return mFontFactory.getLightBt();
            case Constants.LIGHT_ITALIC: return mFontFactory.getLightItalic();
            case Constants.MEDIUM_BT: return mFontFactory.getMediumBt();
            case Constants.MEDIUM_CON: return mFontFactory.getMediumCon();
            case Constants.MEDIUM_ITALIC: return mFontFactory.getMediumItalic();

            default: return mFontFactory.getMediumBt();
        }
    }

    public interface Constants {
        int BOLD = 0, FUTURA = 2, BOLD_ITALIC = 1, BOOK = 11, BOOK_ITALIC = 12, EXTRA_BLACK = 13,
            HEAVY = 6, HEAVY_ITALIC = 7, LIGHT = 3, LIGHT_BT = 4, LIGHT_ITALIC = 5, MEDIUM_BT = 9,
            MEDIUM_CON = 8, MEDIUM_ITALIC = 10;
    }
}
