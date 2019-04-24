package belajarclavin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bericotech.clavin.ClavinException;
import com.bericotech.clavin.GeoParser;
import com.bericotech.clavin.GeoParserFactory;
import com.bericotech.clavin.resolver.ResolvedLocation;
import com.bericotech.clavin.util.TextUtils;

import belajarclavin.controller.ClavinController;
import belajarclavin.model.ResultModel;

public class MainClavin {
	public static void main(String[] args) {
		try {
//			dapatkan index si lucene yang udah dibuat dari model nya. ref: 
			GeoParser parser = GeoParserFactory.getDefault("./src/main/resources/IndexDirectory");
			
//			input text dari dataset, bisa dari text online news, tweet dsb :D
			String input = TextUtils.fileToString(new File("./src/main/resources/text.txt"));
			
//			parsing si text nya
			List<ResolvedLocation> resolvedLocations = parser.parse(input);
			
//			dapat list lokasinya
			List<ResultModel> resultList = ClavinController.getResult(resolvedLocations);
						
//			dump hasil
			for(ResultModel result : resultList) {
				System.out.printf("Nama: %s|Lintang: %f|Bujur: %f|Populasi: %d|\n Gazete Record : %s\n", 
						result.getNama(), 
						result.getLintang(), 
						result.getBujur(),
						result.getPopulasi(),
						result.getGazetterRecord());
			}

		} catch (ClavinException e) {
			e.printStackTrace();
			System.err.println("Error Clavin");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error I/O File");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unexpected Error");
		}
	}
}
