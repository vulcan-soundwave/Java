package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Strtest {

	private static String commonProcess(Map<String, Object> inf) {
		String s = new String();
		for (int i = 1;; i++) {
			if (inf.get("name" + i) == null)
				break;
			else {
				s = s + "{name:\'" + inf.get("name" + i) + "\',value:" + inf.get("data" + i) + "},";
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "	{\"name1\":{\"name1\":\"大专及以上\",\"name2\":\"本科及以上\",\"name3\":\"硕士及以上\",\"name4\":\"博士及以上\",\"name5\":\"学历不限\"},\"name2\":{\"name1\":\"经验1年以下\",\"name2\":\"经验1-3年\",\"name3\":\"经验3-5年\",\"name4\":\"经验5-10年\",\"name5\":\"经验10年以上\",\"name6\":\"应届毕业生\",\"name7\":\"经验不限\"},\"data1\":{\"data1\":1,\"data2\":2,\"data3\":3,\"data4\":4,\"data5\":5},\"data2\":{\"data1\":1,\"data2\":2,\"data3\":3,\"data4\":4,\"data5\":5,\"data6\":6,\"data7\":7}}";
//		JSONObject jo = new JSONObject();
//		Map<String, Object> map = new HashMap<String, Object>();
//		map = (Map<String, Object>) jo.parse(s);
//		Map<String, Object> map1 = new HashMap<String, Object>();
//		map1=(Map<String, Object>)map.get("name1");
//		map1.putAll((Map<String, Object>)map.get("data1"));
//		Map<String, Object> map2 = new HashMap<String, Object>();
//		map2=(Map<String, Object>)map.get("name2");
//		map2.putAll((Map<String, Object>)map.get("data2"));
//		Map<String,String> info=new HashMap<String,String>();
//		info.put("info1", commonProcess(map1));
//		info.put("info2", commonProcess(map2));
//		System.out.println(info);
//		System.out.println(map1);
	List<Integer> a=new ArrayList<>();
	}
}
