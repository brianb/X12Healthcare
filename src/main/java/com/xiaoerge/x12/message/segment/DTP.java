package com.xiaoerge.x12.message.segment;

import com.xiaoerge.x12.annotation.Declaration;
import com.xiaoerge.x12.annotation.Definition;
import com.xiaoerge.x12.message.MessageFormat;

/**
 * Created by xiaoerge on 5/23/16.
 */
@Declaration(fieldSize = 3, name = "DTP")
public class DTP extends Segment {
    public DTP() { super(); }
    public DTP(String content, MessageFormat mf) {
        super(content, mf);
    }

    @Definition(position = 1, minLength = 3, maxLength = 3)
    public String getDateTimeQualifier() { return getField(1); }

    @Definition(position = 2, minLength = 2, maxLength = 3)
    public String getDateTimePeriodFormatQualifier() { return getField(2); }

    @Definition(position = 3, minLength = 1, maxLength = 35)
    public String getDateTimePeriod() { return getField(3); }

    public void setDateTimeQualifier(String s) { setField(1,s); }
    public void setDateTimePeriodFormatQualifier(String s) { setField(2,s); }
    public void setDateTimePeriod(String s) { setField(3,s); }
}
