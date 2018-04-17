package web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

import common.Common;
import dao.InfoDao;

@Service
public class AllService {
	@Autowired
	InfoDao dao;
	Common common;

	private String commonProcess(Map<String, Object> inf) {
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

	private String commonProcess2(Map<String, Object> inf) {
		String s = new String();
		for (int i = 1;; i++) {
			if (inf.get("name" + i) == null)
				break;
			else {
				s = s + '\"' + inf.get("name" + i) + '\"' + ':' + inf.get("data" + i) + ",";
			}
		}
		return s;
	}

	public String processType1(String json) {
		JSONObject jsonObject = new JSONObject();
		Map<String, Object> inf = new HashMap<String, Object>();
		inf = (Map<String, Object>) JSON.parse(json);
		return commonProcess(inf);
	}

	public List<String> processType4_11(String json) {
		JSONObject jsonObject = new JSONObject();
		Map<String, Object> inf = new HashMap<String, Object>();
		inf = (Map<String, Object>) JSON.parse(json);
		List<String> info = new ArrayList<String>();
		String names = new String();
		String datas = new String();
		for (int i = 1;; i++)
			if (inf.get("name" + i) == null)
				break;
			else {
				names = names + '\'' + inf.get("name" + i) + "\',";
				datas = datas + '\'' + inf.get("data" + i) + "\',";
			}

		info.add(0, names);
		info.add(1, datas);
		return info;

	}

	public List<String> processType2(String json) {
		JSONObject jo = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map = (Map<String, Object>) jo.parse(json);
		List<String> info = new ArrayList<String>();
		for (int i = 1;; i++)
			if (map.get("name" + i) == null)
				break;
			else {
				Map<String, Object> mapt = new HashMap<String, Object>();
				mapt = (Map<String, Object>) map.get("name" + i);
				mapt.putAll((Map<String, Object>) map.get("data" + i));
				info.add(commonProcess2(mapt));
			}
		return info;
	}

	public String getinfo(String name) {
		String s = dao.select(name).getJson();
		// System.out.println(s+"\n"+name);
		return s;
	}

	public Map<String, Object> process4_9(String json) {
		JSONObject jo = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map = (Map<String, Object>) jo.parse(json);
		Map<String, Object> nm = (Map<String, Object>) map.get("name1");
		Map<String, Object> dm = map;
		String names = new String();
		List<Object> datas = new ArrayList<Object>();

		List<String> namelist = new ArrayList<String>();
		int dataarray[] = { 0, 0, 0, 0 };
		for (int i = 1;; i++)
			if (nm.get("name" + i) == null)
				break;
			else {
				namelist.add(i - 1, (String) nm.get("name" + i));
				names = names + '\'' + nm.get("name" + i) + '\'' + ',';
				Map<String, Object> mt = (Map<String, Object>) dm.get("data" + i);
				List<Integer> datat = new ArrayList<Integer>();
				for (int j = 1;; j++)
					if (mt.get("data" + j) == null) {
						datas.add(i - 1, datat);
						break;
					} else {
						datat.add(j - 1, (int) mt.get("data" + j));
						dataarray[i - 1] += (int) mt.get("data" + j);
					}
			}
		nm = (Map<String, Object>) map.get("name2");
		List<String> cn = new ArrayList<String>();
		for (int i = 1;; i++)
			if (nm.get("name" + i) == null)
				break;
			else {
				cn.add(i - 1, (String) nm.get("name" + i));
			}
		Map<String, Object> info = new HashMap<String, Object>();
		info.put("names", names);
		info.put("datas", datas);
		info.put("namelist", namelist);
		info.put("dataa", dataarray);
		info.put("company", cn);
		return info;
	}

	public Map<String, Object> processType4_12(String json) {
		JSONObject jo = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map = (Map<String, Object>) jo.parse(json);
		Map<String, Object> temp = (Map<String, Object>) map.get("name1");
		String citys = new String();
		for (int i = 1;; i++)
			if (temp.get("name" + i) == null)
				break;
			else {
				citys += '\'' + (String) temp.get("name" + i) + '\'' + ',';
			}
		List<String> posts = new ArrayList<>();
		List<String> datas = new ArrayList<>();
		temp = (Map<String, Object>) map.get("name2");
		Map<String, Object> datatemp = (Map<String, Object>) map.get("data2");
		for (int i = 1;; i++)
			if (temp.get("name" + i) == null)
				break;
			else {
				posts.add(i - 1, (String) temp.get("name" + i));
				String dstemp = new String();
				Map<String, Object> data = (Map<String, Object>) datatemp.get("data" + i);
				for (int j = 1;; j++)
					if (data.get("data" + j) == null)
						break;
					else {
						dstemp += Integer.toString((int) data.get("data" + j)) + ',';
					}
				datas.add(i - 1, dstemp);
			}

		Map<String, Object> info = new HashMap<String, Object>();
		info.put("citys", citys);
		info.put("posts", posts);
		info.put("datas", datas);
		return info;
	}

	public List<String> process4_13(String json) {
		JSONObject jo = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map = (Map<String, Object>) jo.parse(json);
		Map<String, Object> temp;
		String info = new String();
		String data1 = new String();
		String data2 = new String();
		for (int i = 1;; i++)
			if (map.get("name" + i) == null)
				break;
			else {
				info += '\'' + (String) map.get("name" + i) + '\'' + ',';
				temp = (Map<String, Object>) map.get("data" + i);
				data1 += Integer.toString((int) temp.get("data1")) + ',';
				data2 += Integer.toString((int) temp.get("data2")) + ',';
			}
		List<String> inf = new ArrayList<>();
		inf.add(0, info);
		inf.add(1, data1);
		inf.add(2, data2);
		return inf;
	}

	public List<String> process4_16(String json) {
		JSONObject jo = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map = (Map<String, Object>) jo.parse(json);
		Map<String, Object> temp;
		String info = new String();
		String data1 = new String();
		String data2 = new String();
		String data3 = new String();
		for (int i = 1;; i++)
			if (map.get("name" + i) == null)
				break;
			else {
				info += '\'' + (String) map.get("name" + i) + '\'' + ", ";
				temp = (Map<String, Object>) map.get("data" + i);
				data1 += Integer.toString((int) temp.get("data1")) + ',';
				data2 += Integer.toString((int) temp.get("data2")) + ',';
				data3 += Integer.toString((int) temp.get("data3")) + ',';
			}
		List<String> inf = new ArrayList<>();
		inf.add(0, info);
		inf.add(1, data1);
		inf.add(2, data2);
		inf.add(3, data3);
		return inf;
	}

	public List<String> process4_15(String json) {
		JSONObject jsonObject = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map = (Map<String, Object>) JSON.parse(json);
		String info = new String();
		for (int i = 1;; i++)
			if (map.get("name" + i) == null)
				break;
			else {
				info += '\'' + (String) map.get("name" + i) + '\'' + ", ";
			}
		List<String> echo = new ArrayList<String>();
		echo.add(0, info);
		echo.add(1, commonProcess(map));
		return echo;
	}

	public List<String> processType4_7x(String json) {
		JSONObject jsonObject = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map = (Map<String, Object>) JSON.parse(json);
		String inf1 = new String();
		for (int i = 1;; i++)
			if (map.get("name" + i) == null)
				break;
			else {
				inf1 += (String) map.get("name" + i) + ':' + map.get("data" + i) + "\\n";
			}
		String inf2 = commonProcess(map);
		List<String> i = new ArrayList<>();
		i.add(0,inf1);
		i.add(1,inf2);
		return i;

	}
}
