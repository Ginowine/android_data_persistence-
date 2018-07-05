package ingressive.tutorial.com.hubmembersapp.data;

import android.provider.BaseColumns;

public class HubMemebersContract {

    public static final class MembersEntry implements BaseColumns {
        // COMPLETED (2) Inside create a static final members for the table name and each of the db columns
        public static final String TABLE_NAME = "hubmemberslist";
        public static final String COLUMN_FULL_NAME = "memberName";
        public static final String COLUMN_EMAIL = "memberEmail";
        public static final String COLUMN_PHONE = "phoneNumber";
        public static final String COULUMN_DESCRIPTION = "jobDescription";
        public static final String COULUM_SEX = "memberSex";
        public static final String COLUMN_MEMEBER_PLAN = "memberPlan";
    }
}
