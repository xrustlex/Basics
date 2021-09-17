package seleniumDev.pageObjects;

import seleniumDev.foundation.IMenuPath;

public class MenuPath implements IMenuPath {
	private String segments;
	private String relativeUrl;

	public MenuPath(String segments, String relativeUrl) {
		this.segments = segments;
		this.relativeUrl = relativeUrl;
	}

	public String getSegments() {
		return segments;
	}

	public String getRelativeUrl() {
		return relativeUrl;
	}	
}
