package com.xiaoerge.x12.message.segment;

import com.xiaoerge.x12.annotation.Declaration;
import com.xiaoerge.x12.annotation.Definition;
import com.xiaoerge.x12.message.MessageFormat;

/**
 * Created by xiaoerge on 5/23/16.
 */
@Declaration(fieldSize = 3, name = "AMT")
public class AMT extends Segment {
    public AMT() { super(); }
    public AMT(String content, MessageFormat mf) {
        super(content, mf);
    }

    @Definition(position = 1, minLength = 1, maxLength = 3)
    public String getAmountQualifierCode() { return getField(1); }

    @Definition(position = 2, minLength = 1, maxLength = 18)
    public String getMonetaryAmount() { return getField(2); }

    @Definition(position = 3, minLength = 1, maxLength = 1)
    public String getCreditDebitFlagCode() { return getField(3); }

    public void setAmountQualifierCode(String s) { setField(1,s); }
    public void setMonetaryAmount(String s) { setField(2,s); }
    public void setCreditDebitFlagCode(String s) { setField(3,s); }
}
