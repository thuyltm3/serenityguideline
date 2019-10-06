package common.db.blog;

import common.db.Base;

import java.util.List;
import java.util.Map;

public class BlogSimple extends Blog {

    private Base base = new Base();

    public List<Map<String, Object>> getAllUserInfo() throws Exception {

        String query = "select * from user_info";
        return base.executeQuery(blogDbConnect.getSession(), query);
    }

    public void clearDataCreateProfile(String email) {

        String query = String.format("delete TCBS_USER_OPENACCOUNT_QUEUE where EMAIL = '%s'", email);
        base.queryNoReturn(blogDbConnect.getSession(), query);
    }

}
