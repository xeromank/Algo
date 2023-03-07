package bm.c04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public String solution(String pathVariableUrl) {
        String answer = "error";

        String reg = "^\\/payment\\/([0-9]{1,9})\\/([a-zA-Z]{1,10})$";

        Pattern pt = Pattern.compile(reg);
        Matcher mc = pt.matcher(pathVariableUrl);
        if(mc.find()){
            answer = "/payment/" + mc.group(2) + "?paymentId=" +  mc.group(1);
        }

        return answer;
    }
}
