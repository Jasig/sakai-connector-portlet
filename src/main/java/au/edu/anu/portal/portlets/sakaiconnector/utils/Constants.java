/**
 * Copyright 2009-2013 The Australian National University
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package au.edu.anu.portal.portlets.sakaiconnector.utils;

public class Constants {

	/* portlet height settings */
	public static final int PORTLET_HEIGHT_400 = 400;
	public static final int PORTLET_HEIGHT_600 = 600;
	public static final int PORTLET_HEIGHT_800 = 800;
	public static final int PORTLET_HEIGHT_1200 = 1200;
	public static final int PORTLET_HEIGHT_1600 = 1600;
	
	public static final int PORTLET_HEIGHT_DEFAULT=PORTLET_HEIGHT_600;
	
	public static final String PORTLET_TITLE_DEFAULT="Sakai-uPortal connector";

	//cache name - if this changes, update ehcache.xml as well, and vice versa
	public static final String CACHE_NAME = "au.edu.anu.portal.portlets.cache.SakaiConnectorPortletCache";

	
}
