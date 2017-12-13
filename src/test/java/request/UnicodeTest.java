package request;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import util.JsonUtil;
import util.UnicodeUtil;

/**
 * Created by aaa on 17-12-6.
 */
public class UnicodeTest {
    
    @Test
    public void encode(){
        String txt = "{\"html\":\"<div class=\\\"inquiry_header\\\"><div class=\\\"left fixed\\\"><h3 id=\\\"lh\\\">140\\u8def<\\/h3><\\/div><div class=\\\"inner\\\"><h2 id=\\\"lm\\\">\\u5317\\u4eac\\u7ad9\\u4e1c-\\u77f3\\u4f5b\\u8425\\u897f\\u91cc<\\/h2><article><p>\\u671d\\u9633\\u95e8\\u5185&nbsp;5:10-23:00&nbsp;\\u5206\\u6bb5\\u8ba1\\u4ef7&nbsp;\\u6240\\u5c5e\\u5ba2\\u4e8c\\u5206\\u516c\\u53f8<\\/p><p>\\u6700\\u8fd1\\u4e00\\u8f86\\u8f66\\u8ddd\\u79bb\\u6b64\\u8fd8\\u6709&nbsp;4&nbsp;\\u7ad9\\uff0c&nbsp;<span>2.53<\\/span>&nbsp;\\u516c\\u91cc\\uff0c\\u9884\\u8ba1\\u5230\\u7ad9\\u65f6\\u95f4&nbsp;<span>8<\\/span>&nbsp;\\u5206\\u949f<\\/p><\\/article><\\/div><\\/div><div id=\\\"cc_stop\\\" class=\\\"inquiry_main\\\" unselectable=\\\"on\\\" onselectstart=\\\"return false;\\\"><ul class=\\\"fixed\\\"><li><div id=\\\"1\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5317\\u4eac\\u7ad9\\u4e1c\\\">\\u5317\\u4eac\\u7ad9\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"2m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"2\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u738b\\u5e9c\\u4e95\\\">\\u738b\\u5e9c\\u4e95<\\/span><\\/div><\\/li><li><div id=\\\"3m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"3\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u738b\\u5e9c\\u4e95\\u8def\\u53e3\\u5317\\\">\\u738b\\u5e9c\\u4e95\\u8def\\u53e3\\u5317<\\/span><\\/div><\\/li><li><div id=\\\"4m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"4\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u65b0\\u4e1c\\u5b89\\u5e02\\u573a\\\">\\u65b0\\u4e1c\\u5b89\\u5e02\\u573a<\\/span><\\/div><\\/li><li><div id=\\\"5m\\\"><i  class=\\\"busc\\\" clstag=\\\"2531\\\"><\\/i><\\/div><\\/li><li><div id=\\\"5\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u706f\\u5e02\\u897f\\u53e3\\\">\\u706f\\u5e02\\u897f\\u53e3<\\/span><\\/div><\\/li><li><div id=\\\"6m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"6\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u7f8e\\u672f\\u9986\\u4e1c\\\">\\u7f8e\\u672f\\u9986\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"7m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"7\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u4e1c\\u56db\\u8def\\u53e3\\u4e1c\\\">\\u4e1c\\u56db\\u8def\\u53e3\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"8m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"8\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u671d\\u5185\\u5c0f\\u8857\\\">\\u671d\\u5185\\u5c0f\\u8857<\\/span><\\/div><\\/li><li><div id=\\\"9m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"9\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u671d\\u9633\\u95e8\\u5185\\\" style=\\\"font-size: 16px;font-weight:700;\\\">\\u671d\\u9633\\u95e8\\u5185<\\/span><\\/div><\\/li><li><div id=\\\"10m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"10\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u671d\\u9633\\u95e8\\u5916\\\">\\u671d\\u9633\\u95e8\\u5916<\\/span><\\/div><\\/li><li><div id=\\\"11m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"11\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u795e\\u8def\\u8857\\\">\\u795e\\u8def\\u8857<\\/span><\\/div><\\/li><li><div id=\\\"12m\\\"><i  class=\\\"busc\\\" clstag=\\\"\\\"><\\/i><\\/div><\\/li><li><div id=\\\"12\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u4e1c\\u5927\\u6865\\u8def\\u53e3\\u4e1c\\\">\\u4e1c\\u5927\\u6865\\u8def\\u53e3\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"13m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"13\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5173\\u4e1c\\u5e97\\\">\\u5173\\u4e1c\\u5e97<\\/span><\\/div><\\/li><li><div id=\\\"14m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"14\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u547c\\u5bb6\\u697c\\u5317\\\">\\u547c\\u5bb6\\u697c\\u5317<\\/span><\\/div><\\/li><li><div id=\\\"15m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"15\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u547c\\u5bb6\\u697c\\u5317\\u8857\\\">\\u547c\\u5bb6\\u697c\\u5317\\u8857<\\/span><\\/div><\\/li><li><div id=\\\"16m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"16\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u6c34\\u7893\\u5b50\\\">\\u6c34\\u7893\\u5b50<\\/span><\\/div><\\/li><li><div id=\\\"17m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"17\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u91d1\\u53f0\\u8def\\u53e3\\u4e1c\\\">\\u91d1\\u53f0\\u8def\\u53e3\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"18m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"18\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5ef6\\u9759\\u91cc\\\">\\u5ef6\\u9759\\u91cc<\\/span><\\/div><\\/li><li><div id=\\\"19m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"19\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u7ea2\\u9886\\u5dfe\\u516c\\u56ed\\\">\\u7ea2\\u9886\\u5dfe\\u516c\\u56ed<\\/span><\\/div><\\/li><li><div id=\\\"20m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"20\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u516b\\u91cc\\u5e84\\u5357\\u91cc\\\">\\u516b\\u91cc\\u5e84\\u5357\\u91cc<\\/span><\\/div><\\/li><li><div id=\\\"21m\\\"><i  class=\\\"busc\\\" clstag=\\\"\\\"><\\/i><\\/div><\\/li><li><div id=\\\"21\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u519c\\u6c11\\u65e5\\u62a5\\u793e\\\">\\u519c\\u6c11\\u65e5\\u62a5\\u793e<\\/span><\\/div><\\/li><li><div id=\\\"22m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"22\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u519c\\u6c11\\u65e5\\u62a5\\u793e\\u5317\\\">\\u519c\\u6c11\\u65e5\\u62a5\\u793e\\u5317<\\/span><\\/div><\\/li><li><div id=\\\"23m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"23\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u516b\\u91cc\\u5e84\\u5317\\u91cc\\\">\\u516b\\u91cc\\u5e84\\u5317\\u91cc<\\/span><\\/div><\\/li><li><div id=\\\"24m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"24\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u9ad8\\u5e99\\\">\\u9ad8\\u5e99<\\/span><\\/div><\\/li><li><div id=\\\"25m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"25\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u8c46\\u5404\\u5e84\\u8def\\u53e3\\u897f\\\">\\u8c46\\u5404\\u5e84\\u8def\\u53e3\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"26m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"26\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u8c46\\u5404\\u5e84\\u8def\\u53e3\\u5357\\\">\\u8c46\\u5404\\u5e84\\u8def\\u53e3\\u5357<\\/span><\\/div><\\/li><li><div id=\\\"27m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"27\\\"><i class=\\\"buss\\\" clstag=\\\"-1\\\"><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u77f3\\u4f5b\\u8425\\u897f\\u91cc\\u4e1c\\u7ad9\\\">\\u77f3\\u4f5b\\u8425\\u897f\\u91cc\\u4e1c<br\\/>...<\\/span><\\/div><\\/li><li><div id=\\\"28m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"28\\\"><i class=\\\"buss\\\" clstag=\\\"-1\\\"><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u77f3\\u4f5b\\u8425\\u897f\\u91cc\\\">\\u77f3\\u4f5b\\u8425\\u897f\\u91cc<\\/span><\\/div><\\/li><\\/ul><\\/div><div class=\\\"inquiry_footer\\\"><section><div class=\\\"inner\\\"><span class=\\\"buss\\\">\\u9014\\u4e2d\\u8f66\\u8f86<\\/span><span class=\\\"busc\\\">\\u5230\\u7ad9\\u8f66\\u8f86<\\/span><\\/div><\\/section><\\/div>\",\"w\":1340,\"seq\":\"9\"}";
        System.out.println(UnicodeUtil.gbEncoding(txt));
    }
    
