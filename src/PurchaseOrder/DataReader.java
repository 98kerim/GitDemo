package PurchaseOrder;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import com.fasterxml.jackson.core.type.TypeReference;

public class DataReader {
	
	public getJsonDataToMap()
	{
		String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"ddf""));
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
			});
		return data;
	}

}
