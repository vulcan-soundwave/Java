package incloud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

class HttpRequest {

	public static String sendGet(String url, String param) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?" + param;
			URL realUrl = new URL(urlNameString);
			URLConnection connection = realUrl.openConnection();
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 锟斤拷锟斤拷实锟绞碉拷锟斤拷锟斤拷
			connection.connect();
			// 锟斤拷取锟斤拷锟斤拷锟斤拷应头锟街讹拷
			Map<String, List<String>> map = connection.getHeaderFields();
			// 锟斤拷锟斤拷锟斤拷锟叫碉拷锟斤拷应头锟街讹拷
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// 锟斤拷锟斤拷 BufferedReader锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷取URL锟斤拷锟斤拷应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 使锟斤拷finally锟斤拷锟斤拷锟截憋拷锟斤拷锟斤拷锟斤拷
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 锟斤拷指锟斤拷 URL 锟斤拷锟斤拷POST锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
	 * 
	 * @param url
	 *            锟斤拷锟斤拷锟斤拷锟斤拷锟�URL
	 * @param param
	 *            锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷应锟斤拷锟斤拷 name1=value1&name2=value2
	 *            锟斤拷锟斤拷式锟斤拷
	 * @return 锟斤拷锟斤拷远锟斤拷锟斤拷源锟斤拷锟斤拷应锟斤拷锟�
	 */
	public static String sendPost(String url, String param) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 锟津开猴拷URL之锟斤拷锟斤拷锟斤拷锟�
			URLConnection conn = realUrl.openConnection();
			// 锟斤拷锟斤拷通锟矫碉拷锟斤拷锟斤拷锟斤拷锟斤拷
			// conn.setRequestProperty("accept", "*/*");
			// conn.setRequestProperty("connection", "Keep-Alive");
			// conn.setRequestProperty("user-agent",
			// "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 锟斤拷锟斤拷POST锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
			conn.setDoOutput(true);
			conn.setDoInput(true);

			// 锟斤拷取URLConnection锟斤拷锟斤拷锟接︼拷锟斤拷锟斤拷锟斤拷
			out = new PrintWriter(conn.getOutputStream());
			// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
			out.print(param);
			// flush锟斤拷锟斤拷锟斤拷幕锟斤拷锟�
			out.flush();
			// 锟斤拷锟斤拷BufferedReader锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷取URL锟斤拷锟斤拷应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 使锟斤拷finally锟斤拷锟斤拷锟截憋拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
}

public class linktest {
	public static void main(String[] args) {
		// String
		// s=HttpRequest.sendGet("http://localhost:6144/Home/RequestString",
		// "key=123&v=456");
		// System.out.println(s);

		// 锟斤拷锟斤拷 POST 锟斤拷锟斤拷
		JSONObject jsonObject = new JSONObject();
		// jsonObject.put("username", "testnamepp");
		// jsonObject.put("token", "edcHP2yulvJHsOiUTCFvJnOEoxLoPtMb");
		jsonObject.put("username", "usertest");
		// jsonObject.put("token", "CfBuFYu4vtzANkGjeMYXQ6sOA2OZphFY");
		jsonObject.put("type", 9);
		//JSONObject json2 = new JSONObject();
//		json2.put("page", 1);
//		jsonObject.put("inf", json2.toString());
		//jsonObject.put("page", 2);
		jsonObject.put("no", 1);
		jsonObject.put("token", "jOSUG4KfspERdwnzruUmH1PEaL4ws2cR");
		jsonObject.put("password", "806b2af4633e64af88d33fbe4165a06a");
		jsonObject.put("inf", "2");
		jsonObject.put("key", "123");
		// jsonObject.put("cardinf", "{1231241223}");
		// jsonObject.put("ii", "16");
		// jsonObject.put("cardid", "1720160428234209858");
		// System.out.println(jsonObject.toJSONString());
		// String
		// sr=HttpRequest.sendPost("http://115.159.73.94/ccard/login.html",jsonObject.toJSONString());
		String qq = "username=testname&password=testpass&token=L9kGKObegMCZM4O6bpH45Nlp7mEJxAyI&cardinf={11231241223}";
		String sr=HttpRequest.sendPost("http://localhost:16666/incloud/request.do",jsonObject.toJSONString());
		// HttpURLConnection connection

		//String sr = HttpRequest.sendPost("http://123.206.75.21:16666/incloud/request.do", jsonObject.toJSONString());
		System.out.println(sr);
	}
}
