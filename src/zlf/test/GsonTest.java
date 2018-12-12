package zlf.test;

import zlf.bo.BookBo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest {
	
	public static void main(String[] args) {
		//1.将bean转换成json
		BookBo book=new BookBo();
		book.setId("科幻类");
		book.setName("黑暗森林");
		Gson gson=new Gson();
		System.out.println(gson.toJson(book));
		
		//2.将json转换成bean
//		String json="{\"id\":\"科幻类\",\"name\":\"黑暗森林\"}";
//		Gson gson=new Gson();
//		BookBo book2 = gson.fromJson(json, BookBo.class);
//		System.out.println(book2.toString());
		
		//3.json转换复杂的bean，比如List，Set   将json转换成复杂类型的bean,需要使用TypeToken
		
//		Gson gson = new Gson();
//		String json = "[{\"id\":\"1\",\"name\":\"Json技术\"},{\"id\":\"2\",\"name\":\"java技术\"}]";
//		//将json转换成List
//		List list = gson.fromJson(json,new TypeToken<List>() {}.getType());
//		//将json转换成Set
//		Set set = gson.fromJson(json,new TypeToken<Set>() {}.getType());
		
//		4.从json串中获取属性,注意点在于如果json不是单个｛｝，而是个集合如第五点里面的这个json，就会发生转化异常。
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		String propertyName = "id";
//		String propertyValue = "";
//		try {
//		JsonParser jsonParser = new JsonParser();
//		JsonElement element = jsonParser.parse(json);
//		JsonObject jsonObj = element.getAsJsonObject();
//		propertyValue = jsonObj.get(propertyName).toString();
//		} catch (Exception e) {
//		propertyValue = null;
//		}
		
//		5.判断字符串是否是json,通过捕捉的异常来判断是否是json
//		String json = "[{\"id\":\"1\",\"name\":\"Json技术\"},{\"id\":\"2\",\"name\":\"java技术\"}]";
//		boolean jsonFlag;
//		try {
//		new JsonParser().parse(json).getAsJsonObject();
//		jsonFlag = true;
//		} catch (Exception e) {
//		jsonFlag = false;
//		}
		
//		6.除去json中的某个属性,这里了的json也是有要求的，如5中的json过来解析出呢个JsonObject就会异常了。JsonObject只能解析类似与map的数据结构。
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		String propertyName = "id";
//		JsonParser jsonParser = new JsonParser();
//		JsonElement element = jsonParser.parse(json);
//		JsonObject jsonObj = element.getAsJsonObject();
//		jsonObj.remove(propertyName);
//		json = jsonObj.toString();
		
//		7.向json中添加属性
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		String propertyName = "desc";
//		Object propertyValue = "json各种技术的调研";
//		String propertyName1 = "desc1";
//		Object propertyValue1 = "json各种技术的调研1";
//		JsonParser jsonParser = new JsonParser();
//		JsonElement element = jsonParser.parse(json);
//		JsonObject jsonObj = element.getAsJsonObject();
//		jsonObj.addProperty(propertyName, new Gson().toJson(propertyValue));//添加进去的效果："desc":"\"json各种技术的调研\""
//		jsonObj.addProperty(propertyName1, (String) propertyValue1);//效果："desc1":"json各种技术的调研1"
//		
//		json = jsonObj.toString();
		
//		8.修改json中的属性,就是得到propertyname后，先删除，后添加一个同名的。。。
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		String propertyName = "name";
//		Object propertyValue = "json各种技术的调研";
//		JsonParser jsonParser = new JsonParser();
//		JsonElement element = jsonParser.parse(json);
//		JsonObject jsonObj = element.getAsJsonObject();
//		jsonObj.remove(propertyName);
//		jsonObj.addProperty(propertyName, new Gson().toJson(propertyValue));
//		json = jsonObj.toString();
		
//		9.判断json中是否有属性
//		String json = "{\"id\":\"1\",\"name\":\"Json技术\"}";
//		String propertyName = "name";
//		boolean isContains = false ;
//		JsonParser jsonParser = new JsonParser();
//		JsonElement element = jsonParser.parse(json);
//		JsonObject jsonObj = element.getAsJsonObject();
//		isContains = jsonObj.has(propertyName);
		
//		10.json中日期格式的处理
//		GsonBuilder builder = new GsonBuilder();
//		builder.setDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		Gson gson = builder.create();
//		然后使用gson对象进行json的处理，如果出现日期Date类的对象，就会按照设置的格式进行处理
//		String time="2017-06-23 12:23:45";
		
		
	}
}