    @Test
    public void decode(){
        String json = "{\"html\":\"<div class=\\\"inquiry_header\\\"><div class=\\\"left fixed\\\"><h3 id=\\\"lh\\\">9\\u8def<\\/h3><\\/div><div class=\\\"inner\\\"><h2 id=\\\"lm\\\">\\u91d1\\u5bb6\\u6751\\u6865\\u4e1c-\\u91d1\\u53f0\\u8def<\\/h2><article><p>\\u5d07\\u6587\\u95e8\\u897f&nbsp;5:10-23:00&nbsp;\\u5206\\u6bb5\\u8ba1\\u4ef7&nbsp;\\u6240\\u5c5e\\u7535\\u8f66\\u5206\\u516c\\u53f8<\\/p><p>\\u6700\\u8fd1\\u4e00\\u8f86\\u8f66\\u8ddd\\u79bb\\u6b64\\u8fd8\\u6709&nbsp;3&nbsp;\\u7ad9\\uff0c&nbsp;<span>1.36<\\/span>&nbsp;\\u516c\\u91cc\\uff0c\\u9884\\u8ba1\\u5230\\u7ad9\\u65f6\\u95f4&nbsp;<span>4<\\/span>&nbsp;\\u5206\\u949f<\\/p><\\/article><\\/div><\\/div><div id=\\\"cc_stop\\\" class=\\\"inquiry_main\\\" unselectable=\\\"on\\\" onselectstart=\\\"return false;\\\"><ul class=\\\"fixed\\\"><li><div id=\\\"1\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u91d1\\u5bb6\\u6751\\u6865\\u4e1c\\\">\\u91d1\\u5bb6\\u6751\\u6865\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"2m\\\"><i  class=\\\"busc\\\" clstag=\\\"10116\\\"><\\/i><\\/div><\\/li><li><div id=\\\"2\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u83b2\\u82b1\\u5c0f\\u533a\\\">\\u83b2\\u82b1\\u5c0f\\u533a<\\/span><\\/div><\\/li><li><div id=\\\"3m\\\"><i  class=\\\"busc\\\" clstag=\\\"8718\\\"><\\/i><\\/div><\\/li><li><div id=\\\"3\\\"><i class=\\\"buss\\\" clstag=\\\"-1\\\"><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5317\\u4eac\\u897f\\u7ad9\\\">\\u5317\\u4eac\\u897f\\u7ad9<\\/span><\\/div><\\/li><li><div id=\\\"4m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"4\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5c0f\\u9a6c\\u5382\\\">\\u5c0f\\u9a6c\\u5382<\\/span><\\/div><\\/li><li><div id=\\\"5m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"5\\\"><i class=\\\"buss\\\" clstag=\\\"-1\\\"><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u767d\\u4e91\\u6865\\u897f\\\">\\u767d\\u4e91\\u6865\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"6m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"6\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5929\\u5b81\\u5bfa\\u6865\\u897f\\\">\\u5929\\u5b81\\u5bfa\\u6865\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"7m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"7\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u957f\\u693f\\u8857\\u8def\\u53e3\\u4e1c\\\">\\u957f\\u693f\\u8857\\u8def\\u53e3\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"8m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"8\\\"><i class=\\\"buss\\\" clstag=\\\"-1\\\"><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5ba3\\u6b66\\u95e8\\u897f\\\">\\u5ba3\\u6b66\\u95e8\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"9m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"9\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u548c\\u5e73\\u95e8\\u897f\\\">\\u548c\\u5e73\\u95e8\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"10m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"10\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5317\\u4eac\\u4f9b\\u7535\\u5c40\\\">\\u5317\\u4eac\\u4f9b\\u7535\\u5c40<\\/span><\\/div><\\/li><li><div id=\\\"11m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"11\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u524d\\u95e8\\u897f\\\">\\u524d\\u95e8\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"12m\\\"><i  class=\\\"busc\\\" clstag=\\\"1362\\\"><\\/i><\\/div><\\/li><li><div id=\\\"12\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u524d\\u95e8\\u4e1c\\\">\\u524d\\u95e8\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"13m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"13\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u6b63\\u4e49\\u8def\\\">\\u6b63\\u4e49\\u8def<\\/span><\\/div><\\/li><li><div id=\\\"14m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"14\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u53f0\\u57fa\\u5382\\u8def\\u53e3\\u897f\\\">\\u53f0\\u57fa\\u5382\\u8def\\u53e3\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"15m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"15\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5d07\\u6587\\u95e8\\u897f\\\" style=\\\"font-size: 16px;font-weight:700;\\\">\\u5d07\\u6587\\u95e8\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"16m\\\"><i  class=\\\"busc\\\" clstag=\\\"\\\"><\\/i><\\/div><\\/li><li><div id=\\\"16\\\"><i class=\\\"buss\\\" clstag=\\\"-1\\\"><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5317\\u4eac\\u7ad9\\u524d\\u8857\\\">\\u5317\\u4eac\\u7ad9\\u524d\\u8857<\\/span><\\/div><\\/li><li><div id=\\\"17m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"17\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u65e5\\u575b\\u8def\\\">\\u65e5\\u575b\\u8def<\\/span><\\/div><\\/li><li><div id=\\\"18m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"18\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u6c38\\u5b89\\u91cc\\u8def\\u53e3\\u897f\\\">\\u6c38\\u5b89\\u91cc\\u8def\\u53e3\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"19m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"19\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5927\\u5317\\u7a91\\u897f\\\">\\u5927\\u5317\\u7a91\\u897f<\\/span><\\/div><\\/li><li><div id=\\\"20m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"20\\\"><i class=\\\"buss\\\" clstag=\\\"-1\\\"><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5149\\u534e\\u6865\\u5357\\\">\\u5149\\u534e\\u6865\\u5357<\\/span><\\/div><\\/li><li><div id=\\\"21m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"21\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u547c\\u5bb6\\u697c\\u4e1c\\\">\\u547c\\u5bb6\\u697c\\u4e1c<\\/span><\\/div><\\/li><li><div id=\\\"22m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"22\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u5c0f\\u5e84\\u8def\\u53e3\\u5317\\\">\\u5c0f\\u5e84\\u8def\\u53e3\\u5317<\\/span><\\/div><\\/li><li><div id=\\\"23m\\\"><i ><\\/i><\\/div><\\/li><li><div id=\\\"23\\\"><i class=\\\"buss\\\" clstag=\\\"-1\\\"><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u6c34\\u7893\\u8def\\u53e3\\u5357\\\">\\u6c34\\u7893\\u8def\\u53e3\\u5357<\\/span><\\/div><\\/li><li><div id=\\\"24m\\\"><i  class=\\\"busc\\\" clstag=\\\"\\\" class=\\\"busc\\\" clstag=\\\"\\\"><\\/i><\\/div><\\/li><li><div id=\\\"24\\\"><i><\\/i><p class=\\\"sicon\\\"><\\/p><span title=\\\"\\u91d1\\u53f0\\u8def\\\">\\u91d1\\u53f0\\u8def<\\/span><\\/div><\\/li><\\/ul><\\/div><div class=\\\"inquiry_footer\\\"><section><div class=\\\"inner\\\"><span class=\\\"buss\\\">\\u9014\\u4e2d\\u8f66\\u8f86<\\/span><span class=\\\"busc\\\">\\u5230\\u7ad9\\u8f66\\u8f86<\\/span><\\/div><\\/section><\\/div>\",\"w\":1148,\"seq\":\"15\"}";
        JSONObject jsonObject = JsonUtil.getJsonObj(json);
        String txt = String.valueOf(jsonObject.get("html"));
        String result = UnicodeUtil.decodeUnicode(txt);
        String view = "<html><title></title><body>" + result.replace("\\\"", "\"").replace("\\/", "/") + "</body></html>";
        System.out.println(view);
    }
    
    @Test
    public void decodeBytes(){
        String bytes = "\\u9879\\u76ee\\u542f\\u52a8\\u65f6\\u95f4";
        String result = UnicodeUtil.decodeUnicode(bytes);
        System.out.println(result);
    }
    
    @Test
    public void decodeHex(){
        String s = "db166b20";
        byte[] hex = s.getBytes();
        System.out.println(UnicodeUtil.byte2HexStr(hex));
    }
    
    @Test
    public void decodeHexChar(){
        String s = "db166b20";
        byte[] hex = s.getBytes();
        int[] ints = UnicodeUtil.byte2HexChars(hex);
        for (int i = 0; i < ints.length; i++) {
            int n = ints[i];
            System.out.print(n + " ");
        }
    }
}
