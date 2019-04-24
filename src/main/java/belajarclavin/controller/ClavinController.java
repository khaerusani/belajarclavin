package belajarclavin.controller;

import java.util.ArrayList;
import java.util.List;

import com.bericotech.clavin.resolver.ResolvedLocation;

import belajarclavin.model.ResultModel;

public class ClavinController {

	public static List<ResultModel> getResult(List<ResolvedLocation> resolvedLocations) {
		List<ResultModel> resultList = new ArrayList<ResultModel>();
		for (ResolvedLocation resolvedLocation : resolvedLocations) {
			ResultModel location = new ResultModel(resolvedLocation.getGeoname().getAsciiName(),
					resolvedLocation.getGeoname().getLatitude(), resolvedLocation.getGeoname().getLongitude(),
					resolvedLocation.getGeoname().getPopulation(),
					resolvedLocation.getGeoname().getDigitalElevationModel(),
					resolvedLocation.getGeoname().getGazetteerRecord());
			resultList.add(location);
		}
		return resultList;
	}

}
