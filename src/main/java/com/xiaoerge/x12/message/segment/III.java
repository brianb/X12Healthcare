package com.xiaoerge.x12.message.segment;

import com.xiaoerge.x12.annotation.Declaration;
import com.xiaoerge.x12.annotation.Definition;
import com.xiaoerge.x12.message.MessageFormat;

/**
 * Created by xiaoerge on 5/23/16.
 */
@Declaration(fieldSize = 9, name = "III")
public class III extends Segment {
    public III() { super(); }
    public III(String content, MessageFormat mf) {
        super(content, mf);
    }

    @Definition(position = 1, minLength = 1, maxLength = 3)
    public String getCodeListQualifierCode() { return getField(1); }

    @Definition(position = 2, minLength = 1, maxLength = 30)
    public String getIndustryCode() { return getField(2); }

    @Definition(position = 3, minLength = 2, maxLength = 2)
    public String getCodeCategory() { return getField(3); }

    @Definition(position = 4, minLength = 1, maxLength = 264)
    public String getFreeFormMessageText() { return getField(4); }

    @Definition(position = 5, minLength = 1, maxLength = 15)
    public String getQuantity() { return getField(5); }

    @Definition(position = 6, minLength = 1, maxLength = 10)
    public String getCompositeUnitOfMeasure() { return getField(6); }

    @Definition(position = 7, minLength = 2, maxLength = 2)
    public String getSurfaceLayerPositionCode1() { return getField(7); }

    @Definition(position = 8, minLength = 2, maxLength = 2)
    public String getSurfaceLayerPositionCode2() { return getField(8); }

    @Definition(position = 9, minLength = 2, maxLength = 2)
    public String getSurfaceLayerPositionCode3() { return getField(9); }

    public void setCodeListQualifierCode(String s) { setField(1,s); }
    public void setIndustryCode(String s) { setField(2,s); }
    public void setCodeCategory(String s) { setField(3,s); }
    public void setFreeFormMessageText(String s) { setField(4,s); }
    public void setQuantity(String s) { setField(5,s); }
    public void setCompositeUnitOfMeasure(String s) { setField(6,s); }
    public void setSurfaceLayerPositionCode1(String s) { setField(7,s); }
    public void setSurfaceLayerPositionCode2(String s) { setField(8,s); }
    public void setSurfaceLayerPositionCode3(String s) { setField(9,s); }
}
