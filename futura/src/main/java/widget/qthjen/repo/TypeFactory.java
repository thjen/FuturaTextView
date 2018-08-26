package widget.qthjen.repo;

import android.content.Context;
import android.graphics.Typeface;

public class TypeFactory {
    final String FUTURA_BOLD = "fonts/FuturaBold.ttf";
    final String FUTURA = "fonts/futur.ttf";
    final String FUTURA_BOLD_ITALIC = "fonts/FuturaBoldItalic.ttf";
    final String FUTURA_BOOK = "fonts/FuturaBook.ttf";
    final String FUTURA_BOOK_ITALIC = "fonts/FuturaBookItalic.ttf";
    final String FUTURA_EXTRA_BLACK = "fonts/FuturaExtraBlack.ttf";
    final String FUTURA_HEAVY = "fonts/FuturaHeavy.ttf";
    final String FUTURA_HEAVY_ITALIC = "fonts/FuturaHeavyItalic.ttf";
    final String FUTURA_LIGHT = "fonts/FuturaLight.ttf";
    final String FUTURA_LIGHT_BT = "fonts/futuralightbt.ttf";
    final String FUTURA_LIGHT_ITALIC = "fonts/FuturaLightItalic.ttf";
    final String FUTURA_MEDIUM_BT = "fonts/futuramediumbt.ttf";
    final String FUTURA_MEDIUM_CON = "fonts/futuramediumcondensedbt.ttf";
    final String FUTURA_MEDIUM_ITALIC = "fonts/FuturaMediumItalic font.ttf";

    Typeface bold;
    Typeface boldItalic;
    Typeface futura;
    Typeface light;
    Typeface lightBt;
    Typeface lightItalic;
    Typeface heavy;
    Typeface heavyItalic;
    Typeface mediumCon;
    Typeface mediumBt;
    Typeface mediumItalic;
    Typeface book;
    Typeface bookItalic;
    Typeface extra;

    public TypeFactory(Context context) {
        bold = Typeface.createFromAsset(context.getAssets(), FUTURA_BOLD);
        boldItalic = Typeface.createFromAsset(context.getAssets(), FUTURA_BOLD_ITALIC);
        futura = Typeface.createFromAsset(context.getAssets(), FUTURA);
        light = Typeface.createFromAsset(context.getAssets(), FUTURA_LIGHT);
        lightBt = Typeface.createFromAsset(context.getAssets(), FUTURA_LIGHT_BT);
        lightItalic = Typeface.createFromAsset(context.getAssets(), FUTURA_LIGHT_ITALIC);
        heavy = Typeface.createFromAsset(context.getAssets(), FUTURA_HEAVY);
        heavyItalic = Typeface.createFromAsset(context.getAssets(), FUTURA_HEAVY_ITALIC);
        mediumCon = Typeface.createFromAsset(context.getAssets(), FUTURA_MEDIUM_CON);
        mediumBt = Typeface.createFromAsset(context.getAssets(), FUTURA_MEDIUM_BT);
        mediumItalic = Typeface.createFromAsset(context.getAssets(), FUTURA_MEDIUM_ITALIC);
        book = Typeface.createFromAsset(context.getAssets(), FUTURA_BOOK);
        bookItalic = Typeface.createFromAsset(context.getAssets(), FUTURA_BOOK_ITALIC);
        extra = Typeface.createFromAsset(context.getAssets(), FUTURA_EXTRA_BLACK);
    }

    public Typeface getBold() {
        return bold;
    }

    public Typeface getBoldItalic() {
        return boldItalic;
    }

    public Typeface getFutura() {
        return futura;
    }

    public Typeface getLight() {
        return light;
    }

    public Typeface getLightBt() {
        return lightBt;
    }

    public Typeface getLightItalic() {
        return lightItalic;
    }

    public Typeface getHeavy() {
        return heavy;
    }

    public Typeface getHeavyItalic() {
        return heavyItalic;
    }

    public Typeface getMediumCon() {
        return mediumCon;
    }

    public Typeface getMediumBt() {
        return mediumBt;
    }

    public Typeface getMediumItalic() {
        return mediumItalic;
    }

    public Typeface getBook() {
        return book;
    }

    public Typeface getBookItalic() {
        return bookItalic;
    }

    public Typeface getExtra() {
        return extra;
    }
}
