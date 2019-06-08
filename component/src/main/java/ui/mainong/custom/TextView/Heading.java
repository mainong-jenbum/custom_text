package ui.mainong.custom.TextView;

import android.content.Context;
import android.util.AttributeSet;

public class Heading extends TextViewRobotoBold {
    public Heading(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Heading(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Heading(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTextSize(16);
        }
    }
}
