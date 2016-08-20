package com.xiaoerge.x12.segment;

import com.xiaoerge.x12.annotation.Declaration;
import com.xiaoerge.x12.annotation.Definition;

/**
 * Created by xiaoerge on 5/23/16.
 */
@Declaration(fieldSize = 7, name = "MPI")
public class MPI extends Segment {
    public MPI() {
        super();
    }
    public MPI(String content) {
        super(content);
    }

    @Definition(position = 1, minLength = 1, maxLength = 1)
    public String getInformationStatusCode() { return getByPosition(); }

    @Definition(position = 2, minLength = 2, maxLength = 2)
    public String getEmploymentStatusCode() { return getByPosition(); }

    @Definition(position = 3, minLength = 1, maxLength = 1)
    public String getGovernmentServiceAffiliationCode() { return getByPosition(); }

    @Definition(position = 4, minLength = 1, maxLength = 80)
    public String getDescription() { return getByPosition(); }

    @Definition(position = 5, minLength = 2, maxLength = 2)
    public String getMilitaryServiceRankCode() { return getByPosition(); }

    @Definition(position = 6, minLength = 2, maxLength = 3)
    public String getDateTimePeriodFormatQualifier() { return getByPosition(); }

    @Definition(position = 7, minLength = 1, maxLength = 35)
    public String getDateTimePeriod() { return getByPosition(); }

    public void setInformationStatusCode(String s) { collection[1] = s; }
    public void setEmploymentStatusCode(String s) { collection[2] = s; }
    public void setGovernmentServiceAffiliationCode(String s) { collection[3] = s; }
    public void setDescription(String s) { collection[4] = s; }
    public void setMilitaryServiceRankCode(String s) { collection[5] = s; }
    public void setDateTimePeriodFormatQualifier(String s) { collection[6] = s; }
    public void setDateTimePeriod(String s) { collection[7] = s; }
}
