package zlf.test;

import java.util.Set;

import zlf.bo.BookBo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * fastJson为阿里巴巴，需要的一个jar包
 * com.alibaba.fastjson  1.1.22
 * @author Administrator
 *
 */
public class FastJson {
	
	public static void main(String[] args) {
		BookBo book=new BookBo();
		
		book.setId("科幻类");
		book.setName("海底两万里");
//		1.bean转换json   将对象转换成格式化的json
		String str1 = JSON.toJSONString(book,false);
		System.out.println(str1);
////		将对象转换成非格式化的json
//		String str2 = JSON.toJSONString(book,false);
//		System.out.println(str2);
		
//		2.obj设计对象	对于复杂类型的转换,对于重复的引用在转成json串后在json串中出现引用的字符,比如 $ref":"$[0].books[1]
//		StudentBo stu = new StudentBo();
//		Set set= new HashSet();
//		BookBo book = new BookBo();
//		set.add(book);
//		stu.setSet(set);
//		List list = new ArrayList();
//		for(int i=0;i<5;i++){
//			
//			list.add(stu);
//		}
//		String json = JSON.toJSONString(list,true);
//		System.out.println(json);
		
//		3.json转换bean,这个json只能是一套属性值map结构，而不能是一个list结构中有多套bo属性。
//		String json = "{\"id\":\"2\",\"name\":\"Json技术\"}";
//		BookBo book = JSON.parseObject(json, BookBo.class);
		
//		4.json转换复杂的bean，比如List，Map
//		String json = "[{\"id\":\"1\",\"name\":\"Json技术\"},{\"id\":\"2\",\"name\":\"java技术\"}]";
//		//将json转换成List
//		List list = JSON.parseObject(json,new TypeReference<ArrayList>(){});
//		
//		//将json转换成Set
//		Set set = JSON.parseObject(json,new TypeReference<HashSet>(){});
		
//		5.通过json对象直接操作json
//		a)从json串中获取属性
//		String propertyName = "id";
//		String propertyValue = "";
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		JSONObject obj = JSON.parseObject(json);
//		propertyValue = (String) obj.get(propertyName);
//		b)除去json中的某个属性
//		String propertyName = "id";
//		boolean propertyValue =false;
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		JSONObject obj = JSON.parseObject(json);
//		Set set = obj.keySet();
//		propertyValue = set.remove(propertyName);
//		json = obj.toString();
//		c)向json中添加属性
//		String propertyName = "desc";
//		Object propertyValue = "json的玩意儿";
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		JSONObject obj = JSON.parseObject(json);
//		obj.put(propertyName, JSON.toJSONString(propertyValue));
////		obj.put(propertyName, propertyValue);
//
//		json = obj.toString();
//		d)修改json中的属性,用的是覆盖的方法。也可以先删除，后添加
//		String propertyName = 'name';
//		Object propertyValue = "json的玩意儿";
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		JSONObject obj = JSON.parseObject(json);
//		Set set = obj.keySet();
//		if(set.contains(propertyName))
//		obj.put(propertyName, JSON.toJSONString(propertyValue));
//		json = obj.toString();
//		e)判断json中是否有属性
		String propertyName = "name";
		boolean isContain = false;
		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
		JSONObject obj = JSON.parseObject(json);
		Set set = obj.keySet();
		isContain = set.contains(propertyName);
		
	}
	
}
